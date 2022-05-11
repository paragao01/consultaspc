//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.05.10 às 08:06:45 AM BRT 
//


package br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.socios;

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
 *         &lt;element name="nome_empresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cpf_cnpj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipo_documento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="situacao_documento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="participacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="data_entrada" type="{http://boavistaservicos.com.br/define/xml/util}dataDiaMesAno" minOccurs="0"/>
 *         &lt;element name="assina_empresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "nomeEmpresa",
    "cpfCnpj",
    "tipoDocumento",
    "situacaoDocumento",
    "participacao",
    "dataEntrada",
    "assinaEmpresa",
    "indicadorDebito",
    "indicadorFraude",
    "restricoesDocumento"
})
@XmlRootElement(name = "socio")
public class Socio {

    @XmlElement(name = "nome_empresa")
    protected String nomeEmpresa;
    @XmlElement(name = "cpf_cnpj")
    protected String cpfCnpj;
    @XmlElement(name = "tipo_documento")
    protected String tipoDocumento;
    @XmlElement(name = "situacao_documento")
    protected String situacaoDocumento;
    protected String participacao;
    @XmlElement(name = "data_entrada")
    protected String dataEntrada;
    @XmlElement(name = "assina_empresa")
    protected String assinaEmpresa;
    @XmlElement(name = "indicador_debito")
    protected String indicadorDebito;
    @XmlElement(name = "indicador_fraude")
    protected String indicadorFraude;
    @XmlElement(name = "restricoes_documento", namespace = "http://boavistaservicos.com.br/define/xml/restricoes_documento")
    protected RestricoesDocumento restricoesDocumento;

    /**
     * Obtém o valor da propriedade nomeEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    /**
     * Define o valor da propriedade nomeEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeEmpresa(String value) {
        this.nomeEmpresa = value;
    }

    /**
     * Obtém o valor da propriedade cpfCnpj.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpfCnpj() {
        return cpfCnpj;
    }

    /**
     * Define o valor da propriedade cpfCnpj.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpfCnpj(String value) {
        this.cpfCnpj = value;
    }

    /**
     * Obtém o valor da propriedade tipoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Define o valor da propriedade tipoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDocumento(String value) {
        this.tipoDocumento = value;
    }

    /**
     * Obtém o valor da propriedade situacaoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSituacaoDocumento() {
        return situacaoDocumento;
    }

    /**
     * Define o valor da propriedade situacaoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSituacaoDocumento(String value) {
        this.situacaoDocumento = value;
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
     * Obtém o valor da propriedade dataEntrada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataEntrada() {
        return dataEntrada;
    }

    /**
     * Define o valor da propriedade dataEntrada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataEntrada(String value) {
        this.dataEntrada = value;
    }

    /**
     * Obtém o valor da propriedade assinaEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssinaEmpresa() {
        return assinaEmpresa;
    }

    /**
     * Define o valor da propriedade assinaEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssinaEmpresa(String value) {
        this.assinaEmpresa = value;
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
