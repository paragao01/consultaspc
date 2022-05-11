//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.05.10 às 08:06:45 AM BRT 
//


package br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.identificacao_basico.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element name="cnpj" type="{http://boavistaservicos.com.br/define/xml/util}cnpj" minOccurs="0"/>
 *           &lt;element name="razao_social" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="nome_fantasia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="situacao_cnpj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="data_situacao_cnpj" type="{http://boavistaservicos.com.br/define/xml/util}dataDiaMesAno" minOccurs="0"/>
 *           &lt;element name="data_consulta_receita_federal" type="{http://boavistaservicos.com.br/define/xml/util}dataDiaMesAno" minOccurs="0"/>
 *           &lt;element name="numero_nire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="uf_nire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="inscricao_estadual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="uf_inscricao_estadual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="data_fundacao" type="{http://boavistaservicos.com.br/define/xml/util}dataDiaMesAno" minOccurs="0"/>
 *           &lt;element name="codigo_natureza_juridica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="natureza_juridica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element ref="{http://boavistaservicos.com.br/define/xml/identificacao_basico/v2}ramo_atividade" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element name="mensagem" type="{http://boavistaservicos.com.br/define/xml/util}mensagem"/>
 *         &lt;/sequence>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cnpj",
    "razaoSocial",
    "nomeFantasia",
    "situacaoCnpj",
    "dataSituacaoCnpj",
    "dataConsultaReceitaFederal",
    "numeroNire",
    "ufNire",
    "inscricaoEstadual",
    "ufInscricaoEstadual",
    "dataFundacao",
    "codigoNaturezaJuridica",
    "naturezaJuridica",
    "ramoAtividade",
    "mensagem"
})
@XmlRootElement(name = "identificacao_basico")
public class IdentificacaoBasico {

    protected String cnpj;
    @XmlElement(name = "razao_social")
    protected String razaoSocial;
    @XmlElement(name = "nome_fantasia")
    protected String nomeFantasia;
    @XmlElement(name = "situacao_cnpj")
    protected String situacaoCnpj;
    @XmlElement(name = "data_situacao_cnpj")
    protected String dataSituacaoCnpj;
    @XmlElement(name = "data_consulta_receita_federal")
    protected String dataConsultaReceitaFederal;
    @XmlElement(name = "numero_nire")
    protected String numeroNire;
    @XmlElement(name = "uf_nire")
    protected String ufNire;
    @XmlElement(name = "inscricao_estadual")
    protected String inscricaoEstadual;
    @XmlElement(name = "uf_inscricao_estadual")
    protected String ufInscricaoEstadual;
    @XmlElement(name = "data_fundacao")
    protected String dataFundacao;
    @XmlElement(name = "codigo_natureza_juridica")
    protected String codigoNaturezaJuridica;
    @XmlElement(name = "natureza_juridica")
    protected String naturezaJuridica;
    @XmlElement(name = "ramo_atividade")
    protected RamoAtividade ramoAtividade;
    protected String mensagem;

    /**
     * Obtém o valor da propriedade cnpj.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * Define o valor da propriedade cnpj.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnpj(String value) {
        this.cnpj = value;
    }

    /**
     * Obtém o valor da propriedade razaoSocial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazaoSocial() {
        return razaoSocial;
    }

    /**
     * Define o valor da propriedade razaoSocial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazaoSocial(String value) {
        this.razaoSocial = value;
    }

    /**
     * Obtém o valor da propriedade nomeFantasia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeFantasia() {
        return nomeFantasia;
    }

    /**
     * Define o valor da propriedade nomeFantasia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeFantasia(String value) {
        this.nomeFantasia = value;
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
     * Obtém o valor da propriedade dataSituacaoCnpj.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSituacaoCnpj() {
        return dataSituacaoCnpj;
    }

    /**
     * Define o valor da propriedade dataSituacaoCnpj.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSituacaoCnpj(String value) {
        this.dataSituacaoCnpj = value;
    }

    /**
     * Obtém o valor da propriedade dataConsultaReceitaFederal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataConsultaReceitaFederal() {
        return dataConsultaReceitaFederal;
    }

    /**
     * Define o valor da propriedade dataConsultaReceitaFederal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataConsultaReceitaFederal(String value) {
        this.dataConsultaReceitaFederal = value;
    }

    /**
     * Obtém o valor da propriedade numeroNire.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroNire() {
        return numeroNire;
    }

    /**
     * Define o valor da propriedade numeroNire.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroNire(String value) {
        this.numeroNire = value;
    }

    /**
     * Obtém o valor da propriedade ufNire.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUfNire() {
        return ufNire;
    }

    /**
     * Define o valor da propriedade ufNire.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUfNire(String value) {
        this.ufNire = value;
    }

    /**
     * Obtém o valor da propriedade inscricaoEstadual.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    /**
     * Define o valor da propriedade inscricaoEstadual.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInscricaoEstadual(String value) {
        this.inscricaoEstadual = value;
    }

    /**
     * Obtém o valor da propriedade ufInscricaoEstadual.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUfInscricaoEstadual() {
        return ufInscricaoEstadual;
    }

    /**
     * Define o valor da propriedade ufInscricaoEstadual.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUfInscricaoEstadual(String value) {
        this.ufInscricaoEstadual = value;
    }

    /**
     * Obtém o valor da propriedade dataFundacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataFundacao() {
        return dataFundacao;
    }

    /**
     * Define o valor da propriedade dataFundacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataFundacao(String value) {
        this.dataFundacao = value;
    }

    /**
     * Obtém o valor da propriedade codigoNaturezaJuridica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoNaturezaJuridica() {
        return codigoNaturezaJuridica;
    }

    /**
     * Define o valor da propriedade codigoNaturezaJuridica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoNaturezaJuridica(String value) {
        this.codigoNaturezaJuridica = value;
    }

    /**
     * Obtém o valor da propriedade naturezaJuridica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaturezaJuridica() {
        return naturezaJuridica;
    }

    /**
     * Define o valor da propriedade naturezaJuridica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaturezaJuridica(String value) {
        this.naturezaJuridica = value;
    }

    /**
     * Obtém o valor da propriedade ramoAtividade.
     * 
     * @return
     *     possible object is
     *     {@link RamoAtividade }
     *     
     */
    public RamoAtividade getRamoAtividade() {
        return ramoAtividade;
    }

    /**
     * Define o valor da propriedade ramoAtividade.
     * 
     * @param value
     *     allowed object is
     *     {@link RamoAtividade }
     *     
     */
    public void setRamoAtividade(RamoAtividade value) {
        this.ramoAtividade = value;
    }

    /**
     * Obtém o valor da propriedade mensagem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensagem() {
        return mensagem;
    }

    /**
     * Define o valor da propriedade mensagem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensagem(String value) {
        this.mensagem = value;
    }

}
