//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.05.10 às 08:06:45 AM BRT 
//


package br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.faturamento_presumido.v2;

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
 *           &lt;element name="faixa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="faturamento_anual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "faixa",
    "faturamentoAnual",
    "mensagem"
})
@XmlRootElement(name = "faturamento_presumido")
public class FaturamentoPresumido {

    protected String faixa;
    @XmlElement(name = "faturamento_anual")
    protected String faturamentoAnual;
    protected String mensagem;

    /**
     * Obtém o valor da propriedade faixa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaixa() {
        return faixa;
    }

    /**
     * Define o valor da propriedade faixa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaixa(String value) {
        this.faixa = value;
    }

    /**
     * Obtém o valor da propriedade faturamentoAnual.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaturamentoAnual() {
        return faturamentoAnual;
    }

    /**
     * Define o valor da propriedade faturamentoAnual.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaturamentoAnual(String value) {
        this.faturamentoAnual = value;
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
