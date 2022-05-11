//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.05.10 às 08:06:45 AM BRT 
//


package br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.administradores;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.restricoes_documento.RestricoesDocumento;


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
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cpf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entrada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mandato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cargo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="situacao_cpf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indicador_debito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indicador_fraude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/restricoes_documento}restricoes_documento" minOccurs="0"/>
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
    "nome",
    "cpf",
    "entrada",
    "mandato",
    "cargo",
    "situacaoCpf",
    "indicadorDebito",
    "indicadorFraude",
    "restricoesDocumento"
})
@XmlRootElement(name = "administrador")
public class Administrador {

    protected String nome;
    protected String cpf;
    protected String entrada;
    protected String mandato;
    protected String cargo;
    @XmlElement(name = "situacao_cpf")
    protected String situacaoCpf;
    @XmlElement(name = "indicador_debito")
    protected String indicadorDebito;
    @XmlElement(name = "indicador_fraude")
    protected String indicadorFraude;
    @XmlElement(name = "restricoes_documento", namespace = "http://boavistaservicos.com.br/define/xml/restricoes_documento")
    protected RestricoesDocumento restricoesDocumento;

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
     * Obtém o valor da propriedade cpf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Define o valor da propriedade cpf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpf(String value) {
        this.cpf = value;
    }

    /**
     * Obtém o valor da propriedade entrada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntrada() {
        return entrada;
    }

    /**
     * Define o valor da propriedade entrada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntrada(String value) {
        this.entrada = value;
    }

    /**
     * Obtém o valor da propriedade mandato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMandato() {
        return mandato;
    }

    /**
     * Define o valor da propriedade mandato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMandato(String value) {
        this.mandato = value;
    }

    /**
     * Obtém o valor da propriedade cargo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Define o valor da propriedade cargo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCargo(String value) {
        this.cargo = value;
    }

    /**
     * Obtém o valor da propriedade situacaoCpf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSituacaoCpf() {
        return situacaoCpf;
    }

    /**
     * Define o valor da propriedade situacaoCpf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSituacaoCpf(String value) {
        this.situacaoCpf = value;
    }

    /**
     * Obtém o valor da propriedade indicadorDebito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicadorDebito() {
        return indicadorDebito;
    }

    /**
     * Define o valor da propriedade indicadorDebito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicadorDebito(String value) {
        this.indicadorDebito = value;
    }

    /**
     * Obtém o valor da propriedade indicadorFraude.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicadorFraude() {
        return indicadorFraude;
    }

    /**
     * Define o valor da propriedade indicadorFraude.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicadorFraude(String value) {
        this.indicadorFraude = value;
    }

    /**
     * Obtém o valor da propriedade restricoesDocumento.
     * 
     * @return
     *     possible object is
     *     {@link RestricoesDocumento }
     *     
     */
    public RestricoesDocumento getRestricoesDocumento() {
        return restricoesDocumento;
    }

    /**
     * Define o valor da propriedade restricoesDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link RestricoesDocumento }
     *     
     */
    public void setRestricoesDocumento(RestricoesDocumento value) {
        this.restricoesDocumento = value;
    }

}
