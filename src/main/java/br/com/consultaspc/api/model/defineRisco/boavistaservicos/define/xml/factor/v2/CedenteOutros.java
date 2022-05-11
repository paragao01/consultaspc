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
 *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/factor/v2}numero_factorings_total" minOccurs="0"/>
 *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/factor/v2}compromisso_total" minOccurs="0"/>
 *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/factor/v2}pontuacao_pagamento_total" minOccurs="0"/>
 *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/factor/v2}total_cedente_total" minOccurs="0"/>
 *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/factor/v2}numero_factorings_a_vencer" minOccurs="0"/>
 *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/factor/v2}compromisso_a_vencer" minOccurs="0"/>
 *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/factor/v2}pontuacao_pagamento_a_vencer" minOccurs="0"/>
 *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/factor/v2}total_cedente_a_vencer" minOccurs="0"/>
 *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/factor/v2}numero_factorings_ate_10_dias" minOccurs="0"/>
 *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/factor/v2}compromisso_ate_10_dias" minOccurs="0"/>
 *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/factor/v2}pontuacao_pagamento_ate_10_dias" minOccurs="0"/>
 *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/factor/v2}total_cedente_ate_10_dias" minOccurs="0"/>
 *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/factor/v2}numero_factorings_ate_30_dias" minOccurs="0"/>
 *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/factor/v2}compromisso_ate_30_dias" minOccurs="0"/>
 *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/factor/v2}pontuacao_pagamento_ate_30_dias" minOccurs="0"/>
 *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/factor/v2}total_cedente_ate_30_dias" minOccurs="0"/>
 *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/factor/v2}numero_factorings_mais_30_dias" minOccurs="0"/>
 *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/factor/v2}compromisso_mais_30_dias" minOccurs="0"/>
 *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/factor/v2}pontuacao_pagamento_mais_30_dias" minOccurs="0"/>
 *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/factor/v2}total_cedente_mais_30_dias" minOccurs="0"/>
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
    "numeroFactoringsTotal",
    "compromissoTotal",
    "pontuacaoPagamentoTotal",
    "totalCedenteTotal",
    "numeroFactoringsAVencer",
    "compromissoAVencer",
    "pontuacaoPagamentoAVencer",
    "totalCedenteAVencer",
    "numeroFactoringsAte10Dias",
    "compromissoAte10Dias",
    "pontuacaoPagamentoAte10Dias",
    "totalCedenteAte10Dias",
    "numeroFactoringsAte30Dias",
    "compromissoAte30Dias",
    "pontuacaoPagamentoAte30Dias",
    "totalCedenteAte30Dias",
    "numeroFactoringsMais30Dias",
    "compromissoMais30Dias",
    "pontuacaoPagamentoMais30Dias",
    "totalCedenteMais30Dias"
})
@XmlRootElement(name = "cedente_outros")
public class CedenteOutros {

    @XmlElement(name = "numero_factorings_total")
    protected String numeroFactoringsTotal;
    @XmlElement(name = "compromisso_total")
    protected String compromissoTotal;
    @XmlElement(name = "pontuacao_pagamento_total")
    protected String pontuacaoPagamentoTotal;
    @XmlElement(name = "total_cedente_total")
    protected String totalCedenteTotal;
    @XmlElement(name = "numero_factorings_a_vencer")
    protected String numeroFactoringsAVencer;
    @XmlElement(name = "compromisso_a_vencer")
    protected String compromissoAVencer;
    @XmlElement(name = "pontuacao_pagamento_a_vencer")
    protected String pontuacaoPagamentoAVencer;
    @XmlElement(name = "total_cedente_a_vencer")
    protected String totalCedenteAVencer;
    @XmlElement(name = "numero_factorings_ate_10_dias")
    protected String numeroFactoringsAte10Dias;
    @XmlElement(name = "compromisso_ate_10_dias")
    protected String compromissoAte10Dias;
    @XmlElement(name = "pontuacao_pagamento_ate_10_dias")
    protected String pontuacaoPagamentoAte10Dias;
    @XmlElement(name = "total_cedente_ate_10_dias")
    protected String totalCedenteAte10Dias;
    @XmlElement(name = "numero_factorings_ate_30_dias")
    protected String numeroFactoringsAte30Dias;
    @XmlElement(name = "compromisso_ate_30_dias")
    protected String compromissoAte30Dias;
    @XmlElement(name = "pontuacao_pagamento_ate_30_dias")
    protected String pontuacaoPagamentoAte30Dias;
    @XmlElement(name = "total_cedente_ate_30_dias")
    protected String totalCedenteAte30Dias;
    @XmlElement(name = "numero_factorings_mais_30_dias")
    protected String numeroFactoringsMais30Dias;
    @XmlElement(name = "compromisso_mais_30_dias")
    protected String compromissoMais30Dias;
    @XmlElement(name = "pontuacao_pagamento_mais_30_dias")
    protected String pontuacaoPagamentoMais30Dias;
    @XmlElement(name = "total_cedente_mais_30_dias")
    protected String totalCedenteMais30Dias;

    /**
     * Obtém o valor da propriedade numeroFactoringsTotal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroFactoringsTotal() {
        return numeroFactoringsTotal;
    }

    /**
     * Define o valor da propriedade numeroFactoringsTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroFactoringsTotal(String value) {
        this.numeroFactoringsTotal = value;
    }

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
     * Obtém o valor da propriedade totalCedenteTotal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalCedenteTotal() {
        return totalCedenteTotal;
    }

    /**
     * Define o valor da propriedade totalCedenteTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalCedenteTotal(String value) {
        this.totalCedenteTotal = value;
    }

    /**
     * Obtém o valor da propriedade numeroFactoringsAVencer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroFactoringsAVencer() {
        return numeroFactoringsAVencer;
    }

    /**
     * Define o valor da propriedade numeroFactoringsAVencer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroFactoringsAVencer(String value) {
        this.numeroFactoringsAVencer = value;
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
     * Obtém o valor da propriedade totalCedenteAVencer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalCedenteAVencer() {
        return totalCedenteAVencer;
    }

    /**
     * Define o valor da propriedade totalCedenteAVencer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalCedenteAVencer(String value) {
        this.totalCedenteAVencer = value;
    }

    /**
     * Obtém o valor da propriedade numeroFactoringsAte10Dias.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroFactoringsAte10Dias() {
        return numeroFactoringsAte10Dias;
    }

    /**
     * Define o valor da propriedade numeroFactoringsAte10Dias.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroFactoringsAte10Dias(String value) {
        this.numeroFactoringsAte10Dias = value;
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
     * Obtém o valor da propriedade totalCedenteAte10Dias.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalCedenteAte10Dias() {
        return totalCedenteAte10Dias;
    }

    /**
     * Define o valor da propriedade totalCedenteAte10Dias.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalCedenteAte10Dias(String value) {
        this.totalCedenteAte10Dias = value;
    }

    /**
     * Obtém o valor da propriedade numeroFactoringsAte30Dias.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroFactoringsAte30Dias() {
        return numeroFactoringsAte30Dias;
    }

    /**
     * Define o valor da propriedade numeroFactoringsAte30Dias.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroFactoringsAte30Dias(String value) {
        this.numeroFactoringsAte30Dias = value;
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
     * Obtém o valor da propriedade totalCedenteAte30Dias.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalCedenteAte30Dias() {
        return totalCedenteAte30Dias;
    }

    /**
     * Define o valor da propriedade totalCedenteAte30Dias.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalCedenteAte30Dias(String value) {
        this.totalCedenteAte30Dias = value;
    }

    /**
     * Obtém o valor da propriedade numeroFactoringsMais30Dias.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroFactoringsMais30Dias() {
        return numeroFactoringsMais30Dias;
    }

    /**
     * Define o valor da propriedade numeroFactoringsMais30Dias.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroFactoringsMais30Dias(String value) {
        this.numeroFactoringsMais30Dias = value;
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

    /**
     * Obtém o valor da propriedade totalCedenteMais30Dias.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalCedenteMais30Dias() {
        return totalCedenteMais30Dias;
    }

    /**
     * Define o valor da propriedade totalCedenteMais30Dias.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalCedenteMais30Dias(String value) {
        this.totalCedenteMais30Dias = value;
    }

}
