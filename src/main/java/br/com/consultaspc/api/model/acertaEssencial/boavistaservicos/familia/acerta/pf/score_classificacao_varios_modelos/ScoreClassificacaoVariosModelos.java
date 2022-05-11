//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.05.09 às 08:46:54 PM BRT 
//


package br.com.consultaspc.api.model.acertaEssencial.boavistaservicos.familia.acerta.pf.score_classificacao_varios_modelos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="tamanhoRegistro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoRegistro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="registro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="score" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="planoExecucao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modeloPlano" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomePlano" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modeloScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="classificacaoNumerica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="classificacaoAlfabetica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="probabilidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="texto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoNaturezaModelo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descricaoNatureza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="texto2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "tamanhoRegistro",
    "tipoRegistro",
    "registro",
    "tipoScore",
    "score",
    "planoExecucao",
    "modeloPlano",
    "nomePlano",
    "modeloScore",
    "nomeScore",
    "classificacaoNumerica",
    "classificacaoAlfabetica",
    "probabilidade",
    "texto",
    "codigoNaturezaModelo",
    "descricaoNatureza",
    "texto2"
})
@XmlRootElement(name = "score_classificacao_varios_modelos")
public class ScoreClassificacaoVariosModelos {

    protected String tamanhoRegistro;
    protected String tipoRegistro;
    protected String registro;
    protected String tipoScore;
    protected String score;
    protected String planoExecucao;
    protected String modeloPlano;
    protected String nomePlano;
    protected String modeloScore;
    protected String nomeScore;
    protected String classificacaoNumerica;
    protected String classificacaoAlfabetica;
    protected String probabilidade;
    protected String texto;
    protected String codigoNaturezaModelo;
    protected String descricaoNatureza;
    protected String texto2;

    /**
     * Obtém o valor da propriedade tamanhoRegistro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTamanhoRegistro() {
        return tamanhoRegistro;
    }

    /**
     * Define o valor da propriedade tamanhoRegistro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTamanhoRegistro(String value) {
        this.tamanhoRegistro = value;
    }

    /**
     * Obtém o valor da propriedade tipoRegistro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoRegistro() {
        return tipoRegistro;
    }

    /**
     * Define o valor da propriedade tipoRegistro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoRegistro(String value) {
        this.tipoRegistro = value;
    }

    /**
     * Obtém o valor da propriedade registro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistro() {
        return registro;
    }

    /**
     * Define o valor da propriedade registro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistro(String value) {
        this.registro = value;
    }

    /**
     * Obtém o valor da propriedade tipoScore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoScore() {
        return tipoScore;
    }

    /**
     * Define o valor da propriedade tipoScore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoScore(String value) {
        this.tipoScore = value;
    }

    /**
     * Obtém o valor da propriedade score.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScore() {
        return score;
    }

    /**
     * Define o valor da propriedade score.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScore(String value) {
        this.score = value;
    }

    /**
     * Obtém o valor da propriedade planoExecucao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanoExecucao() {
        return planoExecucao;
    }

    /**
     * Define o valor da propriedade planoExecucao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanoExecucao(String value) {
        this.planoExecucao = value;
    }

    /**
     * Obtém o valor da propriedade modeloPlano.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModeloPlano() {
        return modeloPlano;
    }

    /**
     * Define o valor da propriedade modeloPlano.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModeloPlano(String value) {
        this.modeloPlano = value;
    }

    /**
     * Obtém o valor da propriedade nomePlano.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomePlano() {
        return nomePlano;
    }

    /**
     * Define o valor da propriedade nomePlano.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomePlano(String value) {
        this.nomePlano = value;
    }

    /**
     * Obtém o valor da propriedade modeloScore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModeloScore() {
        return modeloScore;
    }

    /**
     * Define o valor da propriedade modeloScore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModeloScore(String value) {
        this.modeloScore = value;
    }

    /**
     * Obtém o valor da propriedade nomeScore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeScore() {
        return nomeScore;
    }

    /**
     * Define o valor da propriedade nomeScore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeScore(String value) {
        this.nomeScore = value;
    }

    /**
     * Obtém o valor da propriedade classificacaoNumerica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassificacaoNumerica() {
        return classificacaoNumerica;
    }

    /**
     * Define o valor da propriedade classificacaoNumerica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassificacaoNumerica(String value) {
        this.classificacaoNumerica = value;
    }

    /**
     * Obtém o valor da propriedade classificacaoAlfabetica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassificacaoAlfabetica() {
        return classificacaoAlfabetica;
    }

    /**
     * Define o valor da propriedade classificacaoAlfabetica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassificacaoAlfabetica(String value) {
        this.classificacaoAlfabetica = value;
    }

    /**
     * Obtém o valor da propriedade probabilidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProbabilidade() {
        return probabilidade;
    }

    /**
     * Define o valor da propriedade probabilidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProbabilidade(String value) {
        this.probabilidade = value;
    }

    /**
     * Obtém o valor da propriedade texto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTexto() {
        return texto;
    }

    /**
     * Define o valor da propriedade texto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTexto(String value) {
        this.texto = value;
    }

    /**
     * Obtém o valor da propriedade codigoNaturezaModelo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoNaturezaModelo() {
        return codigoNaturezaModelo;
    }

    /**
     * Define o valor da propriedade codigoNaturezaModelo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoNaturezaModelo(String value) {
        this.codigoNaturezaModelo = value;
    }

    /**
     * Obtém o valor da propriedade descricaoNatureza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoNatureza() {
        return descricaoNatureza;
    }

    /**
     * Define o valor da propriedade descricaoNatureza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoNatureza(String value) {
        this.descricaoNatureza = value;
    }

    /**
     * Obtém o valor da propriedade texto2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTexto2() {
        return texto2;
    }

    /**
     * Define o valor da propriedade texto2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTexto2(String value) {
        this.texto2 = value;
    }

}
