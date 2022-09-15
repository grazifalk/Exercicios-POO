package br.com.residencia.poo.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtil {
	
	public static String converterDateParaDataEHora(Date data) {
	var formatador = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");
	return formatador.format(data);
}

public static String converterDateParaData(Date data) {
	var formatador = new SimpleDateFormat("dd/MM/YYYY");
	return formatador.format(data);
}
}
