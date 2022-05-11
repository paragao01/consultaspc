package br.com.consultaspc.api.dto.input;

import javax.validation.constraints.NotEmpty;

import org.springframework.format.annotation.DateTimeFormat;

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
@ApiModel(value = "DefineRiscoFilter")
public class DefineRiscoInputDto {
	
	@NotEmpty(message = "Campo obrigatório")
	@ApiModelProperty(name = "cnpj", required = true, value = "Número do CNPJ", dataType = "String", example = "99999999999999")
	private String cnpj;
	
}
