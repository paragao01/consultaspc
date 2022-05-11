//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.05.10 às 08:06:45 AM BRT 
//


package br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.participacoes_socios_adm_outras_empresas;

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
 *         &lt;element name="nome_socio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cpf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/participacoes_socios_adm_outras_empresas}socios_participantes" maxOccurs="unbounded"/>
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
    "nomeSocio",
    "cpf",
    "sociosParticipantes"
})
@XmlRootElement(name = "socio")
public class Socio {

    @XmlElement(name = "nome_socio")
    protected String nomeSocio;
    protected String cpf;
    @XmlElement(name = "socios_participantes", required = true)
    protected List<SociosParticipantes> sociosParticipantes;

    /**
     * Obtém o valor da propriedade nomeSocio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeSocio() {
        return nomeSocio;
    }

    /**
     * Define o valor da propriedade nomeSocio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeSocio(String value) {
        this.nomeSocio = value;
    }

    /**
     * Obtém o valor da propriedade cpf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Define o valor da propriedade cpf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpf(String value) {
        this.cpf = value;
    }

    /**
     * Gets the value of the sociosParticipantes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sociosParticipantes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSociosParticipantes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SociosParticipantes }
     * 
     * 
     */
    public List<SociosParticipantes> getSociosParticipantes() {
        if (sociosParticipantes == null) {
            sociosParticipantes = new ArrayList<SociosParticipantes>();
        }
        return this.sociosParticipantes;
    }

}
