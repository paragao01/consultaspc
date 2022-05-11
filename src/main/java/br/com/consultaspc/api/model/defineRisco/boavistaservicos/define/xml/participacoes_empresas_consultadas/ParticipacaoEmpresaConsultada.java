//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.05.10 às 08:06:45 AM BRT 
//


package br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.participacoes_empresas_consultadas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.restricoes_documento.RestricoesDocumento;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="razao_social_participada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cnpj_participada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="situacao_cnpj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="participacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entrada" type="{http://boavistaservicos.com.br/define/xml/util}dataDiaMesAno" minOccurs="0"/>
 *         &lt;element name="indicador_debito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indicador_fraude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/restricoes_documento}restricoes_documento" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "razaoSocialParticipada",
    "cnpjParticipada",
    "situacaoCnpj",
    "participacao",
    "entrada",
    "indicadorDebito",
    "indicadorFraude",
    "restricoesDocumento"
})
@XmlRootElement(name = "participacao_empresa_consultada")
public class ParticipacaoEmpresaConsultada {

    @XmlElement(name = "razao_social_participada")
    protected String razaoSocialParticipada;
    @XmlElement(name = "cnpj_participada")
    protected String cnpjParticipada;
    @XmlElement(name = "situacao_cnpj")
    protected String situacaoCnpj;
    protected String participacao;
    protected String entrada;
    @XmlElement(name = "indicador_debito")
    protected String indicadorDebito;
    @XmlElement(name = "indicador_fraude")
    protected String indicadorFraude;
    @XmlElement(name = "restricoes_documento", namespace = "http://boavistaservicos.com.br/define/xml/restricoes_documento")
    protected RestricoesDocumento restricoesDocumento;

    /**
     * Obtém o valor da propriedade razaoSocialParticipada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazaoSocialParticipada() {
        return razaoSocialParticipada;
    }

    /**
     * Define o valor da propriedade razaoSocialParticipada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazaoSocialParticipada(String value) {
        this.razaoSocialParticipada = value;
    }

    /**
     * Obtém o valor da propriedade cnpjParticipada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnpjParticipada() {
        return cnpjParticipada;
    }

    /**
     * Define o valor da propriedade cnpjParticipada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnpjParticipada(String value) {
        this.cnpjParticipada = value;
    }

    /**
     * Obtém o valor da propriedade situacaoCnpj.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSituacaoCnpj() {
        return situacaoCnpj;
    }

    /**
     * Define o valor da propriedade situacaoCnpj.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSituacaoCnpj(String value) {
        this.situacaoCnpj = value;
    }

    /**
     * Obtém o valor da propriedade participacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipacao() {
        return participacao;
    }

    /**
     * Define o valor da propriedade participacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipacao(String value) {
        this.participacao = value;
    }

    /**
     * Obtém o valor da propriedade entrada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntrada() {
        return entrada;
    }

    /**
     * Define o valor da propriedade entrada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntrada(String value) {
        this.entrada = value;
    }

    /**
     * Obtém o valor da propriedade indicadorDebito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicadorDebito() {
        return indicadorDebito;
    }

    /**
     * Define o valor da propriedade indicadorDebito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicadorDebito(String value) {
        this.indicadorDebito = value;
    }

    /**
     * Obtém o valor da propriedade indicadorFraude.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicadorFraude() {
        return indicadorFraude;
    }

    /**
     * Define o valor da propriedade indicadorFraude.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicadorFraude(String value) {
        this.indicadorFraude = value;
    }

    /**
     * Obtém o valor da propriedade restricoesDocumento.
     * 
     * @return
     *     possible object is
     *     {@link RestricoesDocumento }
     *     
     */
    public RestricoesDocumento getRestricoesDocumento() {
        return restricoesDocumento;
    }

    /**
     * Define o valor da propriedade restricoesDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link RestricoesDocumento }
     *     
     */
    public void setRestricoesDocumento(RestricoesDocumento value) {
        this.restricoesDocumento = value;
    }

}
