//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.05.09 às 08:46:54 PM BRT 
//


package br.com.consultaspc.api.model.acertaEssencial.boavistaservicos.familia.acerta.pf.identificacao;

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
 *         &lt;element name="documento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeMae" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataNascimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroRG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgaoEmissor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unidadeFedarativaRG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataEmissaoRG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sexoConsultado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cidadeNascimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estadoCivil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroDependentes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="grauInstrucao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="situacaoReceita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataAtualizacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regiaoCpf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tituloEleitor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="obito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "documento",
    "nome",
    "nomeMae",
    "dataNascimento",
    "numeroRG",
    "orgaoEmissor",
    "unidadeFedarativaRG",
    "dataEmissaoRG",
    "sexoConsultado",
    "cidadeNascimento",
    "estadoCivil",
    "numeroDependentes",
    "grauInstrucao",
    "situacaoReceita",
    "dataAtualizacao",
    "regiaoCpf",
    "tituloEleitor",
    "obito"
})
@XmlRootElement(name = "identificacao")
public class Identificacao {

    protected String tamanhoRegistro;
    protected String tipoRegistro;
    protected String registro;
    protected String documento;
    protected String nome;
    protected String nomeMae;
    protected String dataNascimento;
    protected String numeroRG;
    protected String orgaoEmissor;
    protected String unidadeFedarativaRG;
    protected String dataEmissaoRG;
    protected String sexoConsultado;
    protected String cidadeNascimento;
    protected String estadoCivil;
    protected String numeroDependentes;
    protected String grauInstrucao;
    protected String situacaoReceita;
    protected String dataAtualizacao;
    protected String regiaoCpf;
    protected String tituloEleitor;
    protected String obito;

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
     * Obtém o valor da propriedade documento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumento() {
        return documento;
    }

    /**
     * Define o valor da propriedade documento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumento(String value) {
        this.documento = value;
    }

    /**
     * Obtém o valor da propriedade nome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o valor da propriedade nome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Obtém o valor da propriedade nomeMae.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeMae() {
        return nomeMae;
    }

    /**
     * Define o valor da propriedade nomeMae.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeMae(String value) {
        this.nomeMae = value;
    }

    /**
     * Obtém o valor da propriedade dataNascimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataNascimento() {
        return dataNascimento;
    }

    /**
     * Define o valor da propriedade dataNascimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataNascimento(String value) {
        this.dataNascimento = value;
    }

    /**
     * Obtém o valor da propriedade numeroRG.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroRG() {
        return numeroRG;
    }

    /**
     * Define o valor da propriedade numeroRG.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroRG(String value) {
        this.numeroRG = value;
    }

    /**
     * Obtém o valor da propriedade orgaoEmissor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgaoEmissor() {
        return orgaoEmissor;
    }

    /**
     * Define o valor da propriedade orgaoEmissor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgaoEmissor(String value) {
        this.orgaoEmissor = value;
    }

    /**
     * Obtém o valor da propriedade unidadeFedarativaRG.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidadeFedarativaRG() {
        return unidadeFedarativaRG;
    }

    /**
     * Define o valor da propriedade unidadeFedarativaRG.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidadeFedarativaRG(String value) {
        this.unidadeFedarativaRG = value;
    }

    /**
     * Obtém o valor da propriedade dataEmissaoRG.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataEmissaoRG() {
        return dataEmissaoRG;
    }

    /**
     * Define o valor da propriedade dataEmissaoRG.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataEmissaoRG(String value) {
        this.dataEmissaoRG = value;
    }

    /**
     * Obtém o valor da propriedade sexoConsultado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSexoConsultado() {
        return sexoConsultado;
    }

    /**
     * Define o valor da propriedade sexoConsultado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSexoConsultado(String value) {
        this.sexoConsultado = value;
    }

    /**
     * Obtém o valor da propriedade cidadeNascimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCidadeNascimento() {
        return cidadeNascimento;
    }

    /**
     * Define o valor da propriedade cidadeNascimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCidadeNascimento(String value) {
        this.cidadeNascimento = value;
    }

    /**
     * Obtém o valor da propriedade estadoCivil.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoCivil() {
        return estadoCivil;
    }

    /**
     * Define o valor da propriedade estadoCivil.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoCivil(String value) {
        this.estadoCivil = value;
    }

    /**
     * Obtém o valor da propriedade numeroDependentes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDependentes() {
        return numeroDependentes;
    }

    /**
     * Define o valor da propriedade numeroDependentes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDependentes(String value) {
        this.numeroDependentes = value;
    }

    /**
     * Obtém o valor da propriedade grauInstrucao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrauInstrucao() {
        return grauInstrucao;
    }

    /**
     * Define o valor da propriedade grauInstrucao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrauInstrucao(String value) {
        this.grauInstrucao = value;
    }

    /**
     * Obtém o valor da propriedade situacaoReceita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSituacaoReceita() {
        return situacaoReceita;
    }

    /**
     * Define o valor da propriedade situacaoReceita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSituacaoReceita(String value) {
        this.situacaoReceita = value;
    }

    /**
     * Obtém o valor da propriedade dataAtualizacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataAtualizacao() {
        return dataAtualizacao;
    }

    /**
     * Define o valor da propriedade dataAtualizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataAtualizacao(String value) {
        this.dataAtualizacao = value;
    }

    /**
     * Obtém o valor da propriedade regiaoCpf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegiaoCpf() {
        return regiaoCpf;
    }

    /**
     * Define o valor da propriedade regiaoCpf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegiaoCpf(String value) {
        this.regiaoCpf = value;
    }

    /**
     * Obtém o valor da propriedade tituloEleitor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTituloEleitor() {
        return tituloEleitor;
    }

    /**
     * Define o valor da propriedade tituloEleitor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTituloEleitor(String value) {
        this.tituloEleitor = value;
    }

    /**
     * Obtém o valor da propriedade obito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObito() {
        return obito;
    }

    /**
     * Define o valor da propriedade obito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObito(String value) {
        this.obito = value;
    }

}
