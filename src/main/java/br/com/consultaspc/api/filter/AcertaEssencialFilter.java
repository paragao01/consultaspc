package br.com.consultaspc.api.filter;

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
public class AcertaEssencialFilter {
	
	@NotEmpty(message = "Campo obrigatório")
	@ApiModelProperty(name = "cpf", required = true, value = "Número do CPF", dataType = "String", example = "99999999999")
	private String cpf;
	
	@ApiModelProperty(name = "banco", value = "Código Banco", dataType = "String", example = "9999")
	private String banco;
	
	@ApiModelProperty(name = "agencia", value = "Código Agencia", dataType = "String", example = "9999")
	private String agencia;
	
	@ApiModelProperty(name = "numConta", value = "Número Conta", dataType = "String", example = "9999999")
	private String numConta;
	
	@ApiModelProperty(name = "dvConta", value = "DV Conta", dataType = "String", example = "9")
	private String dvConta;
	
	@ApiModelProperty(name = "numCheque", value = "", dataType = "String", example = "999999999")
	private String numCheque;
	
	@ApiModelProperty(name = "dvCheque", value = "DV Cheque", dataType = "String", example = "9")
	private String dvCheque;
	
	@ApiModelProperty(name = "cmc7", value = "Número CMC7", dataType = "String", example = "999999999999999999999999999999")
	private String cmc7;
	
	@ApiModelProperty(name = "chequeOrigem", value = "Número Cheque", dataType = "String", example = "999999999")
	private String chequeOrigem;
	
	@ApiModelProperty(name = "qtdeCheque", value = "Quantidade de Cheques", dataType = "String", example = "99")
	private String qtdeCheque;
	
	@ApiModelProperty(name = "dataCheque", value = "Data do Cheque", dataType = "String", example = "99999999")
	@DateTimeFormat(pattern = "ddMMyyyy")
	private String dataCheque;
	
	@NotEmpty(message = "Campo obrigatório")
	@ApiModelProperty(name = "consultaSCORE", required = true, value = "Consultar SCORE - informe (S/N)", dataType = "String", example = "N")
	private String consultaSCORE;
	
	@NotEmpty(message = "Campo obrigatório")
	@ApiModelProperty(name = "score12Meses", required = true, value = "Consultar SCORE 12 meses - informe (S/N)", dataType = "String", example = "N")
	private String score12Meses;
	
	@NotEmpty(message = "Campo obrigatório")
	@ApiModelProperty(name = "scoreCC", required = true, value = "Consultar SCORE Cartão de Crédito - informe (S/N)", dataType = "String", example = "N")
	private String scoreCC;
	
	@NotEmpty(message = "Campo obrigatório")
	@ApiModelProperty(name = "score12Meses", required = true, value = "Consultar SCORE 6 meses - informe (S/N)", dataType = "String", example = "N")
	private String score6Meses;
	
	@NotEmpty(message = "Campo obrigatório")
	@ApiModelProperty(name = "limiteParcela", required = true, value = "Consultar Limite de Parcelas - informe (S/N)", dataType = "String", example = "N")
	private String limiteParcela;
		
	@NotEmpty(message = "Campo obrigatório")
	@ApiModelProperty(name = "cheque", required = true, value = "Consultar Cheque - informe (S/N)", dataType = "String", example = "N")
	private String cheque;

}
