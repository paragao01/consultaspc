package br.com.consultaspc.api.service;

import br.com.consultaspc.api.dto.output.RespostaOutputDto;
import br.com.consultaspc.api.filter.AcertaEssencialFilter;
import br.com.consultaspc.api.filter.DefineRiscoFilter;

public interface ConsultaSPCService {

	RespostaOutputDto defineRisco(DefineRiscoFilter filter);
	RespostaOutputDto acertaEssencial(AcertaEssencialFilter filter);
}
