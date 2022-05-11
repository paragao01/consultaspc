//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.05.10 às 08:06:45 AM BRT 
//


package br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.risco.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.administradores.Administradores;
import br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.anvisa.Anvisa;
import br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.cheques_devolvidos_informados_usuario.ChequesDevolvidosInformadosUsuario;
import br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.cheques_sem_fundo.ChequesSemFundo;
import br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.cheques_sustados.ChequesSustados;
import br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.comportamental.comprometimento_futuro.ComprometimentoFuturo;
import br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.comportamental.compromissos.Compromissos;
import br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.comportamental.credito_obtido.CreditoObtido;
import br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.comportamental.demais_informacoes.DemaisInformacoes;
import br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.comportamental.pagamento_a_vista.PagamentoAVista;
import br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.comportamental.pagamento_atrasado.PagamentoAtrasado;
import br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.comportamental.pagamento_pontual.PagamentoPontual;
import br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.consultas.Consultas;
import br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.decisao.Decisao;
import br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.empresas_situada_no_mesmo_endereco.EmpresasSituadaNoMesmoEndereco;
import br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.endereco_telefones_agencia_bancaria.EnderecoTelefonesAgenciaBancaria;
import br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.erro.Erro;
import br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.factor.v2.Factor;
import br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.faturamento_presumido.v2.FaturamentoPresumido;
import br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.historico_cheque_informados.HistoricoChequeInformados;
import br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.historico_conta_correntes.HistoricoContaCorrentes;
import br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.identificacao_basico.v2.IdentificacaoBasico;
import br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.limite_credito.LimiteCredito;
import br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.localizacao_basico.LocalizacaoBasico;
import br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.participacoes_empresas_consultadas.ParticipacoesEmpresasConsultadas;
import br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.participacoes_socios_adm_outras_empresas.ParticipacoesSociosAdmOutrasEmpresas;
import br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.pendencias_restricoes.PendenciasRestricoes;
import br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.protestos.Protestos;
import br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.score.v2.Score;
import br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.segmento_empresarial.SegmentoEmpresarial;
import br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.socios.Socios;
import br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.ultimas_consultas.UltimasConsultas;


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
 *           &lt;element ref="{http://boavistaservicos.com.br/define/xml/decisao}decisao" minOccurs="0"/>
 *           &lt;element ref="{http://boavistaservicos.com.br/define/xml/limite_credito}limite_credito" minOccurs="0"/>
 *           &lt;element ref="{http://boavistaservicos.com.br/define/xml/identificacao_basico/v2}identificacao_basico" minOccurs="0"/>
 *           &lt;element ref="{http://boavistaservicos.com.br/define/xml/localizacao_basico}localizacao_basico" minOccurs="0"/>
 *           &lt;element ref="{http://boavistaservicos.com.br/define/xml/score/v2}score" minOccurs="0"/>
 *           &lt;element ref="{http://boavistaservicos.com.br/define/xml/faturamento_presumido/v2}faturamento_presumido" minOccurs="0"/>
 *           &lt;element ref="{http://boavistaservicos.com.br/define/xml/empresas_situada_no_mesmo_endereco}empresas_situada_no_mesmo_endereco" minOccurs="0"/>
 *           &lt;element ref="{http://boavistaservicos.com.br/define/xml/socios}socios" minOccurs="0"/>
 *           &lt;element ref="{http://boavistaservicos.com.br/define/xml/administradores}administradores" minOccurs="0"/>
 *           &lt;element ref="{http://boavistaservicos.com.br/define/xml/participacoes_socios_adm_outras_empresas}participacoes_socios_adm_outras_empresas" minOccurs="0"/>
 *           &lt;element ref="{http://boavistaservicos.com.br/define/xml/participacoes_empresas_consultadas}participacoes_empresas_consultadas" minOccurs="0"/>
 *           &lt;element ref="{http://boavistaservicos.com.br/define/xml/consultas}consultas" minOccurs="0"/>
 *           &lt;element ref="{http://boavistaservicos.com.br/define/xml/ultimas_consultas}ultimas_consultas" minOccurs="0"/>
 *           &lt;element ref="{http://boavistaservicos.com.br/define/xml/anvisa}anvisa" minOccurs="0"/>
 *           &lt;element ref="{http://boavistaservicos.com.br/define/xml/historico_cheque_informados}historico_cheque_informados" minOccurs="0"/>
 *           &lt;element ref="{http://boavistaservicos.com.br/define/xml/historico_conta_correntes}historico_conta_correntes" minOccurs="0"/>
 *           &lt;element ref="{http://boavistaservicos.com.br/define/xml/endereco_telefones_agencia_bancaria}endereco_telefones_agencia_bancaria" minOccurs="0"/>
 *           &lt;element ref="{http://boavistaservicos.com.br/define/xml/pendencias_restricoes}pendencias_restricoes" minOccurs="0"/>
 *           &lt;element ref="{http://boavistaservicos.com.br/define/xml/cheques_sem_fundo}cheques_sem_fundo" minOccurs="0"/>
 *           &lt;element ref="{http://boavistaservicos.com.br/define/xml/cheques_sustados}cheques_sustados" minOccurs="0"/>
 *           &lt;element ref="{http://boavistaservicos.com.br/define/xml/cheques_devolvidos_informados_usuario}cheques_devolvidos_informados_usuario" minOccurs="0"/>
 *           &lt;element ref="{http://boavistaservicos.com.br/define/xml/protestos}protestos" minOccurs="0"/>
 *           &lt;element ref="{http://boavistaservicos.com.br/define/xml/comportamental/demais_informacoes}demais_informacoes" minOccurs="0"/>
 *           &lt;element ref="{http://boavistaservicos.com.br/define/xml/comportamental/credito_obtido}credito_obtido" minOccurs="0"/>
 *           &lt;element ref="{http://boavistaservicos.com.br/define/xml/comportamental/compromissos}compromissos" minOccurs="0"/>
 *           &lt;element ref="{http://boavistaservicos.com.br/define/xml/comportamental/pagamento_a_vista}pagamento_a_vista" minOccurs="0"/>
 *           &lt;element ref="{http://boavistaservicos.com.br/define/xml/comportamental/pagamento_pontual}pagamento_pontual" minOccurs="0"/>
 *           &lt;element ref="{http://boavistaservicos.com.br/define/xml/comportamental/pagamento_atrasado}pagamento_atrasado" minOccurs="0"/>
 *           &lt;element ref="{http://boavistaservicos.com.br/define/xml/comportamental/comprometimento_futuro}comprometimento_futuro" minOccurs="0"/>
 *           &lt;element ref="{http://boavistaservicos.com.br/define/xml/segmento_empresarial}segmento_empresarial" minOccurs="0"/>
 *           &lt;element ref="{http://boavistaservicos.com.br/define/xml/factor/v2}factor" minOccurs="0"/>
 *           &lt;element ref="{http://boavistaservicos.com.br/define/xml/erro}erro" minOccurs="0"/>
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
    "decisao",
    "limiteCredito",
    "identificacaoBasico",
    "localizacaoBasico",
    "score",
    "faturamentoPresumido",
    "empresasSituadaNoMesmoEndereco",
    "socios",
    "administradores",
    "participacoesSociosAdmOutrasEmpresas",
    "participacoesEmpresasConsultadas",
    "consultas",
    "ultimasConsultas",
    "anvisa",
    "historicoChequeInformados",
    "historicoContaCorrentes",
    "enderecoTelefonesAgenciaBancaria",
    "pendenciasRestricoes",
    "chequesSemFundo",
    "chequesSustados",
    "chequesDevolvidosInformadosUsuario",
    "protestos",
    "demaisInformacoes",
    "creditoObtido",
    "compromissos",
    "pagamentoAVista",
    "pagamentoPontual",
    "pagamentoAtrasado",
    "comprometimentoFuturo",
    "segmentoEmpresarial",
    "factor",
    "erro"
})
@XmlRootElement(name = "defineRisco")
public class DefineRisco {

    @XmlElement(namespace = "http://boavistaservicos.com.br/define/xml/decisao")
    protected Decisao decisao;
    @XmlElement(name = "limite_credito", namespace = "http://boavistaservicos.com.br/define/xml/limite_credito")
    protected LimiteCredito limiteCredito;
    @XmlElement(name = "identificacao_basico", namespace = "http://boavistaservicos.com.br/define/xml/identificacao_basico/v2")
    protected IdentificacaoBasico identificacaoBasico;
    @XmlElement(name = "localizacao_basico", namespace = "http://boavistaservicos.com.br/define/xml/localizacao_basico")
    protected LocalizacaoBasico localizacaoBasico;
    @XmlElement(namespace = "http://boavistaservicos.com.br/define/xml/score/v2")
    protected Score score;
    @XmlElement(name = "faturamento_presumido", namespace = "http://boavistaservicos.com.br/define/xml/faturamento_presumido/v2")
    protected FaturamentoPresumido faturamentoPresumido;
    @XmlElement(name = "empresas_situada_no_mesmo_endereco", namespace = "http://boavistaservicos.com.br/define/xml/empresas_situada_no_mesmo_endereco")
    protected EmpresasSituadaNoMesmoEndereco empresasSituadaNoMesmoEndereco;
    @XmlElement(namespace = "http://boavistaservicos.com.br/define/xml/socios")
    protected Socios socios;
    @XmlElement(namespace = "http://boavistaservicos.com.br/define/xml/administradores")
    protected Administradores administradores;
    @XmlElement(name = "participacoes_socios_adm_outras_empresas", namespace = "http://boavistaservicos.com.br/define/xml/participacoes_socios_adm_outras_empresas")
    protected ParticipacoesSociosAdmOutrasEmpresas participacoesSociosAdmOutrasEmpresas;
    @XmlElement(name = "participacoes_empresas_consultadas", namespace = "http://boavistaservicos.com.br/define/xml/participacoes_empresas_consultadas")
    protected ParticipacoesEmpresasConsultadas participacoesEmpresasConsultadas;
    @XmlElement(namespace = "http://boavistaservicos.com.br/define/xml/consultas")
    protected Consultas consultas;
    @XmlElement(name = "ultimas_consultas", namespace = "http://boavistaservicos.com.br/define/xml/ultimas_consultas")
    protected UltimasConsultas ultimasConsultas;
    @XmlElement(namespace = "http://boavistaservicos.com.br/define/xml/anvisa")
    protected Anvisa anvisa;
    @XmlElement(name = "historico_cheque_informados", namespace = "http://boavistaservicos.com.br/define/xml/historico_cheque_informados")
    protected HistoricoChequeInformados historicoChequeInformados;
    @XmlElement(name = "historico_conta_correntes", namespace = "http://boavistaservicos.com.br/define/xml/historico_conta_correntes")
    protected HistoricoContaCorrentes historicoContaCorrentes;
    @XmlElement(name = "endereco_telefones_agencia_bancaria", namespace = "http://boavistaservicos.com.br/define/xml/endereco_telefones_agencia_bancaria")
    protected EnderecoTelefonesAgenciaBancaria enderecoTelefonesAgenciaBancaria;
    @XmlElement(name = "pendencias_restricoes", namespace = "http://boavistaservicos.com.br/define/xml/pendencias_restricoes")
    protected PendenciasRestricoes pendenciasRestricoes;
    @XmlElement(name = "cheques_sem_fundo", namespace = "http://boavistaservicos.com.br/define/xml/cheques_sem_fundo")
    protected ChequesSemFundo chequesSemFundo;
    @XmlElement(name = "cheques_sustados", namespace = "http://boavistaservicos.com.br/define/xml/cheques_sustados")
    protected ChequesSustados chequesSustados;
    @XmlElement(name = "cheques_devolvidos_informados_usuario", namespace = "http://boavistaservicos.com.br/define/xml/cheques_devolvidos_informados_usuario")
    protected ChequesDevolvidosInformadosUsuario chequesDevolvidosInformadosUsuario;
    @XmlElement(namespace = "http://boavistaservicos.com.br/define/xml/protestos")
    protected Protestos protestos;
    @XmlElement(name = "demais_informacoes", namespace = "http://boavistaservicos.com.br/define/xml/comportamental/demais_informacoes")
    protected DemaisInformacoes demaisInformacoes;
    @XmlElement(name = "credito_obtido", namespace = "http://boavistaservicos.com.br/define/xml/comportamental/credito_obtido")
    protected CreditoObtido creditoObtido;
    @XmlElement(namespace = "http://boavistaservicos.com.br/define/xml/comportamental/compromissos")
    protected Compromissos compromissos;
    @XmlElement(name = "pagamento_a_vista", namespace = "http://boavistaservicos.com.br/define/xml/comportamental/pagamento_a_vista")
    protected PagamentoAVista pagamentoAVista;
    @XmlElement(name = "pagamento_pontual", namespace = "http://boavistaservicos.com.br/define/xml/comportamental/pagamento_pontual")
    protected PagamentoPontual pagamentoPontual;
    @XmlElement(name = "pagamento_atrasado", namespace = "http://boavistaservicos.com.br/define/xml/comportamental/pagamento_atrasado")
    protected PagamentoAtrasado pagamentoAtrasado;
    @XmlElement(name = "comprometimento_futuro", namespace = "http://boavistaservicos.com.br/define/xml/comportamental/comprometimento_futuro")
    protected ComprometimentoFuturo comprometimentoFuturo;
    @XmlElement(name = "segmento_empresarial", namespace = "http://boavistaservicos.com.br/define/xml/segmento_empresarial")
    protected SegmentoEmpresarial segmentoEmpresarial;
    @XmlElement(namespace = "http://boavistaservicos.com.br/define/xml/factor/v2")
    protected Factor factor;
    @XmlElement(namespace = "http://boavistaservicos.com.br/define/xml/erro")
    protected Erro erro;

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
     * Obtém o valor da propriedade limiteCredito.
     * 
     * @return
     *     possible object is
     *     {@link LimiteCredito }
     *     
     */
    public LimiteCredito getLimiteCredito() {
        return limiteCredito;
    }

    /**
     * Define o valor da propriedade limiteCredito.
     * 
     * @param value
     *     allowed object is
     *     {@link LimiteCredito }
     *     
     */
    public void setLimiteCredito(LimiteCredito value) {
        this.limiteCredito = value;
    }

    /**
     * Obtém o valor da propriedade identificacaoBasico.
     * 
     * @return
     *     possible object is
     *     {@link IdentificacaoBasico }
     *     
     */
    public IdentificacaoBasico getIdentificacaoBasico() {
        return identificacaoBasico;
    }

    /**
     * Define o valor da propriedade identificacaoBasico.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificacaoBasico }
     *     
     */
    public void setIdentificacaoBasico(IdentificacaoBasico value) {
        this.identificacaoBasico = value;
    }

    /**
     * Obtém o valor da propriedade localizacaoBasico.
     * 
     * @return
     *     possible object is
     *     {@link LocalizacaoBasico }
     *     
     */
    public LocalizacaoBasico getLocalizacaoBasico() {
        return localizacaoBasico;
    }

    /**
     * Define o valor da propriedade localizacaoBasico.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalizacaoBasico }
     *     
     */
    public void setLocalizacaoBasico(LocalizacaoBasico value) {
        this.localizacaoBasico = value;
    }

    /**
     * Obtém o valor da propriedade score.
     * 
     * @return
     *     possible object is
     *     {@link Score }
     *     
     */
    public Score getScore() {
        return score;
    }

    /**
     * Define o valor da propriedade score.
     * 
     * @param value
     *     allowed object is
     *     {@link Score }
     *     
     */
    public void setScore(Score value) {
        this.score = value;
    }

    /**
     * Obtém o valor da propriedade faturamentoPresumido.
     * 
     * @return
     *     possible object is
     *     {@link FaturamentoPresumido }
     *     
     */
    public FaturamentoPresumido getFaturamentoPresumido() {
        return faturamentoPresumido;
    }

    /**
     * Define o valor da propriedade faturamentoPresumido.
     * 
     * @param value
     *     allowed object is
     *     {@link FaturamentoPresumido }
     *     
     */
    public void setFaturamentoPresumido(FaturamentoPresumido value) {
        this.faturamentoPresumido = value;
    }

    /**
     * Obtém o valor da propriedade empresasSituadaNoMesmoEndereco.
     * 
     * @return
     *     possible object is
     *     {@link EmpresasSituadaNoMesmoEndereco }
     *     
     */
    public EmpresasSituadaNoMesmoEndereco getEmpresasSituadaNoMesmoEndereco() {
        return empresasSituadaNoMesmoEndereco;
    }

    /**
     * Define o valor da propriedade empresasSituadaNoMesmoEndereco.
     * 
     * @param value
     *     allowed object is
     *     {@link EmpresasSituadaNoMesmoEndereco }
     *     
     */
    public void setEmpresasSituadaNoMesmoEndereco(EmpresasSituadaNoMesmoEndereco value) {
        this.empresasSituadaNoMesmoEndereco = value;
    }

    /**
     * Obtém o valor da propriedade socios.
     * 
     * @return
     *     possible object is
     *     {@link Socios }
     *     
     */
    public Socios getSocios() {
        return socios;
    }

    /**
     * Define o valor da propriedade socios.
     * 
     * @param value
     *     allowed object is
     *     {@link Socios }
     *     
     */
    public void setSocios(Socios value) {
        this.socios = value;
    }

    /**
     * Obtém o valor da propriedade administradores.
     * 
     * @return
     *     possible object is
     *     {@link Administradores }
     *     
     */
    public Administradores getAdministradores() {
        return administradores;
    }

    /**
     * Define o valor da propriedade administradores.
     * 
     * @param value
     *     allowed object is
     *     {@link Administradores }
     *     
     */
    public void setAdministradores(Administradores value) {
        this.administradores = value;
    }

    /**
     * Obtém o valor da propriedade participacoesSociosAdmOutrasEmpresas.
     * 
     * @return
     *     possible object is
     *     {@link ParticipacoesSociosAdmOutrasEmpresas }
     *     
     */
    public ParticipacoesSociosAdmOutrasEmpresas getParticipacoesSociosAdmOutrasEmpresas() {
        return participacoesSociosAdmOutrasEmpresas;
    }

    /**
     * Define o valor da propriedade participacoesSociosAdmOutrasEmpresas.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipacoesSociosAdmOutrasEmpresas }
     *     
     */
    public void setParticipacoesSociosAdmOutrasEmpresas(ParticipacoesSociosAdmOutrasEmpresas value) {
        this.participacoesSociosAdmOutrasEmpresas = value;
    }

    /**
     * Obtém o valor da propriedade participacoesEmpresasConsultadas.
     * 
     * @return
     *     possible object is
     *     {@link ParticipacoesEmpresasConsultadas }
     *     
     */
    public ParticipacoesEmpresasConsultadas getParticipacoesEmpresasConsultadas() {
        return participacoesEmpresasConsultadas;
    }

    /**
     * Define o valor da propriedade participacoesEmpresasConsultadas.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipacoesEmpresasConsultadas }
     *     
     */
    public void setParticipacoesEmpresasConsultadas(ParticipacoesEmpresasConsultadas value) {
        this.participacoesEmpresasConsultadas = value;
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
     * Obtém o valor da propriedade ultimasConsultas.
     * 
     * @return
     *     possible object is
     *     {@link UltimasConsultas }
     *     
     */
    public UltimasConsultas getUltimasConsultas() {
        return ultimasConsultas;
    }

    /**
     * Define o valor da propriedade ultimasConsultas.
     * 
     * @param value
     *     allowed object is
     *     {@link UltimasConsultas }
     *     
     */
    public void setUltimasConsultas(UltimasConsultas value) {
        this.ultimasConsultas = value;
    }

    /**
     * Obtém o valor da propriedade anvisa.
     * 
     * @return
     *     possible object is
     *     {@link Anvisa }
     *     
     */
    public Anvisa getAnvisa() {
        return anvisa;
    }

    /**
     * Define o valor da propriedade anvisa.
     * 
     * @param value
     *     allowed object is
     *     {@link Anvisa }
     *     
     */
    public void setAnvisa(Anvisa value) {
        this.anvisa = value;
    }

    /**
     * Obtém o valor da propriedade historicoChequeInformados.
     * 
     * @return
     *     possible object is
     *     {@link HistoricoChequeInformados }
     *     
     */
    public HistoricoChequeInformados getHistoricoChequeInformados() {
        return historicoChequeInformados;
    }

    /**
     * Define o valor da propriedade historicoChequeInformados.
     * 
     * @param value
     *     allowed object is
     *     {@link HistoricoChequeInformados }
     *     
     */
    public void setHistoricoChequeInformados(HistoricoChequeInformados value) {
        this.historicoChequeInformados = value;
    }

    /**
     * Obtém o valor da propriedade historicoContaCorrentes.
     * 
     * @return
     *     possible object is
     *     {@link HistoricoContaCorrentes }
     *     
     */
    public HistoricoContaCorrentes getHistoricoContaCorrentes() {
        return historicoContaCorrentes;
    }

    /**
     * Define o valor da propriedade historicoContaCorrentes.
     * 
     * @param value
     *     allowed object is
     *     {@link HistoricoContaCorrentes }
     *     
     */
    public void setHistoricoContaCorrentes(HistoricoContaCorrentes value) {
        this.historicoContaCorrentes = value;
    }

    /**
     * Obtém o valor da propriedade enderecoTelefonesAgenciaBancaria.
     * 
     * @return
     *     possible object is
     *     {@link EnderecoTelefonesAgenciaBancaria }
     *     
     */
    public EnderecoTelefonesAgenciaBancaria getEnderecoTelefonesAgenciaBancaria() {
        return enderecoTelefonesAgenciaBancaria;
    }

    /**
     * Define o valor da propriedade enderecoTelefonesAgenciaBancaria.
     * 
     * @param value
     *     allowed object is
     *     {@link EnderecoTelefonesAgenciaBancaria }
     *     
     */
    public void setEnderecoTelefonesAgenciaBancaria(EnderecoTelefonesAgenciaBancaria value) {
        this.enderecoTelefonesAgenciaBancaria = value;
    }

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
     * Obtém o valor da propriedade chequesSustados.
     * 
     * @return
     *     possible object is
     *     {@link ChequesSustados }
     *     
     */
    public ChequesSustados getChequesSustados() {
        return chequesSustados;
    }

    /**
     * Define o valor da propriedade chequesSustados.
     * 
     * @param value
     *     allowed object is
     *     {@link ChequesSustados }
     *     
     */
    public void setChequesSustados(ChequesSustados value) {
        this.chequesSustados = value;
    }

    /**
     * Obtém o valor da propriedade chequesDevolvidosInformadosUsuario.
     * 
     * @return
     *     possible object is
     *     {@link ChequesDevolvidosInformadosUsuario }
     *     
     */
    public ChequesDevolvidosInformadosUsuario getChequesDevolvidosInformadosUsuario() {
        return chequesDevolvidosInformadosUsuario;
    }

    /**
     * Define o valor da propriedade chequesDevolvidosInformadosUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link ChequesDevolvidosInformadosUsuario }
     *     
     */
    public void setChequesDevolvidosInformadosUsuario(ChequesDevolvidosInformadosUsuario value) {
        this.chequesDevolvidosInformadosUsuario = value;
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
     * Obtém o valor da propriedade demaisInformacoes.
     * 
     * @return
     *     possible object is
     *     {@link DemaisInformacoes }
     *     
     */
    public DemaisInformacoes getDemaisInformacoes() {
        return demaisInformacoes;
    }

    /**
     * Define o valor da propriedade demaisInformacoes.
     * 
     * @param value
     *     allowed object is
     *     {@link DemaisInformacoes }
     *     
     */
    public void setDemaisInformacoes(DemaisInformacoes value) {
        this.demaisInformacoes = value;
    }

    /**
     * Obtém o valor da propriedade creditoObtido.
     * 
     * @return
     *     possible object is
     *     {@link CreditoObtido }
     *     
     */
    public CreditoObtido getCreditoObtido() {
        return creditoObtido;
    }

    /**
     * Define o valor da propriedade creditoObtido.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditoObtido }
     *     
     */
    public void setCreditoObtido(CreditoObtido value) {
        this.creditoObtido = value;
    }

    /**
     * Obtém o valor da propriedade compromissos.
     * 
     * @return
     *     possible object is
     *     {@link Compromissos }
     *     
     */
    public Compromissos getCompromissos() {
        return compromissos;
    }

    /**
     * Define o valor da propriedade compromissos.
     * 
     * @param value
     *     allowed object is
     *     {@link Compromissos }
     *     
     */
    public void setCompromissos(Compromissos value) {
        this.compromissos = value;
    }

    /**
     * Obtém o valor da propriedade pagamentoAVista.
     * 
     * @return
     *     possible object is
     *     {@link PagamentoAVista }
     *     
     */
    public PagamentoAVista getPagamentoAVista() {
        return pagamentoAVista;
    }

    /**
     * Define o valor da propriedade pagamentoAVista.
     * 
     * @param value
     *     allowed object is
     *     {@link PagamentoAVista }
     *     
     */
    public void setPagamentoAVista(PagamentoAVista value) {
        this.pagamentoAVista = value;
    }

    /**
     * Obtém o valor da propriedade pagamentoPontual.
     * 
     * @return
     *     possible object is
     *     {@link PagamentoPontual }
     *     
     */
    public PagamentoPontual getPagamentoPontual() {
        return pagamentoPontual;
    }

    /**
     * Define o valor da propriedade pagamentoPontual.
     * 
     * @param value
     *     allowed object is
     *     {@link PagamentoPontual }
     *     
     */
    public void setPagamentoPontual(PagamentoPontual value) {
        this.pagamentoPontual = value;
    }

    /**
     * Obtém o valor da propriedade pagamentoAtrasado.
     * 
     * @return
     *     possible object is
     *     {@link PagamentoAtrasado }
     *     
     */
    public PagamentoAtrasado getPagamentoAtrasado() {
        return pagamentoAtrasado;
    }

    /**
     * Define o valor da propriedade pagamentoAtrasado.
     * 
     * @param value
     *     allowed object is
     *     {@link PagamentoAtrasado }
     *     
     */
    public void setPagamentoAtrasado(PagamentoAtrasado value) {
        this.pagamentoAtrasado = value;
    }

    /**
     * Obtém o valor da propriedade comprometimentoFuturo.
     * 
     * @return
     *     possible object is
     *     {@link ComprometimentoFuturo }
     *     
     */
    public ComprometimentoFuturo getComprometimentoFuturo() {
        return comprometimentoFuturo;
    }

    /**
     * Define o valor da propriedade comprometimentoFuturo.
     * 
     * @param value
     *     allowed object is
     *     {@link ComprometimentoFuturo }
     *     
     */
    public void setComprometimentoFuturo(ComprometimentoFuturo value) {
        this.comprometimentoFuturo = value;
    }

    /**
     * Obtém o valor da propriedade segmentoEmpresarial.
     * 
     * @return
     *     possible object is
     *     {@link SegmentoEmpresarial }
     *     
     */
    public SegmentoEmpresarial getSegmentoEmpresarial() {
        return segmentoEmpresarial;
    }

    /**
     * Define o valor da propriedade segmentoEmpresarial.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentoEmpresarial }
     *     
     */
    public void setSegmentoEmpresarial(SegmentoEmpresarial value) {
        this.segmentoEmpresarial = value;
    }

    /**
     * Obtém o valor da propriedade factor.
     * 
     * @return
     *     possible object is
     *     {@link Factor }
     *     
     */
    public Factor getFactor() {
        return factor;
    }

    /**
     * Define o valor da propriedade factor.
     * 
     * @param value
     *     allowed object is
     *     {@link Factor }
     *     
     */
    public void setFactor(Factor value) {
        this.factor = value;
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
