package br.com.consultaspc.api.dto.output;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RespostaOutputDto {
		
	@ApiModelProperty(name = "protocolo", value = "Protocolo de atendimento", dataType = "String", example = "20220203092518.445.17276")
	private String protocolo;
	
	@ApiModelProperty(name = "resposta", value = "Resposta da consulta", dataType = "String", example = "")	
	private String resposta;
	
	@ApiModelProperty(name = "essencial", value = "Classe para armazenar a resposta em XML")	
	private Object essencial;

}
