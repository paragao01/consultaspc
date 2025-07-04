package br.com.consultaspc.api.controller.swagger;

import org.springframework.http.ResponseEntity;

import br.com.consultaspc.api.dto.input.AcertaEssencialInputDto;
import br.com.consultaspc.api.dto.input.DefineRiscoInputDto;
import br.com.consultaspc.api.dto.output.RespostaOutputDto;
import br.com.consultaspc.api.exception.handler.Problem;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(tags = "Consulta SPC")
public interface ConsultaSPCControllerSwagger {

	@ApiOperation(value = "Consulta Define Risco", httpMethod = "GET")
	@ApiResponses({
		@ApiResponse(code = 200, response = RespostaOutputDto.class, message = "Requisição com sucesso"),
		@ApiResponse(code = 404, response = Problem.class, message = "O recurso não foi encontrado")
	})
	ResponseEntity<RespostaOutputDto> defineRisco (DefineRiscoInputDto filter);

	@ApiOperation(value = "Consulta Acerta Essencial", httpMethod = "GET")
	@ApiResponses({
		@ApiResponse(code = 200, response = RespostaOutputDto.class, message = "Requisição com sucesso"),
		@ApiResponse(code = 404, response = Problem.class, message = "O recurso não foi encontrado")
	})
	ResponseEntity<RespostaOutputDto> acertaEssencial (AcertaEssencialInputDto filter);
	
}
