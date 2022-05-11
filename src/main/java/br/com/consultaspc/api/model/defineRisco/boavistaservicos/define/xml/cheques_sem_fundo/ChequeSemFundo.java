//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.05.10 às 08:06:45 AM BRT 
//


package br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.cheques_sem_fundo;

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
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="data_ultimo" type="{http://boavistaservicos.com.br/define/xml/util}dataDiaMesAno" minOccurs="0"/>
 *         &lt;element name="numero_banco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nome_banco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quantidade" type="{http://boavistaservicos.com.br/define/xml/util}quantidade" minOccurs="0"/>
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
    "dataUltimo",
    "numeroBanco",
    "nomeBanco",
    "agencia",
    "motivo",
    "quantidade"
})
@XmlRootElement(name = "cheque_sem_fundo")
public class ChequeSemFundo {

    protected String nome;
    @XmlElement(name = "data_ultimo")
    protected String dataUltimo;
    @XmlElement(name = "numero_banco")
    protected String numeroBanco;
    @XmlElement(name = "nome_banco")
    protected String nomeBanco;
    protected String agencia;
    protected String motivo;
    protected BigInteger quantidade;

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
     * Obtém o valor da propriedade dataUltimo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataUltimo() {
        return dataUltimo;
    }

    /**
     * Define o valor da propriedade dataUltimo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataUltimo(String value) {
        this.dataUltimo = value;
    }

    /**
     * Obtém o valor da propriedade numeroBanco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroBanco() {
        return numeroBanco;
    }

    /**
     * Define o valor da propriedade numeroBanco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroBanco(String value) {
        this.numeroBanco = value;
    }

    /**
     * Obtém o valor da propriedade nomeBanco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeBanco() {
        return nomeBanco;
    }

    /**
     * Define o valor da propriedade nomeBanco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeBanco(String value) {
        this.nomeBanco = value;
    }

    /**
     * Obtém o valor da propriedade agencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencia() {
        return agencia;
    }

    /**
     * Define o valor da propriedade agencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencia(String value) {
        this.agencia = value;
    }

    /**
     * Obtém o valor da propriedade motivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivo() {
        return motivo;
    }

    /**
     * Define o valor da propriedade motivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivo(String value) {
        this.motivo = value;
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
