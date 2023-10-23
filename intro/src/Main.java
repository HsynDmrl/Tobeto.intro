
public class Main {

	public static void main(String[] args) {
		//Variable isimleri camelCase seklinde yazilir
		String ortaMetin = "Ilginizi Cekebilir";
		String altMetin = "Vade Suresi";
		
		//Integer
		int vade = 12;
		
		//Double
		double dlrDun = 18.14;
		double dlrBugun = 18.10;
		
		boolean dolarDustuMu = false;
		
		String okYonu = "";
		
		if (dlrBugun < dlrDun) {
			okYonu = "down.swg"; 
			System.out.println(okYonu);
		}
		else if (dlrBugun == dlrDun) {
			okYonu = "equal.swg"; 
			System.out.println(okYonu);
		}
		else {
			okYonu = "up.swg"; 
			System.out.println(okYonu);
		} 
		
		String[] krediler = {"Hizli Kredi", "Maasi Halkbanktan alanlar", "Mutlu Emekli"};
		// Bu sekilde yazmak cok zahmetli oldugundan dongu kullanmamiz gerekir
		System.out.println(krediler[0]);
		System.out.println(krediler[1]);
		System.out.println(krediler[2]);
		
		/* Burada foreach de kullanilabilirdi foreach hali asagida
		 *
		 * for (String kredi : krediler) { System.out.println(kredi); }
		 *
		 * While kullanarak da bunu yazabilirdik ama for daha pratik!
		 */

		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
	}
}
