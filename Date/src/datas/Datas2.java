package datas;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Datas2 {

public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Date d = Date.from(Instant.parse("1993-07-22T06:30:07Z"));//Converter padrao iso para date, Z indica que � UTC
		Date atual1 = new Date();
		
		System.out.println(sdf.format(d));
		System.out.println(sdf.format(atual1));

		Calendar calendario = Calendar.getInstance();
		
		calendario.setTime(d); // calendario com data instanciada
		
		calendario.add(Calendar.YEAR, 5); // add 5 dias
		
		d = calendario.getTime();
		
		System.out.println(sdf.format(d));
		
		int minutos = calendario.get(Calendar.MINUTE);
		int mes = 1 + calendario.get(Calendar.MONTH);
		int diaDaSemana = 1 + calendario.get(Calendar.DAY_OF_WEEK);
		int dia = calendario.get(Calendar.DAY_OF_MONTH);
		
		

		System.out.println("Minutes: " + minutos);
		System.out.println("Mes: " + mes);
		System.out.println("Dia: " + dia);
		System.out.println("Dia da semana: " + diaDaSemana);
		

	}
	
//	public String weekDay(Calendar cal) {
//		return new DateFormatSymbols().getWeekdays()[cal.get(Calendar.DAY_OF_WEEK)];
//	}
	
}
