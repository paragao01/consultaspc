package br.com.consultaspc.api.service;

import br.com.consultaspc.api.dto.input.AcertaEssencialInputDto;
import br.com.consultaspc.api.dto.input.DefineRiscoInputDto;
import br.com.consultaspc.api.dto.output.RespostaOutputDto;

public interface ConsultaSPCService {

	RespostaOutputDto defineRisco(DefineRiscoInputDto filter);
	RespostaOutputDto acertaEssencial(AcertaEssencialInputDto filter);
}
