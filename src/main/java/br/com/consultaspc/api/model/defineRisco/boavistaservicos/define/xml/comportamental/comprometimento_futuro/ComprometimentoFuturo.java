//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.05.10 às 08:06:45 AM BRT 
//


package br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.comportamental.comprometimento_futuro;

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
 *           &lt;element ref="{http://boavistaservicos.com.br/define/xml/comportamental/comprometimento_futuro}lista_compromissos"/>
 *           &lt;element ref="{http://boavistaservicos.com.br/define/xml/comportamental/comprometimento_futuro}lista_credito"/>
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
    "listaCompromissos",
    "listaCredito"
})
@XmlRootElement(name = "comprometimento_futuro")
public class ComprometimentoFuturo {

    @XmlElement(name = "lista_compromissos")
    protected ListaCompromissos listaCompromissos;
    @XmlElement(name = "lista_credito")
    protected ListaCredito listaCredito;

    /**
     * Obtém o valor da propriedade listaCompromissos.
     * 
     * @return
     *     possible object is
     *     {@link ListaCompromissos }
     *     
     */
    public ListaCompromissos getListaCompromissos() {
        return listaCompromissos;
    }

    /**
     * Define o valor da propriedade listaCompromissos.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaCompromissos }
     *     
     */
    public void setListaCompromissos(ListaCompromissos value) {
        this.listaCompromissos = value;
    }

    /**
     * Obtém o valor da propriedade listaCredito.
     * 
     * @return
     *     possible object is
     *     {@link ListaCredito }
     *     
     */
    public ListaCredito getListaCredito() {
        return listaCredito;
    }

    /**
     * Define o valor da propriedade listaCredito.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaCredito }
     *     
     */
    public void setListaCredito(ListaCredito value) {
        this.listaCredito = value;
    }

}
