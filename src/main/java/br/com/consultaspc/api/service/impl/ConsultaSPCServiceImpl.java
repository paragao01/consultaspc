package br.com.consultaspc.api.service.impl;

import org.springframework.stereotype.Service;

import br.com.consultaspc.api.dto.output.RespostaOutputDto;
import br.com.consultaspc.api.filter.DefineRiscoFilter;
import br.com.consultaspc.api.service.ConsultaSPCService;
import br.com.consultaspc.api.util.ConsultaFornecedor;
import br.com.consultaspc.api.util.GlobalConstants;

@Service
public class ConsultaSPCServiceImpl implements ConsultaSPCService{
	
	@Override
	public RespostaOutputDto defineRisco(DefineRiscoFilter filter){
		String solicitacao = "";
		
		solicitacao = "<SPCA-XML xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:noNamespaceSchemaLocation=\"http://www.scpc.inf.br/spcn/spcaxmlefx.xsd\">" + 
				  "<VERSAO>20151030</VERSAO>" + 
				  "<SOLICITACAO>" + 
				  "<S-CODIGO>"+GlobalConstants.USRCDLRIO+"</S-CODIGO>" + 
				  "<S-SENHA>"+GlobalConstants.PWRCDLRIO+"</S-SENHA>" + 
				  "<S-CONSULTA>623</S-CONSULTA>" + 
				  "<S-SOLICITANTE>RJ001</S-SOLICITANTE>" + 
				  "<S-CNPJ>"+filter.getCnpj()+"</S-CNPJ>";
		
		if(filter.getCheque().equals("S")) {
			solicitacao += "<S-BANCO>"+filter.getBanco()+"</S-BANCO>" +
						   "<S-AGENCIA>"+filter.getAgencia()+"</S-AGENCIA>" +
						   "<S-CONTA-CORRENTE>"+filter.getNumConta()+"</S-CONTA-CORRENTE>"+
						   "<S-CONTA-DIGITO>"+filter.getDvConta()+"</S-CONTA-DIGITO>"+
						   "<S-CHEQUE>"+filter.getNumCheque()+"</S-CHEQUE>"+
						   "<S-CHEQUE-DIGITO>"+filter.getDvCheque()+"</S-CHEQUE-DIGITO>"+
						   "<S-CMC7>"+filter.getCmc7()+"</S-CMC7>"+
						   "<S-CHEQUE-ORIGEM>"+filter.getChequeOrigem()+"</S-CHEQUE-ORIGEM>"+
						   "<S-CHEQUE-DATA>"+filter.getDataCheque()+"</S-CHEQUE-DATA>"+
						   "<S-CHEQUE-QTDE>"+filter.getQtdeCheque()+"</S-CHEQUE-QTDE>";
		}
		solicitacao += "<S-NUMERO-RESPOSTA>0</S-NUMERO-RESPOSTA>" +				  
				  "<S-DEFINE-PRODUTO>" + 
				  "<S-DEF-QUADRO-SOCIAL>"+filter.getQuadroSocial()+"</S-DEF-QUADRO-SOCIAL>" + 
				  "<S-DEF-QUADRO-COMRESTRICAO>"+filter.getQuadroSocialRestricao()+"</S-DEF-QUADRO-COMRESTRICAO>" + 
				  "<S-DEF-PARTICIPACOES>"+filter.getParticipacoes()+"</S-DEF-PARTICIPACOES>" + 
				  "<S-DEF-PART-COMRESTRICAO>"+filter.getParticipacoesRestricao()+"</S-DEF-PART-COMRESTRICAO>" +
				  "<S-DEF-DECISAO>"+filter.getDecisao()+"</S-DEF-DECISAO>" + 
				  "<S-DEF-FAT-PRESUMIDO>"+filter.getFaturamentoPresumido()+"</S-DEF-FAT-PRESUMIDO>" + 
				  "<S-DEF-LIMITE-CREDITO>"+filter.getLimiteCredito()+"</S-DEF-LIMITE-CREDITO>" + 
				  "<S-DEF-ANVISA>"+filter.getAnvisa()+"</S-DEF-ANVISA>" + 
				  "<S-DEF-EMPR-MESMO-ENDERECO>"+filter.getEmpresaMesmoEndereco()+"</S-DEF-EMPR-MESMO-ENDERECO>" + 
				  "<S-DEF-CHEQUE>"+filter.getCheque()+"</S-DEF-CHEQUE>" + 
				  "</S-DEFINE-PRODUTO>" + 
				  "</SOLICITACAO>" + 
				  "</SPCA-XML>";
			
		return ConsultaFornecedor.consultaCDLRio(solicitacao);
	}

}
