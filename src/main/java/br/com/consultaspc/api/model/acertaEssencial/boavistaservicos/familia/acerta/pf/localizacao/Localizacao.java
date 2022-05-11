//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.05.09 às 08:46:54 PM BRT 
//


package br.com.consultaspc.api.model.acertaEssencial.boavistaservicos.familia.acerta.pf.localizacao;

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
 *         &lt;element name="tipoLogradouro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeLogradouro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroLogradouro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="complemento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bairro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unidadeFederativa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ddd_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telefone_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ddd_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telefone_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ddd_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telefone_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "tipoLogradouro",
    "nomeLogradouro",
    "numeroLogradouro",
    "complemento",
    "bairro",
    "cidade",
    "unidadeFederativa",
    "cep",
    "ddd1",
    "telefone1",
    "ddd2",
    "telefone2",
    "ddd3",
    "telefone3"
})
@XmlRootElement(name = "localizacao")
public class Localizacao {

    protected String tamanhoRegistro;
    protected String tipoRegistro;
    protected String registro;
    protected String tipoLogradouro;
    protected String nomeLogradouro;
    protected String numeroLogradouro;
    protected String complemento;
    protected String bairro;
    protected String cidade;
    protected String unidadeFederativa;
    protected String cep;
    @XmlElement(name = "ddd_1")
    protected String ddd1;
    @XmlElement(name = "telefone_1")
    protected String telefone1;
    @XmlElement(name = "ddd_2")
    protected String ddd2;
    @XmlElement(name = "telefone_2")
    protected String telefone2;
    @XmlElement(name = "ddd_3")
    protected String ddd3;
    @XmlElement(name = "telefone_3")
    protected String telefone3;

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
     * Obtém o valor da propriedade tipoLogradouro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoLogradouro() {
        return tipoLogradouro;
    }

    /**
     * Define o valor da propriedade tipoLogradouro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoLogradouro(String value) {
        this.tipoLogradouro = value;
    }

    /**
     * Obtém o valor da propriedade nomeLogradouro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeLogradouro() {
        return nomeLogradouro;
    }

    /**
     * Define o valor da propriedade nomeLogradouro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeLogradouro(String value) {
        this.nomeLogradouro = value;
    }

    /**
     * Obtém o valor da propriedade numeroLogradouro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroLogradouro() {
        return numeroLogradouro;
    }

    /**
     * Define o valor da propriedade numeroLogradouro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroLogradouro(String value) {
        this.numeroLogradouro = value;
    }

    /**
     * Obtém o valor da propriedade complemento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * Define o valor da propriedade complemento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplemento(String value) {
        this.complemento = value;
    }

    /**
     * Obtém o valor da propriedade bairro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * Define o valor da propriedade bairro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBairro(String value) {
        this.bairro = value;
    }

    /**
     * Obtém o valor da propriedade cidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * Define o valor da propriedade cidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCidade(String value) {
        this.cidade = value;
    }

    /**
     * Obtém o valor da propriedade unidadeFederativa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidadeFederativa() {
        return unidadeFederativa;
    }

    /**
     * Define o valor da propriedade unidadeFederativa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidadeFederativa(String value) {
        this.unidadeFederativa = value;
    }

    /**
     * Obtém o valor da propriedade cep.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCep() {
        return cep;
    }

    /**
     * Define o valor da propriedade cep.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCep(String value) {
        this.cep = value;
    }

    /**
     * Obtém o valor da propriedade ddd1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDdd1() {
        return ddd1;
    }

    /**
     * Define o valor da propriedade ddd1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDdd1(String value) {
        this.ddd1 = value;
    }

    /**
     * Obtém o valor da propriedade telefone1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefone1() {
        return telefone1;
    }

    /**
     * Define o valor da propriedade telefone1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefone1(String value) {
        this.telefone1 = value;
    }

    /**
     * Obtém o valor da propriedade ddd2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDdd2() {
        return ddd2;
    }

    /**
     * Define o valor da propriedade ddd2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDdd2(String value) {
        this.ddd2 = value;
    }

    /**
     * Obtém o valor da propriedade telefone2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefone2() {
        return telefone2;
    }

    /**
     * Define o valor da propriedade telefone2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefone2(String value) {
        this.telefone2 = value;
    }

    /**
     * Obtém o valor da propriedade ddd3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDdd3() {
        return ddd3;
    }

    /**
     * Define o valor da propriedade ddd3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDdd3(String value) {
        this.ddd3 = value;
    }

    /**
     * Obtém o valor da propriedade telefone3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefone3() {
        return telefone3;
    }

    /**
     * Define o valor da propriedade telefone3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefone3(String value) {
        this.telefone3 = value;
    }

}
