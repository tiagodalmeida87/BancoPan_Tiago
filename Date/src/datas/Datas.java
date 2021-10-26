package datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Datas {

	public static void main(String[] args) throws ParseException {
		// instanciar a data atual, por padrao a conf. da maq.
		Date atual1 = new Date(); 
		Date atual2 = new Date(System.currentTimeMillis());//data do sistema e converte para milissegundos
		
		Date atual3 = new Date(0L); //long
		Date atual4 = new Date(1000L * 60L * 60L * 7L);
		System.out.println("atual1: " + atual1);
		System.out.println("atual2: " + atual2);
		System.out.println("atual3: " + atual3);
		System.out.println("atual4: " + atual4);
		
		// istanciar SimpleDateFormat 
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT")); //java.util.TimeZone
		
		Date d1 = sdf1.parse("22/07/1993"); //recebe dado do tipo String e converte para o formato do sdf1
		Date d2 = sdf2.parse("22/07/1993 14:30:00"); // Date = java.util.Date / throws ParseException
		System.out.println(sdf1.format(d1));
		System.out.println(sdf2.format(d1));
		
		
		System.out.println(sdf2.format(d2));
		System.out.println(sdf3.format(atual1));
		
	}
	
}
