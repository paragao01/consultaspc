//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.05.09 às 08:46:54 PM BRT 
//


package br.com.consultaspc.api.model.acertaEssencial.boavistaservicos.familia.acerta.pf.cheque_talao_sustado;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="tipoOcorrencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoDeDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="banco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contaCorrente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cheque" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="alinea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataOcorrencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataDisponibilizacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="informante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indicador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "tipoOcorrencia",
    "tipoDeDocumento",
    "numeroDocumento",
    "banco",
    "agencia",
    "contaCorrente",
    "cheque",
    "alinea",
    "dataOcorrencia",
    "dataDisponibilizacao",
    "informante",
    "indicador"
})
@XmlRootElement(name = "cheque_talao_sustado")
public class ChequeTalaoSustado {

    protected String tamanhoRegistro;
    protected String tipoRegistro;
    protected String registro;
    protected String tipoOcorrencia;
    protected String tipoDeDocumento;
    protected String numeroDocumento;
    protected String banco;
    protected String agencia;
    protected String contaCorrente;
    protected String cheque;
    protected String alinea;
    protected String dataOcorrencia;
    protected String dataDisponibilizacao;
    protected String informante;
    protected String indicador;

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
     * Obtém o valor da propriedade tipoOcorrencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoOcorrencia() {
        return tipoOcorrencia;
    }

    /**
     * Define o valor da propriedade tipoOcorrencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoOcorrencia(String value) {
        this.tipoOcorrencia = value;
    }

    /**
     * Obtém o valor da propriedade tipoDeDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDeDocumento() {
        return tipoDeDocumento;
    }

    /**
     * Define o valor da propriedade tipoDeDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDeDocumento(String value) {
        this.tipoDeDocumento = value;
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
     * Obtém o valor da propriedade contaCorrente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContaCorrente() {
        return contaCorrente;
    }

    /**
     * Define o valor da propriedade contaCorrente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContaCorrente(String value) {
        this.contaCorrente = value;
    }

    /**
     * Obtém o valor da propriedade cheque.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheque() {
        return cheque;
    }

    /**
     * Define o valor da propriedade cheque.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheque(String value) {
        this.cheque = value;
    }

    /**
     * Obtém o valor da propriedade alinea.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlinea() {
        return alinea;
    }

    /**
     * Define o valor da propriedade alinea.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlinea(String value) {
        this.alinea = value;
    }

    /**
     * Obtém o valor da propriedade dataOcorrencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataOcorrencia() {
        return dataOcorrencia;
    }

    /**
     * Define o valor da propriedade dataOcorrencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataOcorrencia(String value) {
        this.dataOcorrencia = value;
    }

    /**
     * Obtém o valor da propriedade dataDisponibilizacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataDisponibilizacao() {
        return dataDisponibilizacao;
    }

    /**
     * Define o valor da propriedade dataDisponibilizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataDisponibilizacao(String value) {
        this.dataDisponibilizacao = value;
    }

    /**
     * Obtém o valor da propriedade informante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformante() {
        return informante;
    }

    /**
     * Define o valor da propriedade informante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformante(String value) {
        this.informante = value;
    }

    /**
     * Obtém o valor da propriedade indicador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicador() {
        return indicador;
    }

    /**
     * Define o valor da propriedade indicador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicador(String value) {
        this.indicador = value;
    }

}
