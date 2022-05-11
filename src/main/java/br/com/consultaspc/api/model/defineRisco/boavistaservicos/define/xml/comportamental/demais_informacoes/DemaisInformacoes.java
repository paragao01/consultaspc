//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.05.10 às 08:06:45 AM BRT 
//


package br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.comportamental.demais_informacoes;

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
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element ref="{http://boavistaservicos.com.br/define/xml/comportamental/demais_informacoes}tempo_relacionamento_fornecedores"/>
 *           &lt;element ref="{http://boavistaservicos.com.br/define/xml/comportamental/demais_informacoes}acontecimentos_importantes"/>
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
    "tempoRelacionamentoFornecedores",
    "acontecimentosImportantes"
})
@XmlRootElement(name = "demais_informacoes")
public class DemaisInformacoes {

    @XmlElement(name = "tempo_relacionamento_fornecedores")
    protected TempoRelacionamentoFornecedores tempoRelacionamentoFornecedores;
    @XmlElement(name = "acontecimentos_importantes")
    protected AcontecimentosImportantes acontecimentosImportantes;

    /**
     * Obtém o valor da propriedade tempoRelacionamentoFornecedores.
     * 
     * @return
     *     possible object is
     *     {@link TempoRelacionamentoFornecedores }
     *     
     */
    public TempoRelacionamentoFornecedores getTempoRelacionamentoFornecedores() {
        return tempoRelacionamentoFornecedores;
    }

    /**
     * Define o valor da propriedade tempoRelacionamentoFornecedores.
     * 
     * @param value
     *     allowed object is
     *     {@link TempoRelacionamentoFornecedores }
     *     
     */
    public void setTempoRelacionamentoFornecedores(TempoRelacionamentoFornecedores value) {
        this.tempoRelacionamentoFornecedores = value;
    }

    /**
     * Obtém o valor da propriedade acontecimentosImportantes.
     * 
     * @return
     *     possible object is
     *     {@link AcontecimentosImportantes }
     *     
     */
    public AcontecimentosImportantes getAcontecimentosImportantes() {
        return acontecimentosImportantes;
    }

    /**
     * Define o valor da propriedade acontecimentosImportantes.
     * 
     * @param value
     *     allowed object is
     *     {@link AcontecimentosImportantes }
     *     
     */
    public void setAcontecimentosImportantes(AcontecimentosImportantes value) {
        this.acontecimentosImportantes = value;
    }

}
