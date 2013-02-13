import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;




public class Prova {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		  String dataInizioCall = "2013-01-11 15:01:59";
		  SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		  Calendar inizio = Calendar.getInstance();
		  inizio.setTime( sdf1.parse( dataInizioCall ) );
		  
		  Calendar apertraCallCenter = Calendar.getInstance();
		  apertraCallCenter.setTimeInMillis( inizio.getTimeInMillis() );
		  apertraCallCenter.set(Calendar.HOUR_OF_DAY, 8);
		  apertraCallCenter.set(Calendar.MINUTE, 30);
		  apertraCallCenter.set(Calendar.SECOND, 0);
		  apertraCallCenter.set(Calendar.MILLISECOND, 0);
		  
		  Calendar chiusuraCallCenter = Calendar.getInstance();
		  chiusuraCallCenter.setTimeInMillis( apertraCallCenter.getTimeInMillis() );
		  chiusuraCallCenter.set(Calendar.HOUR_OF_DAY, 22);
		  chiusuraCallCenter.set(Calendar.MINUTE, 30);
		   
		  System.out.println( "inizio: " + sdf1.format(inizio.getTime()));
		  System.out.println( "apertraCallCenter: " + sdf1.format(apertraCallCenter.getTime()));
		  System.out.println( "apertraCallCenter: " + sdf1.format(chiusuraCallCenter.getTime()));
		  
		  if( inizio.after( apertraCallCenter ) && inizio.before(chiusuraCallCenter) ){
		   System.out.println("operatore");
		  }else System.out.println("abbatto");
		
		
		
		
		
		
		
      

	}

}
