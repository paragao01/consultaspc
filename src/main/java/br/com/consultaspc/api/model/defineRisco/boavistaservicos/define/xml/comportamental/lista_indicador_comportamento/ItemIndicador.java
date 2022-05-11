//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.05.10 às 08:06:45 AM BRT 
//


package br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.comportamental.lista_indicador_comportamento;

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
 *         &lt;element name="mes_ano" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pontuacao_mensal" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "mesAno",
    "pontuacaoMensal"
})
@XmlRootElement(name = "item_indicador")
public class ItemIndicador {

    @XmlElement(name = "mes_ano", required = true)
    protected String mesAno;
    @XmlElement(name = "pontuacao_mensal", required = true)
    protected String pontuacaoMensal;

    /**
     * Obtém o valor da propriedade mesAno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMesAno() {
        return mesAno;
    }

    /**
     * Define o valor da propriedade mesAno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMesAno(String value) {
        this.mesAno = value;
    }

    /**
     * Obtém o valor da propriedade pontuacaoMensal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPontuacaoMensal() {
        return pontuacaoMensal;
    }

    /**
     * Define o valor da propriedade pontuacaoMensal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPontuacaoMensal(String value) {
        this.pontuacaoMensal = value;
    }

}
