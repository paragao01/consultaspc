//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.05.09 às 08:46:54 PM BRT 
//


package br.com.consultaspc.api.model.acertaEssencial.boavistaservicos.familia.acerta.pf.essencial.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import br.com.consultaspc.api.model.acertaEssencial.boavistaservicos.familia.acerta.pf.cheque_talao_sustado.ChequeTalaoSustado;
import br.com.consultaspc.api.model.acertaEssencial.boavistaservicos.familia.acerta.pf.cheques_sustados_pelo_motivo_21.ChequesSustadosPeloMotivo21;
import br.com.consultaspc.api.model.acertaEssencial.boavistaservicos.familia.acerta.pf.confirmacao_cep.ConfirmacaoCep;
import br.com.consultaspc.api.model.acertaEssencial.boavistaservicos.familia.acerta.pf.confirmacao_telefone.ConfirmacaoTelefone;
import br.com.consultaspc.api.model.acertaEssencial.boavistaservicos.familia.acerta.pf.consultas_anteriores.ConsultasAnteriores;
import br.com.consultaspc.api.model.acertaEssencial.boavistaservicos.familia.acerta.pf.consultas_anteriores_cheque.ConsultasAnterioresCheque;
import br.com.consultaspc.api.model.acertaEssencial.boavistaservicos.familia.acerta.pf.debitos.Debitos;
import br.com.consultaspc.api.model.acertaEssencial.boavistaservicos.familia.acerta.pf.decisao.Decisao;
import br.com.consultaspc.api.model.acertaEssencial.boavistaservicos.familia.acerta.pf.devolucoes_informadas_pelo_usuario.DevolucoesInformadasPeloUsuario;
import br.com.consultaspc.api.model.acertaEssencial.boavistaservicos.familia.acerta.pf.endereco_telefones_agencia_bancaria.EnderecoTelefonesAgenciaBancaria;
import br.com.consultaspc.api.model.acertaEssencial.boavistaservicos.familia.acerta.pf.erro.Erro;
import br.com.consultaspc.api.model.acertaEssencial.boavistaservicos.familia.acerta.pf.historico_cheque_informado.HistoricoChequeInformado;
import br.com.consultaspc.api.model.acertaEssencial.boavistaservicos.familia.acerta.pf.historico_conta_corrente_informada.HistoricoContaCorrenteInformada;
import br.com.consultaspc.api.model.acertaEssencial.boavistaservicos.familia.acerta.pf.identificacao.Identificacao;
import br.com.consultaspc.api.model.acertaEssencial.boavistaservicos.familia.acerta.pf.informacoes_complementares.InformacoesComplementares;
import br.com.consultaspc.api.model.acertaEssencial.boavistaservicos.familia.acerta.pf.informacoes_complementares_cheque.InformacoesComplementaresCheque;
import br.com.consultaspc.api.model.acertaEssencial.boavistaservicos.familia.acerta.pf.localizacao.Localizacao;
import br.com.consultaspc.api.model.acertaEssencial.boavistaservicos.familia.acerta.pf.mensagem_registro.MensagemRegistro;
import br.com.consultaspc.api.model.acertaEssencial.boavistaservicos.familia.acerta.pf.nome_documentos.NomeDocumentos;
import br.com.consultaspc.api.model.acertaEssencial.boavistaservicos.familia.acerta.pf.relacao_devolucoes_informadas_pelo_ccf.RelacaoDevolucoesInformadasPeloCcf;
import br.com.consultaspc.api.model.acertaEssencial.boavistaservicos.familia.acerta.pf.resumo_consultas_anteriores_cheque.ResumoConsultasAnterioresCheque;
import br.com.consultaspc.api.model.acertaEssencial.boavistaservicos.familia.acerta.pf.resumo_devolucoes_informada_pelo_usuario.ResumoDevolucoesInformadaPeloUsuario;
import br.com.consultaspc.api.model.acertaEssencial.boavistaservicos.familia.acerta.pf.resumo_devolucoes_informadas_pelo_ccf.ResumoDevolucoesInformadasPeloCcf;
import br.com.consultaspc.api.model.acertaEssencial.boavistaservicos.familia.acerta.pf.resumo_ocorrencias_de_debitos.ResumoOcorrenciasDeDebitos;
import br.com.consultaspc.api.model.acertaEssencial.boavistaservicos.familia.acerta.pf.resumo_titulos_protestados.ResumoTitulosProtestados;
import br.com.consultaspc.api.model.acertaEssencial.boavistaservicos.familia.acerta.pf.resumoconsultas_anteriores_90_dias.ResumoConsultasAnteriores90Dias;
import br.com.consultaspc.api.model.acertaEssencial.boavistaservicos.familia.acerta.pf.score_classificacao_varios_modelos.ScoreClassificacaoVariosModelos;
import br.com.consultaspc.api.model.acertaEssencial.boavistaservicos.familia.acerta.pf.titulos_protestados.TitulosProtestados;


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
 *           &lt;element ref="{http://boavistaservicos.com.br/familia/acerta/pf/resumo_ocorrencias_de_debitos}resumo_ocorrencias_de_debitos" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://boavistaservicos.com.br/familia/acerta/pf/resumoConsultas_anteriores_90_dias}resumoConsultas_anteriores_90_dias" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://boavistaservicos.com.br/familia/acerta/pf/informacoes_complementares}informacoes_complementares" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://boavistaservicos.com.br/familia/acerta/pf/debitos}debitos" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://boavistaservicos.com.br/familia/acerta/pf/consultas_anteriores}consultas_anteriores" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://boavistaservicos.com.br/familia/acerta/pf/titulos_protestados}titulos_protestados" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://boavistaservicos.com.br/familia/acerta/pf/resumo_titulos_protestados}resumo_titulos_protestados" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://boavistaservicos.com.br/familia/acerta/pf/cheque_talao_sustado}cheque_talao_sustado" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://boavistaservicos.com.br/familia/acerta/pf/resumo_devolucoes_informadas_pelo_ccf}resumo_devolucoes_informadas_pelo_ccf" minOccurs="0"/>
 *           &lt;element ref="{http://boavistaservicos.com.br/familia/acerta/pf/resumo_consultas_anteriores_cheque}resumo_consultas_anteriores_cheque" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://boavistaservicos.com.br/familia/acerta/pf/confirmacao_telefone}confirmacao_telefone" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://boavistaservicos.com.br/familia/acerta/pf/endereco_telefones_agencia_bancaria}endereco_telefones_agencia_bancaria" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://boavistaservicos.com.br/familia/acerta/pf/confirmacao_cep}confirmacao_cep" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://boavistaservicos.com.br/familia/acerta/pf/nome_documentos}nome_documentos" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://boavistaservicos.com.br/familia/acerta/pf/relacao_devolucoes_informadas_pelo_ccf}relacao_devolucoes_informadas_pelo_ccf" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://boavistaservicos.com.br/familia/acerta/pf/informacoes_complementares_cheque}informacoes_complementares_cheque" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://boavistaservicos.com.br/familia/acerta/pf/devolucoes_informadas_pelo_usuario}devolucoes_informadas_pelo_usuario" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://boavistaservicos.com.br/familia/acerta/pf/cheques_sustados_pelo_motivo_21}cheques_sustados_pelo_motivo_21" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://boavistaservicos.com.br/familia/acerta/pf/historico_cheque_informado}historico_cheque_informado" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://boavistaservicos.com.br/familia/acerta/pf/historico_conta_corrente_informada}historico_conta_corrente_informada" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://boavistaservicos.com.br/familia/acerta/pf/consultas_anteriores_cheque}consultas_anteriores_cheque" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://boavistaservicos.com.br/familia/acerta/pf/resumo_devolucoes_informada_pelo_usuario}resumo_devolucoes_informada_pelo_usuario" minOccurs="0"/>
 *           &lt;element ref="{http://boavistaservicos.com.br/familia/acerta/pf/identificacao}identificacao" minOccurs="0"/>
 *           &lt;element ref="{http://boavistaservicos.com.br/familia/acerta/pf/localizacao}localizacao" minOccurs="0"/>
 *           &lt;element ref="{http://boavistaservicos.com.br/familia/acerta/pf/score_classificacao_varios_modelos}score_classificacao_varios_modelos" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://boavistaservicos.com.br/familia/acerta/pf/decisao}decisao" minOccurs="0"/>
 *           &lt;element ref="{http://boavistaservicos.com.br/familia/acerta/pf/mensagem_registro}mensagem_registro" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://boavistaservicos.com.br/familia/acerta/pf/erro}erro" minOccurs="0"/>
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
    "resumoOcorrenciasDeDebitos",
    "resumoConsultasAnteriores90Dias",
    "informacoesComplementares",
    "debitos",
    "consultasAnteriores",
    "titulosProtestados",
    "resumoTitulosProtestados",
    "chequeTalaoSustado",
    "resumoDevolucoesInformadasPeloCcf",
    "resumoConsultasAnterioresCheque",
    "confirmacaoTelefone",
    "enderecoTelefonesAgenciaBancaria",
    "confirmacaoCep",
    "nomeDocumentos",
    "relacaoDevolucoesInformadasPeloCcf",
    "informacoesComplementaresCheque",
    "devolucoesInformadasPeloUsuario",
    "chequesSustadosPeloMotivo21",
    "historicoChequeInformado",
    "historicoContaCorrenteInformada",
    "consultasAnterioresCheque",
    "resumoDevolucoesInformadaPeloUsuario",
    "identificacao",
    "localizacao",
    "scoreClassificacaoVariosModelos",
    "decisao",
    "mensagemRegistro",
    "erro"
})
@XmlRootElement(name = "essencial")
public class Essencial {

    @XmlElement(name = "resumo_ocorrencias_de_debitos", namespace = "http://boavistaservicos.com.br/familia/acerta/pf/resumo_ocorrencias_de_debitos")
    protected List<ResumoOcorrenciasDeDebitos> resumoOcorrenciasDeDebitos;
    @XmlElement(name = "resumoConsultas_anteriores_90_dias", namespace = "http://boavistaservicos.com.br/familia/acerta/pf/resumoConsultas_anteriores_90_dias")
    protected List<ResumoConsultasAnteriores90Dias> resumoConsultasAnteriores90Dias;
    @XmlElement(name = "informacoes_complementares", namespace = "http://boavistaservicos.com.br/familia/acerta/pf/informacoes_complementares")
    protected List<InformacoesComplementares> informacoesComplementares;
    @XmlElement(namespace = "http://boavistaservicos.com.br/familia/acerta/pf/debitos")
    protected List<Debitos> debitos;
    @XmlElement(name = "consultas_anteriores", namespace = "http://boavistaservicos.com.br/familia/acerta/pf/consultas_anteriores")
    protected List<ConsultasAnteriores> consultasAnteriores;
    @XmlElement(name = "titulos_protestados", namespace = "http://boavistaservicos.com.br/familia/acerta/pf/titulos_protestados")
    protected List<TitulosProtestados> titulosProtestados;
    @XmlElement(name = "resumo_titulos_protestados", namespace = "http://boavistaservicos.com.br/familia/acerta/pf/resumo_titulos_protestados")
    protected List<ResumoTitulosProtestados> resumoTitulosProtestados;
    @XmlElement(name = "cheque_talao_sustado", namespace = "http://boavistaservicos.com.br/familia/acerta/pf/cheque_talao_sustado")
    protected List<ChequeTalaoSustado> chequeTalaoSustado;
    @XmlElement(name = "resumo_devolucoes_informadas_pelo_ccf", namespace = "http://boavistaservicos.com.br/familia/acerta/pf/resumo_devolucoes_informadas_pelo_ccf")
    protected ResumoDevolucoesInformadasPeloCcf resumoDevolucoesInformadasPeloCcf;
    @XmlElement(name = "resumo_consultas_anteriores_cheque", namespace = "http://boavistaservicos.com.br/familia/acerta/pf/resumo_consultas_anteriores_cheque")
    protected List<ResumoConsultasAnterioresCheque> resumoConsultasAnterioresCheque;
    @XmlElement(name = "confirmacao_telefone", namespace = "http://boavistaservicos.com.br/familia/acerta/pf/confirmacao_telefone")
    protected List<ConfirmacaoTelefone> confirmacaoTelefone;
    @XmlElement(name = "endereco_telefones_agencia_bancaria", namespace = "http://boavistaservicos.com.br/familia/acerta/pf/endereco_telefones_agencia_bancaria")
    protected List<EnderecoTelefonesAgenciaBancaria> enderecoTelefonesAgenciaBancaria;
    @XmlElement(name = "confirmacao_cep", namespace = "http://boavistaservicos.com.br/familia/acerta/pf/confirmacao_cep")
    protected List<ConfirmacaoCep> confirmacaoCep;
    @XmlElement(name = "nome_documentos", namespace = "http://boavistaservicos.com.br/familia/acerta/pf/nome_documentos")
    protected List<NomeDocumentos> nomeDocumentos;
    @XmlElement(name = "relacao_devolucoes_informadas_pelo_ccf", namespace = "http://boavistaservicos.com.br/familia/acerta/pf/relacao_devolucoes_informadas_pelo_ccf")
    protected List<RelacaoDevolucoesInformadasPeloCcf> relacaoDevolucoesInformadasPeloCcf;
    @XmlElement(name = "informacoes_complementares_cheque", namespace = "http://boavistaservicos.com.br/familia/acerta/pf/informacoes_complementares_cheque")
    protected List<InformacoesComplementaresCheque> informacoesComplementaresCheque;
    @XmlElement(name = "devolucoes_informadas_pelo_usuario", namespace = "http://boavistaservicos.com.br/familia/acerta/pf/devolucoes_informadas_pelo_usuario")
    protected List<DevolucoesInformadasPeloUsuario> devolucoesInformadasPeloUsuario;
    @XmlElement(name = "cheques_sustados_pelo_motivo_21", namespace = "http://boavistaservicos.com.br/familia/acerta/pf/cheques_sustados_pelo_motivo_21")
    protected List<ChequesSustadosPeloMotivo21> chequesSustadosPeloMotivo21;
    @XmlElement(name = "historico_cheque_informado", namespace = "http://boavistaservicos.com.br/familia/acerta/pf/historico_cheque_informado")
    protected List<HistoricoChequeInformado> historicoChequeInformado;
    @XmlElement(name = "historico_conta_corrente_informada", namespace = "http://boavistaservicos.com.br/familia/acerta/pf/historico_conta_corrente_informada")
    protected List<HistoricoContaCorrenteInformada> historicoContaCorrenteInformada;
    @XmlElement(name = "consultas_anteriores_cheque", namespace = "http://boavistaservicos.com.br/familia/acerta/pf/consultas_anteriores_cheque")
    protected List<ConsultasAnterioresCheque> consultasAnterioresCheque;
    @XmlElement(name = "resumo_devolucoes_informada_pelo_usuario", namespace = "http://boavistaservicos.com.br/familia/acerta/pf/resumo_devolucoes_informada_pelo_usuario")
    protected ResumoDevolucoesInformadaPeloUsuario resumoDevolucoesInformadaPeloUsuario;
    @XmlElement(namespace = "http://boavistaservicos.com.br/familia/acerta/pf/identificacao")
    protected Identificacao identificacao;
    @XmlElement(namespace = "http://boavistaservicos.com.br/familia/acerta/pf/localizacao")
    protected Localizacao localizacao;
    @XmlElement(name = "score_classificacao_varios_modelos", namespace = "http://boavistaservicos.com.br/familia/acerta/pf/score_classificacao_varios_modelos")
    protected List<ScoreClassificacaoVariosModelos> scoreClassificacaoVariosModelos;
    @XmlElement(namespace = "http://boavistaservicos.com.br/familia/acerta/pf/decisao")
    protected Decisao decisao;
    @XmlElement(name = "mensagem_registro", namespace = "http://boavistaservicos.com.br/familia/acerta/pf/mensagem_registro")
    protected List<MensagemRegistro> mensagemRegistro;
    @XmlElement(namespace = "http://boavistaservicos.com.br/familia/acerta/pf/erro")
    protected Erro erro;

    /**
     * Gets the value of the resumoOcorrenciasDeDebitos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resumoOcorrenciasDeDebitos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResumoOcorrenciasDeDebitos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResumoOcorrenciasDeDebitos }
     * 
     * 
     */
    public List<ResumoOcorrenciasDeDebitos> getResumoOcorrenciasDeDebitos() {
        if (resumoOcorrenciasDeDebitos == null) {
            resumoOcorrenciasDeDebitos = new ArrayList<ResumoOcorrenciasDeDebitos>();
        }
        return this.resumoOcorrenciasDeDebitos;
    }

    /**
     * Gets the value of the resumoConsultasAnteriores90Dias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resumoConsultasAnteriores90Dias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResumoConsultasAnteriores90Dias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResumoConsultasAnteriores90Dias }
     * 
     * 
     */
    public List<ResumoConsultasAnteriores90Dias> getResumoConsultasAnteriores90Dias() {
        if (resumoConsultasAnteriores90Dias == null) {
            resumoConsultasAnteriores90Dias = new ArrayList<ResumoConsultasAnteriores90Dias>();
        }
        return this.resumoConsultasAnteriores90Dias;
    }

    /**
     * Gets the value of the informacoesComplementares property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the informacoesComplementares property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInformacoesComplementares().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InformacoesComplementares }
     * 
     * 
     */
    public List<InformacoesComplementares> getInformacoesComplementares() {
        if (informacoesComplementares == null) {
            informacoesComplementares = new ArrayList<InformacoesComplementares>();
        }
        return this.informacoesComplementares;
    }

    /**
     * Gets the value of the debitos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the debitos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDebitos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Debitos }
     * 
     * 
     */
    public List<Debitos> getDebitos() {
        if (debitos == null) {
            debitos = new ArrayList<Debitos>();
        }
        return this.debitos;
    }

    /**
     * Gets the value of the consultasAnteriores property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consultasAnteriores property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsultasAnteriores().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsultasAnteriores }
     * 
     * 
     */
    public List<ConsultasAnteriores> getConsultasAnteriores() {
        if (consultasAnteriores == null) {
            consultasAnteriores = new ArrayList<ConsultasAnteriores>();
        }
        return this.consultasAnteriores;
    }

    /**
     * Gets the value of the titulosProtestados property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the titulosProtestados property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTitulosProtestados().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TitulosProtestados }
     * 
     * 
     */
    public List<TitulosProtestados> getTitulosProtestados() {
        if (titulosProtestados == null) {
            titulosProtestados = new ArrayList<TitulosProtestados>();
        }
        return this.titulosProtestados;
    }

    /**
     * Gets the value of the resumoTitulosProtestados property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resumoTitulosProtestados property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResumoTitulosProtestados().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResumoTitulosProtestados }
     * 
     * 
     */
    public List<ResumoTitulosProtestados> getResumoTitulosProtestados() {
        if (resumoTitulosProtestados == null) {
            resumoTitulosProtestados = new ArrayList<ResumoTitulosProtestados>();
        }
        return this.resumoTitulosProtestados;
    }

    /**
     * Gets the value of the chequeTalaoSustado property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chequeTalaoSustado property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChequeTalaoSustado().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChequeTalaoSustado }
     * 
     * 
     */
    public List<ChequeTalaoSustado> getChequeTalaoSustado() {
        if (chequeTalaoSustado == null) {
            chequeTalaoSustado = new ArrayList<ChequeTalaoSustado>();
        }
        return this.chequeTalaoSustado;
    }

    /**
     * Obtém o valor da propriedade resumoDevolucoesInformadasPeloCcf.
     * 
     * @return
     *     possible object is
     *     {@link ResumoDevolucoesInformadasPeloCcf }
     *     
     */
    public ResumoDevolucoesInformadasPeloCcf getResumoDevolucoesInformadasPeloCcf() {
        return resumoDevolucoesInformadasPeloCcf;
    }

    /**
     * Define o valor da propriedade resumoDevolucoesInformadasPeloCcf.
     * 
     * @param value
     *     allowed object is
     *     {@link ResumoDevolucoesInformadasPeloCcf }
     *     
     */
    public void setResumoDevolucoesInformadasPeloCcf(ResumoDevolucoesInformadasPeloCcf value) {
        this.resumoDevolucoesInformadasPeloCcf = value;
    }

    /**
     * Gets the value of the resumoConsultasAnterioresCheque property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resumoConsultasAnterioresCheque property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResumoConsultasAnterioresCheque().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResumoConsultasAnterioresCheque }
     * 
     * 
     */
    public List<ResumoConsultasAnterioresCheque> getResumoConsultasAnterioresCheque() {
        if (resumoConsultasAnterioresCheque == null) {
            resumoConsultasAnterioresCheque = new ArrayList<ResumoConsultasAnterioresCheque>();
        }
        return this.resumoConsultasAnterioresCheque;
    }

    /**
     * Gets the value of the confirmacaoTelefone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the confirmacaoTelefone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfirmacaoTelefone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConfirmacaoTelefone }
     * 
     * 
     */
    public List<ConfirmacaoTelefone> getConfirmacaoTelefone() {
        if (confirmacaoTelefone == null) {
            confirmacaoTelefone = new ArrayList<ConfirmacaoTelefone>();
        }
        return this.confirmacaoTelefone;
    }

    /**
     * Gets the value of the enderecoTelefonesAgenciaBancaria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enderecoTelefonesAgenciaBancaria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnderecoTelefonesAgenciaBancaria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnderecoTelefonesAgenciaBancaria }
     * 
     * 
     */
    public List<EnderecoTelefonesAgenciaBancaria> getEnderecoTelefonesAgenciaBancaria() {
        if (enderecoTelefonesAgenciaBancaria == null) {
            enderecoTelefonesAgenciaBancaria = new ArrayList<EnderecoTelefonesAgenciaBancaria>();
        }
        return this.enderecoTelefonesAgenciaBancaria;
    }

    /**
     * Gets the value of the confirmacaoCep property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the confirmacaoCep property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfirmacaoCep().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConfirmacaoCep }
     * 
     * 
     */
    public List<ConfirmacaoCep> getConfirmacaoCep() {
        if (confirmacaoCep == null) {
            confirmacaoCep = new ArrayList<ConfirmacaoCep>();
        }
        return this.confirmacaoCep;
    }

    /**
     * Gets the value of the nomeDocumentos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nomeDocumentos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNomeDocumentos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NomeDocumentos }
     * 
     * 
     */
    public List<NomeDocumentos> getNomeDocumentos() {
        if (nomeDocumentos == null) {
            nomeDocumentos = new ArrayList<NomeDocumentos>();
        }
        return this.nomeDocumentos;
    }

    /**
     * Gets the value of the relacaoDevolucoesInformadasPeloCcf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relacaoDevolucoesInformadasPeloCcf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelacaoDevolucoesInformadasPeloCcf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelacaoDevolucoesInformadasPeloCcf }
     * 
     * 
     */
    public List<RelacaoDevolucoesInformadasPeloCcf> getRelacaoDevolucoesInformadasPeloCcf() {
        if (relacaoDevolucoesInformadasPeloCcf == null) {
            relacaoDevolucoesInformadasPeloCcf = new ArrayList<RelacaoDevolucoesInformadasPeloCcf>();
        }
        return this.relacaoDevolucoesInformadasPeloCcf;
    }

    /**
     * Gets the value of the informacoesComplementaresCheque property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the informacoesComplementaresCheque property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInformacoesComplementaresCheque().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InformacoesComplementaresCheque }
     * 
     * 
     */
    public List<InformacoesComplementaresCheque> getInformacoesComplementaresCheque() {
        if (informacoesComplementaresCheque == null) {
            informacoesComplementaresCheque = new ArrayList<InformacoesComplementaresCheque>();
        }
        return this.informacoesComplementaresCheque;
    }

    /**
     * Gets the value of the devolucoesInformadasPeloUsuario property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the devolucoesInformadasPeloUsuario property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDevolucoesInformadasPeloUsuario().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DevolucoesInformadasPeloUsuario }
     * 
     * 
     */
    public List<DevolucoesInformadasPeloUsuario> getDevolucoesInformadasPeloUsuario() {
        if (devolucoesInformadasPeloUsuario == null) {
            devolucoesInformadasPeloUsuario = new ArrayList<DevolucoesInformadasPeloUsuario>();
        }
        return this.devolucoesInformadasPeloUsuario;
    }

    /**
     * Gets the value of the chequesSustadosPeloMotivo21 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chequesSustadosPeloMotivo21 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChequesSustadosPeloMotivo21().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChequesSustadosPeloMotivo21 }
     * 
     * 
     */
    public List<ChequesSustadosPeloMotivo21> getChequesSustadosPeloMotivo21() {
        if (chequesSustadosPeloMotivo21 == null) {
            chequesSustadosPeloMotivo21 = new ArrayList<ChequesSustadosPeloMotivo21>();
        }
        return this.chequesSustadosPeloMotivo21;
    }

    /**
     * Gets the value of the historicoChequeInformado property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the historicoChequeInformado property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHistoricoChequeInformado().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HistoricoChequeInformado }
     * 
     * 
     */
    public List<HistoricoChequeInformado> getHistoricoChequeInformado() {
        if (historicoChequeInformado == null) {
            historicoChequeInformado = new ArrayList<HistoricoChequeInformado>();
        }
        return this.historicoChequeInformado;
    }

    /**
     * Gets the value of the historicoContaCorrenteInformada property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the historicoContaCorrenteInformada property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHistoricoContaCorrenteInformada().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HistoricoContaCorrenteInformada }
     * 
     * 
     */
    public List<HistoricoContaCorrenteInformada> getHistoricoContaCorrenteInformada() {
        if (historicoContaCorrenteInformada == null) {
            historicoContaCorrenteInformada = new ArrayList<HistoricoContaCorrenteInformada>();
        }
        return this.historicoContaCorrenteInformada;
    }

    /**
     * Gets the value of the consultasAnterioresCheque property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consultasAnterioresCheque property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsultasAnterioresCheque().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsultasAnterioresCheque }
     * 
     * 
     */
    public List<ConsultasAnterioresCheque> getConsultasAnterioresCheque() {
        if (consultasAnterioresCheque == null) {
            consultasAnterioresCheque = new ArrayList<ConsultasAnterioresCheque>();
        }
        return this.consultasAnterioresCheque;
    }

    /**
     * Obtém o valor da propriedade resumoDevolucoesInformadaPeloUsuario.
     * 
     * @return
     *     possible object is
     *     {@link ResumoDevolucoesInformadaPeloUsuario }
     *     
     */
    public ResumoDevolucoesInformadaPeloUsuario getResumoDevolucoesInformadaPeloUsuario() {
        return resumoDevolucoesInformadaPeloUsuario;
    }

    /**
     * Define o valor da propriedade resumoDevolucoesInformadaPeloUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link ResumoDevolucoesInformadaPeloUsuario }
     *     
     */
    public void setResumoDevolucoesInformadaPeloUsuario(ResumoDevolucoesInformadaPeloUsuario value) {
        this.resumoDevolucoesInformadaPeloUsuario = value;
    }

    /**
     * Obtém o valor da propriedade identificacao.
     * 
     * @return
     *     possible object is
     *     {@link Identificacao }
     *     
     */
    public Identificacao getIdentificacao() {
        return identificacao;
    }

    /**
     * Define o valor da propriedade identificacao.
     * 
     * @param value
     *     allowed object is
     *     {@link Identificacao }
     *     
     */
    public void setIdentificacao(Identificacao value) {
        this.identificacao = value;
    }

    /**
     * Obtém o valor da propriedade localizacao.
     * 
     * @return
     *     possible object is
     *     {@link Localizacao }
     *     
     */
    public Localizacao getLocalizacao() {
        return localizacao;
    }

    /**
     * Define o valor da propriedade localizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link Localizacao }
     *     
     */
    public void setLocalizacao(Localizacao value) {
        this.localizacao = value;
    }

    /**
     * Gets the value of the scoreClassificacaoVariosModelos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreClassificacaoVariosModelos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreClassificacaoVariosModelos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScoreClassificacaoVariosModelos }
     * 
     * 
     */
    public List<ScoreClassificacaoVariosModelos> getScoreClassificacaoVariosModelos() {
        if (scoreClassificacaoVariosModelos == null) {
            scoreClassificacaoVariosModelos = new ArrayList<ScoreClassificacaoVariosModelos>();
        }
        return this.scoreClassificacaoVariosModelos;
    }

    /**
     * Obtém o valor da propriedade decisao.
     * 
     * @return
     *     possible object is
     *     {@link Decisao }
     *     
     */
    public Decisao getDecisao() {
        return decisao;
    }

    /**
     * Define o valor da propriedade decisao.
     * 
     * @param value
     *     allowed object is
     *     {@link Decisao }
     *     
     */
    public void setDecisao(Decisao value) {
        this.decisao = value;
    }

    /**
     * Gets the value of the mensagemRegistro property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mensagemRegistro property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMensagemRegistro().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MensagemRegistro }
     * 
     * 
     */
    public List<MensagemRegistro> getMensagemRegistro() {
        if (mensagemRegistro == null) {
            mensagemRegistro = new ArrayList<MensagemRegistro>();
        }
        return this.mensagemRegistro;
    }

    /**
     * Obtém o valor da propriedade erro.
     * 
     * @return
     *     possible object is
     *     {@link Erro }
     *     
     */
    public Erro getErro() {
        return erro;
    }

    /**
     * Define o valor da propriedade erro.
     * 
     * @param value
     *     allowed object is
     *     {@link Erro }
     *     
     */
    public void setErro(Erro value) {
        this.erro = value;
    }

}
