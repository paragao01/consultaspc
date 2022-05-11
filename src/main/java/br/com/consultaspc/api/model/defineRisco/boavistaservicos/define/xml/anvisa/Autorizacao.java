//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.05.10 às 08:06:45 AM BRT 
//


package br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.anvisa;

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
 *         &lt;element name="autorizacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="situacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="data_autorizacao" type="{http://boavistaservicos.com.br/define/xml/util}dataDiaMesAno" minOccurs="0"/>
 *         &lt;element name="num_processo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipo_autorizacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipo_autorizacao2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="classe_atividade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "autorizacao",
    "situacao",
    "dataAutorizacao",
    "numProcesso",
    "tipoAutorizacao",
    "tipoAutorizacao2",
    "classeAtividade"
})
@XmlRootElement(name = "autorizacao")
public class Autorizacao {

    protected String autorizacao;
    protected String situacao;
    @XmlElement(name = "data_autorizacao")
    protected String dataAutorizacao;
    @XmlElement(name = "num_processo")
    protected String numProcesso;
    @XmlElement(name = "tipo_autorizacao")
    protected String tipoAutorizacao;
    @XmlElement(name = "tipo_autorizacao2")
    protected String tipoAutorizacao2;
    @XmlElement(name = "classe_atividade")
    protected String classeAtividade;

    /**
     * Obtém o valor da propriedade autorizacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutorizacao() {
        return autorizacao;
    }

    /**
     * Define o valor da propriedade autorizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutorizacao(String value) {
        this.autorizacao = value;
    }

    /**
     * Obtém o valor da propriedade situacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSituacao() {
        return situacao;
    }

    /**
     * Define o valor da propriedade situacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSituacao(String value) {
        this.situacao = value;
    }

    /**
     * Obtém o valor da propriedade dataAutorizacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataAutorizacao() {
        return dataAutorizacao;
    }

    /**
     * Define o valor da propriedade dataAutorizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataAutorizacao(String value) {
        this.dataAutorizacao = value;
    }

    /**
     * Obtém o valor da propriedade numProcesso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumProcesso() {
        return numProcesso;
    }

    /**
     * Define o valor da propriedade numProcesso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumProcesso(String value) {
        this.numProcesso = value;
    }

    /**
     * Obtém o valor da propriedade tipoAutorizacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoAutorizacao() {
        return tipoAutorizacao;
    }

    /**
     * Define o valor da propriedade tipoAutorizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoAutorizacao(String value) {
        this.tipoAutorizacao = value;
    }

    /**
     * Obtém o valor da propriedade tipoAutorizacao2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoAutorizacao2() {
        return tipoAutorizacao2;
    }

    /**
     * Define o valor da propriedade tipoAutorizacao2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoAutorizacao2(String value) {
        this.tipoAutorizacao2 = value;
    }

    /**
     * Obtém o valor da propriedade classeAtividade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClasseAtividade() {
        return classeAtividade;
    }

    /**
     * Define o valor da propriedade classeAtividade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClasseAtividade(String value) {
        this.classeAtividade = value;
    }

}
