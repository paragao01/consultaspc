//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.05.10 às 08:06:45 AM BRT 
//


package br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.comportamental.pagamento_pontual;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.comportamental.lista_indicador_comportamento.ListaIndicadorComportamento;


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
 *           &lt;element name="pontuacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element ref="{http://boavistaservicos.com.br/define/xml/comportamental/lista_indicador_comportamento}lista_indicador_comportamento"/>
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
    "pontuacao",
    "listaIndicadorComportamento"
})
@XmlRootElement(name = "pagamento_pontual")
public class PagamentoPontual {

    protected String pontuacao;
    @XmlElement(name = "lista_indicador_comportamento", namespace = "http://boavistaservicos.com.br/define/xml/comportamental/lista_indicador_comportamento")
    protected ListaIndicadorComportamento listaIndicadorComportamento;

    /**
     * Obtém o valor da propriedade pontuacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPontuacao() {
        return pontuacao;
    }

    /**
     * Define o valor da propriedade pontuacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPontuacao(String value) {
        this.pontuacao = value;
    }

    /**
     * Obtém o valor da propriedade listaIndicadorComportamento.
     * 
     * @return
     *     possible object is
     *     {@link ListaIndicadorComportamento }
     *     
     */
    public ListaIndicadorComportamento getListaIndicadorComportamento() {
        return listaIndicadorComportamento;
    }

    /**
     * Define o valor da propriedade listaIndicadorComportamento.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaIndicadorComportamento }
     *     
     */
    public void setListaIndicadorComportamento(ListaIndicadorComportamento value) {
        this.listaIndicadorComportamento = value;
    }

}
