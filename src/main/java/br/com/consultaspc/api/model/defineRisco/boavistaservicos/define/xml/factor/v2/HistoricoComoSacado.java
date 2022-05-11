//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.05.10 às 08:06:45 AM BRT 
//


package br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.factor.v2;

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
 *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/factor/v2}mes_e_ano" minOccurs="0"/>
 *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/factor/v2}compromisso_maior_valor" minOccurs="0"/>
 *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/factor/v2}compromisso_maior_valor_atraso" minOccurs="0"/>
 *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/factor/v2}pontuacao_media_titulo" minOccurs="0"/>
 *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/factor/v2}pontuacao_media_titulo_atrasados" minOccurs="0"/>
 *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/factor/v2}desvio_padrao_medio_titulos" minOccurs="0"/>
 *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/factor/v2}desvio_padrao_medio_titulos_atrasados" minOccurs="0"/>
 *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/factor/v2}numero_medio_papeis" minOccurs="0"/>
 *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/factor/v2}numero_medio_papeis_atrasados" minOccurs="0"/>
 *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/factor/v2}responsabilidade_media_global" minOccurs="0"/>
 *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/factor/v2}responsabilidade_media_global_atrasada" minOccurs="0"/>
 *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/factor/v2}maior_prazo_contratado_titulos" minOccurs="0"/>
 *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/factor/v2}maior_atraso_titulos_vencidos" minOccurs="0"/>
 *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/factor/v2}prazo_medio_titulos_ser" minOccurs="0"/>
 *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/factor/v2}atraso_medio_titulos_vencidos" minOccurs="0"/>
 *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/factor/v2}numero_factorings" minOccurs="0"/>
 *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/factor/v2}prazo_medio_ponderado" minOccurs="0"/>
 *         &lt;element ref="{http://boavistaservicos.com.br/define/xml/factor/v2}atraso_medio_ponderado" minOccurs="0"/>
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
    "mesEAno",
    "compromissoMaiorValor",
    "compromissoMaiorValorAtraso",
    "pontuacaoMediaTitulo",
    "pontuacaoMediaTituloAtrasados",
    "desvioPadraoMedioTitulos",
    "desvioPadraoMedioTitulosAtrasados",
    "numeroMedioPapeis",
    "numeroMedioPapeisAtrasados",
    "responsabilidadeMediaGlobal",
    "responsabilidadeMediaGlobalAtrasada",
    "maiorPrazoContratadoTitulos",
    "maiorAtrasoTitulosVencidos",
    "prazoMedioTitulosSer",
    "atrasoMedioTitulosVencidos",
    "numeroFactorings",
    "prazoMedioPonderado",
    "atrasoMedioPonderado"
})
@XmlRootElement(name = "historico_como_sacado")
public class HistoricoComoSacado {

    @XmlElement(name = "mes_e_ano")
    protected String mesEAno;
    @XmlElement(name = "compromisso_maior_valor")
    protected String compromissoMaiorValor;
    @XmlElement(name = "compromisso_maior_valor_atraso")
    protected String compromissoMaiorValorAtraso;
    @XmlElement(name = "pontuacao_media_titulo")
    protected String pontuacaoMediaTitulo;
    @XmlElement(name = "pontuacao_media_titulo_atrasados")
    protected String pontuacaoMediaTituloAtrasados;
    @XmlElement(name = "desvio_padrao_medio_titulos")
    protected String desvioPadraoMedioTitulos;
    @XmlElement(name = "desvio_padrao_medio_titulos_atrasados")
    protected String desvioPadraoMedioTitulosAtrasados;
    @XmlElement(name = "numero_medio_papeis")
    protected String numeroMedioPapeis;
    @XmlElement(name = "numero_medio_papeis_atrasados")
    protected String numeroMedioPapeisAtrasados;
    @XmlElement(name = "responsabilidade_media_global")
    protected String responsabilidadeMediaGlobal;
    @XmlElement(name = "responsabilidade_media_global_atrasada")
    protected String responsabilidadeMediaGlobalAtrasada;
    @XmlElement(name = "maior_prazo_contratado_titulos")
    protected String maiorPrazoContratadoTitulos;
    @XmlElement(name = "maior_atraso_titulos_vencidos")
    protected String maiorAtrasoTitulosVencidos;
    @XmlElement(name = "prazo_medio_titulos_ser")
    protected String prazoMedioTitulosSer;
    @XmlElement(name = "atraso_medio_titulos_vencidos")
    protected String atrasoMedioTitulosVencidos;
    @XmlElement(name = "numero_factorings")
    protected String numeroFactorings;
    @XmlElement(name = "prazo_medio_ponderado")
    protected String prazoMedioPonderado;
    @XmlElement(name = "atraso_medio_ponderado")
    protected String atrasoMedioPonderado;

    /**
     * Obtém o valor da propriedade mesEAno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMesEAno() {
        return mesEAno;
    }

    /**
     * Define o valor da propriedade mesEAno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMesEAno(String value) {
        this.mesEAno = value;
    }

    /**
     * Obtém o valor da propriedade compromissoMaiorValor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompromissoMaiorValor() {
        return compromissoMaiorValor;
    }

    /**
     * Define o valor da propriedade compromissoMaiorValor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompromissoMaiorValor(String value) {
        this.compromissoMaiorValor = value;
    }

    /**
     * Obtém o valor da propriedade compromissoMaiorValorAtraso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompromissoMaiorValorAtraso() {
        return compromissoMaiorValorAtraso;
    }

    /**
     * Define o valor da propriedade compromissoMaiorValorAtraso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompromissoMaiorValorAtraso(String value) {
        this.compromissoMaiorValorAtraso = value;
    }

    /**
     * Obtém o valor da propriedade pontuacaoMediaTitulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPontuacaoMediaTitulo() {
        return pontuacaoMediaTitulo;
    }

    /**
     * Define o valor da propriedade pontuacaoMediaTitulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPontuacaoMediaTitulo(String value) {
        this.pontuacaoMediaTitulo = value;
    }

    /**
     * Obtém o valor da propriedade pontuacaoMediaTituloAtrasados.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPontuacaoMediaTituloAtrasados() {
        return pontuacaoMediaTituloAtrasados;
    }

    /**
     * Define o valor da propriedade pontuacaoMediaTituloAtrasados.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPontuacaoMediaTituloAtrasados(String value) {
        this.pontuacaoMediaTituloAtrasados = value;
    }

    /**
     * Obtém o valor da propriedade desvioPadraoMedioTitulos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesvioPadraoMedioTitulos() {
        return desvioPadraoMedioTitulos;
    }

    /**
     * Define o valor da propriedade desvioPadraoMedioTitulos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesvioPadraoMedioTitulos(String value) {
        this.desvioPadraoMedioTitulos = value;
    }

    /**
     * Obtém o valor da propriedade desvioPadraoMedioTitulosAtrasados.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesvioPadraoMedioTitulosAtrasados() {
        return desvioPadraoMedioTitulosAtrasados;
    }

    /**
     * Define o valor da propriedade desvioPadraoMedioTitulosAtrasados.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesvioPadraoMedioTitulosAtrasados(String value) {
        this.desvioPadraoMedioTitulosAtrasados = value;
    }

    /**
     * Obtém o valor da propriedade numeroMedioPapeis.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroMedioPapeis() {
        return numeroMedioPapeis;
    }

    /**
     * Define o valor da propriedade numeroMedioPapeis.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroMedioPapeis(String value) {
        this.numeroMedioPapeis = value;
    }

    /**
     * Obtém o valor da propriedade numeroMedioPapeisAtrasados.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroMedioPapeisAtrasados() {
        return numeroMedioPapeisAtrasados;
    }

    /**
     * Define o valor da propriedade numeroMedioPapeisAtrasados.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroMedioPapeisAtrasados(String value) {
        this.numeroMedioPapeisAtrasados = value;
    }

    /**
     * Obtém o valor da propriedade responsabilidadeMediaGlobal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponsabilidadeMediaGlobal() {
        return responsabilidadeMediaGlobal;
    }

    /**
     * Define o valor da propriedade responsabilidadeMediaGlobal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponsabilidadeMediaGlobal(String value) {
        this.responsabilidadeMediaGlobal = value;
    }

    /**
     * Obtém o valor da propriedade responsabilidadeMediaGlobalAtrasada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponsabilidadeMediaGlobalAtrasada() {
        return responsabilidadeMediaGlobalAtrasada;
    }

    /**
     * Define o valor da propriedade responsabilidadeMediaGlobalAtrasada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponsabilidadeMediaGlobalAtrasada(String value) {
        this.responsabilidadeMediaGlobalAtrasada = value;
    }

    /**
     * Obtém o valor da propriedade maiorPrazoContratadoTitulos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaiorPrazoContratadoTitulos() {
        return maiorPrazoContratadoTitulos;
    }

    /**
     * Define o valor da propriedade maiorPrazoContratadoTitulos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaiorPrazoContratadoTitulos(String value) {
        this.maiorPrazoContratadoTitulos = value;
    }

    /**
     * Obtém o valor da propriedade maiorAtrasoTitulosVencidos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaiorAtrasoTitulosVencidos() {
        return maiorAtrasoTitulosVencidos;
    }

    /**
     * Define o valor da propriedade maiorAtrasoTitulosVencidos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaiorAtrasoTitulosVencidos(String value) {
        this.maiorAtrasoTitulosVencidos = value;
    }

    /**
     * Obtém o valor da propriedade prazoMedioTitulosSer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrazoMedioTitulosSer() {
        return prazoMedioTitulosSer;
    }

    /**
     * Define o valor da propriedade prazoMedioTitulosSer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrazoMedioTitulosSer(String value) {
        this.prazoMedioTitulosSer = value;
    }

    /**
     * Obtém o valor da propriedade atrasoMedioTitulosVencidos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtrasoMedioTitulosVencidos() {
        return atrasoMedioTitulosVencidos;
    }

    /**
     * Define o valor da propriedade atrasoMedioTitulosVencidos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtrasoMedioTitulosVencidos(String value) {
        this.atrasoMedioTitulosVencidos = value;
    }

    /**
     * Obtém o valor da propriedade numeroFactorings.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroFactorings() {
        return numeroFactorings;
    }

    /**
     * Define o valor da propriedade numeroFactorings.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroFactorings(String value) {
        this.numeroFactorings = value;
    }

    /**
     * Obtém o valor da propriedade prazoMedioPonderado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrazoMedioPonderado() {
        return prazoMedioPonderado;
    }

    /**
     * Define o valor da propriedade prazoMedioPonderado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrazoMedioPonderado(String value) {
        this.prazoMedioPonderado = value;
    }

    /**
     * Obtém o valor da propriedade atrasoMedioPonderado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtrasoMedioPonderado() {
        return atrasoMedioPonderado;
    }

    /**
     * Define o valor da propriedade atrasoMedioPonderado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtrasoMedioPonderado(String value) {
        this.atrasoMedioPonderado = value;
    }

}
