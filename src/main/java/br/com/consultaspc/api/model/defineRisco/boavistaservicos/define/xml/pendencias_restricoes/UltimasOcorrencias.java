//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.05.10 às 08:06:45 AM BRT 
//


package br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.pendencias_restricoes;

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
 *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/pendencias_restricoes}pendencia_restricao" maxOccurs="unbounded"/>
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
    "pendenciaRestricao"
})
@XmlRootElement(name = "ultimas_ocorrencias")
public class UltimasOcorrencias {

    @XmlElement(name = "pendencia_restricao", required = true)
    protected List<PendenciaRestricao> pendenciaRestricao;

    /**
     * Gets the value of the pendenciaRestricao property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pendenciaRestricao property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPendenciaRestricao().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PendenciaRestricao }
     * 
     * 
     */
    public List<PendenciaRestricao> getPendenciaRestricao() {
        if (pendenciaRestricao == null) {
            pendenciaRestricao = new ArrayList<PendenciaRestricao>();
        }
        return this.pendenciaRestricao;
    }

}
