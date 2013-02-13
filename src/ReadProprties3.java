import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;


public class ReadProprties3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// al massimo possono esserci 8 categorie oppure 8 option
		final int UPPER_LIMIT = 9;
		final String CATEGORIA = "categoria[%d]";
		final String OPTION = "categoria[%d].option[%d]";
		final String NUMBER_OF_OPTION = "categoria[%d].size";
		
		Map<String, String> menu = new TreeMap<String,String>();
		Properties prop = new Properties();
		
    	try {
            //load a properties file from class path, inside static method
    		prop.load(ReadProprties3.class.getClassLoader().getResourceAsStream("file.properties"));
    		for( int i = 1; i < UPPER_LIMIT; i++){
    			String categoria = String.format( CATEGORIA, i);
    			String catetoria_value = (String) prop.get( categoria );
    			
    			if( catetoria_value != null ){
    				for( int j = 1; j < UPPER_LIMIT ; j++){
    					String option = String.format( OPTION, i, j);
    					String option_value = (String) prop.get( option );
    					String option_number = String.format( NUMBER_OF_OPTION, i);
    					if( option_value != null ){
    						menu.put( i+","+j, catetoria_value+","+option_value);
    						menu.put( option_number , ""+j);
    					}else if( j == 1 ){// avviene quando la categoria non ha option
    							menu.put( i+","+j, catetoria_value+",x");	
    							menu.put( option_number , "0");
    							continue;//con il continue esco dal for delle option
    						  }
    				}
    			}else continue;//con il continue esco dal for delle categorie
    			
    			menu.put("categoria.size", ""+i);
    		}
    		System.out.println("------------------------------------->"+ menu);
    	} catch (IOException ex) {
    		ex.printStackTrace();
        }
    	
    	System.out.println("=====================");
    	for( String k : menu.keySet() ){
    		System.out.println( k +" : " + menu.get(k) );
    	}
    	System.out.println("=====================");
    	System.out.println( menu.get("2,1") );
    	System.out.println( menu.get("1,3") );
    	System.out.println( menu.get("2,3") );
    	System.out.println( menu.get("1,3") );
    	System.out.println( menu.get("3,3") );
    	System.out.println( menu.get("3,3") );
    	
		
	}

}
