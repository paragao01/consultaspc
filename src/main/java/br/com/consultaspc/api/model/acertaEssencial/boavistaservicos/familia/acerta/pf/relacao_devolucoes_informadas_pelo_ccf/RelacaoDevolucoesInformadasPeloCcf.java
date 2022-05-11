//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.05.09 às 08:46:54 PM BRT 
//


package br.com.consultaspc.api.model.acertaEssencial.boavistaservicos.familia.acerta.pf.relacao_devolucoes_informadas_pelo_ccf;

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
 *       &lt;sequence>
 *         &lt;element name="tamanhoRegistro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoRegistro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="registro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="banco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motivo_12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="data_ultima_ocorrencia_12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motivo_13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="data_ultima_ocorrencia_13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motivo_14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="data_ultima_ocorrencia_14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motivo_99" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="data_ultima_ocorrencia_99" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeBanco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "tamanhoRegistro",
    "tipoRegistro",
    "registro",
    "tipoDocumento",
    "numeroDocumento",
    "nome",
    "banco",
    "agencia",
    "motivo12",
    "dataUltimaOcorrencia12",
    "motivo13",
    "dataUltimaOcorrencia13",
    "motivo14",
    "dataUltimaOcorrencia14",
    "motivo99",
    "dataUltimaOcorrencia99",
    "nomeBanco"
})
@XmlRootElement(name = "relacao_devolucoes_informadas_pelo_ccf")
public class RelacaoDevolucoesInformadasPeloCcf {

    protected String tamanhoRegistro;
    protected String tipoRegistro;
    protected String registro;
    protected String tipoDocumento;
    protected String numeroDocumento;
    protected String nome;
    protected String banco;
    protected String agencia;
    @XmlElement(name = "motivo_12")
    protected String motivo12;
    @XmlElement(name = "data_ultima_ocorrencia_12")
    protected String dataUltimaOcorrencia12;
    @XmlElement(name = "motivo_13")
    protected String motivo13;
    @XmlElement(name = "data_ultima_ocorrencia_13")
    protected String dataUltimaOcorrencia13;
    @XmlElement(name = "motivo_14")
    protected String motivo14;
    @XmlElement(name = "data_ultima_ocorrencia_14")
    protected String dataUltimaOcorrencia14;
    @XmlElement(name = "motivo_99")
    protected String motivo99;
    @XmlElement(name = "data_ultima_ocorrencia_99")
    protected String dataUltimaOcorrencia99;
    protected String nomeBanco;

    /**
     * Obtém o valor da propriedade tamanhoRegistro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTamanhoRegistro() {
        return tamanhoRegistro;
    }

    /**
     * Define o valor da propriedade tamanhoRegistro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTamanhoRegistro(String value) {
        this.tamanhoRegistro = value;
    }

    /**
     * Obtém o valor da propriedade tipoRegistro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoRegistro() {
        return tipoRegistro;
    }

    /**
     * Define o valor da propriedade tipoRegistro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoRegistro(String value) {
        this.tipoRegistro = value;
    }

    /**
     * Obtém o valor da propriedade registro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistro() {
        return registro;
    }

    /**
     * Define o valor da propriedade registro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistro(String value) {
        this.registro = value;
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
     * Obtém o valor da propriedade numeroDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    /**
     * Define o valor da propriedade numeroDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDocumento(String value) {
        this.numeroDocumento = value;
    }

    /**
     * Obtém o valor da propriedade nome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o valor da propriedade nome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Obtém o valor da propriedade banco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBanco() {
        return banco;
    }

    /**
     * Define o valor da propriedade banco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBanco(String value) {
        this.banco = value;
    }

    /**
     * Obtém o valor da propriedade agencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencia() {
        return agencia;
    }

    /**
     * Define o valor da propriedade agencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencia(String value) {
        this.agencia = value;
    }

    /**
     * Obtém o valor da propriedade motivo12.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivo12() {
        return motivo12;
    }

    /**
     * Define o valor da propriedade motivo12.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivo12(String value) {
        this.motivo12 = value;
    }

    /**
     * Obtém o valor da propriedade dataUltimaOcorrencia12.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataUltimaOcorrencia12() {
        return dataUltimaOcorrencia12;
    }

    /**
     * Define o valor da propriedade dataUltimaOcorrencia12.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataUltimaOcorrencia12(String value) {
        this.dataUltimaOcorrencia12 = value;
    }

    /**
     * Obtém o valor da propriedade motivo13.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivo13() {
        return motivo13;
    }

    /**
     * Define o valor da propriedade motivo13.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivo13(String value) {
        this.motivo13 = value;
    }

    /**
     * Obtém o valor da propriedade dataUltimaOcorrencia13.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataUltimaOcorrencia13() {
        return dataUltimaOcorrencia13;
    }

    /**
     * Define o valor da propriedade dataUltimaOcorrencia13.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataUltimaOcorrencia13(String value) {
        this.dataUltimaOcorrencia13 = value;
    }

    /**
     * Obtém o valor da propriedade motivo14.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivo14() {
        return motivo14;
    }

    /**
     * Define o valor da propriedade motivo14.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivo14(String value) {
        this.motivo14 = value;
    }

    /**
     * Obtém o valor da propriedade dataUltimaOcorrencia14.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataUltimaOcorrencia14() {
        return dataUltimaOcorrencia14;
    }

    /**
     * Define o valor da propriedade dataUltimaOcorrencia14.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataUltimaOcorrencia14(String value) {
        this.dataUltimaOcorrencia14 = value;
    }

    /**
     * Obtém o valor da propriedade motivo99.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivo99() {
        return motivo99;
    }

    /**
     * Define o valor da propriedade motivo99.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivo99(String value) {
        this.motivo99 = value;
    }

    /**
     * Obtém o valor da propriedade dataUltimaOcorrencia99.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataUltimaOcorrencia99() {
        return dataUltimaOcorrencia99;
    }

    /**
     * Define o valor da propriedade dataUltimaOcorrencia99.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataUltimaOcorrencia99(String value) {
        this.dataUltimaOcorrencia99 = value;
    }

    /**
     * Obtém o valor da propriedade nomeBanco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeBanco() {
        return nomeBanco;
    }

    /**
     * Define o valor da propriedade nomeBanco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeBanco(String value) {
        this.nomeBanco = value;
    }

}
