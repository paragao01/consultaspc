//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.05.09 às 08:46:54 PM BRT 
//


package br.com.consultaspc.api.model.acertaEssencial.boavistaservicos.familia.acerta.pf.resumoconsultas_anteriores_90_dias;

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
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ano_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mes_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="total_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ano_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mes_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="total_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ano_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mes_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="total_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ano_4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mes_4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="total_4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "total",
    "ano1",
    "mes1",
    "total1",
    "ano2",
    "mes2",
    "total2",
    "ano3",
    "mes3",
    "total3",
    "ano4",
    "mes4",
    "total4"
})
@XmlRootElement(name = "resumoConsultas_anteriores_90_dias")
public class ResumoConsultasAnteriores90Dias {

    protected String tamanhoRegistro;
    protected String tipoRegistro;
    protected String registro;
    protected String total;
    @XmlElement(name = "ano_1")
    protected String ano1;
    @XmlElement(name = "mes_1")
    protected String mes1;
    @XmlElement(name = "total_1")
    protected String total1;
    @XmlElement(name = "ano_2")
    protected String ano2;
    @XmlElement(name = "mes_2")
    protected String mes2;
    @XmlElement(name = "total_2")
    protected String total2;
    @XmlElement(name = "ano_3")
    protected String ano3;
    @XmlElement(name = "mes_3")
    protected String mes3;
    @XmlElement(name = "total_3")
    protected String total3;
    @XmlElement(name = "ano_4")
    protected String ano4;
    @XmlElement(name = "mes_4")
    protected String mes4;
    @XmlElement(name = "total_4")
    protected String total4;

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
     * Obtém o valor da propriedade ano1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAno1() {
        return ano1;
    }

    /**
     * Define o valor da propriedade ano1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAno1(String value) {
        this.ano1 = value;
    }

    /**
     * Obtém o valor da propriedade mes1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMes1() {
        return mes1;
    }

    /**
     * Define o valor da propriedade mes1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMes1(String value) {
        this.mes1 = value;
    }

    /**
     * Obtém o valor da propriedade total1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotal1() {
        return total1;
    }

    /**
     * Define o valor da propriedade total1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotal1(String value) {
        this.total1 = value;
    }

    /**
     * Obtém o valor da propriedade ano2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAno2() {
        return ano2;
    }

    /**
     * Define o valor da propriedade ano2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAno2(String value) {
        this.ano2 = value;
    }

    /**
     * Obtém o valor da propriedade mes2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMes2() {
        return mes2;
    }

    /**
     * Define o valor da propriedade mes2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMes2(String value) {
        this.mes2 = value;
    }

    /**
     * Obtém o valor da propriedade total2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotal2() {
        return total2;
    }

    /**
     * Define o valor da propriedade total2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotal2(String value) {
        this.total2 = value;
    }

    /**
     * Obtém o valor da propriedade ano3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAno3() {
        return ano3;
    }

    /**
     * Define o valor da propriedade ano3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAno3(String value) {
        this.ano3 = value;
    }

    /**
     * Obtém o valor da propriedade mes3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMes3() {
        return mes3;
    }

    /**
     * Define o valor da propriedade mes3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMes3(String value) {
        this.mes3 = value;
    }

    /**
     * Obtém o valor da propriedade total3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotal3() {
        return total3;
    }

    /**
     * Define o valor da propriedade total3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotal3(String value) {
        this.total3 = value;
    }

    /**
     * Obtém o valor da propriedade ano4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAno4() {
        return ano4;
    }

    /**
     * Define o valor da propriedade ano4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAno4(String value) {
        this.ano4 = value;
    }

    /**
     * Obtém o valor da propriedade mes4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMes4() {
        return mes4;
    }

    /**
     * Define o valor da propriedade mes4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMes4(String value) {
        this.mes4 = value;
    }

    /**
     * Obtém o valor da propriedade total4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotal4() {
        return total4;
    }

    /**
     * Define o valor da propriedade total4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotal4(String value) {
        this.total4 = value;
    }

}
