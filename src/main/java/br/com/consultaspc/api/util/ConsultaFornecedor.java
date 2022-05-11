package br.com.consultaspc.api.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.apache.commons.io.IOUtils;

import br.com.consultaspc.api.dto.output.RespostaOutputDto;

public class ConsultaFornecedor {

	public static RespostaOutputDto consultaCDLRio(Object obj, String solicitacao, String urlProduto) {
		RespostaOutputDto respostaOutputDto = new RespostaOutputDto();
		Log log = new Log(false, GlobalConstants.PASTALOG);;	
		URL url;
		HttpURLConnection con;		
		BufferedReader br = null;
		String resposta = "";
		String protocolo = Util.geraProtocolo();
		String snd = solicitacao.replace("\n", "");
		int HTTP_COD_SUCESSO = 200;
		
		try {
			log.registro(protocolo, "SND", snd);

			url = new URL(urlProduto);
			con = (HttpURLConnection) url.openConnection();
			
			//Methd
			// specify that we will send output and accept input
			//con.setDoInput(true);
			con.setDoOutput(true);
			//long timeout, but not infinite
			//con.setConnectTimeout(15000); 
			//con.setReadTimeout(15000);
			con.setUseCaches(false);
			con.setDefaultUseCaches(false);
			// Tell the web server what we are sending
			con.setRequestMethod("POST");
			con.setRequestProperty("Content-Type", "application/xml;charset=utf-8");

			OutputStreamWriter writer = new OutputStreamWriter(con.getOutputStream());
			writer.write(solicitacao);
			writer.flush();
			writer.close();
			
			if (con.getResponseCode() != HTTP_COD_SUCESSO) {
				log.registro(protocolo, "ERRO1", "HTTP error code : " + con.getResponseCode());
				respostaOutputDto.setProtocolo(protocolo);
				respostaOutputDto.setResposta("Erro na comunicacao com o Fornecedor");
				return respostaOutputDto;
			}
			
			byte[] imageBytes = IOUtils.toByteArray(con.getInputStream());
			resposta = new String(imageBytes, "UTF-8");

			br = new BufferedReader(new StringReader(resposta));
			
			//Faco o parse aqui xml->classe java
			JAXBContext jaxbContext = JAXBContext.newInstance(obj.getClass());
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			respostaOutputDto.setEssencial(jaxbUnmarshaller.unmarshal(br));
			 
			br.close();
			con.disconnect();

			log.registro(protocolo, "RCV", resposta);
			respostaOutputDto.setProtocolo(protocolo);
			respostaOutputDto.setResposta(Util.lerTag("<MENSAGEM-RESPOSTA>", resposta));			
		} catch (MalformedURLException e) {
			log.registro(protocolo, "ERRO2", e.getMessage());
			respostaOutputDto.setProtocolo(protocolo);
			respostaOutputDto.setResposta("Erro na comunicacao com o Fornecedor");
		} catch (IOException e) {
			log.registro(protocolo, "ERRO3", e.getMessage());
			respostaOutputDto.setProtocolo(protocolo);
			respostaOutputDto.setResposta("Erro na comunicacao com o Fornecedor");
		} catch (JAXBException e) {
			log.registro(protocolo, "ERRO4", e.getMessage());
			respostaOutputDto.setProtocolo(protocolo);
			respostaOutputDto.setResposta("Erro na comunicacao com o Fornecedor");
		}

		return respostaOutputDto;
	}

}
