//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.05.09 às 08:46:54 PM BRT 
//


package br.com.consultaspc.api.model.acertaEssencial.boavistaservicos.familia.acerta.pf.resumo_devolucoes_informadas_pelo_ccf;

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
 *         &lt;element name="tamanhoRegistro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoRegistro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="registro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalNomes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalDevolucoes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motivo_12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motivo_13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motivo_14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motivo_99" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "nome",
    "totalNomes",
    "totalDevolucoes",
    "motivo12",
    "motivo13",
    "motivo14",
    "motivo99"
})
@XmlRootElement(name = "resumo_devolucoes_informadas_pelo_ccf")
public class ResumoDevolucoesInformadasPeloCcf {

    protected String tamanhoRegistro;
    protected String tipoRegistro;
    protected String registro;
    protected String tipoDocumento;
    protected String numeroDocumento;
    protected String nome;
    protected String totalNomes;
    protected String totalDevolucoes;
    @XmlElement(name = "motivo_12")
    protected String motivo12;
    @XmlElement(name = "motivo_13")
    protected String motivo13;
    @XmlElement(name = "motivo_14")
    protected String motivo14;
    @XmlElement(name = "motivo_99")
    protected String motivo99;

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
     * Obtém o valor da propriedade nome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o valor da propriedade nome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Obtém o valor da propriedade totalNomes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalNomes() {
        return totalNomes;
    }

    /**
     * Define o valor da propriedade totalNomes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalNomes(String value) {
        this.totalNomes = value;
    }

    /**
     * Obtém o valor da propriedade totalDevolucoes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalDevolucoes() {
        return totalDevolucoes;
    }

    /**
     * Define o valor da propriedade totalDevolucoes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalDevolucoes(String value) {
        this.totalDevolucoes = value;
    }

    /**
     * Obtém o valor da propriedade motivo12.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivo12() {
        return motivo12;
    }

    /**
     * Define o valor da propriedade motivo12.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivo12(String value) {
        this.motivo12 = value;
    }

    /**
     * Obtém o valor da propriedade motivo13.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivo13() {
        return motivo13;
    }

    /**
     * Define o valor da propriedade motivo13.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivo13(String value) {
        this.motivo13 = value;
    }

    /**
     * Obtém o valor da propriedade motivo14.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivo14() {
        return motivo14;
    }

    /**
     * Define o valor da propriedade motivo14.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivo14(String value) {
        this.motivo14 = value;
    }

    /**
     * Obtém o valor da propriedade motivo99.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivo99() {
        return motivo99;
    }

    /**
     * Define o valor da propriedade motivo99.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivo99(String value) {
        this.motivo99 = value;
    }

}
