package br.com.consultaspc.api.util;

public class GlobalConstants {
	/*Diretorio do log*/
	public static String PASTALOG = System.getProperty("user.dir")+ArquivoParametro.buscaparametro("PASTALOG");
	
	/*Informacoes para consultar no CDLRio*/
	public static String URLACERTA = ArquivoParametro.buscaparametro("URLACERTA");
	public static String URLDEFINE = ArquivoParametro.buscaparametro("URLDEFINE");	
	public static String USRBOAVIS = ArquivoParametro.buscaparametro("USRBOAVIS");
	public static String PWRBOAVIS = ArquivoParametro.buscaparametro("PWRBOAVIS");
	
}
