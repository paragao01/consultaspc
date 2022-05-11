//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.05.10 às 08:06:45 AM BRT 
//


package br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.cheques_sustados;

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
 *           &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="periodo_inicial" type="{http://boavistaservicos.com.br/define/xml/util}dataDiaMesAno" minOccurs="0"/>
 *           &lt;element name="periodo_final" type="{http://boavistaservicos.com.br/define/xml/util}dataDiaMesAno" minOccurs="0"/>
 *           &lt;element name="habilita" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *           &lt;element ref="{http://boavistaservicos.com.br/define/xml/cheques_sustados}ultimas_ocorrencias" minOccurs="0"/>
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
    "total",
    "periodoInicial",
    "periodoFinal",
    "habilita",
    "ultimasOcorrencias",
    "mensagem"
})
@XmlRootElement(name = "cheques_sustados")
public class ChequesSustados {

    protected String total;
    @XmlElement(name = "periodo_inicial")
    protected String periodoInicial;
    @XmlElement(name = "periodo_final")
    protected String periodoFinal;
    protected Boolean habilita;
    @XmlElement(name = "ultimas_ocorrencias")
    protected UltimasOcorrencias ultimasOcorrencias;
    protected String mensagem;

    /**
     * Obtém o valor da propriedade total.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotal() {
        return total;
    }

    /**
     * Define o valor da propriedade total.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotal(String value) {
        this.total = value;
    }

    /**
     * Obtém o valor da propriedade periodoInicial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodoInicial() {
        return periodoInicial;
    }

    /**
     * Define o valor da propriedade periodoInicial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodoInicial(String value) {
        this.periodoInicial = value;
    }

    /**
     * Obtém o valor da propriedade periodoFinal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodoFinal() {
        return periodoFinal;
    }

    /**
     * Define o valor da propriedade periodoFinal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodoFinal(String value) {
        this.periodoFinal = value;
    }

    /**
     * Obtém o valor da propriedade habilita.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHabilita() {
        return habilita;
    }

    /**
     * Define o valor da propriedade habilita.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHabilita(Boolean value) {
        this.habilita = value;
    }

    /**
     * Obtém o valor da propriedade ultimasOcorrencias.
     * 
     * @return
     *     possible object is
     *     {@link UltimasOcorrencias }
     *     
     */
    public UltimasOcorrencias getUltimasOcorrencias() {
        return ultimasOcorrencias;
    }

    /**
     * Define o valor da propriedade ultimasOcorrencias.
     * 
     * @param value
     *     allowed object is
     *     {@link UltimasOcorrencias }
     *     
     */
    public void setUltimasOcorrencias(UltimasOcorrencias value) {
        this.ultimasOcorrencias = value;
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
