//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.05.10 às 08:06:45 AM BRT 
//


package br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.restricoes_documento;

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
 *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/restricoes_documento}pendencias_restricoes"/>
 *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/restricoes_documento}cheques_sem_fundo"/>
 *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/restricoes_documento}protestos"/>
 *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/restricoes_documento}acoes_judiciais"/>
 *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/restricoes_documento}falencias_recuperacao_judicial"/>
 *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/restricoes_documento}consultas"/>
 *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/restricoes_documento}titulos_vencer"/>
 *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/restricoes_documento}pagamentos"/>
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
    "pendenciasRestricoes",
    "chequesSemFundo",
    "protestos",
    "acoesJudiciais",
    "falenciasRecuperacaoJudicial",
    "consultas",
    "titulosVencer",
    "pagamentos"
})
@XmlRootElement(name = "restricoes_documento")
public class RestricoesDocumento {

    @XmlElement(name = "pendencias_restricoes", required = true)
    protected PendenciasRestricoes pendenciasRestricoes;
    @XmlElement(name = "cheques_sem_fundo", required = true)
    protected ChequesSemFundo chequesSemFundo;
    @XmlElement(required = true)
    protected Protestos protestos;
    @XmlElement(name = "acoes_judiciais", required = true)
    protected AcoesJudiciais acoesJudiciais;
    @XmlElement(name = "falencias_recuperacao_judicial", required = true)
    protected FalenciasRecuperacaoJudicial falenciasRecuperacaoJudicial;
    @XmlElement(required = true)
    protected Consultas consultas;
    @XmlElement(name = "titulos_vencer", required = true)
    protected TitulosVencer titulosVencer;
    @XmlElement(required = true)
    protected Pagamentos pagamentos;

    /**
     * Obtém o valor da propriedade pendenciasRestricoes.
     * 
     * @return
     *     possible object is
     *     {@link PendenciasRestricoes }
     *     
     */
    public PendenciasRestricoes getPendenciasRestricoes() {
        return pendenciasRestricoes;
    }

    /**
     * Define o valor da propriedade pendenciasRestricoes.
     * 
     * @param value
     *     allowed object is
     *     {@link PendenciasRestricoes }
     *     
     */
    public void setPendenciasRestricoes(PendenciasRestricoes value) {
        this.pendenciasRestricoes = value;
    }

    /**
     * Obtém o valor da propriedade chequesSemFundo.
     * 
     * @return
     *     possible object is
     *     {@link ChequesSemFundo }
     *     
     */
    public ChequesSemFundo getChequesSemFundo() {
        return chequesSemFundo;
    }

    /**
     * Define o valor da propriedade chequesSemFundo.
     * 
     * @param value
     *     allowed object is
     *     {@link ChequesSemFundo }
     *     
     */
    public void setChequesSemFundo(ChequesSemFundo value) {
        this.chequesSemFundo = value;
    }

    /**
     * Obtém o valor da propriedade protestos.
     * 
     * @return
     *     possible object is
     *     {@link Protestos }
     *     
     */
    public Protestos getProtestos() {
        return protestos;
    }

    /**
     * Define o valor da propriedade protestos.
     * 
     * @param value
     *     allowed object is
     *     {@link Protestos }
     *     
     */
    public void setProtestos(Protestos value) {
        this.protestos = value;
    }

    /**
     * Obtém o valor da propriedade acoesJudiciais.
     * 
     * @return
     *     possible object is
     *     {@link AcoesJudiciais }
     *     
     */
    public AcoesJudiciais getAcoesJudiciais() {
        return acoesJudiciais;
    }

    /**
     * Define o valor da propriedade acoesJudiciais.
     * 
     * @param value
     *     allowed object is
     *     {@link AcoesJudiciais }
     *     
     */
    public void setAcoesJudiciais(AcoesJudiciais value) {
        this.acoesJudiciais = value;
    }

    /**
     * Obtém o valor da propriedade falenciasRecuperacaoJudicial.
     * 
     * @return
     *     possible object is
     *     {@link FalenciasRecuperacaoJudicial }
     *     
     */
    public FalenciasRecuperacaoJudicial getFalenciasRecuperacaoJudicial() {
        return falenciasRecuperacaoJudicial;
    }

    /**
     * Define o valor da propriedade falenciasRecuperacaoJudicial.
     * 
     * @param value
     *     allowed object is
     *     {@link FalenciasRecuperacaoJudicial }
     *     
     */
    public void setFalenciasRecuperacaoJudicial(FalenciasRecuperacaoJudicial value) {
        this.falenciasRecuperacaoJudicial = value;
    }

    /**
     * Obtém o valor da propriedade consultas.
     * 
     * @return
     *     possible object is
     *     {@link Consultas }
     *     
     */
    public Consultas getConsultas() {
        return consultas;
    }

    /**
     * Define o valor da propriedade consultas.
     * 
     * @param value
     *     allowed object is
     *     {@link Consultas }
     *     
     */
    public void setConsultas(Consultas value) {
        this.consultas = value;
    }

    /**
     * Obtém o valor da propriedade titulosVencer.
     * 
     * @return
     *     possible object is
     *     {@link TitulosVencer }
     *     
     */
    public TitulosVencer getTitulosVencer() {
        return titulosVencer;
    }

    /**
     * Define o valor da propriedade titulosVencer.
     * 
     * @param value
     *     allowed object is
     *     {@link TitulosVencer }
     *     
     */
    public void setTitulosVencer(TitulosVencer value) {
        this.titulosVencer = value;
    }

    /**
     * Obtém o valor da propriedade pagamentos.
     * 
     * @return
     *     possible object is
     *     {@link Pagamentos }
     *     
     */
    public Pagamentos getPagamentos() {
        return pagamentos;
    }

    /**
     * Define o valor da propriedade pagamentos.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagamentos }
     *     
     */
    public void setPagamentos(Pagamentos value) {
        this.pagamentos = value;
    }

}
