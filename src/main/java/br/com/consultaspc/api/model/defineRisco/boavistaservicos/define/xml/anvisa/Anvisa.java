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
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element ref="{http://boavistaservicos.com.br/define/xml/anvisa}farmacia_drogaria" minOccurs="0"/>
 *           &lt;element ref="{http://boavistaservicos.com.br/define/xml/anvisa}distribuidores" minOccurs="0"/>
 *           &lt;element ref="{http://boavistaservicos.com.br/define/xml/anvisa}peticoes" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element name="mensagem" type="{http://boavistaservicos.com.br/define/xml/util}mensagem" minOccurs="0"/>
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
    "farmaciaDrogaria",
    "distribuidores",
    "peticoes",
    "mensagem"
})
@XmlRootElement(name = "anvisa")
public class Anvisa {

    @XmlElement(name = "farmacia_drogaria")
    protected FarmaciaDrogaria farmaciaDrogaria;
    protected Distribuidores distribuidores;
    protected Peticoes peticoes;
    protected String mensagem;

    /**
     * Obtém o valor da propriedade farmaciaDrogaria.
     * 
     * @return
     *     possible object is
     *     {@link FarmaciaDrogaria }
     *     
     */
    public FarmaciaDrogaria getFarmaciaDrogaria() {
        return farmaciaDrogaria;
    }

    /**
     * Define o valor da propriedade farmaciaDrogaria.
     * 
     * @param value
     *     allowed object is
     *     {@link FarmaciaDrogaria }
     *     
     */
    public void setFarmaciaDrogaria(FarmaciaDrogaria value) {
        this.farmaciaDrogaria = value;
    }

    /**
     * Obtém o valor da propriedade distribuidores.
     * 
     * @return
     *     possible object is
     *     {@link Distribuidores }
     *     
     */
    public Distribuidores getDistribuidores() {
        return distribuidores;
    }

    /**
     * Define o valor da propriedade distribuidores.
     * 
     * @param value
     *     allowed object is
     *     {@link Distribuidores }
     *     
     */
    public void setDistribuidores(Distribuidores value) {
        this.distribuidores = value;
    }

    /**
     * Obtém o valor da propriedade peticoes.
     * 
     * @return
     *     possible object is
     *     {@link Peticoes }
     *     
     */
    public Peticoes getPeticoes() {
        return peticoes;
    }

    /**
     * Define o valor da propriedade peticoes.
     * 
     * @param value
     *     allowed object is
     *     {@link Peticoes }
     *     
     */
    public void setPeticoes(Peticoes value) {
        this.peticoes = value;
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
