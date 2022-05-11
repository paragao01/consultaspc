//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.05.10 às 08:06:45 AM BRT 
//


package br.com.consultaspc.api.model.defineRisco.boavistaservicos.define.xml.comportamental.pagamento_atrasado;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.boavistaservicos.define.xml.comportamental.pagamento_atrasado package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.boavistaservicos.define.xml.comportamental.pagamento_atrasado
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PagamentoAtrasado }
     * 
     */
    public PagamentoAtrasado createPagamentoAtrasado() {
        return new PagamentoAtrasado();
    }

    /**
     * Create an instance of {@link PagamentoAtrasado.Periodo6A15Dias }
     * 
     */
    public PagamentoAtrasado.Periodo6A15Dias createPagamentoAtrasadoPeriodo6A15Dias() {
        return new PagamentoAtrasado.Periodo6A15Dias();
    }

    /**
     * Create an instance of {@link PagamentoAtrasado.Periodo16A30Dias }
     * 
     */
    public PagamentoAtrasado.Periodo16A30Dias createPagamentoAtrasadoPeriodo16A30Dias() {
        return new PagamentoAtrasado.Periodo16A30Dias();
    }

    /**
     * Create an instance of {@link PagamentoAtrasado.Periodo31A60Dias }
     * 
     */
    public PagamentoAtrasado.Periodo31A60Dias createPagamentoAtrasadoPeriodo31A60Dias() {
        return new PagamentoAtrasado.Periodo31A60Dias();
    }

    /**
     * Create an instance of {@link PagamentoAtrasado.MaisDe60Dias }
     * 
     */
    public PagamentoAtrasado.MaisDe60Dias createPagamentoAtrasadoMaisDe60Dias() {
        return new PagamentoAtrasado.MaisDe60Dias();
    }

    /**
     * Create an instance of {@link PagamentoAtrasado.AtrasoMedioDias }
     * 
     */
    public PagamentoAtrasado.AtrasoMedioDias createPagamentoAtrasadoAtrasoMedioDias() {
        return new PagamentoAtrasado.AtrasoMedioDias();
    }

}
