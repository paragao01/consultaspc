//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.05.10 às 08:06:45 AM BRT 
//


package br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.cheques_sustados;

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
 *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/cheques_sustados}cheques_sustado" maxOccurs="unbounded"/>
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
    "chequesSustado"
})
@XmlRootElement(name = "ultimas_ocorrencias")
public class UltimasOcorrencias {

    @XmlElement(name = "cheques_sustado", required = true)
    protected List<ChequesSustado> chequesSustado;

    /**
     * O elemento cheque_sustado pode se repetir ate 5 vezes. Cada elemento indica uma ocorrencia de cheque sustado.Gets the value of the chequesSustado property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chequesSustado property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChequesSustado().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChequesSustado }
     * 
     * 
     */
    public List<ChequesSustado> getChequesSustado() {
        if (chequesSustado == null) {
            chequesSustado = new ArrayList<ChequesSustado>();
        }
        return this.chequesSustado;
    }

}
