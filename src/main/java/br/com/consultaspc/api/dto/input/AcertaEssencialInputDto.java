package br.com.consultaspc.api.dto.input;

import javax.validation.constraints.NotEmpty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "AcertaEssencialFilter")
public class AcertaEssencialInputDto {
	
	@NotEmpty(message = "Campo obrigatório")
	@ApiModelProperty(name = "cpf", required = true, value = "Número do CPF", dataType = "String", example = "99999999999")
	private String cpf;
	
}
