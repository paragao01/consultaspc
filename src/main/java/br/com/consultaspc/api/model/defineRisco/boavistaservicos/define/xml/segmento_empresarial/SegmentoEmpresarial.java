//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.05.10 às 08:06:45 AM BRT 
//


package br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.segmento_empresarial;

import java.util.ArrayList;
import java.util.List;
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
 *           &lt;element name="nomeGrupo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="mensagem" type="{http://boavistaservicos.com.br/define/xml/util}mensagem" minOccurs="0"/>
 *           &lt;element name="identificacao" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="cnpj" type="{http://boavistaservicos.com.br/define/xml/util}cnpj" minOccurs="0"/>
 *                     &lt;element name="razao_social" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="ultima_remessa_enviada" type="{http://boavistaservicos.com.br/define/xml/util}dataDiaMesAno" minOccurs="0"/>
 *                     &lt;element name="ultimo_processamento_grupo" type="{http://boavistaservicos.com.br/define/xml/util}dataDiaMesAno" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="consultas_grupo" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="total_consultas" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                     &lt;element name="mes_ate_dia_anterior" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                     &lt;element name="total_1mes_atras" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                     &lt;element name="total_2meses_atras" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                     &lt;element name="total_3meses_atras" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                     &lt;element name="total_4meses_atras" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                     &lt;element name="total_5meses_atras" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                     &lt;element name="total_6meses_atras" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                     &lt;element name="total_7meses_atras" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                     &lt;element name="total_8meses_atras" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                     &lt;element name="total_9meses_atras" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                     &lt;element name="total_10meses_atras" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                     &lt;element name="total_11meses_atras" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="comportamento_pagamentos_grupo" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="classificacao_ranking" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="titulos_em_aberto_ranking" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="vencido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                         &lt;element name="a_vencer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                         &lt;element name="em_aberto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="dt_atual_menos_5m_1ano_dt_atual_menos_5m" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="titulos_pagos" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="a_vista" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                         &lt;element name="pontual" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                         &lt;element name="atraso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="titulos_em_aberto" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="vencido" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                         &lt;element name="a_vencer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                         &lt;element name="em_aberto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="maior_compra" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="data_atual_menos_4meses" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="titulos_pagos" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="a_vista" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                         &lt;element name="pontual" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                         &lt;element name="atraso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="titulos_em_aberto" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="vencido" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                         &lt;element name="a_vencer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                         &lt;element name="em_aberto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="maior_compra" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="data_atual_menos_3meses" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="titulos_pagos" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="a_vista" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                         &lt;element name="pontual" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                         &lt;element name="atraso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="titulos_em_aberto" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="vencido" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                         &lt;element name="a_vencer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                         &lt;element name="em_aberto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="maior_compra" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="data_atual_menos_2meses" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="titulos_pagos" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="a_vista" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                         &lt;element name="pontual" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                         &lt;element name="atraso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="titulos_em_aberto" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="vencido" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                         &lt;element name="a_vencer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                         &lt;element name="em_aberto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="maior_compra" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="data_atual_menos_1mes" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="titulos_pagos" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="a_vista" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                         &lt;element name="pontual" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                         &lt;element name="atraso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="titulos_em_aberto" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="vencido" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                         &lt;element name="a_vencer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                         &lt;element name="em_aberto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="maior_compra" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="data_atual" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="titulos_pagos" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="a_vista" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                         &lt;element name="pontual" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                         &lt;element name="atraso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="titulos_em_aberto" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="vencido" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                         &lt;element name="a_vencer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                         &lt;element name="em_aberto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="maior_compra" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="data_atual_mais_1mes" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="titulos_em_aberto_a_vencer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="data_atual_mais_2meses" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="titulos_em_aberto_a_vencer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="data_atual_mais_3meses" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="titulos_em_aberto_a_vencer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="comprometimento_futuro" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="titulos_em_aberto_a_vencer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                               &lt;element name="titulos_em_aberto_em_aberto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="total_comportamento" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="titulos_pagos" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="a_vista" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                         &lt;element name="pontual" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                         &lt;element name="atraso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="titulos_em_aberto" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="vencido" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                         &lt;element name="a_vencer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                         &lt;element name="em_aberto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="media_credito_concedido" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="titulos_em_aberto_em_aberto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="total_titulos_comportamento" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="titulos_pagos" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="a_vista" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                         &lt;element name="pontual" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                         &lt;element name="atraso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="titulos_em_aberto" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="vencido" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                         &lt;element name="a_vencer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                         &lt;element name="em_aberto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="media_titulos_comportamento" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="titulos_pagos" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="a_vista" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                         &lt;element name="pontual" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                         &lt;element name="atraso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="titulos_em_aberto" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="vencido" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                         &lt;element name="a_vencer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                         &lt;element name="em_aberto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="media_dias_comportamento" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="titulos_pagos_atraso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                               &lt;element name="titulos_aberto_vencido" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                               &lt;element name="titulos_aberto_a_vencer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="tipo_periodo" minOccurs="0">
 *                       &lt;simpleType>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;/restriction>
 *                       &lt;/simpleType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="empresas_grupo_registrando_sobre_cnpj" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice>
 *                     &lt;sequence>
 *                       &lt;element name="empresa_grupo" maxOccurs="unbounded" minOccurs="0">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence>
 *                                 &lt;element name="segmento_grupo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                 &lt;element name="quantidade" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                               &lt;/sequence>
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="qtd_total" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                     &lt;/sequence>
 *                     &lt;sequence>
 *                       &lt;element name="mensagem" type="{http://boavistaservicos.com.br/define/xml/util}mensagem" minOccurs="0"/>
 *                     &lt;/sequence>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
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
    "nomeGrupo",
    "mensagem",
    "identificacao",
    "consultasGrupo",
    "comportamentoPagamentosGrupo",
    "empresasGrupoRegistrandoSobreCnpj"
})
@XmlRootElement(name = "segmento_empresarial")
public class SegmentoEmpresarial {

    protected String nomeGrupo;
    protected String mensagem;
    protected SegmentoEmpresarial.Identificacao identificacao;
    @XmlElement(name = "consultas_grupo")
    protected SegmentoEmpresarial.ConsultasGrupo consultasGrupo;
    @XmlElement(name = "comportamento_pagamentos_grupo")
    protected SegmentoEmpresarial.ComportamentoPagamentosGrupo comportamentoPagamentosGrupo;
    @XmlElement(name = "empresas_grupo_registrando_sobre_cnpj")
    protected SegmentoEmpresarial.EmpresasGrupoRegistrandoSobreCnpj empresasGrupoRegistrandoSobreCnpj;

    /**
     * Obtém o valor da propriedade nomeGrupo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeGrupo() {
        return nomeGrupo;
    }

    /**
     * Define o valor da propriedade nomeGrupo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeGrupo(String value) {
        this.nomeGrupo = value;
    }

    /**
     * Obtém o valor da propriedade mensagem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensagem() {
        return mensagem;
    }

    /**
     * Define o valor da propriedade mensagem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensagem(String value) {
        this.mensagem = value;
    }

    /**
     * Obtém o valor da propriedade identificacao.
     * 
     * @return
     *     possible object is
     *     {@link SegmentoEmpresarial.Identificacao }
     *     
     */
    public SegmentoEmpresarial.Identificacao getIdentificacao() {
        return identificacao;
    }

    /**
     * Define o valor da propriedade identificacao.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentoEmpresarial.Identificacao }
     *     
     */
    public void setIdentificacao(SegmentoEmpresarial.Identificacao value) {
        this.identificacao = value;
    }

    /**
     * Obtém o valor da propriedade consultasGrupo.
     * 
     * @return
     *     possible object is
     *     {@link SegmentoEmpresarial.ConsultasGrupo }
     *     
     */
    public SegmentoEmpresarial.ConsultasGrupo getConsultasGrupo() {
        return consultasGrupo;
    }

    /**
     * Define o valor da propriedade consultasGrupo.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentoEmpresarial.ConsultasGrupo }
     *     
     */
    public void setConsultasGrupo(SegmentoEmpresarial.ConsultasGrupo value) {
        this.consultasGrupo = value;
    }

    /**
     * Obtém o valor da propriedade comportamentoPagamentosGrupo.
     * 
     * @return
     *     possible object is
     *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo }
     *     
     */
    public SegmentoEmpresarial.ComportamentoPagamentosGrupo getComportamentoPagamentosGrupo() {
        return comportamentoPagamentosGrupo;
    }

    /**
     * Define o valor da propriedade comportamentoPagamentosGrupo.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo }
     *     
     */
    public void setComportamentoPagamentosGrupo(SegmentoEmpresarial.ComportamentoPagamentosGrupo value) {
        this.comportamentoPagamentosGrupo = value;
    }

    /**
     * Obtém o valor da propriedade empresasGrupoRegistrandoSobreCnpj.
     * 
     * @return
     *     possible object is
     *     {@link SegmentoEmpresarial.EmpresasGrupoRegistrandoSobreCnpj }
     *     
     */
    public SegmentoEmpresarial.EmpresasGrupoRegistrandoSobreCnpj getEmpresasGrupoRegistrandoSobreCnpj() {
        return empresasGrupoRegistrandoSobreCnpj;
    }

    /**
     * Define o valor da propriedade empresasGrupoRegistrandoSobreCnpj.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentoEmpresarial.EmpresasGrupoRegistrandoSobreCnpj }
     *     
     */
    public void setEmpresasGrupoRegistrandoSobreCnpj(SegmentoEmpresarial.EmpresasGrupoRegistrandoSobreCnpj value) {
        this.empresasGrupoRegistrandoSobreCnpj = value;
    }


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
     *         &lt;element name="classificacao_ranking" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="titulos_em_aberto_ranking" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="vencido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="a_vencer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="em_aberto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="dt_atual_menos_5m_1ano_dt_atual_menos_5m" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="titulos_pagos" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="a_vista" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                             &lt;element name="pontual" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                             &lt;element name="atraso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="titulos_em_aberto" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="vencido" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                             &lt;element name="a_vencer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                             &lt;element name="em_aberto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="maior_compra" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="data_atual_menos_4meses" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="titulos_pagos" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="a_vista" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                             &lt;element name="pontual" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                             &lt;element name="atraso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="titulos_em_aberto" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="vencido" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                             &lt;element name="a_vencer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                             &lt;element name="em_aberto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="maior_compra" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="data_atual_menos_3meses" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="titulos_pagos" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="a_vista" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                             &lt;element name="pontual" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                             &lt;element name="atraso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="titulos_em_aberto" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="vencido" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                             &lt;element name="a_vencer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                             &lt;element name="em_aberto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="maior_compra" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="data_atual_menos_2meses" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="titulos_pagos" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="a_vista" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                             &lt;element name="pontual" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                             &lt;element name="atraso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="titulos_em_aberto" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="vencido" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                             &lt;element name="a_vencer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                             &lt;element name="em_aberto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="maior_compra" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="data_atual_menos_1mes" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="titulos_pagos" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="a_vista" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                             &lt;element name="pontual" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                             &lt;element name="atraso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="titulos_em_aberto" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="vencido" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                             &lt;element name="a_vencer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                             &lt;element name="em_aberto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="maior_compra" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="data_atual" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="titulos_pagos" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="a_vista" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                             &lt;element name="pontual" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                             &lt;element name="atraso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="titulos_em_aberto" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="vencido" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                             &lt;element name="a_vencer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                             &lt;element name="em_aberto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="maior_compra" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="data_atual_mais_1mes" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="titulos_em_aberto_a_vencer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="data_atual_mais_2meses" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="titulos_em_aberto_a_vencer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="data_atual_mais_3meses" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="titulos_em_aberto_a_vencer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="comprometimento_futuro" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="titulos_em_aberto_a_vencer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="titulos_em_aberto_em_aberto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="total_comportamento" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="titulos_pagos" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="a_vista" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                             &lt;element name="pontual" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                             &lt;element name="atraso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="titulos_em_aberto" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="vencido" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                             &lt;element name="a_vencer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                             &lt;element name="em_aberto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="media_credito_concedido" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="titulos_em_aberto_em_aberto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="total_titulos_comportamento" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="titulos_pagos" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="a_vista" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                             &lt;element name="pontual" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                             &lt;element name="atraso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="titulos_em_aberto" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="vencido" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                             &lt;element name="a_vencer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                             &lt;element name="em_aberto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="media_titulos_comportamento" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="titulos_pagos" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="a_vista" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                             &lt;element name="pontual" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                             &lt;element name="atraso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="titulos_em_aberto" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="vencido" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                             &lt;element name="a_vencer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                             &lt;element name="em_aberto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="media_dias_comportamento" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="titulos_pagos_atraso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="titulos_aberto_vencido" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="titulos_aberto_a_vencer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="tipo_periodo" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
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
        "classificacaoRanking",
        "dtAtualMenos5M1AnoDtAtualMenos5M",
        "dataAtualMenos4Meses",
        "dataAtualMenos3Meses",
        "dataAtualMenos2Meses",
        "dataAtualMenos1Mes",
        "dataAtual",
        "dataAtualMais1Mes",
        "dataAtualMais2Meses",
        "dataAtualMais3Meses",
        "comprometimentoFuturo",
        "totalComportamento",
        "mediaCreditoConcedido",
        "totalTitulosComportamento",
        "mediaTitulosComportamento",
        "mediaDiasComportamento",
        "tipoPeriodo"
    })
    public static class ComportamentoPagamentosGrupo {

        @XmlElement(name = "classificacao_ranking")
        protected SegmentoEmpresarial.ComportamentoPagamentosGrupo.ClassificacaoRanking classificacaoRanking;
        @XmlElement(name = "dt_atual_menos_5m_1ano_dt_atual_menos_5m")
        protected SegmentoEmpresarial.ComportamentoPagamentosGrupo.DtAtualMenos5M1AnoDtAtualMenos5M dtAtualMenos5M1AnoDtAtualMenos5M;
        @XmlElement(name = "data_atual_menos_4meses")
        protected SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMenos4Meses dataAtualMenos4Meses;
        @XmlElement(name = "data_atual_menos_3meses")
        protected SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMenos3Meses dataAtualMenos3Meses;
        @XmlElement(name = "data_atual_menos_2meses")
        protected SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMenos2Meses dataAtualMenos2Meses;
        @XmlElement(name = "data_atual_menos_1mes")
        protected SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMenos1Mes dataAtualMenos1Mes;
        @XmlElement(name = "data_atual")
        protected SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtual dataAtual;
        @XmlElement(name = "data_atual_mais_1mes")
        protected SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMais1Mes dataAtualMais1Mes;
        @XmlElement(name = "data_atual_mais_2meses")
        protected SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMais2Meses dataAtualMais2Meses;
        @XmlElement(name = "data_atual_mais_3meses")
        protected SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMais3Meses dataAtualMais3Meses;
        @XmlElement(name = "comprometimento_futuro")
        protected SegmentoEmpresarial.ComportamentoPagamentosGrupo.ComprometimentoFuturo comprometimentoFuturo;
        @XmlElement(name = "total_comportamento")
        protected SegmentoEmpresarial.ComportamentoPagamentosGrupo.TotalComportamento totalComportamento;
        @XmlElement(name = "media_credito_concedido")
        protected SegmentoEmpresarial.ComportamentoPagamentosGrupo.MediaCreditoConcedido mediaCreditoConcedido;
        @XmlElement(name = "total_titulos_comportamento")
        protected SegmentoEmpresarial.ComportamentoPagamentosGrupo.TotalTitulosComportamento totalTitulosComportamento;
        @XmlElement(name = "media_titulos_comportamento")
        protected SegmentoEmpresarial.ComportamentoPagamentosGrupo.MediaTitulosComportamento mediaTitulosComportamento;
        @XmlElement(name = "media_dias_comportamento")
        protected SegmentoEmpresarial.ComportamentoPagamentosGrupo.MediaDiasComportamento mediaDiasComportamento;
        @XmlElement(name = "tipo_periodo")
        protected String tipoPeriodo;

        /**
         * Obtém o valor da propriedade classificacaoRanking.
         * 
         * @return
         *     possible object is
         *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.ClassificacaoRanking }
         *     
         */
        public SegmentoEmpresarial.ComportamentoPagamentosGrupo.ClassificacaoRanking getClassificacaoRanking() {
            return classificacaoRanking;
        }

        /**
         * Define o valor da propriedade classificacaoRanking.
         * 
         * @param value
         *     allowed object is
         *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.ClassificacaoRanking }
         *     
         */
        public void setClassificacaoRanking(SegmentoEmpresarial.ComportamentoPagamentosGrupo.ClassificacaoRanking value) {
            this.classificacaoRanking = value;
        }

        /**
         * Obtém o valor da propriedade dtAtualMenos5M1AnoDtAtualMenos5M.
         * 
         * @return
         *     possible object is
         *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.DtAtualMenos5M1AnoDtAtualMenos5M }
         *     
         */
        public SegmentoEmpresarial.ComportamentoPagamentosGrupo.DtAtualMenos5M1AnoDtAtualMenos5M getDtAtualMenos5M1AnoDtAtualMenos5M() {
            return dtAtualMenos5M1AnoDtAtualMenos5M;
        }

        /**
         * Define o valor da propriedade dtAtualMenos5M1AnoDtAtualMenos5M.
         * 
         * @param value
         *     allowed object is
         *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.DtAtualMenos5M1AnoDtAtualMenos5M }
         *     
         */
        public void setDtAtualMenos5M1AnoDtAtualMenos5M(SegmentoEmpresarial.ComportamentoPagamentosGrupo.DtAtualMenos5M1AnoDtAtualMenos5M value) {
            this.dtAtualMenos5M1AnoDtAtualMenos5M = value;
        }

        /**
         * Obtém o valor da propriedade dataAtualMenos4Meses.
         * 
         * @return
         *     possible object is
         *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMenos4Meses }
         *     
         */
        public SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMenos4Meses getDataAtualMenos4Meses() {
            return dataAtualMenos4Meses;
        }

        /**
         * Define o valor da propriedade dataAtualMenos4Meses.
         * 
         * @param value
         *     allowed object is
         *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMenos4Meses }
         *     
         */
        public void setDataAtualMenos4Meses(SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMenos4Meses value) {
            this.dataAtualMenos4Meses = value;
        }

        /**
         * Obtém o valor da propriedade dataAtualMenos3Meses.
         * 
         * @return
         *     possible object is
         *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMenos3Meses }
         *     
         */
        public SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMenos3Meses getDataAtualMenos3Meses() {
            return dataAtualMenos3Meses;
        }

        /**
         * Define o valor da propriedade dataAtualMenos3Meses.
         * 
         * @param value
         *     allowed object is
         *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMenos3Meses }
         *     
         */
        public void setDataAtualMenos3Meses(SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMenos3Meses value) {
            this.dataAtualMenos3Meses = value;
        }

        /**
         * Obtém o valor da propriedade dataAtualMenos2Meses.
         * 
         * @return
         *     possible object is
         *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMenos2Meses }
         *     
         */
        public SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMenos2Meses getDataAtualMenos2Meses() {
            return dataAtualMenos2Meses;
        }

        /**
         * Define o valor da propriedade dataAtualMenos2Meses.
         * 
         * @param value
         *     allowed object is
         *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMenos2Meses }
         *     
         */
        public void setDataAtualMenos2Meses(SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMenos2Meses value) {
            this.dataAtualMenos2Meses = value;
        }

        /**
         * Obtém o valor da propriedade dataAtualMenos1Mes.
         * 
         * @return
         *     possible object is
         *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMenos1Mes }
         *     
         */
        public SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMenos1Mes getDataAtualMenos1Mes() {
            return dataAtualMenos1Mes;
        }

        /**
         * Define o valor da propriedade dataAtualMenos1Mes.
         * 
         * @param value
         *     allowed object is
         *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMenos1Mes }
         *     
         */
        public void setDataAtualMenos1Mes(SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMenos1Mes value) {
            this.dataAtualMenos1Mes = value;
        }

        /**
         * Obtém o valor da propriedade dataAtual.
         * 
         * @return
         *     possible object is
         *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtual }
         *     
         */
        public SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtual getDataAtual() {
            return dataAtual;
        }

        /**
         * Define o valor da propriedade dataAtual.
         * 
         * @param value
         *     allowed object is
         *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtual }
         *     
         */
        public void setDataAtual(SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtual value) {
            this.dataAtual = value;
        }

        /**
         * Obtém o valor da propriedade dataAtualMais1Mes.
         * 
         * @return
         *     possible object is
         *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMais1Mes }
         *     
         */
        public SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMais1Mes getDataAtualMais1Mes() {
            return dataAtualMais1Mes;
        }

        /**
         * Define o valor da propriedade dataAtualMais1Mes.
         * 
         * @param value
         *     allowed object is
         *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMais1Mes }
         *     
         */
        public void setDataAtualMais1Mes(SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMais1Mes value) {
            this.dataAtualMais1Mes = value;
        }

        /**
         * Obtém o valor da propriedade dataAtualMais2Meses.
         * 
         * @return
         *     possible object is
         *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMais2Meses }
         *     
         */
        public SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMais2Meses getDataAtualMais2Meses() {
            return dataAtualMais2Meses;
        }

        /**
         * Define o valor da propriedade dataAtualMais2Meses.
         * 
         * @param value
         *     allowed object is
         *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMais2Meses }
         *     
         */
        public void setDataAtualMais2Meses(SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMais2Meses value) {
            this.dataAtualMais2Meses = value;
        }

        /**
         * Obtém o valor da propriedade dataAtualMais3Meses.
         * 
         * @return
         *     possible object is
         *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMais3Meses }
         *     
         */
        public SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMais3Meses getDataAtualMais3Meses() {
            return dataAtualMais3Meses;
        }

        /**
         * Define o valor da propriedade dataAtualMais3Meses.
         * 
         * @param value
         *     allowed object is
         *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMais3Meses }
         *     
         */
        public void setDataAtualMais3Meses(SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMais3Meses value) {
            this.dataAtualMais3Meses = value;
        }

        /**
         * Obtém o valor da propriedade comprometimentoFuturo.
         * 
         * @return
         *     possible object is
         *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.ComprometimentoFuturo }
         *     
         */
        public SegmentoEmpresarial.ComportamentoPagamentosGrupo.ComprometimentoFuturo getComprometimentoFuturo() {
            return comprometimentoFuturo;
        }

        /**
         * Define o valor da propriedade comprometimentoFuturo.
         * 
         * @param value
         *     allowed object is
         *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.ComprometimentoFuturo }
         *     
         */
        public void setComprometimentoFuturo(SegmentoEmpresarial.ComportamentoPagamentosGrupo.ComprometimentoFuturo value) {
            this.comprometimentoFuturo = value;
        }

        /**
         * Obtém o valor da propriedade totalComportamento.
         * 
         * @return
         *     possible object is
         *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.TotalComportamento }
         *     
         */
        public SegmentoEmpresarial.ComportamentoPagamentosGrupo.TotalComportamento getTotalComportamento() {
            return totalComportamento;
        }

        /**
         * Define o valor da propriedade totalComportamento.
         * 
         * @param value
         *     allowed object is
         *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.TotalComportamento }
         *     
         */
        public void setTotalComportamento(SegmentoEmpresarial.ComportamentoPagamentosGrupo.TotalComportamento value) {
            this.totalComportamento = value;
        }

        /**
         * Obtém o valor da propriedade mediaCreditoConcedido.
         * 
         * @return
         *     possible object is
         *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.MediaCreditoConcedido }
         *     
         */
        public SegmentoEmpresarial.ComportamentoPagamentosGrupo.MediaCreditoConcedido getMediaCreditoConcedido() {
            return mediaCreditoConcedido;
        }

        /**
         * Define o valor da propriedade mediaCreditoConcedido.
         * 
         * @param value
         *     allowed object is
         *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.MediaCreditoConcedido }
         *     
         */
        public void setMediaCreditoConcedido(SegmentoEmpresarial.ComportamentoPagamentosGrupo.MediaCreditoConcedido value) {
            this.mediaCreditoConcedido = value;
        }

        /**
         * Obtém o valor da propriedade totalTitulosComportamento.
         * 
         * @return
         *     possible object is
         *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.TotalTitulosComportamento }
         *     
         */
        public SegmentoEmpresarial.ComportamentoPagamentosGrupo.TotalTitulosComportamento getTotalTitulosComportamento() {
            return totalTitulosComportamento;
        }

        /**
         * Define o valor da propriedade totalTitulosComportamento.
         * 
         * @param value
         *     allowed object is
         *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.TotalTitulosComportamento }
         *     
         */
        public void setTotalTitulosComportamento(SegmentoEmpresarial.ComportamentoPagamentosGrupo.TotalTitulosComportamento value) {
            this.totalTitulosComportamento = value;
        }

        /**
         * Obtém o valor da propriedade mediaTitulosComportamento.
         * 
         * @return
         *     possible object is
         *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.MediaTitulosComportamento }
         *     
         */
        public SegmentoEmpresarial.ComportamentoPagamentosGrupo.MediaTitulosComportamento getMediaTitulosComportamento() {
            return mediaTitulosComportamento;
        }

        /**
         * Define o valor da propriedade mediaTitulosComportamento.
         * 
         * @param value
         *     allowed object is
         *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.MediaTitulosComportamento }
         *     
         */
        public void setMediaTitulosComportamento(SegmentoEmpresarial.ComportamentoPagamentosGrupo.MediaTitulosComportamento value) {
            this.mediaTitulosComportamento = value;
        }

        /**
         * Obtém o valor da propriedade mediaDiasComportamento.
         * 
         * @return
         *     possible object is
         *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.MediaDiasComportamento }
         *     
         */
        public SegmentoEmpresarial.ComportamentoPagamentosGrupo.MediaDiasComportamento getMediaDiasComportamento() {
            return mediaDiasComportamento;
        }

        /**
         * Define o valor da propriedade mediaDiasComportamento.
         * 
         * @param value
         *     allowed object is
         *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.MediaDiasComportamento }
         *     
         */
        public void setMediaDiasComportamento(SegmentoEmpresarial.ComportamentoPagamentosGrupo.MediaDiasComportamento value) {
            this.mediaDiasComportamento = value;
        }

        /**
         * Obtém o valor da propriedade tipoPeriodo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTipoPeriodo() {
            return tipoPeriodo;
        }

        /**
         * Define o valor da propriedade tipoPeriodo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTipoPeriodo(String value) {
            this.tipoPeriodo = value;
        }


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
         *         &lt;element name="titulos_em_aberto_ranking" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="vencido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="a_vencer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="em_aberto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "titulosEmAbertoRanking"
        })
        public static class ClassificacaoRanking {

            @XmlElement(name = "titulos_em_aberto_ranking")
            protected SegmentoEmpresarial.ComportamentoPagamentosGrupo.ClassificacaoRanking.TitulosEmAbertoRanking titulosEmAbertoRanking;

            /**
             * Obtém o valor da propriedade titulosEmAbertoRanking.
             * 
             * @return
             *     possible object is
             *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.ClassificacaoRanking.TitulosEmAbertoRanking }
             *     
             */
            public SegmentoEmpresarial.ComportamentoPagamentosGrupo.ClassificacaoRanking.TitulosEmAbertoRanking getTitulosEmAbertoRanking() {
                return titulosEmAbertoRanking;
            }

            /**
             * Define o valor da propriedade titulosEmAbertoRanking.
             * 
             * @param value
             *     allowed object is
             *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.ClassificacaoRanking.TitulosEmAbertoRanking }
             *     
             */
            public void setTitulosEmAbertoRanking(SegmentoEmpresarial.ComportamentoPagamentosGrupo.ClassificacaoRanking.TitulosEmAbertoRanking value) {
                this.titulosEmAbertoRanking = value;
            }


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
             *         &lt;element name="vencido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="a_vencer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="em_aberto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "vencido",
                "aVencer",
                "emAberto"
            })
            public static class TitulosEmAbertoRanking {

                protected String vencido;
                @XmlElement(name = "a_vencer")
                protected String aVencer;
                @XmlElement(name = "em_aberto")
                protected String emAberto;

                /**
                 * Obtém o valor da propriedade vencido.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVencido() {
                    return vencido;
                }

                /**
                 * Define o valor da propriedade vencido.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVencido(String value) {
                    this.vencido = value;
                }

                /**
                 * Obtém o valor da propriedade aVencer.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAVencer() {
                    return aVencer;
                }

                /**
                 * Define o valor da propriedade aVencer.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAVencer(String value) {
                    this.aVencer = value;
                }

                /**
                 * Obtém o valor da propriedade emAberto.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEmAberto() {
                    return emAberto;
                }

                /**
                 * Define o valor da propriedade emAberto.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEmAberto(String value) {
                    this.emAberto = value;
                }

            }

        }


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
         *         &lt;element name="titulos_em_aberto_a_vencer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="titulos_em_aberto_em_aberto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
            "titulosEmAbertoAVencer",
            "titulosEmAbertoEmAberto"
        })
        public static class ComprometimentoFuturo {

            @XmlElement(name = "titulos_em_aberto_a_vencer")
            protected Integer titulosEmAbertoAVencer;
            @XmlElement(name = "titulos_em_aberto_em_aberto")
            protected Integer titulosEmAbertoEmAberto;

            /**
             * Obtém o valor da propriedade titulosEmAbertoAVencer.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getTitulosEmAbertoAVencer() {
                return titulosEmAbertoAVencer;
            }

            /**
             * Define o valor da propriedade titulosEmAbertoAVencer.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setTitulosEmAbertoAVencer(Integer value) {
                this.titulosEmAbertoAVencer = value;
            }

            /**
             * Obtém o valor da propriedade titulosEmAbertoEmAberto.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getTitulosEmAbertoEmAberto() {
                return titulosEmAbertoEmAberto;
            }

            /**
             * Define o valor da propriedade titulosEmAbertoEmAberto.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setTitulosEmAbertoEmAberto(Integer value) {
                this.titulosEmAbertoEmAberto = value;
            }

        }


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
         *         &lt;element name="titulos_pagos" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="a_vista" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                   &lt;element name="pontual" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                   &lt;element name="atraso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="titulos_em_aberto" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="vencido" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                   &lt;element name="a_vencer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                   &lt;element name="em_aberto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="maior_compra" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
            "titulosPagos",
            "titulosEmAberto",
            "maiorCompra"
        })
        public static class DataAtual {

            @XmlElement(name = "titulos_pagos")
            protected SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtual.TitulosPagos titulosPagos;
            @XmlElement(name = "titulos_em_aberto")
            protected SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtual.TitulosEmAberto titulosEmAberto;
            @XmlElement(name = "maior_compra")
            protected Integer maiorCompra;

            /**
             * Obtém o valor da propriedade titulosPagos.
             * 
             * @return
             *     possible object is
             *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtual.TitulosPagos }
             *     
             */
            public SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtual.TitulosPagos getTitulosPagos() {
                return titulosPagos;
            }

            /**
             * Define o valor da propriedade titulosPagos.
             * 
             * @param value
             *     allowed object is
             *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtual.TitulosPagos }
             *     
             */
            public void setTitulosPagos(SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtual.TitulosPagos value) {
                this.titulosPagos = value;
            }

            /**
             * Obtém o valor da propriedade titulosEmAberto.
             * 
             * @return
             *     possible object is
             *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtual.TitulosEmAberto }
             *     
             */
            public SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtual.TitulosEmAberto getTitulosEmAberto() {
                return titulosEmAberto;
            }

            /**
             * Define o valor da propriedade titulosEmAberto.
             * 
             * @param value
             *     allowed object is
             *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtual.TitulosEmAberto }
             *     
             */
            public void setTitulosEmAberto(SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtual.TitulosEmAberto value) {
                this.titulosEmAberto = value;
            }

            /**
             * Obtém o valor da propriedade maiorCompra.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getMaiorCompra() {
                return maiorCompra;
            }

            /**
             * Define o valor da propriedade maiorCompra.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setMaiorCompra(Integer value) {
                this.maiorCompra = value;
            }


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
             *         &lt;element name="vencido" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
             *         &lt;element name="a_vencer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
             *         &lt;element name="em_aberto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
                "vencido",
                "aVencer",
                "emAberto"
            })
            public static class TitulosEmAberto {

                protected Integer vencido;
                @XmlElement(name = "a_vencer")
                protected Integer aVencer;
                @XmlElement(name = "em_aberto")
                protected Integer emAberto;

                /**
                 * Obtém o valor da propriedade vencido.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getVencido() {
                    return vencido;
                }

                /**
                 * Define o valor da propriedade vencido.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setVencido(Integer value) {
                    this.vencido = value;
                }

                /**
                 * Obtém o valor da propriedade aVencer.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getAVencer() {
                    return aVencer;
                }

                /**
                 * Define o valor da propriedade aVencer.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setAVencer(Integer value) {
                    this.aVencer = value;
                }

                /**
                 * Obtém o valor da propriedade emAberto.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getEmAberto() {
                    return emAberto;
                }

                /**
                 * Define o valor da propriedade emAberto.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setEmAberto(Integer value) {
                    this.emAberto = value;
                }

            }


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
             *         &lt;element name="a_vista" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
             *         &lt;element name="pontual" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
             *         &lt;element name="atraso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
                "aVista",
                "pontual",
                "atraso"
            })
            public static class TitulosPagos {

                @XmlElement(name = "a_vista")
                protected Integer aVista;
                protected Integer pontual;
                protected Integer atraso;

                /**
                 * Obtém o valor da propriedade aVista.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getAVista() {
                    return aVista;
                }

                /**
                 * Define o valor da propriedade aVista.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setAVista(Integer value) {
                    this.aVista = value;
                }

                /**
                 * Obtém o valor da propriedade pontual.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getPontual() {
                    return pontual;
                }

                /**
                 * Define o valor da propriedade pontual.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setPontual(Integer value) {
                    this.pontual = value;
                }

                /**
                 * Obtém o valor da propriedade atraso.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getAtraso() {
                    return atraso;
                }

                /**
                 * Define o valor da propriedade atraso.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setAtraso(Integer value) {
                    this.atraso = value;
                }

            }

        }


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
         *         &lt;element name="titulos_em_aberto_a_vencer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
            "titulosEmAbertoAVencer"
        })
        public static class DataAtualMais1Mes {

            @XmlElement(name = "titulos_em_aberto_a_vencer")
            protected Integer titulosEmAbertoAVencer;

            /**
             * Obtém o valor da propriedade titulosEmAbertoAVencer.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getTitulosEmAbertoAVencer() {
                return titulosEmAbertoAVencer;
            }

            /**
             * Define o valor da propriedade titulosEmAbertoAVencer.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setTitulosEmAbertoAVencer(Integer value) {
                this.titulosEmAbertoAVencer = value;
            }

        }


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
         *         &lt;element name="titulos_em_aberto_a_vencer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
            "titulosEmAbertoAVencer"
        })
        public static class DataAtualMais2Meses {

            @XmlElement(name = "titulos_em_aberto_a_vencer")
            protected Integer titulosEmAbertoAVencer;

            /**
             * Obtém o valor da propriedade titulosEmAbertoAVencer.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getTitulosEmAbertoAVencer() {
                return titulosEmAbertoAVencer;
            }

            /**
             * Define o valor da propriedade titulosEmAbertoAVencer.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setTitulosEmAbertoAVencer(Integer value) {
                this.titulosEmAbertoAVencer = value;
            }

        }


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
         *         &lt;element name="titulos_em_aberto_a_vencer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
            "titulosEmAbertoAVencer"
        })
        public static class DataAtualMais3Meses {

            @XmlElement(name = "titulos_em_aberto_a_vencer")
            protected Integer titulosEmAbertoAVencer;

            /**
             * Obtém o valor da propriedade titulosEmAbertoAVencer.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getTitulosEmAbertoAVencer() {
                return titulosEmAbertoAVencer;
            }

            /**
             * Define o valor da propriedade titulosEmAbertoAVencer.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setTitulosEmAbertoAVencer(Integer value) {
                this.titulosEmAbertoAVencer = value;
            }

        }


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
         *         &lt;element name="titulos_pagos" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="a_vista" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                   &lt;element name="pontual" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                   &lt;element name="atraso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="titulos_em_aberto" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="vencido" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                   &lt;element name="a_vencer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                   &lt;element name="em_aberto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="maior_compra" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
            "titulosPagos",
            "titulosEmAberto",
            "maiorCompra"
        })
        public static class DataAtualMenos1Mes {

            @XmlElement(name = "titulos_pagos")
            protected SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMenos1Mes.TitulosPagos titulosPagos;
            @XmlElement(name = "titulos_em_aberto")
            protected SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMenos1Mes.TitulosEmAberto titulosEmAberto;
            @XmlElement(name = "maior_compra")
            protected Integer maiorCompra;

            /**
             * Obtém o valor da propriedade titulosPagos.
             * 
             * @return
             *     possible object is
             *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMenos1Mes.TitulosPagos }
             *     
             */
            public SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMenos1Mes.TitulosPagos getTitulosPagos() {
                return titulosPagos;
            }

            /**
             * Define o valor da propriedade titulosPagos.
             * 
             * @param value
             *     allowed object is
             *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMenos1Mes.TitulosPagos }
             *     
             */
            public void setTitulosPagos(SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMenos1Mes.TitulosPagos value) {
                this.titulosPagos = value;
            }

            /**
             * Obtém o valor da propriedade titulosEmAberto.
             * 
             * @return
             *     possible object is
             *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMenos1Mes.TitulosEmAberto }
             *     
             */
            public SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMenos1Mes.TitulosEmAberto getTitulosEmAberto() {
                return titulosEmAberto;
            }

            /**
             * Define o valor da propriedade titulosEmAberto.
             * 
             * @param value
             *     allowed object is
             *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMenos1Mes.TitulosEmAberto }
             *     
             */
            public void setTitulosEmAberto(SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMenos1Mes.TitulosEmAberto value) {
                this.titulosEmAberto = value;
            }

            /**
             * Obtém o valor da propriedade maiorCompra.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getMaiorCompra() {
                return maiorCompra;
            }

            /**
             * Define o valor da propriedade maiorCompra.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setMaiorCompra(Integer value) {
                this.maiorCompra = value;
            }


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
             *         &lt;element name="vencido" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
             *         &lt;element name="a_vencer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
             *         &lt;element name="em_aberto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
                "vencido",
                "aVencer",
                "emAberto"
            })
            public static class TitulosEmAberto {

                protected Integer vencido;
                @XmlElement(name = "a_vencer")
                protected Integer aVencer;
                @XmlElement(name = "em_aberto")
                protected Integer emAberto;

                /**
                 * Obtém o valor da propriedade vencido.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getVencido() {
                    return vencido;
                }

                /**
                 * Define o valor da propriedade vencido.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setVencido(Integer value) {
                    this.vencido = value;
                }

                /**
                 * Obtém o valor da propriedade aVencer.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getAVencer() {
                    return aVencer;
                }

                /**
                 * Define o valor da propriedade aVencer.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setAVencer(Integer value) {
                    this.aVencer = value;
                }

                /**
                 * Obtém o valor da propriedade emAberto.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getEmAberto() {
                    return emAberto;
                }

                /**
                 * Define o valor da propriedade emAberto.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setEmAberto(Integer value) {
                    this.emAberto = value;
                }

            }


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
             *         &lt;element name="a_vista" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
             *         &lt;element name="pontual" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
             *         &lt;element name="atraso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
                "aVista",
                "pontual",
                "atraso"
            })
            public static class TitulosPagos {

                @XmlElement(name = "a_vista")
                protected Integer aVista;
                protected Integer pontual;
                protected Integer atraso;

                /**
                 * Obtém o valor da propriedade aVista.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getAVista() {
                    return aVista;
                }

                /**
                 * Define o valor da propriedade aVista.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setAVista(Integer value) {
                    this.aVista = value;
                }

                /**
                 * Obtém o valor da propriedade pontual.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getPontual() {
                    return pontual;
                }

                /**
                 * Define o valor da propriedade pontual.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setPontual(Integer value) {
                    this.pontual = value;
                }

                /**
                 * Obtém o valor da propriedade atraso.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getAtraso() {
                    return atraso;
                }

                /**
                 * Define o valor da propriedade atraso.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setAtraso(Integer value) {
                    this.atraso = value;
                }

            }

        }


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
         *         &lt;element name="titulos_pagos" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="a_vista" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                   &lt;element name="pontual" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                   &lt;element name="atraso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="titulos_em_aberto" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="vencido" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                   &lt;element name="a_vencer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                   &lt;element name="em_aberto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="maior_compra" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
            "titulosPagos",
            "titulosEmAberto",
            "maiorCompra"
        })
        public static class DataAtualMenos2Meses {

            @XmlElement(name = "titulos_pagos")
            protected SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMenos2Meses.TitulosPagos titulosPagos;
            @XmlElement(name = "titulos_em_aberto")
            protected SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMenos2Meses.TitulosEmAberto titulosEmAberto;
            @XmlElement(name = "maior_compra")
            protected Integer maiorCompra;

            /**
             * Obtém o valor da propriedade titulosPagos.
             * 
             * @return
             *     possible object is
             *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMenos2Meses.TitulosPagos }
             *     
             */
            public SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMenos2Meses.TitulosPagos getTitulosPagos() {
                return titulosPagos;
            }

            /**
             * Define o valor da propriedade titulosPagos.
             * 
             * @param value
             *     allowed object is
             *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMenos2Meses.TitulosPagos }
             *     
             */
            public void setTitulosPagos(SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMenos2Meses.TitulosPagos value) {
                this.titulosPagos = value;
            }

            /**
             * Obtém o valor da propriedade titulosEmAberto.
             * 
             * @return
             *     possible object is
             *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMenos2Meses.TitulosEmAberto }
             *     
             */
            public SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMenos2Meses.TitulosEmAberto getTitulosEmAberto() {
                return titulosEmAberto;
            }

            /**
             * Define o valor da propriedade titulosEmAberto.
             * 
             * @param value
             *     allowed object is
             *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMenos2Meses.TitulosEmAberto }
             *     
             */
            public void setTitulosEmAberto(SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMenos2Meses.TitulosEmAberto value) {
                this.titulosEmAberto = value;
            }

            /**
             * Obtém o valor da propriedade maiorCompra.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getMaiorCompra() {
                return maiorCompra;
            }

            /**
             * Define o valor da propriedade maiorCompra.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setMaiorCompra(Integer value) {
                this.maiorCompra = value;
            }


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
             *         &lt;element name="vencido" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
             *         &lt;element name="a_vencer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
             *         &lt;element name="em_aberto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
                "vencido",
                "aVencer",
                "emAberto"
            })
            public static class TitulosEmAberto {

                protected Integer vencido;
                @XmlElement(name = "a_vencer")
                protected Integer aVencer;
                @XmlElement(name = "em_aberto")
                protected Integer emAberto;

                /**
                 * Obtém o valor da propriedade vencido.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getVencido() {
                    return vencido;
                }

                /**
                 * Define o valor da propriedade vencido.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setVencido(Integer value) {
                    this.vencido = value;
                }

                /**
                 * Obtém o valor da propriedade aVencer.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getAVencer() {
                    return aVencer;
                }

                /**
                 * Define o valor da propriedade aVencer.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setAVencer(Integer value) {
                    this.aVencer = value;
                }

                /**
                 * Obtém o valor da propriedade emAberto.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getEmAberto() {
                    return emAberto;
                }

                /**
                 * Define o valor da propriedade emAberto.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setEmAberto(Integer value) {
                    this.emAberto = value;
                }

            }


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
             *         &lt;element name="a_vista" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
             *         &lt;element name="pontual" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
             *         &lt;element name="atraso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
                "aVista",
                "pontual",
                "atraso"
            })
            public static class TitulosPagos {

                @XmlElement(name = "a_vista")
                protected Integer aVista;
                protected Integer pontual;
                protected Integer atraso;

                /**
                 * Obtém o valor da propriedade aVista.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getAVista() {
                    return aVista;
                }

                /**
                 * Define o valor da propriedade aVista.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setAVista(Integer value) {
                    this.aVista = value;
                }

                /**
                 * Obtém o valor da propriedade pontual.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getPontual() {
                    return pontual;
                }

                /**
                 * Define o valor da propriedade pontual.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setPontual(Integer value) {
                    this.pontual = value;
                }

                /**
                 * Obtém o valor da propriedade atraso.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getAtraso() {
                    return atraso;
                }

                /**
                 * Define o valor da propriedade atraso.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setAtraso(Integer value) {
                    this.atraso = value;
                }

            }

        }


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
         *         &lt;element name="titulos_pagos" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="a_vista" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                   &lt;element name="pontual" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                   &lt;element name="atraso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="titulos_em_aberto" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="vencido" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                   &lt;element name="a_vencer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                   &lt;element name="em_aberto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="maior_compra" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
            "titulosPagos",
            "titulosEmAberto",
            "maiorCompra"
        })
        public static class DataAtualMenos3Meses {

            @XmlElement(name = "titulos_pagos")
            protected SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMenos3Meses.TitulosPagos titulosPagos;
            @XmlElement(name = "titulos_em_aberto")
            protected SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMenos3Meses.TitulosEmAberto titulosEmAberto;
            @XmlElement(name = "maior_compra")
            protected Integer maiorCompra;

            /**
             * Obtém o valor da propriedade titulosPagos.
             * 
             * @return
             *     possible object is
             *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMenos3Meses.TitulosPagos }
             *     
             */
            public SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMenos3Meses.TitulosPagos getTitulosPagos() {
                return titulosPagos;
            }

            /**
             * Define o valor da propriedade titulosPagos.
             * 
             * @param value
             *     allowed object is
             *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMenos3Meses.TitulosPagos }
             *     
             */
            public void setTitulosPagos(SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMenos3Meses.TitulosPagos value) {
                this.titulosPagos = value;
            }

            /**
             * Obtém o valor da propriedade titulosEmAberto.
             * 
             * @return
             *     possible object is
             *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMenos3Meses.TitulosEmAberto }
             *     
             */
            public SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMenos3Meses.TitulosEmAberto getTitulosEmAberto() {
                return titulosEmAberto;
            }

            /**
             * Define o valor da propriedade titulosEmAberto.
             * 
             * @param value
             *     allowed object is
             *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMenos3Meses.TitulosEmAberto }
             *     
             */
            public void setTitulosEmAberto(SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMenos3Meses.TitulosEmAberto value) {
                this.titulosEmAberto = value;
            }

            /**
             * Obtém o valor da propriedade maiorCompra.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getMaiorCompra() {
                return maiorCompra;
            }

            /**
             * Define o valor da propriedade maiorCompra.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setMaiorCompra(Integer value) {
                this.maiorCompra = value;
            }


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
             *         &lt;element name="vencido" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
             *         &lt;element name="a_vencer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
             *         &lt;element name="em_aberto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
                "vencido",
                "aVencer",
                "emAberto"
            })
            public static class TitulosEmAberto {

                protected Integer vencido;
                @XmlElement(name = "a_vencer")
                protected Integer aVencer;
                @XmlElement(name = "em_aberto")
                protected Integer emAberto;

                /**
                 * Obtém o valor da propriedade vencido.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getVencido() {
                    return vencido;
                }

                /**
                 * Define o valor da propriedade vencido.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setVencido(Integer value) {
                    this.vencido = value;
                }

                /**
                 * Obtém o valor da propriedade aVencer.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getAVencer() {
                    return aVencer;
                }

                /**
                 * Define o valor da propriedade aVencer.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setAVencer(Integer value) {
                    this.aVencer = value;
                }

                /**
                 * Obtém o valor da propriedade emAberto.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getEmAberto() {
                    return emAberto;
                }

                /**
                 * Define o valor da propriedade emAberto.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setEmAberto(Integer value) {
                    this.emAberto = value;
                }

            }


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
             *         &lt;element name="a_vista" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
             *         &lt;element name="pontual" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
             *         &lt;element name="atraso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
                "aVista",
                "pontual",
                "atraso"
            })
            public static class TitulosPagos {

                @XmlElement(name = "a_vista")
                protected Integer aVista;
                protected Integer pontual;
                protected Integer atraso;

                /**
                 * Obtém o valor da propriedade aVista.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getAVista() {
                    return aVista;
                }

                /**
                 * Define o valor da propriedade aVista.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setAVista(Integer value) {
                    this.aVista = value;
                }

                /**
                 * Obtém o valor da propriedade pontual.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getPontual() {
                    return pontual;
                }

                /**
                 * Define o valor da propriedade pontual.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setPontual(Integer value) {
                    this.pontual = value;
                }

                /**
                 * Obtém o valor da propriedade atraso.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getAtraso() {
                    return atraso;
                }

                /**
                 * Define o valor da propriedade atraso.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setAtraso(Integer value) {
                    this.atraso = value;
                }

            }

        }


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
         *         &lt;element name="titulos_pagos" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="a_vista" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                   &lt;element name="pontual" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                   &lt;element name="atraso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="titulos_em_aberto" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="vencido" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                   &lt;element name="a_vencer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                   &lt;element name="em_aberto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="maior_compra" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
            "titulosPagos",
            "titulosEmAberto",
            "maiorCompra"
        })
        public static class DataAtualMenos4Meses {

            @XmlElement(name = "titulos_pagos")
            protected SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMenos4Meses.TitulosPagos titulosPagos;
            @XmlElement(name = "titulos_em_aberto")
            protected SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMenos4Meses.TitulosEmAberto titulosEmAberto;
            @XmlElement(name = "maior_compra")
            protected Integer maiorCompra;

            /**
             * Obtém o valor da propriedade titulosPagos.
             * 
             * @return
             *     possible object is
             *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMenos4Meses.TitulosPagos }
             *     
             */
            public SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMenos4Meses.TitulosPagos getTitulosPagos() {
                return titulosPagos;
            }

            /**
             * Define o valor da propriedade titulosPagos.
             * 
             * @param value
             *     allowed object is
             *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMenos4Meses.TitulosPagos }
             *     
             */
            public void setTitulosPagos(SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMenos4Meses.TitulosPagos value) {
                this.titulosPagos = value;
            }

            /**
             * Obtém o valor da propriedade titulosEmAberto.
             * 
             * @return
             *     possible object is
             *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMenos4Meses.TitulosEmAberto }
             *     
             */
            public SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMenos4Meses.TitulosEmAberto getTitulosEmAberto() {
                return titulosEmAberto;
            }

            /**
             * Define o valor da propriedade titulosEmAberto.
             * 
             * @param value
             *     allowed object is
             *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMenos4Meses.TitulosEmAberto }
             *     
             */
            public void setTitulosEmAberto(SegmentoEmpresarial.ComportamentoPagamentosGrupo.DataAtualMenos4Meses.TitulosEmAberto value) {
                this.titulosEmAberto = value;
            }

            /**
             * Obtém o valor da propriedade maiorCompra.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getMaiorCompra() {
                return maiorCompra;
            }

            /**
             * Define o valor da propriedade maiorCompra.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setMaiorCompra(Integer value) {
                this.maiorCompra = value;
            }


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
             *         &lt;element name="vencido" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
             *         &lt;element name="a_vencer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
             *         &lt;element name="em_aberto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
                "vencido",
                "aVencer",
                "emAberto"
            })
            public static class TitulosEmAberto {

                protected Integer vencido;
                @XmlElement(name = "a_vencer")
                protected Integer aVencer;
                @XmlElement(name = "em_aberto")
                protected Integer emAberto;

                /**
                 * Obtém o valor da propriedade vencido.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getVencido() {
                    return vencido;
                }

                /**
                 * Define o valor da propriedade vencido.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setVencido(Integer value) {
                    this.vencido = value;
                }

                /**
                 * Obtém o valor da propriedade aVencer.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getAVencer() {
                    return aVencer;
                }

                /**
                 * Define o valor da propriedade aVencer.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setAVencer(Integer value) {
                    this.aVencer = value;
                }

                /**
                 * Obtém o valor da propriedade emAberto.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getEmAberto() {
                    return emAberto;
                }

                /**
                 * Define o valor da propriedade emAberto.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setEmAberto(Integer value) {
                    this.emAberto = value;
                }

            }


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
             *         &lt;element name="a_vista" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
             *         &lt;element name="pontual" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
             *         &lt;element name="atraso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
                "aVista",
                "pontual",
                "atraso"
            })
            public static class TitulosPagos {

                @XmlElement(name = "a_vista")
                protected Integer aVista;
                protected Integer pontual;
                protected Integer atraso;

                /**
                 * Obtém o valor da propriedade aVista.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getAVista() {
                    return aVista;
                }

                /**
                 * Define o valor da propriedade aVista.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setAVista(Integer value) {
                    this.aVista = value;
                }

                /**
                 * Obtém o valor da propriedade pontual.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getPontual() {
                    return pontual;
                }

                /**
                 * Define o valor da propriedade pontual.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setPontual(Integer value) {
                    this.pontual = value;
                }

                /**
                 * Obtém o valor da propriedade atraso.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getAtraso() {
                    return atraso;
                }

                /**
                 * Define o valor da propriedade atraso.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setAtraso(Integer value) {
                    this.atraso = value;
                }

            }

        }


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
         *         &lt;element name="titulos_pagos" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="a_vista" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                   &lt;element name="pontual" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                   &lt;element name="atraso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="titulos_em_aberto" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="vencido" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                   &lt;element name="a_vencer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                   &lt;element name="em_aberto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="maior_compra" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
            "titulosPagos",
            "titulosEmAberto",
            "maiorCompra"
        })
        public static class DtAtualMenos5M1AnoDtAtualMenos5M {

            @XmlElement(name = "titulos_pagos")
            protected SegmentoEmpresarial.ComportamentoPagamentosGrupo.DtAtualMenos5M1AnoDtAtualMenos5M.TitulosPagos titulosPagos;
            @XmlElement(name = "titulos_em_aberto")
            protected SegmentoEmpresarial.ComportamentoPagamentosGrupo.DtAtualMenos5M1AnoDtAtualMenos5M.TitulosEmAberto titulosEmAberto;
            @XmlElement(name = "maior_compra")
            protected Integer maiorCompra;

            /**
             * Obtém o valor da propriedade titulosPagos.
             * 
             * @return
             *     possible object is
             *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.DtAtualMenos5M1AnoDtAtualMenos5M.TitulosPagos }
             *     
             */
            public SegmentoEmpresarial.ComportamentoPagamentosGrupo.DtAtualMenos5M1AnoDtAtualMenos5M.TitulosPagos getTitulosPagos() {
                return titulosPagos;
            }

            /**
             * Define o valor da propriedade titulosPagos.
             * 
             * @param value
             *     allowed object is
             *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.DtAtualMenos5M1AnoDtAtualMenos5M.TitulosPagos }
             *     
             */
            public void setTitulosPagos(SegmentoEmpresarial.ComportamentoPagamentosGrupo.DtAtualMenos5M1AnoDtAtualMenos5M.TitulosPagos value) {
                this.titulosPagos = value;
            }

            /**
             * Obtém o valor da propriedade titulosEmAberto.
             * 
             * @return
             *     possible object is
             *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.DtAtualMenos5M1AnoDtAtualMenos5M.TitulosEmAberto }
             *     
             */
            public SegmentoEmpresarial.ComportamentoPagamentosGrupo.DtAtualMenos5M1AnoDtAtualMenos5M.TitulosEmAberto getTitulosEmAberto() {
                return titulosEmAberto;
            }

            /**
             * Define o valor da propriedade titulosEmAberto.
             * 
             * @param value
             *     allowed object is
             *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.DtAtualMenos5M1AnoDtAtualMenos5M.TitulosEmAberto }
             *     
             */
            public void setTitulosEmAberto(SegmentoEmpresarial.ComportamentoPagamentosGrupo.DtAtualMenos5M1AnoDtAtualMenos5M.TitulosEmAberto value) {
                this.titulosEmAberto = value;
            }

            /**
             * Obtém o valor da propriedade maiorCompra.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getMaiorCompra() {
                return maiorCompra;
            }

            /**
             * Define o valor da propriedade maiorCompra.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setMaiorCompra(Integer value) {
                this.maiorCompra = value;
            }


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
             *         &lt;element name="vencido" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
             *         &lt;element name="a_vencer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
             *         &lt;element name="em_aberto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
                "vencido",
                "aVencer",
                "emAberto"
            })
            public static class TitulosEmAberto {

                protected Integer vencido;
                @XmlElement(name = "a_vencer")
                protected Integer aVencer;
                @XmlElement(name = "em_aberto")
                protected Integer emAberto;

                /**
                 * Obtém o valor da propriedade vencido.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getVencido() {
                    return vencido;
                }

                /**
                 * Define o valor da propriedade vencido.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setVencido(Integer value) {
                    this.vencido = value;
                }

                /**
                 * Obtém o valor da propriedade aVencer.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getAVencer() {
                    return aVencer;
                }

                /**
                 * Define o valor da propriedade aVencer.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setAVencer(Integer value) {
                    this.aVencer = value;
                }

                /**
                 * Obtém o valor da propriedade emAberto.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getEmAberto() {
                    return emAberto;
                }

                /**
                 * Define o valor da propriedade emAberto.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setEmAberto(Integer value) {
                    this.emAberto = value;
                }

            }


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
             *         &lt;element name="a_vista" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
             *         &lt;element name="pontual" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
             *         &lt;element name="atraso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
                "aVista",
                "pontual",
                "atraso"
            })
            public static class TitulosPagos {

                @XmlElement(name = "a_vista")
                protected Integer aVista;
                protected Integer pontual;
                protected Integer atraso;

                /**
                 * Obtém o valor da propriedade aVista.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getAVista() {
                    return aVista;
                }

                /**
                 * Define o valor da propriedade aVista.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setAVista(Integer value) {
                    this.aVista = value;
                }

                /**
                 * Obtém o valor da propriedade pontual.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getPontual() {
                    return pontual;
                }

                /**
                 * Define o valor da propriedade pontual.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setPontual(Integer value) {
                    this.pontual = value;
                }

                /**
                 * Obtém o valor da propriedade atraso.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getAtraso() {
                    return atraso;
                }

                /**
                 * Define o valor da propriedade atraso.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setAtraso(Integer value) {
                    this.atraso = value;
                }

            }

        }


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
         *         &lt;element name="titulos_em_aberto_em_aberto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
            "titulosEmAbertoEmAberto"
        })
        public static class MediaCreditoConcedido {

            @XmlElement(name = "titulos_em_aberto_em_aberto")
            protected Integer titulosEmAbertoEmAberto;

            /**
             * Obtém o valor da propriedade titulosEmAbertoEmAberto.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getTitulosEmAbertoEmAberto() {
                return titulosEmAbertoEmAberto;
            }

            /**
             * Define o valor da propriedade titulosEmAbertoEmAberto.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setTitulosEmAbertoEmAberto(Integer value) {
                this.titulosEmAbertoEmAberto = value;
            }

        }


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
         *         &lt;element name="titulos_pagos_atraso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="titulos_aberto_vencido" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="titulos_aberto_a_vencer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
            "titulosPagosAtraso",
            "titulosAbertoVencido",
            "titulosAbertoAVencer"
        })
        public static class MediaDiasComportamento {

            @XmlElement(name = "titulos_pagos_atraso")
            protected Integer titulosPagosAtraso;
            @XmlElement(name = "titulos_aberto_vencido")
            protected Integer titulosAbertoVencido;
            @XmlElement(name = "titulos_aberto_a_vencer")
            protected Integer titulosAbertoAVencer;

            /**
             * Obtém o valor da propriedade titulosPagosAtraso.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getTitulosPagosAtraso() {
                return titulosPagosAtraso;
            }

            /**
             * Define o valor da propriedade titulosPagosAtraso.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setTitulosPagosAtraso(Integer value) {
                this.titulosPagosAtraso = value;
            }

            /**
             * Obtém o valor da propriedade titulosAbertoVencido.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getTitulosAbertoVencido() {
                return titulosAbertoVencido;
            }

            /**
             * Define o valor da propriedade titulosAbertoVencido.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setTitulosAbertoVencido(Integer value) {
                this.titulosAbertoVencido = value;
            }

            /**
             * Obtém o valor da propriedade titulosAbertoAVencer.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getTitulosAbertoAVencer() {
                return titulosAbertoAVencer;
            }

            /**
             * Define o valor da propriedade titulosAbertoAVencer.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setTitulosAbertoAVencer(Integer value) {
                this.titulosAbertoAVencer = value;
            }

        }


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
         *         &lt;element name="titulos_pagos" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="a_vista" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                   &lt;element name="pontual" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                   &lt;element name="atraso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="titulos_em_aberto" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="vencido" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                   &lt;element name="a_vencer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                   &lt;element name="em_aberto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "titulosPagos",
            "titulosEmAberto"
        })
        public static class MediaTitulosComportamento {

            @XmlElement(name = "titulos_pagos")
            protected SegmentoEmpresarial.ComportamentoPagamentosGrupo.MediaTitulosComportamento.TitulosPagos titulosPagos;
            @XmlElement(name = "titulos_em_aberto")
            protected SegmentoEmpresarial.ComportamentoPagamentosGrupo.MediaTitulosComportamento.TitulosEmAberto titulosEmAberto;

            /**
             * Obtém o valor da propriedade titulosPagos.
             * 
             * @return
             *     possible object is
             *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.MediaTitulosComportamento.TitulosPagos }
             *     
             */
            public SegmentoEmpresarial.ComportamentoPagamentosGrupo.MediaTitulosComportamento.TitulosPagos getTitulosPagos() {
                return titulosPagos;
            }

            /**
             * Define o valor da propriedade titulosPagos.
             * 
             * @param value
             *     allowed object is
             *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.MediaTitulosComportamento.TitulosPagos }
             *     
             */
            public void setTitulosPagos(SegmentoEmpresarial.ComportamentoPagamentosGrupo.MediaTitulosComportamento.TitulosPagos value) {
                this.titulosPagos = value;
            }

            /**
             * Obtém o valor da propriedade titulosEmAberto.
             * 
             * @return
             *     possible object is
             *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.MediaTitulosComportamento.TitulosEmAberto }
             *     
             */
            public SegmentoEmpresarial.ComportamentoPagamentosGrupo.MediaTitulosComportamento.TitulosEmAberto getTitulosEmAberto() {
                return titulosEmAberto;
            }

            /**
             * Define o valor da propriedade titulosEmAberto.
             * 
             * @param value
             *     allowed object is
             *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.MediaTitulosComportamento.TitulosEmAberto }
             *     
             */
            public void setTitulosEmAberto(SegmentoEmpresarial.ComportamentoPagamentosGrupo.MediaTitulosComportamento.TitulosEmAberto value) {
                this.titulosEmAberto = value;
            }


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
             *         &lt;element name="vencido" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
             *         &lt;element name="a_vencer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
             *         &lt;element name="em_aberto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
                "vencido",
                "aVencer",
                "emAberto"
            })
            public static class TitulosEmAberto {

                protected Integer vencido;
                @XmlElement(name = "a_vencer")
                protected Integer aVencer;
                @XmlElement(name = "em_aberto")
                protected Integer emAberto;

                /**
                 * Obtém o valor da propriedade vencido.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getVencido() {
                    return vencido;
                }

                /**
                 * Define o valor da propriedade vencido.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setVencido(Integer value) {
                    this.vencido = value;
                }

                /**
                 * Obtém o valor da propriedade aVencer.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getAVencer() {
                    return aVencer;
                }

                /**
                 * Define o valor da propriedade aVencer.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setAVencer(Integer value) {
                    this.aVencer = value;
                }

                /**
                 * Obtém o valor da propriedade emAberto.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getEmAberto() {
                    return emAberto;
                }

                /**
                 * Define o valor da propriedade emAberto.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setEmAberto(Integer value) {
                    this.emAberto = value;
                }

            }


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
             *         &lt;element name="a_vista" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
             *         &lt;element name="pontual" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
             *         &lt;element name="atraso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
                "aVista",
                "pontual",
                "atraso"
            })
            public static class TitulosPagos {

                @XmlElement(name = "a_vista")
                protected Integer aVista;
                protected Integer pontual;
                protected Integer atraso;

                /**
                 * Obtém o valor da propriedade aVista.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getAVista() {
                    return aVista;
                }

                /**
                 * Define o valor da propriedade aVista.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setAVista(Integer value) {
                    this.aVista = value;
                }

                /**
                 * Obtém o valor da propriedade pontual.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getPontual() {
                    return pontual;
                }

                /**
                 * Define o valor da propriedade pontual.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setPontual(Integer value) {
                    this.pontual = value;
                }

                /**
                 * Obtém o valor da propriedade atraso.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getAtraso() {
                    return atraso;
                }

                /**
                 * Define o valor da propriedade atraso.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setAtraso(Integer value) {
                    this.atraso = value;
                }

            }

        }


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
         *         &lt;element name="titulos_pagos" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="a_vista" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                   &lt;element name="pontual" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                   &lt;element name="atraso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="titulos_em_aberto" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="vencido" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                   &lt;element name="a_vencer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                   &lt;element name="em_aberto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "titulosPagos",
            "titulosEmAberto"
        })
        public static class TotalComportamento {

            @XmlElement(name = "titulos_pagos")
            protected SegmentoEmpresarial.ComportamentoPagamentosGrupo.TotalComportamento.TitulosPagos titulosPagos;
            @XmlElement(name = "titulos_em_aberto")
            protected SegmentoEmpresarial.ComportamentoPagamentosGrupo.TotalComportamento.TitulosEmAberto titulosEmAberto;

            /**
             * Obtém o valor da propriedade titulosPagos.
             * 
             * @return
             *     possible object is
             *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.TotalComportamento.TitulosPagos }
             *     
             */
            public SegmentoEmpresarial.ComportamentoPagamentosGrupo.TotalComportamento.TitulosPagos getTitulosPagos() {
                return titulosPagos;
            }

            /**
             * Define o valor da propriedade titulosPagos.
             * 
             * @param value
             *     allowed object is
             *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.TotalComportamento.TitulosPagos }
             *     
             */
            public void setTitulosPagos(SegmentoEmpresarial.ComportamentoPagamentosGrupo.TotalComportamento.TitulosPagos value) {
                this.titulosPagos = value;
            }

            /**
             * Obtém o valor da propriedade titulosEmAberto.
             * 
             * @return
             *     possible object is
             *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.TotalComportamento.TitulosEmAberto }
             *     
             */
            public SegmentoEmpresarial.ComportamentoPagamentosGrupo.TotalComportamento.TitulosEmAberto getTitulosEmAberto() {
                return titulosEmAberto;
            }

            /**
             * Define o valor da propriedade titulosEmAberto.
             * 
             * @param value
             *     allowed object is
             *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.TotalComportamento.TitulosEmAberto }
             *     
             */
            public void setTitulosEmAberto(SegmentoEmpresarial.ComportamentoPagamentosGrupo.TotalComportamento.TitulosEmAberto value) {
                this.titulosEmAberto = value;
            }


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
             *         &lt;element name="vencido" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
             *         &lt;element name="a_vencer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
             *         &lt;element name="em_aberto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
                "vencido",
                "aVencer",
                "emAberto"
            })
            public static class TitulosEmAberto {

                protected Integer vencido;
                @XmlElement(name = "a_vencer")
                protected Integer aVencer;
                @XmlElement(name = "em_aberto")
                protected Integer emAberto;

                /**
                 * Obtém o valor da propriedade vencido.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getVencido() {
                    return vencido;
                }

                /**
                 * Define o valor da propriedade vencido.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setVencido(Integer value) {
                    this.vencido = value;
                }

                /**
                 * Obtém o valor da propriedade aVencer.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getAVencer() {
                    return aVencer;
                }

                /**
                 * Define o valor da propriedade aVencer.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setAVencer(Integer value) {
                    this.aVencer = value;
                }

                /**
                 * Obtém o valor da propriedade emAberto.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getEmAberto() {
                    return emAberto;
                }

                /**
                 * Define o valor da propriedade emAberto.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setEmAberto(Integer value) {
                    this.emAberto = value;
                }

            }


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
             *         &lt;element name="a_vista" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
             *         &lt;element name="pontual" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
             *         &lt;element name="atraso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
                "aVista",
                "pontual",
                "atraso"
            })
            public static class TitulosPagos {

                @XmlElement(name = "a_vista")
                protected Integer aVista;
                protected Integer pontual;
                protected Integer atraso;

                /**
                 * Obtém o valor da propriedade aVista.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getAVista() {
                    return aVista;
                }

                /**
                 * Define o valor da propriedade aVista.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setAVista(Integer value) {
                    this.aVista = value;
                }

                /**
                 * Obtém o valor da propriedade pontual.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getPontual() {
                    return pontual;
                }

                /**
                 * Define o valor da propriedade pontual.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setPontual(Integer value) {
                    this.pontual = value;
                }

                /**
                 * Obtém o valor da propriedade atraso.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getAtraso() {
                    return atraso;
                }

                /**
                 * Define o valor da propriedade atraso.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setAtraso(Integer value) {
                    this.atraso = value;
                }

            }

        }


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
         *         &lt;element name="titulos_pagos" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="a_vista" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                   &lt;element name="pontual" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                   &lt;element name="atraso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="titulos_em_aberto" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="vencido" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                   &lt;element name="a_vencer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                   &lt;element name="em_aberto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "titulosPagos",
            "titulosEmAberto"
        })
        public static class TotalTitulosComportamento {

            @XmlElement(name = "titulos_pagos")
            protected SegmentoEmpresarial.ComportamentoPagamentosGrupo.TotalTitulosComportamento.TitulosPagos titulosPagos;
            @XmlElement(name = "titulos_em_aberto")
            protected SegmentoEmpresarial.ComportamentoPagamentosGrupo.TotalTitulosComportamento.TitulosEmAberto titulosEmAberto;

            /**
             * Obtém o valor da propriedade titulosPagos.
             * 
             * @return
             *     possible object is
             *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.TotalTitulosComportamento.TitulosPagos }
             *     
             */
            public SegmentoEmpresarial.ComportamentoPagamentosGrupo.TotalTitulosComportamento.TitulosPagos getTitulosPagos() {
                return titulosPagos;
            }

            /**
             * Define o valor da propriedade titulosPagos.
             * 
             * @param value
             *     allowed object is
             *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.TotalTitulosComportamento.TitulosPagos }
             *     
             */
            public void setTitulosPagos(SegmentoEmpresarial.ComportamentoPagamentosGrupo.TotalTitulosComportamento.TitulosPagos value) {
                this.titulosPagos = value;
            }

            /**
             * Obtém o valor da propriedade titulosEmAberto.
             * 
             * @return
             *     possible object is
             *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.TotalTitulosComportamento.TitulosEmAberto }
             *     
             */
            public SegmentoEmpresarial.ComportamentoPagamentosGrupo.TotalTitulosComportamento.TitulosEmAberto getTitulosEmAberto() {
                return titulosEmAberto;
            }

            /**
             * Define o valor da propriedade titulosEmAberto.
             * 
             * @param value
             *     allowed object is
             *     {@link SegmentoEmpresarial.ComportamentoPagamentosGrupo.TotalTitulosComportamento.TitulosEmAberto }
             *     
             */
            public void setTitulosEmAberto(SegmentoEmpresarial.ComportamentoPagamentosGrupo.TotalTitulosComportamento.TitulosEmAberto value) {
                this.titulosEmAberto = value;
            }


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
             *         &lt;element name="vencido" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
             *         &lt;element name="a_vencer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
             *         &lt;element name="em_aberto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
                "vencido",
                "aVencer",
                "emAberto"
            })
            public static class TitulosEmAberto {

                protected Integer vencido;
                @XmlElement(name = "a_vencer")
                protected Integer aVencer;
                @XmlElement(name = "em_aberto")
                protected Integer emAberto;

                /**
                 * Obtém o valor da propriedade vencido.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getVencido() {
                    return vencido;
                }

                /**
                 * Define o valor da propriedade vencido.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setVencido(Integer value) {
                    this.vencido = value;
                }

                /**
                 * Obtém o valor da propriedade aVencer.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getAVencer() {
                    return aVencer;
                }

                /**
                 * Define o valor da propriedade aVencer.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setAVencer(Integer value) {
                    this.aVencer = value;
                }

                /**
                 * Obtém o valor da propriedade emAberto.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getEmAberto() {
                    return emAberto;
                }

                /**
                 * Define o valor da propriedade emAberto.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setEmAberto(Integer value) {
                    this.emAberto = value;
                }

            }


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
             *         &lt;element name="a_vista" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
             *         &lt;element name="pontual" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
             *         &lt;element name="atraso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
                "aVista",
                "pontual",
                "atraso"
            })
            public static class TitulosPagos {

                @XmlElement(name = "a_vista")
                protected Integer aVista;
                protected Integer pontual;
                protected Integer atraso;

                /**
                 * Obtém o valor da propriedade aVista.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getAVista() {
                    return aVista;
                }

                /**
                 * Define o valor da propriedade aVista.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setAVista(Integer value) {
                    this.aVista = value;
                }

                /**
                 * Obtém o valor da propriedade pontual.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getPontual() {
                    return pontual;
                }

                /**
                 * Define o valor da propriedade pontual.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setPontual(Integer value) {
                    this.pontual = value;
                }

                /**
                 * Obtém o valor da propriedade atraso.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getAtraso() {
                    return atraso;
                }

                /**
                 * Define o valor da propriedade atraso.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setAtraso(Integer value) {
                    this.atraso = value;
                }

            }

        }

    }


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
     *         &lt;element name="total_consultas" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="mes_ate_dia_anterior" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="total_1mes_atras" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="total_2meses_atras" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="total_3meses_atras" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="total_4meses_atras" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="total_5meses_atras" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="total_6meses_atras" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="total_7meses_atras" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="total_8meses_atras" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="total_9meses_atras" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="total_10meses_atras" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="total_11meses_atras" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
        "totalConsultas",
        "mesAteDiaAnterior",
        "total1MesAtras",
        "total2MesesAtras",
        "total3MesesAtras",
        "total4MesesAtras",
        "total5MesesAtras",
        "total6MesesAtras",
        "total7MesesAtras",
        "total8MesesAtras",
        "total9MesesAtras",
        "total10MesesAtras",
        "total11MesesAtras"
    })
    public static class ConsultasGrupo {

        @XmlElement(name = "total_consultas")
        protected Integer totalConsultas;
        @XmlElement(name = "mes_ate_dia_anterior")
        protected Integer mesAteDiaAnterior;
        @XmlElement(name = "total_1mes_atras")
        protected Integer total1MesAtras;
        @XmlElement(name = "total_2meses_atras")
        protected Integer total2MesesAtras;
        @XmlElement(name = "total_3meses_atras")
        protected Integer total3MesesAtras;
        @XmlElement(name = "total_4meses_atras")
        protected Integer total4MesesAtras;
        @XmlElement(name = "total_5meses_atras")
        protected Integer total5MesesAtras;
        @XmlElement(name = "total_6meses_atras")
        protected Integer total6MesesAtras;
        @XmlElement(name = "total_7meses_atras")
        protected Integer total7MesesAtras;
        @XmlElement(name = "total_8meses_atras")
        protected Integer total8MesesAtras;
        @XmlElement(name = "total_9meses_atras")
        protected Integer total9MesesAtras;
        @XmlElement(name = "total_10meses_atras")
        protected Integer total10MesesAtras;
        @XmlElement(name = "total_11meses_atras")
        protected Integer total11MesesAtras;

        /**
         * Obtém o valor da propriedade totalConsultas.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getTotalConsultas() {
            return totalConsultas;
        }

        /**
         * Define o valor da propriedade totalConsultas.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setTotalConsultas(Integer value) {
            this.totalConsultas = value;
        }

        /**
         * Obtém o valor da propriedade mesAteDiaAnterior.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getMesAteDiaAnterior() {
            return mesAteDiaAnterior;
        }

        /**
         * Define o valor da propriedade mesAteDiaAnterior.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setMesAteDiaAnterior(Integer value) {
            this.mesAteDiaAnterior = value;
        }

        /**
         * Obtém o valor da propriedade total1MesAtras.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getTotal1MesAtras() {
            return total1MesAtras;
        }

        /**
         * Define o valor da propriedade total1MesAtras.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setTotal1MesAtras(Integer value) {
            this.total1MesAtras = value;
        }

        /**
         * Obtém o valor da propriedade total2MesesAtras.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getTotal2MesesAtras() {
            return total2MesesAtras;
        }

        /**
         * Define o valor da propriedade total2MesesAtras.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setTotal2MesesAtras(Integer value) {
            this.total2MesesAtras = value;
        }

        /**
         * Obtém o valor da propriedade total3MesesAtras.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getTotal3MesesAtras() {
            return total3MesesAtras;
        }

        /**
         * Define o valor da propriedade total3MesesAtras.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setTotal3MesesAtras(Integer value) {
            this.total3MesesAtras = value;
        }

        /**
         * Obtém o valor da propriedade total4MesesAtras.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getTotal4MesesAtras() {
            return total4MesesAtras;
        }

        /**
         * Define o valor da propriedade total4MesesAtras.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setTotal4MesesAtras(Integer value) {
            this.total4MesesAtras = value;
        }

        /**
         * Obtém o valor da propriedade total5MesesAtras.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getTotal5MesesAtras() {
            return total5MesesAtras;
        }

        /**
         * Define o valor da propriedade total5MesesAtras.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setTotal5MesesAtras(Integer value) {
            this.total5MesesAtras = value;
        }

        /**
         * Obtém o valor da propriedade total6MesesAtras.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getTotal6MesesAtras() {
            return total6MesesAtras;
        }

        /**
         * Define o valor da propriedade total6MesesAtras.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setTotal6MesesAtras(Integer value) {
            this.total6MesesAtras = value;
        }

        /**
         * Obtém o valor da propriedade total7MesesAtras.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getTotal7MesesAtras() {
            return total7MesesAtras;
        }

        /**
         * Define o valor da propriedade total7MesesAtras.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setTotal7MesesAtras(Integer value) {
            this.total7MesesAtras = value;
        }

        /**
         * Obtém o valor da propriedade total8MesesAtras.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getTotal8MesesAtras() {
            return total8MesesAtras;
        }

        /**
         * Define o valor da propriedade total8MesesAtras.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setTotal8MesesAtras(Integer value) {
            this.total8MesesAtras = value;
        }

        /**
         * Obtém o valor da propriedade total9MesesAtras.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getTotal9MesesAtras() {
            return total9MesesAtras;
        }

        /**
         * Define o valor da propriedade total9MesesAtras.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setTotal9MesesAtras(Integer value) {
            this.total9MesesAtras = value;
        }

        /**
         * Obtém o valor da propriedade total10MesesAtras.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getTotal10MesesAtras() {
            return total10MesesAtras;
        }

        /**
         * Define o valor da propriedade total10MesesAtras.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setTotal10MesesAtras(Integer value) {
            this.total10MesesAtras = value;
        }

        /**
         * Obtém o valor da propriedade total11MesesAtras.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getTotal11MesesAtras() {
            return total11MesesAtras;
        }

        /**
         * Define o valor da propriedade total11MesesAtras.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setTotal11MesesAtras(Integer value) {
            this.total11MesesAtras = value;
        }

    }


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
     *           &lt;element name="empresa_grupo" maxOccurs="unbounded" minOccurs="0">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="segmento_grupo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                     &lt;element name="quantidade" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;/sequence>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="qtd_total" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;/sequence>
     *         &lt;sequence>
     *           &lt;element name="mensagem" type="{http://boavistaservicos.com.br/define/xml/util}mensagem" minOccurs="0"/>
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
        "empresaGrupo",
        "qtdTotal",
        "mensagem"
    })
    public static class EmpresasGrupoRegistrandoSobreCnpj {

        @XmlElement(name = "empresa_grupo")
        protected List<SegmentoEmpresarial.EmpresasGrupoRegistrandoSobreCnpj.EmpresaGrupo> empresaGrupo;
        @XmlElement(name = "qtd_total")
        protected Integer qtdTotal;
        protected String mensagem;

        /**
         * Gets the value of the empresaGrupo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the empresaGrupo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEmpresaGrupo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SegmentoEmpresarial.EmpresasGrupoRegistrandoSobreCnpj.EmpresaGrupo }
         * 
         * 
         */
        public List<SegmentoEmpresarial.EmpresasGrupoRegistrandoSobreCnpj.EmpresaGrupo> getEmpresaGrupo() {
            if (empresaGrupo == null) {
                empresaGrupo = new ArrayList<SegmentoEmpresarial.EmpresasGrupoRegistrandoSobreCnpj.EmpresaGrupo>();
            }
            return this.empresaGrupo;
        }

        /**
         * Obtém o valor da propriedade qtdTotal.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getQtdTotal() {
            return qtdTotal;
        }

        /**
         * Define o valor da propriedade qtdTotal.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setQtdTotal(Integer value) {
            this.qtdTotal = value;
        }

        /**
         * Obtém o valor da propriedade mensagem.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMensagem() {
            return mensagem;
        }

        /**
         * Define o valor da propriedade mensagem.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMensagem(String value) {
            this.mensagem = value;
        }


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
         *         &lt;element name="segmento_grupo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="quantidade" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
            "segmentoGrupo",
            "quantidade"
        })
        public static class EmpresaGrupo {

            @XmlElement(name = "segmento_grupo")
            protected String segmentoGrupo;
            protected Integer quantidade;

            /**
             * Obtém o valor da propriedade segmentoGrupo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSegmentoGrupo() {
                return segmentoGrupo;
            }

            /**
             * Define o valor da propriedade segmentoGrupo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSegmentoGrupo(String value) {
                this.segmentoGrupo = value;
            }

            /**
             * Obtém o valor da propriedade quantidade.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getQuantidade() {
                return quantidade;
            }

            /**
             * Define o valor da propriedade quantidade.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setQuantidade(Integer value) {
                this.quantidade = value;
            }

        }

    }


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
     *         &lt;element name="cnpj" type="{http://boavistaservicos.com.br/define/xml/util}cnpj" minOccurs="0"/>
     *         &lt;element name="razao_social" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ultima_remessa_enviada" type="{http://boavistaservicos.com.br/define/xml/util}dataDiaMesAno" minOccurs="0"/>
     *         &lt;element name="ultimo_processamento_grupo" type="{http://boavistaservicos.com.br/define/xml/util}dataDiaMesAno" minOccurs="0"/>
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
        "cnpj",
        "razaoSocial",
        "ultimaRemessaEnviada",
        "ultimoProcessamentoGrupo"
    })
    public static class Identificacao {

        protected String cnpj;
        @XmlElement(name = "razao_social")
        protected String razaoSocial;
        @XmlElement(name = "ultima_remessa_enviada")
        protected String ultimaRemessaEnviada;
        @XmlElement(name = "ultimo_processamento_grupo")
        protected String ultimoProcessamentoGrupo;

        /**
         * Obtém o valor da propriedade cnpj.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCnpj() {
            return cnpj;
        }

        /**
         * Define o valor da propriedade cnpj.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCnpj(String value) {
            this.cnpj = value;
        }

        /**
         * Obtém o valor da propriedade razaoSocial.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRazaoSocial() {
            return razaoSocial;
        }

        /**
         * Define o valor da propriedade razaoSocial.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRazaoSocial(String value) {
            this.razaoSocial = value;
        }

        /**
         * Obtém o valor da propriedade ultimaRemessaEnviada.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUltimaRemessaEnviada() {
            return ultimaRemessaEnviada;
        }

        /**
         * Define o valor da propriedade ultimaRemessaEnviada.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUltimaRemessaEnviada(String value) {
            this.ultimaRemessaEnviada = value;
        }

        /**
         * Obtém o valor da propriedade ultimoProcessamentoGrupo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUltimoProcessamentoGrupo() {
            return ultimoProcessamentoGrupo;
        }

        /**
         * Define o valor da propriedade ultimoProcessamentoGrupo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUltimoProcessamentoGrupo(String value) {
            this.ultimoProcessamentoGrupo = value;
        }

    }

}
