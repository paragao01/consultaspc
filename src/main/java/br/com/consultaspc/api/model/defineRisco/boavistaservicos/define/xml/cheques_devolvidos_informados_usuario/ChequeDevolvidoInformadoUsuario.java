//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.05.10 às 08:06:45 AM BRT 
//


package br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.cheques_devolvidos_informados_usuario;

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
 *         &lt;element name="informante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="banco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cheques_inicial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cheques_final" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="data_ocorrencia" type="{http://boavistaservicos.com.br/define/xml/util}dataDiaMesAno" minOccurs="0"/>
 *         &lt;element name="data_registro" type="{http://boavistaservicos.com.br/define/xml/util}dataDiaMesAno" minOccurs="0"/>
 *         &lt;element name="motivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "informante",
    "banco",
    "agencia",
    "chequesInicial",
    "chequesFinal",
    "dataOcorrencia",
    "dataRegistro",
    "motivo",
    "cidade",
    "uf"
})
@XmlRootElement(name = "cheque_devolvido_informado_usuario")
public class ChequeDevolvidoInformadoUsuario {

    protected String informante;
    protected String banco;
    protected String agencia;
    @XmlElement(name = "cheques_inicial")
    protected String chequesInicial;
    @XmlElement(name = "cheques_final")
    protected String chequesFinal;
    @XmlElement(name = "data_ocorrencia")
    protected String dataOcorrencia;
    @XmlElement(name = "data_registro")
    protected String dataRegistro;
    protected String motivo;
    protected String cidade;
    protected String uf;

    /**
     * Obtém o valor da propriedade informante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformante() {
        return informante;
    }

    /**
     * Define o valor da propriedade informante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformante(String value) {
        this.informante = value;
    }

    /**
     * Obtém o valor da propriedade banco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBanco() {
        return banco;
    }

    /**
     * Define o valor da propriedade banco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBanco(String value) {
        this.banco = value;
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
     * Obtém o valor da propriedade chequesInicial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChequesInicial() {
        return chequesInicial;
    }

    /**
     * Define o valor da propriedade chequesInicial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChequesInicial(String value) {
        this.chequesInicial = value;
    }

    /**
     * Obtém o valor da propriedade chequesFinal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChequesFinal() {
        return chequesFinal;
    }

    /**
     * Define o valor da propriedade chequesFinal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChequesFinal(String value) {
        this.chequesFinal = value;
    }

    /**
     * Obtém o valor da propriedade dataOcorrencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataOcorrencia() {
        return dataOcorrencia;
    }

    /**
     * Define o valor da propriedade dataOcorrencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataOcorrencia(String value) {
        this.dataOcorrencia = value;
    }

    /**
     * Obtém o valor da propriedade dataRegistro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataRegistro() {
        return dataRegistro;
    }

    /**
     * Define o valor da propriedade dataRegistro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataRegistro(String value) {
        this.dataRegistro = value;
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
     * Obtém o valor da propriedade cidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * Define o valor da propriedade cidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCidade(String value) {
        this.cidade = value;
    }

    /**
     * Obtém o valor da propriedade uf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUf() {
        return uf;
    }

    /**
     * Define o valor da propriedade uf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUf(String value) {
        this.uf = value;
    }

}
