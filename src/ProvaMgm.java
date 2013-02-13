
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;


public class ProvaMgm {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		Properties prop = new Properties();
		List<String> prova = new ArrayList<String>();
		String aderito= null;
		try {
			prop.load(ProvaMgm.class.getClassLoader().getResourceAsStream("mgm.properties"));
			//System.out.println(prop.size());
			for(int i = 1; i<=prop.size();i++){
			aderito = (String) prop.get(String.format("promoFerrar[%d]", i));
			prova.add(aderito);
			System.out.println(prova);
			String s = prova.get(i-1).equalsIgnoreCase("y") ? "aderito":"non aderito";
				System.out.println(s);
			
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		}

}
