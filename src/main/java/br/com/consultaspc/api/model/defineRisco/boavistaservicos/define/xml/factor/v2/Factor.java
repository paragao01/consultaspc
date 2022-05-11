//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.05.10 às 08:06:45 AM BRT 
//


package br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.factor.v2;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/factor/v2}cedente_casa" minOccurs="0"/>
 *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/factor/v2}cedente_outros" minOccurs="0"/>
 *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/factor/v2}sacado_casa" minOccurs="0"/>
 *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/factor/v2}sacado_outros" minOccurs="0"/>
 *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/factor/v2}historico_como_cedente" maxOccurs="7" minOccurs="0"/>
 *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/factor/v2}historico_como_sacado" maxOccurs="7" minOccurs="0"/>
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
    "cedenteCasa",
    "cedenteOutros",
    "sacadoCasa",
    "sacadoOutros",
    "historicoComoCedente",
    "historicoComoSacado"
})
@XmlRootElement(name = "factor")
public class Factor {

    @XmlElement(name = "cedente_casa")
    protected CedenteCasa cedenteCasa;
    @XmlElement(name = "cedente_outros")
    protected CedenteOutros cedenteOutros;
    @XmlElement(name = "sacado_casa")
    protected SacadoCasa sacadoCasa;
    @XmlElement(name = "sacado_outros")
    protected SacadoOutros sacadoOutros;
    @XmlElement(name = "historico_como_cedente")
    protected List<HistoricoComoCedente> historicoComoCedente;
    @XmlElement(name = "historico_como_sacado")
    protected List<HistoricoComoSacado> historicoComoSacado;

    /**
     * Obtém o valor da propriedade cedenteCasa.
     * 
     * @return
     *     possible object is
     *     {@link CedenteCasa }
     *     
     */
    public CedenteCasa getCedenteCasa() {
        return cedenteCasa;
    }

    /**
     * Define o valor da propriedade cedenteCasa.
     * 
     * @param value
     *     allowed object is
     *     {@link CedenteCasa }
     *     
     */
    public void setCedenteCasa(CedenteCasa value) {
        this.cedenteCasa = value;
    }

    /**
     * Obtém o valor da propriedade cedenteOutros.
     * 
     * @return
     *     possible object is
     *     {@link CedenteOutros }
     *     
     */
    public CedenteOutros getCedenteOutros() {
        return cedenteOutros;
    }

    /**
     * Define o valor da propriedade cedenteOutros.
     * 
     * @param value
     *     allowed object is
     *     {@link CedenteOutros }
     *     
     */
    public void setCedenteOutros(CedenteOutros value) {
        this.cedenteOutros = value;
    }

    /**
     * Obtém o valor da propriedade sacadoCasa.
     * 
     * @return
     *     possible object is
     *     {@link SacadoCasa }
     *     
     */
    public SacadoCasa getSacadoCasa() {
        return sacadoCasa;
    }

    /**
     * Define o valor da propriedade sacadoCasa.
     * 
     * @param value
     *     allowed object is
     *     {@link SacadoCasa }
     *     
     */
    public void setSacadoCasa(SacadoCasa value) {
        this.sacadoCasa = value;
    }

    /**
     * Obtém o valor da propriedade sacadoOutros.
     * 
     * @return
     *     possible object is
     *     {@link SacadoOutros }
     *     
     */
    public SacadoOutros getSacadoOutros() {
        return sacadoOutros;
    }

    /**
     * Define o valor da propriedade sacadoOutros.
     * 
     * @param value
     *     allowed object is
     *     {@link SacadoOutros }
     *     
     */
    public void setSacadoOutros(SacadoOutros value) {
        this.sacadoOutros = value;
    }

    /**
     * Gets the value of the historicoComoCedente property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the historicoComoCedente property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHistoricoComoCedente().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HistoricoComoCedente }
     * 
     * 
     */
    public List<HistoricoComoCedente> getHistoricoComoCedente() {
        if (historicoComoCedente == null) {
            historicoComoCedente = new ArrayList<HistoricoComoCedente>();
        }
        return this.historicoComoCedente;
    }

    /**
     * Gets the value of the historicoComoSacado property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the historicoComoSacado property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHistoricoComoSacado().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HistoricoComoSacado }
     * 
     * 
     */
    public List<HistoricoComoSacado> getHistoricoComoSacado() {
        if (historicoComoSacado == null) {
            historicoComoSacado = new ArrayList<HistoricoComoSacado>();
        }
        return this.historicoComoSacado;
    }

}
