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

	public static RespostaOutputDto consultaCDLRio(Object obj, String solicitacao) {
		RespostaOutputDto respostaOutputDto = new RespostaOutputDto();
		Log log = new Log(false, GlobalConstants.PASTALOG);;	
		URL url;
		HttpURLConnection con;		
		BufferedReader br = null;
		String resposta = "";
		String protocolo = Util.geraProtocolo();		
		int HTTP_COD_SUCESSO = 200;
		
		try {
			log.registro(protocolo, "SND", solicitacao);

			url = new URL(GlobalConstants.URLCDLRIO);
			con = (HttpURLConnection) url.openConnection();
			// specify that we will send output and accept input
			con.setDoInput(true);
			con.setDoOutput(true);
			// con.setConnectTimeout(15000); //long timeout, but not infinite
			// con.setReadTimeout(15000);
			con.setUseCaches(false);
			con.setDefaultUseCaches(false);
			// Tell the web server what we are sending
			//con.setRequestProperty("Content-Type", "text/xml;charset=ISO-8859-1");

			OutputStreamWriter writer = new OutputStreamWriter(con.getOutputStream());
			writer.write(solicitacao);
			writer.flush();
			writer.close();

			if (con.getResponseCode() != HTTP_COD_SUCESSO) {
				log.registro(protocolo, "ERRO", "HTTP error code : " + con.getResponseCode());
				respostaOutputDto.setProtocolo(protocolo);
				respostaOutputDto.setResposta("Erro na comunicacao com o Fornecedor");
				return respostaOutputDto;
			}
			
			//Aqui o encolde eh ISO-8859-1
			byte[] imageBytes = IOUtils.toByteArray(con.getInputStream());
			resposta = new String(imageBytes, "ISO-8859-1");
			resposta = resposta.trim().replace("\n", "");
			resposta = resposta.trim().replace("    ", "");
			br = new BufferedReader(new StringReader(resposta));
			
			//Faco o parse aqui xml->classe java
			JAXBContext jaxbContext = JAXBContext.newInstance(obj.getClass());
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			respostaOutputDto.setSpcaxml(jaxbUnmarshaller.unmarshal(br));
			 
			br.close();
			con.disconnect();

			log.registro(protocolo, "RCV", resposta);
			respostaOutputDto.setProtocolo(protocolo);
			respostaOutputDto.setResposta(Util.lerTag("<MENSAGEM-RESPOSTA>", resposta));			
		} catch (MalformedURLException e) {
			log.registro(protocolo, "ERRO", e.getMessage());
			respostaOutputDto.setProtocolo(protocolo);
			respostaOutputDto.setResposta("Erro na comunicacao com o Fornecedor");
		} catch (IOException e) {
			log.registro(protocolo, "ERRO", e.getMessage());
			respostaOutputDto.setProtocolo(protocolo);
			respostaOutputDto.setResposta("Erro na comunicacao com o Fornecedor");
		} catch (JAXBException e) {
			log.registro(protocolo, "ERRO", e.getMessage());
			respostaOutputDto.setProtocolo(protocolo);
			respostaOutputDto.setResposta("Erro na comunicacao com o Fornecedor");
		}

		return respostaOutputDto;
	}

}
