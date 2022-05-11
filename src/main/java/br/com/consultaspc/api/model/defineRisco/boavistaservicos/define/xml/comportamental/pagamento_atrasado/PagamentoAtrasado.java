//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.05.10 às 08:06:45 AM BRT 
//


package br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.comportamental.pagamento_atrasado;

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
 *           &lt;element name="periodo_6_a_15_dias" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="pontuacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element ref="{http://boavistaservicos.com.br/define/xml/comportamental/lista_indicador_comportamento}lista_indicador_comportamento"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="periodo_16_a_30_dias" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="pontuacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element ref="{http://boavistaservicos.com.br/define/xml/comportamental/lista_indicador_comportamento}lista_indicador_comportamento"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="periodo_31_a_60_dias" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="pontuacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element ref="{http://boavistaservicos.com.br/define/xml/comportamental/lista_indicador_comportamento}lista_indicador_comportamento"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="mais_de_60_dias" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="pontuacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element ref="{http://boavistaservicos.com.br/define/xml/comportamental/lista_indicador_comportamento}lista_indicador_comportamento"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="atraso_medio_dias" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="pontuacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element ref="{http://boavistaservicos.com.br/define/xml/comportamental/lista_indicador_comportamento}lista_indicador_comportamento"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
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
    "periodo6A15Dias",
    "periodo16A30Dias",
    "periodo31A60Dias",
    "maisDe60Dias",
    "atrasoMedioDias"
})
@XmlRootElement(name = "pagamento_atrasado")
public class PagamentoAtrasado {

    @XmlElement(name = "periodo_6_a_15_dias")
    protected PagamentoAtrasado.Periodo6A15Dias periodo6A15Dias;
    @XmlElement(name = "periodo_16_a_30_dias")
    protected PagamentoAtrasado.Periodo16A30Dias periodo16A30Dias;
    @XmlElement(name = "periodo_31_a_60_dias")
    protected PagamentoAtrasado.Periodo31A60Dias periodo31A60Dias;
    @XmlElement(name = "mais_de_60_dias")
    protected PagamentoAtrasado.MaisDe60Dias maisDe60Dias;
    @XmlElement(name = "atraso_medio_dias")
    protected PagamentoAtrasado.AtrasoMedioDias atrasoMedioDias;

    /**
     * Obtém o valor da propriedade periodo6A15Dias.
     * 
     * @return
     *     possible object is
     *     {@link PagamentoAtrasado.Periodo6A15Dias }
     *     
     */
    public PagamentoAtrasado.Periodo6A15Dias getPeriodo6A15Dias() {
        return periodo6A15Dias;
    }

    /**
     * Define o valor da propriedade periodo6A15Dias.
     * 
     * @param value
     *     allowed object is
     *     {@link PagamentoAtrasado.Periodo6A15Dias }
     *     
     */
    public void setPeriodo6A15Dias(PagamentoAtrasado.Periodo6A15Dias value) {
        this.periodo6A15Dias = value;
    }

    /**
     * Obtém o valor da propriedade periodo16A30Dias.
     * 
     * @return
     *     possible object is
     *     {@link PagamentoAtrasado.Periodo16A30Dias }
     *     
     */
    public PagamentoAtrasado.Periodo16A30Dias getPeriodo16A30Dias() {
        return periodo16A30Dias;
    }

    /**
     * Define o valor da propriedade periodo16A30Dias.
     * 
     * @param value
     *     allowed object is
     *     {@link PagamentoAtrasado.Periodo16A30Dias }
     *     
     */
    public void setPeriodo16A30Dias(PagamentoAtrasado.Periodo16A30Dias value) {
        this.periodo16A30Dias = value;
    }

    /**
     * Obtém o valor da propriedade periodo31A60Dias.
     * 
     * @return
     *     possible object is
     *     {@link PagamentoAtrasado.Periodo31A60Dias }
     *     
     */
    public PagamentoAtrasado.Periodo31A60Dias getPeriodo31A60Dias() {
        return periodo31A60Dias;
    }

    /**
     * Define o valor da propriedade periodo31A60Dias.
     * 
     * @param value
     *     allowed object is
     *     {@link PagamentoAtrasado.Periodo31A60Dias }
     *     
     */
    public void setPeriodo31A60Dias(PagamentoAtrasado.Periodo31A60Dias value) {
        this.periodo31A60Dias = value;
    }

    /**
     * Obtém o valor da propriedade maisDe60Dias.
     * 
     * @return
     *     possible object is
     *     {@link PagamentoAtrasado.MaisDe60Dias }
     *     
     */
    public PagamentoAtrasado.MaisDe60Dias getMaisDe60Dias() {
        return maisDe60Dias;
    }

    /**
     * Define o valor da propriedade maisDe60Dias.
     * 
     * @param value
     *     allowed object is
     *     {@link PagamentoAtrasado.MaisDe60Dias }
     *     
     */
    public void setMaisDe60Dias(PagamentoAtrasado.MaisDe60Dias value) {
        this.maisDe60Dias = value;
    }

    /**
     * Obtém o valor da propriedade atrasoMedioDias.
     * 
     * @return
     *     possible object is
     *     {@link PagamentoAtrasado.AtrasoMedioDias }
     *     
     */
    public PagamentoAtrasado.AtrasoMedioDias getAtrasoMedioDias() {
        return atrasoMedioDias;
    }

    /**
     * Define o valor da propriedade atrasoMedioDias.
     * 
     * @param value
     *     allowed object is
     *     {@link PagamentoAtrasado.AtrasoMedioDias }
     *     
     */
    public void setAtrasoMedioDias(PagamentoAtrasado.AtrasoMedioDias value) {
        this.atrasoMedioDias = value;
    }


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
     *         &lt;element name="pontuacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/comportamental/lista_indicador_comportamento}lista_indicador_comportamento"/>
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
        "pontuacao",
        "listaIndicadorComportamento"
    })
    public static class AtrasoMedioDias {

        protected String pontuacao;
        @XmlElement(name = "lista_indicador_comportamento", namespace = "http://boavistaservicos.com.br/define/xml/comportamental/lista_indicador_comportamento", required = true)
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
     *         &lt;element name="pontuacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/comportamental/lista_indicador_comportamento}lista_indicador_comportamento"/>
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
        "pontuacao",
        "listaIndicadorComportamento"
    })
    public static class MaisDe60Dias {

        protected String pontuacao;
        @XmlElement(name = "lista_indicador_comportamento", namespace = "http://boavistaservicos.com.br/define/xml/comportamental/lista_indicador_comportamento", required = true)
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
     *         &lt;element name="pontuacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/comportamental/lista_indicador_comportamento}lista_indicador_comportamento"/>
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
        "pontuacao",
        "listaIndicadorComportamento"
    })
    public static class Periodo16A30Dias {

        protected String pontuacao;
        @XmlElement(name = "lista_indicador_comportamento", namespace = "http://boavistaservicos.com.br/define/xml/comportamental/lista_indicador_comportamento", required = true)
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
     *         &lt;element name="pontuacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/comportamental/lista_indicador_comportamento}lista_indicador_comportamento"/>
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
        "pontuacao",
        "listaIndicadorComportamento"
    })
    public static class Periodo31A60Dias {

        protected String pontuacao;
        @XmlElement(name = "lista_indicador_comportamento", namespace = "http://boavistaservicos.com.br/define/xml/comportamental/lista_indicador_comportamento", required = true)
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
     *         &lt;element name="pontuacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/comportamental/lista_indicador_comportamento}lista_indicador_comportamento"/>
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
        "pontuacao",
        "listaIndicadorComportamento"
    })
    public static class Periodo6A15Dias {

        protected String pontuacao;
        @XmlElement(name = "lista_indicador_comportamento", namespace = "http://boavistaservicos.com.br/define/xml/comportamental/lista_indicador_comportamento", required = true)
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

}
