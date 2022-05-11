//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.05.10 às 08:06:45 AM BRT 
//


package br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.comportamental.demais_informacoes;

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
 *         &lt;element name="indicador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="periodo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pontuacao" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "indicador",
    "periodo",
    "pontuacao"
})
@XmlRootElement(name = "historico_periodo_pontuacao")
public class HistoricoPeriodoPontuacao {

    @XmlElement(required = true)
    protected String indicador;
    @XmlElement(required = true)
    protected String periodo;
    @XmlElement(required = true)
    protected String pontuacao;

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

    /**
     * Obtém o valor da propriedade periodo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodo() {
        return periodo;
    }

    /**
     * Define o valor da propriedade periodo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodo(String value) {
        this.periodo = value;
    }

    /**
     * Obtém o valor da propriedade pontuacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPontuacao() {
        return pontuacao;
    }

    /**
     * Define o valor da propriedade pontuacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPontuacao(String value) {
        this.pontuacao = value;
    }

}
