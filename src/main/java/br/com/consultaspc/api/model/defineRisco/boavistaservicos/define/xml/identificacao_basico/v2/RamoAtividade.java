//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.05.10 às 08:06:45 AM BRT 
//


package br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.identificacao_basico.v2;

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
 *         &lt;element name="atividade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cnae" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "atividade",
    "cnae"
})
@XmlRootElement(name = "ramo_atividade")
public class RamoAtividade {

    protected String atividade;
    protected String cnae;

    /**
     * Obtém o valor da propriedade atividade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtividade() {
        return atividade;
    }

    /**
     * Define o valor da propriedade atividade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtividade(String value) {
        this.atividade = value;
    }

    /**
     * Obtém o valor da propriedade cnae.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnae() {
        return cnae;
    }

    /**
     * Define o valor da propriedade cnae.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnae(String value) {
        this.cnae = value;
    }

}
