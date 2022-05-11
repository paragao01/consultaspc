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
 *         &lt;element name="data_entrada" type="{http://boavistaservicos.com.br/define/xml/util}dataDiaMesAno" minOccurs="0"/>
 *         &lt;element name="num_expediente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="situacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="protocolo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assunto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="processo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="local" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="publicacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resolucao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "dataEntrada",
    "numExpediente",
    "situacao",
    "protocolo",
    "assunto",
    "processo",
    "local",
    "publicacao",
    "resolucao"
})
@XmlRootElement(name = "peticao")
public class Peticao {

    @XmlElement(name = "data_entrada")
    protected String dataEntrada;
    @XmlElement(name = "num_expediente")
    protected String numExpediente;
    protected String situacao;
    protected String protocolo;
    protected String assunto;
    protected String processo;
    protected String local;
    protected String publicacao;
    protected String resolucao;

    /**
     * Obtém o valor da propriedade dataEntrada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataEntrada() {
        return dataEntrada;
    }

    /**
     * Define o valor da propriedade dataEntrada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataEntrada(String value) {
        this.dataEntrada = value;
    }

    /**
     * Obtém o valor da propriedade numExpediente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumExpediente() {
        return numExpediente;
    }

    /**
     * Define o valor da propriedade numExpediente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumExpediente(String value) {
        this.numExpediente = value;
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
     * Obtém o valor da propriedade protocolo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolo() {
        return protocolo;
    }

    /**
     * Define o valor da propriedade protocolo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocolo(String value) {
        this.protocolo = value;
    }

    /**
     * Obtém o valor da propriedade assunto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssunto() {
        return assunto;
    }

    /**
     * Define o valor da propriedade assunto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssunto(String value) {
        this.assunto = value;
    }

    /**
     * Obtém o valor da propriedade processo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcesso() {
        return processo;
    }

    /**
     * Define o valor da propriedade processo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcesso(String value) {
        this.processo = value;
    }

    /**
     * Obtém o valor da propriedade local.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocal() {
        return local;
    }

    /**
     * Define o valor da propriedade local.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocal(String value) {
        this.local = value;
    }

    /**
     * Obtém o valor da propriedade publicacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicacao() {
        return publicacao;
    }

    /**
     * Define o valor da propriedade publicacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicacao(String value) {
        this.publicacao = value;
    }

    /**
     * Obtém o valor da propriedade resolucao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResolucao() {
        return resolucao;
    }

    /**
     * Define o valor da propriedade resolucao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResolucao(String value) {
        this.resolucao = value;
    }

}
