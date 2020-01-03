import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Datas {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat ("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss");
		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2018 15:42:07");
		
		Date x1= new Date();
		
		/*System.out.println(sdf1.format(y1));
		System.out.println(sdf2.format(y2));
		System.out.println(sdf2.format(x1));*/
		
		//instancia o formato da data a ser exibida
		
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss");
		// declara uma data 
		Date d = Date.from(Instant.parse("2019-01-03T10:06:20Z"));
		System.out.println(sdf.format(d));
		
		//declara um calendario
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		
		// adiciona uma data no calendario, add 4horas a mais
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		// pega os minutos da data 
		int minutos = cal.get(Calendar.MINUTE);
		
		System.out.println(sdf.format(d));
		System.out.println("Minutos- " + minutos);
		
	}

}
