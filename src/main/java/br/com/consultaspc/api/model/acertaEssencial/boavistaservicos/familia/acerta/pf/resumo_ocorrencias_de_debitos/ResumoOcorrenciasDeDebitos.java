//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.05.09 às 08:46:54 PM BRT 
//


package br.com.consultaspc.api.model.acertaEssencial.boavistaservicos.familia.acerta.pf.resumo_ocorrencias_de_debitos;

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
 *         &lt;element name="totalDevedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalAvalista" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valorAcomulado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataPrimeiroDebito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valorPrimeiroDebito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataMaiorDebito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valorMaiorDebito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "totalDevedor",
    "totalAvalista",
    "valorAcomulado",
    "dataPrimeiroDebito",
    "valorPrimeiroDebito",
    "dataMaiorDebito",
    "valorMaiorDebito"
})
@XmlRootElement(name = "resumo_ocorrencias_de_debitos")
public class ResumoOcorrenciasDeDebitos {

    protected String tamanhoRegistro;
    protected String tipoRegistro;
    protected String registro;
    protected String totalDevedor;
    protected String totalAvalista;
    protected String valorAcomulado;
    protected String dataPrimeiroDebito;
    protected String valorPrimeiroDebito;
    protected String dataMaiorDebito;
    protected String valorMaiorDebito;

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
     * Obtém o valor da propriedade totalDevedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalDevedor() {
        return totalDevedor;
    }

    /**
     * Define o valor da propriedade totalDevedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalDevedor(String value) {
        this.totalDevedor = value;
    }

    /**
     * Obtém o valor da propriedade totalAvalista.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalAvalista() {
        return totalAvalista;
    }

    /**
     * Define o valor da propriedade totalAvalista.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalAvalista(String value) {
        this.totalAvalista = value;
    }

    /**
     * Obtém o valor da propriedade valorAcomulado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorAcomulado() {
        return valorAcomulado;
    }

    /**
     * Define o valor da propriedade valorAcomulado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorAcomulado(String value) {
        this.valorAcomulado = value;
    }

    /**
     * Obtém o valor da propriedade dataPrimeiroDebito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataPrimeiroDebito() {
        return dataPrimeiroDebito;
    }

    /**
     * Define o valor da propriedade dataPrimeiroDebito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataPrimeiroDebito(String value) {
        this.dataPrimeiroDebito = value;
    }

    /**
     * Obtém o valor da propriedade valorPrimeiroDebito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorPrimeiroDebito() {
        return valorPrimeiroDebito;
    }

    /**
     * Define o valor da propriedade valorPrimeiroDebito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorPrimeiroDebito(String value) {
        this.valorPrimeiroDebito = value;
    }

    /**
     * Obtém o valor da propriedade dataMaiorDebito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataMaiorDebito() {
        return dataMaiorDebito;
    }

    /**
     * Define o valor da propriedade dataMaiorDebito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataMaiorDebito(String value) {
        this.dataMaiorDebito = value;
    }

    /**
     * Obtém o valor da propriedade valorMaiorDebito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorMaiorDebito() {
        return valorMaiorDebito;
    }

    /**
     * Define o valor da propriedade valorMaiorDebito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorMaiorDebito(String value) {
        this.valorMaiorDebito = value;
    }

}
