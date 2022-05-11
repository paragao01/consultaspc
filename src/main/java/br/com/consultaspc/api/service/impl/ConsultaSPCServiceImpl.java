package br.com.consultaspc.api.service.impl;

import org.springframework.stereotype.Service;

import br.com.consultaspc.api.dto.input.AcertaEssencialInputDto;
import br.com.consultaspc.api.dto.input.DefineRiscoInputDto;
import br.com.consultaspc.api.dto.output.RespostaOutputDto;
import br.com.consultaspc.api.service.ConsultaSPCService;
import br.com.consultaspc.api.util.ConsultaFornecedor;
import br.com.consultaspc.api.util.GlobalConstants;

@Service
public class ConsultaSPCServiceImpl implements ConsultaSPCService{
	
	@Override
	public RespostaOutputDto defineRisco(DefineRiscoInputDto filter){
		br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.risco.v5.DefineRisco obj = new br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.risco.v5.DefineRisco();
		String solicitacao = "";
		
		solicitacao = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
				+ "<defineRiscoContratoEntradaXml xmlns=\"http://boavistaservicos.com.br/define/entrada/risco\">\n"
				+ "<usuario>"+GlobalConstants.USRBOAVIS+"</usuario>\n"
				+ "<senha>"+GlobalConstants.PWRBOAVIS+"</senha>\n"
				+ "<cnpj>"+filter.getCnpj()+"</cnpj>\n"
				+ "</defineRiscoContratoEntradaXml>";
		
		return ConsultaFornecedor.consultaCDLRio(obj, solicitacao, GlobalConstants.URLDEFINE);
	}

	@Override
	public RespostaOutputDto acertaEssencial(AcertaEssencialInputDto filter) {
		br.com.consultaspc.api.model.acertaEssencial.boavistaservicos.familia.acerta.pf.essencial.v3.Essencial obj = new br.com.consultaspc.api.model.acertaEssencial.boavistaservicos.familia.acerta.pf.essencial.v3.Essencial();
		String solicitacao = "";
		
		solicitacao = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n"
				+ "<acertaContratoEntrada\n"
				+ "xmlns=\"http://boavistaservicos.com.br/familia/acerta/pf\">\n"
				+ "<usuario>"+GlobalConstants.USRBOAVIS+"</usuario>\n"
				+ "<senha>"+GlobalConstants.PWRBOAVIS+"</senha>\n"
				+ "<cpf>"+filter.getCpf()+"</cpf> \n"
				+ "<tipoCredito>CC</tipoCredito>\n"
				+ "</acertaContratoEntrada>";

		return ConsultaFornecedor.consultaCDLRio(obj, solicitacao, GlobalConstants.URLACERTA);
	}

}
