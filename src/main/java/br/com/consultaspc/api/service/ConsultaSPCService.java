package br.com.consultaspc.api.service;

import br.com.consultaspc.api.dto.output.RespostaOutputDto;
import br.com.consultaspc.api.filter.DefineRiscoFilter;

public interface ConsultaSPCService {

	RespostaOutputDto defineRisco(DefineRiscoFilter filter);
}
