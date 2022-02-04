package br.com.consultaspc.api.util;

public class GlobalConstants {
	/*Diretorio do log*/
	public static String PASTALOG = System.getProperty("user.dir")+ArquivoParametro.buscaparametro("PASTALOG");
	
	/*Informacoes para consultar no CDLRio*/
	public static String URLCDLRIO = ArquivoParametro.buscaparametro("URLCDLRIO");
	public static String USRCDLRIO = ArquivoParametro.buscaparametro("USRCDLRIO");
	public static String PWRCDLRIO = ArquivoParametro.buscaparametro("PWRCDLRIO");
	public static String URLCDLNEG = ArquivoParametro.buscaparametro("URLCDLNEG");
	
}
