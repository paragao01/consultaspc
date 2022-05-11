//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.05.10 às 08:06:45 AM BRT 
//


package br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.consultas;

import java.math.BigInteger;
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
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element name="quantidade_total" type="{http://boavistaservicos.com.br/define/xml/util}quantidade"/>
 *           &lt;element name="periodo_inicial" type="{http://boavistaservicos.com.br/define/xml/util}dataDiaMesAno"/>
 *           &lt;element name="periodo_final" type="{http://boavistaservicos.com.br/define/xml/util}dataDiaMesAno"/>
 *           &lt;element ref="{http://boavistaservicos.com.br/define/xml/consultas}consultas_mes" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://boavistaservicos.com.br/define/xml/consultas}ultimas_consultas" minOccurs="0"/>
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
    "quantidadeTotal",
    "periodoInicial",
    "periodoFinal",
    "consultasMes",
    "ultimasConsultas",
    "mensagem"
})
@XmlRootElement(name = "consultas")
public class Consultas {

    @XmlElement(name = "quantidade_total")
    protected BigInteger quantidadeTotal;
    @XmlElement(name = "periodo_inicial")
    protected String periodoInicial;
    @XmlElement(name = "periodo_final")
    protected String periodoFinal;
    @XmlElement(name = "consultas_mes")
    protected List<ConsultasMes> consultasMes;
    @XmlElement(name = "ultimas_consultas")
    protected UltimasConsultas ultimasConsultas;
    protected String mensagem;

    /**
     * Obtém o valor da propriedade quantidadeTotal.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantidadeTotal() {
        return quantidadeTotal;
    }

    /**
     * Define o valor da propriedade quantidadeTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantidadeTotal(BigInteger value) {
        this.quantidadeTotal = value;
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
     * Gets the value of the consultasMes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consultasMes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsultasMes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsultasMes }
     * 
     * 
     */
    public List<ConsultasMes> getConsultasMes() {
        if (consultasMes == null) {
            consultasMes = new ArrayList<ConsultasMes>();
        }
        return this.consultasMes;
    }

    /**
     * Obtém o valor da propriedade ultimasConsultas.
     * 
     * @return
     *     possible object is
     *     {@link UltimasConsultas }
     *     
     */
    public UltimasConsultas getUltimasConsultas() {
        return ultimasConsultas;
    }

    /**
     * Define o valor da propriedade ultimasConsultas.
     * 
     * @param value
     *     allowed object is
     *     {@link UltimasConsultas }
     *     
     */
    public void setUltimasConsultas(UltimasConsultas value) {
        this.ultimasConsultas = value;
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
