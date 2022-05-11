//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.05.10 às 08:06:45 AM BRT 
//


package br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.score.v2;

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
 *         &lt;element name="tipo_score" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="score" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="plano_execucao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modelo_plano" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nome_plano" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modelo_score" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nome_score" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="classificacao_numerica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="classificacao_alfabetica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="probabilidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="texto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigo_natureza_modelo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descricao_natureza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="texto_explicativo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id_ajuda_score" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "textoExplicativo",
    "idAjudaScore"
})
@XmlRootElement(name = "score_pj")
public class ScorePj {

    @XmlElement(name = "tipo_score")
    protected String tipoScore;
    protected String score;
    @XmlElement(name = "plano_execucao")
    protected String planoExecucao;
    @XmlElement(name = "modelo_plano")
    protected String modeloPlano;
    @XmlElement(name = "nome_plano")
    protected String nomePlano;
    @XmlElement(name = "modelo_score")
    protected String modeloScore;
    @XmlElement(name = "nome_score")
    protected String nomeScore;
    @XmlElement(name = "classificacao_numerica")
    protected String classificacaoNumerica;
    @XmlElement(name = "classificacao_alfabetica")
    protected String classificacaoAlfabetica;
    protected String probabilidade;
    protected String texto;
    @XmlElement(name = "codigo_natureza_modelo")
    protected String codigoNaturezaModelo;
    @XmlElement(name = "descricao_natureza")
    protected String descricaoNatureza;
    @XmlElement(name = "texto_explicativo")
    protected String textoExplicativo;
    @XmlElement(name = "id_ajuda_score")
    protected String idAjudaScore;

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
     * Obtém o valor da propriedade textoExplicativo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextoExplicativo() {
        return textoExplicativo;
    }

    /**
     * Define o valor da propriedade textoExplicativo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextoExplicativo(String value) {
        this.textoExplicativo = value;
    }

    /**
     * Obtém o valor da propriedade idAjudaScore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdAjudaScore() {
        return idAjudaScore;
    }

    /**
     * Define o valor da propriedade idAjudaScore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdAjudaScore(String value) {
        this.idAjudaScore = value;
    }

}
