//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.05.09 às 08:46:54 PM BRT 
//


package br.com.consultaspc.api.model.acertaEssencial.boavistaservicos.familia.acerta.pf.historico_cheque_informado;

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
 *         &lt;element name="tamanho" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoRegistro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="registro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="banco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contaCorrente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cheque" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataConsulta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="horaConsulta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rede" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "tamanho",
    "tipoRegistro",
    "registro",
    "tipoDocumento",
    "numeroDocumento",
    "banco",
    "agencia",
    "contaCorrente",
    "cheque",
    "dataConsulta",
    "horaConsulta",
    "rede"
})
@XmlRootElement(name = "historico_cheque_informado")
public class HistoricoChequeInformado {

    protected String tamanho;
    protected String tipoRegistro;
    protected String registro;
    protected String tipoDocumento;
    protected String numeroDocumento;
    protected String banco;
    protected String agencia;
    protected String contaCorrente;
    protected String cheque;
    protected String dataConsulta;
    protected String horaConsulta;
    protected String rede;

    /**
     * Obtém o valor da propriedade tamanho.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTamanho() {
        return tamanho;
    }

    /**
     * Define o valor da propriedade tamanho.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTamanho(String value) {
        this.tamanho = value;
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
     * Obtém o valor da propriedade dataConsulta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataConsulta() {
        return dataConsulta;
    }

    /**
     * Define o valor da propriedade dataConsulta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataConsulta(String value) {
        this.dataConsulta = value;
    }

    /**
     * Obtém o valor da propriedade horaConsulta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraConsulta() {
        return horaConsulta;
    }

    /**
     * Define o valor da propriedade horaConsulta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraConsulta(String value) {
        this.horaConsulta = value;
    }

    /**
     * Obtém o valor da propriedade rede.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRede() {
        return rede;
    }

    /**
     * Define o valor da propriedade rede.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRede(String value) {
        this.rede = value;
    }

}
