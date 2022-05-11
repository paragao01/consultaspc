//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.05.10 às 08:06:45 AM BRT 
//


package br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.consultas;

import java.math.BigInteger;
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
 *         &lt;element name="mes_ano" type="{http://boavistaservicos.com.br/define/xml/util}dataMesAno"/>
 *         &lt;element name="quantidade" type="{http://boavistaservicos.com.br/define/xml/util}quantidade"/>
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
    "quantidade"
})
@XmlRootElement(name = "consultas_mes")
public class ConsultasMes {

    @XmlElement(name = "mes_ano", required = true)
    protected String mesAno;
    @XmlElement(required = true)
    protected BigInteger quantidade;

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
     * Obtém o valor da propriedade quantidade.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantidade() {
        return quantidade;
    }

    /**
     * Define o valor da propriedade quantidade.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantidade(BigInteger value) {
        this.quantidade = value;
    }

}
