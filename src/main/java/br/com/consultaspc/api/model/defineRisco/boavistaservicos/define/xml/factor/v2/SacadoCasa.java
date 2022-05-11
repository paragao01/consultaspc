//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.05.10 às 08:06:45 AM BRT 
//


package br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.factor.v2;

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
 *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/factor/v2}compromisso_total" minOccurs="0"/>
 *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/factor/v2}pontuacao_pagamento_total" minOccurs="0"/>
 *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/factor/v2}compromisso_a_vencer" minOccurs="0"/>
 *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/factor/v2}pontuacao_pagamento_a_vencer" minOccurs="0"/>
 *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/factor/v2}compromisso_ate_10_dias" minOccurs="0"/>
 *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/factor/v2}pontuacao_pagamento_ate_10_dias" minOccurs="0"/>
 *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/factor/v2}compromisso_ate_30_dias" minOccurs="0"/>
 *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/factor/v2}pontuacao_pagamento_ate_30_dias" minOccurs="0"/>
 *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/factor/v2}compromisso_mais_30_dias" minOccurs="0"/>
 *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/factor/v2}pontuacao_pagamento_mais_30_dias" minOccurs="0"/>
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
    "compromissoTotal",
    "pontuacaoPagamentoTotal",
    "compromissoAVencer",
    "pontuacaoPagamentoAVencer",
    "compromissoAte10Dias",
    "pontuacaoPagamentoAte10Dias",
    "compromissoAte30Dias",
    "pontuacaoPagamentoAte30Dias",
    "compromissoMais30Dias",
    "pontuacaoPagamentoMais30Dias"
})
@XmlRootElement(name = "sacado_casa")
public class SacadoCasa {

    @XmlElement(name = "compromisso_total")
    protected String compromissoTotal;
    @XmlElement(name = "pontuacao_pagamento_total")
    protected String pontuacaoPagamentoTotal;
    @XmlElement(name = "compromisso_a_vencer")
    protected String compromissoAVencer;
    @XmlElement(name = "pontuacao_pagamento_a_vencer")
    protected String pontuacaoPagamentoAVencer;
    @XmlElement(name = "compromisso_ate_10_dias")
    protected String compromissoAte10Dias;
    @XmlElement(name = "pontuacao_pagamento_ate_10_dias")
    protected String pontuacaoPagamentoAte10Dias;
    @XmlElement(name = "compromisso_ate_30_dias")
    protected String compromissoAte30Dias;
    @XmlElement(name = "pontuacao_pagamento_ate_30_dias")
    protected String pontuacaoPagamentoAte30Dias;
    @XmlElement(name = "compromisso_mais_30_dias")
    protected String compromissoMais30Dias;
    @XmlElement(name = "pontuacao_pagamento_mais_30_dias")
    protected String pontuacaoPagamentoMais30Dias;

    /**
     * Obtém o valor da propriedade compromissoTotal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompromissoTotal() {
        return compromissoTotal;
    }

    /**
     * Define o valor da propriedade compromissoTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompromissoTotal(String value) {
        this.compromissoTotal = value;
    }

    /**
     * Obtém o valor da propriedade pontuacaoPagamentoTotal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPontuacaoPagamentoTotal() {
        return pontuacaoPagamentoTotal;
    }

    /**
     * Define o valor da propriedade pontuacaoPagamentoTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPontuacaoPagamentoTotal(String value) {
        this.pontuacaoPagamentoTotal = value;
    }

    /**
     * Obtém o valor da propriedade compromissoAVencer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompromissoAVencer() {
        return compromissoAVencer;
    }

    /**
     * Define o valor da propriedade compromissoAVencer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompromissoAVencer(String value) {
        this.compromissoAVencer = value;
    }

    /**
     * Obtém o valor da propriedade pontuacaoPagamentoAVencer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPontuacaoPagamentoAVencer() {
        return pontuacaoPagamentoAVencer;
    }

    /**
     * Define o valor da propriedade pontuacaoPagamentoAVencer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPontuacaoPagamentoAVencer(String value) {
        this.pontuacaoPagamentoAVencer = value;
    }

    /**
     * Obtém o valor da propriedade compromissoAte10Dias.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompromissoAte10Dias() {
        return compromissoAte10Dias;
    }

    /**
     * Define o valor da propriedade compromissoAte10Dias.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompromissoAte10Dias(String value) {
        this.compromissoAte10Dias = value;
    }

    /**
     * Obtém o valor da propriedade pontuacaoPagamentoAte10Dias.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPontuacaoPagamentoAte10Dias() {
        return pontuacaoPagamentoAte10Dias;
    }

    /**
     * Define o valor da propriedade pontuacaoPagamentoAte10Dias.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPontuacaoPagamentoAte10Dias(String value) {
        this.pontuacaoPagamentoAte10Dias = value;
    }

    /**
     * Obtém o valor da propriedade compromissoAte30Dias.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompromissoAte30Dias() {
        return compromissoAte30Dias;
    }

    /**
     * Define o valor da propriedade compromissoAte30Dias.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompromissoAte30Dias(String value) {
        this.compromissoAte30Dias = value;
    }

    /**
     * Obtém o valor da propriedade pontuacaoPagamentoAte30Dias.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPontuacaoPagamentoAte30Dias() {
        return pontuacaoPagamentoAte30Dias;
    }

    /**
     * Define o valor da propriedade pontuacaoPagamentoAte30Dias.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPontuacaoPagamentoAte30Dias(String value) {
        this.pontuacaoPagamentoAte30Dias = value;
    }

    /**
     * Obtém o valor da propriedade compromissoMais30Dias.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompromissoMais30Dias() {
        return compromissoMais30Dias;
    }

    /**
     * Define o valor da propriedade compromissoMais30Dias.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompromissoMais30Dias(String value) {
        this.compromissoMais30Dias = value;
    }

    /**
     * Obtém o valor da propriedade pontuacaoPagamentoMais30Dias.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPontuacaoPagamentoMais30Dias() {
        return pontuacaoPagamentoMais30Dias;
    }

    /**
     * Define o valor da propriedade pontuacaoPagamentoMais30Dias.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPontuacaoPagamentoMais30Dias(String value) {
        this.pontuacaoPagamentoMais30Dias = value;
    }

}
