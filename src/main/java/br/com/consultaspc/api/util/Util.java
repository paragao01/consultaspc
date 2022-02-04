package br.com.consultaspc.api.util;

import java.util.Calendar;
import java.util.Random;

public class Util {
	public static String geraProtocolo(){
	    Calendar calendar = Calendar.getInstance();
	    java.util.Date now = calendar.getTime();
	    java.sql.Timestamp currentTimestamp = new java.sql.Timestamp(now.getTime());
	    String protocolo;

	    protocolo = currentTimestamp.toString();
	    protocolo = protocolo.replaceAll(" ","");
	    protocolo = protocolo.replaceAll("-","");
	    protocolo = protocolo.replaceAll(":","");

	    Random numRandon = new Random();
	    int numero = numRandon.nextInt(99999);

	    protocolo = protocolo + "." + Integer.toString(numero);

	    return protocolo;
	}

	/* Preencher com espacos a direita */
	public static String formataCampo(String campo, int tamanho) {
		String ret = "";
		int auxLen = 0;
		if (campo == null ||campo.equals("")) {
			for (int i = auxLen; i < tamanho; i++)
				ret += " ";
		} else {
			auxLen = campo.length();
			if (auxLen < tamanho) {
				ret += campo;
				for (int i = auxLen; i < tamanho; i++)
					ret += " ";
			} else {
				for (int i = 0; i < tamanho; i++)
					ret += campo.substring(i, i + 1);
			}
		}
		return ret;
	}
	
	public static String lerTag(String tag, String xml) {
		String str = "";
		String tagFin = "";
		int posIni = 0;
		int posFin = 0;
		posIni = xml.indexOf(tag);
		if(posIni > 0) {
			tagFin = "</"+tag.substring(1, tag.length());
			posFin = xml.indexOf(tagFin);
			if(posFin > 0) {
				str = xml.substring(posIni+tag.length(), posFin);
			}
		}
		return str;
	}
	
	public static String gravaTag(String tag, String valorTag, String xml) {
		String tagFin = "";
		String str = "";
		int posIni = 0;
		int posFin = 0;
		posIni = xml.indexOf(tag);
		if(posIni > 0) {
			tagFin = "</"+tag.substring(1, tag.length());
			posFin = xml.indexOf(tagFin);
			if(posFin > 0) {
				str = tag+xml.substring(posIni+tag.length(), posFin)+tagFin;
				valorTag = tag+valorTag+tagFin;
				xml = xml.replace(str, valorTag);
			}
		}
		return xml;
	}
	
	public static String limpaXML(String xml) {
		String str = "";
		int pos = 0;
		pos = xml.indexOf("<VERSAO>");
		if(pos > 0) {
			str = xml.substring(0, pos);
			xml = xml.replace(str, "<SPCA-XML>");
		}
		return xml;
	}
	
}
