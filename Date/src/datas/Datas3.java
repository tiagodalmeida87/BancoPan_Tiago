package datas;

import java.text.DateFormat;
import java.util.Date;

public class Datas3 {

public static void main(String[] args) {
		
		Date data = new Date();
	      System.out.println(data); // Thu Oct 21 21:24:35 BRT 2021
	      
	      DateFormat dfs = DateFormat.getDateInstance(DateFormat.SHORT);
	      
	      System.out.println(dfs.format(data)); // 21/10/2021
	      
	      DateFormat dfm = DateFormat.getDateInstance(DateFormat.MEDIUM);
	      System.out.println(dfm.format(data)); // 21 de out. de 2021
	      
	      DateFormat dfl = DateFormat.getDateInstance(DateFormat.LONG);
	      System.out.println(dfl.format(data)); // 21 de outubro de 2021
	      
	      DateFormat dff = DateFormat.getDateInstance(DateFormat.FULL);
	      System.out.println(dff.format(data)); // quinta-feira, 21 de outubro de 2021
		
	}
	
}
