//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.05.10 às 08:06:45 AM BRT 
//


package br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.pendencias_restricoes;

import java.math.BigDecimal;
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
 *           &lt;element name="informante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="cidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="uf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="documento_origem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="data_debito" type="{http://boavistaservicos.com.br/define/xml/util}dataDiaMesAno" minOccurs="0"/>
 *           &lt;element name="disponivel_em" type="{http://boavistaservicos.com.br/define/xml/util}dataDiaMesAno" minOccurs="0"/>
 *           &lt;element name="valor" type="{http://boavistaservicos.com.br/define/xml/util}valor" minOccurs="0"/>
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
    "informante",
    "tipo",
    "cidade",
    "uf",
    "documentoOrigem",
    "dataDebito",
    "disponivelEm",
    "valor"
})
@XmlRootElement(name = "pendencia_restricao")
public class PendenciaRestricao {

    protected String informante;
    protected String tipo;
    protected String cidade;
    protected String uf;
    @XmlElement(name = "documento_origem")
    protected String documentoOrigem;
    @XmlElement(name = "data_debito")
    protected String dataDebito;
    @XmlElement(name = "disponivel_em")
    protected String disponivelEm;
    protected BigDecimal valor;

    /**
     * Obtém o valor da propriedade informante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformante() {
        return informante;
    }

    /**
     * Define o valor da propriedade informante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformante(String value) {
        this.informante = value;
    }

    /**
     * Obtém o valor da propriedade tipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Define o valor da propriedade tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
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
     * Obtém o valor da propriedade uf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUf() {
        return uf;
    }

    /**
     * Define o valor da propriedade uf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUf(String value) {
        this.uf = value;
    }

    /**
     * Obtém o valor da propriedade documentoOrigem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentoOrigem() {
        return documentoOrigem;
    }

    /**
     * Define o valor da propriedade documentoOrigem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentoOrigem(String value) {
        this.documentoOrigem = value;
    }

    /**
     * Obtém o valor da propriedade dataDebito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataDebito() {
        return dataDebito;
    }

    /**
     * Define o valor da propriedade dataDebito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataDebito(String value) {
        this.dataDebito = value;
    }

    /**
     * Obtém o valor da propriedade disponivelEm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisponivelEm() {
        return disponivelEm;
    }

    /**
     * Define o valor da propriedade disponivelEm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisponivelEm(String value) {
        this.disponivelEm = value;
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

}
