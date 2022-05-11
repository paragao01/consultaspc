//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.05.10 às 08:06:45 AM BRT 
//


package br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.anvisa;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="resp_legal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resp_tecnico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="segundo_resp_legal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="segundo_resp_tecnico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="terceiro_resp_legal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="terceiro_resp_tecnico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="autorizacoes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://boavistaservicos.com.br/define/xml/anvisa}autorizacao" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "respLegal",
    "respTecnico",
    "segundoRespLegal",
    "segundoRespTecnico",
    "terceiroRespLegal",
    "terceiroRespTecnico",
    "autorizacoes"
})
@XmlRootElement(name = "farmacia_drogaria")
public class FarmaciaDrogaria {

    @XmlElement(name = "resp_legal")
    protected String respLegal;
    @XmlElement(name = "resp_tecnico")
    protected String respTecnico;
    @XmlElement(name = "segundo_resp_legal")
    protected String segundoRespLegal;
    @XmlElement(name = "segundo_resp_tecnico")
    protected String segundoRespTecnico;
    @XmlElement(name = "terceiro_resp_legal")
    protected String terceiroRespLegal;
    @XmlElement(name = "terceiro_resp_tecnico")
    protected String terceiroRespTecnico;
    protected FarmaciaDrogaria.Autorizacoes autorizacoes;

    /**
     * Obtém o valor da propriedade respLegal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRespLegal() {
        return respLegal;
    }

    /**
     * Define o valor da propriedade respLegal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRespLegal(String value) {
        this.respLegal = value;
    }

    /**
     * Obtém o valor da propriedade respTecnico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRespTecnico() {
        return respTecnico;
    }

    /**
     * Define o valor da propriedade respTecnico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRespTecnico(String value) {
        this.respTecnico = value;
    }

    /**
     * Obtém o valor da propriedade segundoRespLegal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegundoRespLegal() {
        return segundoRespLegal;
    }

    /**
     * Define o valor da propriedade segundoRespLegal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegundoRespLegal(String value) {
        this.segundoRespLegal = value;
    }

    /**
     * Obtém o valor da propriedade segundoRespTecnico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegundoRespTecnico() {
        return segundoRespTecnico;
    }

    /**
     * Define o valor da propriedade segundoRespTecnico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegundoRespTecnico(String value) {
        this.segundoRespTecnico = value;
    }

    /**
     * Obtém o valor da propriedade terceiroRespLegal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerceiroRespLegal() {
        return terceiroRespLegal;
    }

    /**
     * Define o valor da propriedade terceiroRespLegal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerceiroRespLegal(String value) {
        this.terceiroRespLegal = value;
    }

    /**
     * Obtém o valor da propriedade terceiroRespTecnico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerceiroRespTecnico() {
        return terceiroRespTecnico;
    }

    /**
     * Define o valor da propriedade terceiroRespTecnico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerceiroRespTecnico(String value) {
        this.terceiroRespTecnico = value;
    }

    /**
     * Obtém o valor da propriedade autorizacoes.
     * 
     * @return
     *     possible object is
     *     {@link FarmaciaDrogaria.Autorizacoes }
     *     
     */
    public FarmaciaDrogaria.Autorizacoes getAutorizacoes() {
        return autorizacoes;
    }

    /**
     * Define o valor da propriedade autorizacoes.
     * 
     * @param value
     *     allowed object is
     *     {@link FarmaciaDrogaria.Autorizacoes }
     *     
     */
    public void setAutorizacoes(FarmaciaDrogaria.Autorizacoes value) {
        this.autorizacoes = value;
    }


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
     *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/anvisa}autorizacao" maxOccurs="unbounded" minOccurs="0"/>
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
        "autorizacao"
    })
    public static class Autorizacoes {

        protected List<Autorizacao> autorizacao;

        /**
         * Gets the value of the autorizacao property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the autorizacao property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAutorizacao().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Autorizacao }
         * 
         * 
         */
        public List<Autorizacao> getAutorizacao() {
            if (autorizacao == null) {
                autorizacao = new ArrayList<Autorizacao>();
            }
            return this.autorizacao;
        }

    }

}
