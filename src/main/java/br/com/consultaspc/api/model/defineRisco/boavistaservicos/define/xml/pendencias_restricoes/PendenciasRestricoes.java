//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.05.10 às 08:06:45 AM BRT 
//


package br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.pendencias_restricoes;

import java.math.BigDecimal;
import java.math.BigInteger;
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
 *           &lt;element name="total_pendencias" type="{http://boavistaservicos.com.br/define/xml/util}quantidade" minOccurs="0"/>
 *           &lt;element name="total_credores" type="{http://boavistaservicos.com.br/define/xml/util}quantidade" minOccurs="0"/>
 *           &lt;element name="valor" type="{http://boavistaservicos.com.br/define/xml/util}valor" minOccurs="0"/>
 *           &lt;element name="periodo_inicial" type="{http://boavistaservicos.com.br/define/xml/util}dataDiaMesAno" minOccurs="0"/>
 *           &lt;element name="periodo_final" type="{http://boavistaservicos.com.br/define/xml/util}dataDiaMesAno" minOccurs="0"/>
 *           &lt;element name="valor_primeiro" type="{http://boavistaservicos.com.br/define/xml/util}valor" minOccurs="0"/>
 *           &lt;element name="data_primeiro" type="{http://boavistaservicos.com.br/define/xml/util}dataDiaMesAno" minOccurs="0"/>
 *           &lt;element name="valor_maior" type="{http://boavistaservicos.com.br/define/xml/util}valor" minOccurs="0"/>
 *           &lt;element name="data_maior" type="{http://boavistaservicos.com.br/define/xml/util}dataDiaMesAno" minOccurs="0"/>
 *           &lt;element ref="{http://boavistaservicos.com.br/define/xml/pendencias_restricoes}ultimas_ocorrencias" minOccurs="0"/>
 *           &lt;element name="habilita" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "totalPendencias",
    "totalCredores",
    "valor",
    "periodoInicial",
    "periodoFinal",
    "valorPrimeiro",
    "dataPrimeiro",
    "valorMaior",
    "dataMaior",
    "ultimasOcorrencias",
    "habilita",
    "mensagem"
})
@XmlRootElement(name = "pendencias_restricoes")
public class PendenciasRestricoes {

    @XmlElement(name = "total_pendencias")
    protected BigInteger totalPendencias;
    @XmlElement(name = "total_credores")
    protected BigInteger totalCredores;
    protected BigDecimal valor;
    @XmlElement(name = "periodo_inicial")
    protected String periodoInicial;
    @XmlElement(name = "periodo_final")
    protected String periodoFinal;
    @XmlElement(name = "valor_primeiro")
    protected BigDecimal valorPrimeiro;
    @XmlElement(name = "data_primeiro")
    protected String dataPrimeiro;
    @XmlElement(name = "valor_maior")
    protected BigDecimal valorMaior;
    @XmlElement(name = "data_maior")
    protected String dataMaior;
    @XmlElement(name = "ultimas_ocorrencias")
    protected UltimasOcorrencias ultimasOcorrencias;
    protected Boolean habilita;
    protected String mensagem;

    /**
     * Obtém o valor da propriedade totalPendencias.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalPendencias() {
        return totalPendencias;
    }

    /**
     * Define o valor da propriedade totalPendencias.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalPendencias(BigInteger value) {
        this.totalPendencias = value;
    }

    /**
     * Obtém o valor da propriedade totalCredores.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalCredores() {
        return totalCredores;
    }

    /**
     * Define o valor da propriedade totalCredores.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalCredores(BigInteger value) {
        this.totalCredores = value;
    }

    /**
     * Obtém o valor da propriedade valor.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValor() {
        return valor;
    }

    /**
     * Define o valor da propriedade valor.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValor(BigDecimal value) {
        this.valor = value;
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
     * Obtém o valor da propriedade valorPrimeiro.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorPrimeiro() {
        return valorPrimeiro;
    }

    /**
     * Define o valor da propriedade valorPrimeiro.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorPrimeiro(BigDecimal value) {
        this.valorPrimeiro = value;
    }

    /**
     * Obtém o valor da propriedade dataPrimeiro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataPrimeiro() {
        return dataPrimeiro;
    }

    /**
     * Define o valor da propriedade dataPrimeiro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataPrimeiro(String value) {
        this.dataPrimeiro = value;
    }

    /**
     * Obtém o valor da propriedade valorMaior.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorMaior() {
        return valorMaior;
    }

    /**
     * Define o valor da propriedade valorMaior.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorMaior(BigDecimal value) {
        this.valorMaior = value;
    }

    /**
     * Obtém o valor da propriedade dataMaior.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataMaior() {
        return dataMaior;
    }

    /**
     * Define o valor da propriedade dataMaior.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataMaior(String value) {
        this.dataMaior = value;
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
