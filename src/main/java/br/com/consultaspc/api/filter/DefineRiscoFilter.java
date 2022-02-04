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
public class DefineRiscoFilter {
	
	@NotEmpty(message = "Campo obrigatório")
	@ApiModelProperty(name = "cnpj", required = true, value = "Número do CNPJ", dataType = "String", example = "99999999999999")
	private String cnpj;
	
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
	@ApiModelProperty(name = "quadroSocial", required = true, value = "Consultar Quadro Societário - informe (S/N)", dataType = "String", example = "N")
	private String quadroSocial;
	
	@NotEmpty(message = "Campo obrigatório")
	@ApiModelProperty(name = "quadroSocialRestricao", required = true, value = "Consultar Restrições Quadro Societário - informe (S/N)", dataType = "String", example = "N")
	private String quadroSocialRestricao;
	
	@NotEmpty(message = "Campo obrigatório")
	@ApiModelProperty(name = "participacoes", required = true, value = "Consultar Participações Outra Empresa - informe (S/N)", dataType = "String", example = "N")
	private String participacoes;
	
	@NotEmpty(message = "Campo obrigatório")
	@ApiModelProperty(name = "participacoesRestricao", required = true, value = "Consultar Restrições Participações Outra Empresa - informe (S/N)", dataType = "String", example = "N")
	private String participacoesRestricao;
	
	@NotEmpty(message = "Campo obrigatório")
	@ApiModelProperty(name = "decisao", required = true, value = "Consultar Decisão - informe (S/N)", dataType = "String", example = "N")
	private String decisao;
	
	@NotEmpty(message = "Campo obrigatório")
	@ApiModelProperty(name = "faturamentoPresumido", required = true, value = "Consultar Faturamento Prsumido - informe (S/N)", dataType = "String", example = "N")
	private String faturamentoPresumido;
	
	@NotEmpty(message = "Campo obrigatório")
	@ApiModelProperty(value = "Consultar Limite de Crédito - informe (S/N)", dataType = "String", example = "N")
	private String limiteCredito;
	
	@NotEmpty(message = "Campo obrigatório")
	@ApiModelProperty(value = "Consultar Anvisa - informe (S/N)", dataType = "String", example = "N")
	private String anvisa;
	
	@NotEmpty(message = "Campo obrigatório")
	@ApiModelProperty(name = "empresaMesmoEndereco", required = true, value = "Consultar Empresa Mesmo Endereço - informe (S/N)", dataType = "String", example = "N")
	private String empresaMesmoEndereco;
	
	@NotEmpty(message = "Campo obrigatório")
	@ApiModelProperty(name = "cheque", required = true, value = "Consultar Cheque - informe (S/N)", dataType = "String", example = "N")
	private String cheque;

}
