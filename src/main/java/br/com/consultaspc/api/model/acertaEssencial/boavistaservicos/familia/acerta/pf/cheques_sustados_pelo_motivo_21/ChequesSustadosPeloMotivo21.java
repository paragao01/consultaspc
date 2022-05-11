//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.05.09 às 08:46:54 PM BRT 
//


package br.com.consultaspc.api.model.acertaEssencial.boavistaservicos.familia.acerta.pf.cheques_sustados_pelo_motivo_21;

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
 *         &lt;element name="tipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="banco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contaCorrente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chequeInicial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chequeFinal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="alinea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataOcorrencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataDisponibilizacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="moeda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="informante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "banco",
    "agencia",
    "contaCorrente",
    "chequeInicial",
    "chequeFinal",
    "alinea",
    "dataOcorrencia",
    "dataDisponibilizacao",
    "moeda",
    "valor",
    "informante"
})
@XmlRootElement(name = "cheques_sustados_pelo_motivo_21")
public class ChequesSustadosPeloMotivo21 {

    protected String tamanhoRegistro;
    protected String tipoRegistro;
    protected String registro;
    protected String tipoDocumento;
    protected String numeroDocumento;
    protected String banco;
    protected String agencia;
    protected String contaCorrente;
    protected String chequeInicial;
    protected String chequeFinal;
    protected String alinea;
    protected String dataOcorrencia;
    protected String dataDisponibilizacao;
    protected String moeda;
    protected String valor;
    protected String informante;

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
     * Obtém o valor da propriedade chequeInicial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChequeInicial() {
        return chequeInicial;
    }

    /**
     * Define o valor da propriedade chequeInicial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChequeInicial(String value) {
        this.chequeInicial = value;
    }

    /**
     * Obtém o valor da propriedade chequeFinal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChequeFinal() {
        return chequeFinal;
    }

    /**
     * Define o valor da propriedade chequeFinal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChequeFinal(String value) {
        this.chequeFinal = value;
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
     * Obtém o valor da propriedade moeda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoeda() {
        return moeda;
    }

    /**
     * Define o valor da propriedade moeda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoeda(String value) {
        this.moeda = value;
    }

    /**
     * Obtém o valor da propriedade valor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValor() {
        return valor;
    }

    /**
     * Define o valor da propriedade valor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValor(String value) {
        this.valor = value;
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

}
