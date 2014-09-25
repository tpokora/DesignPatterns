package Rozdzial1Strategy;

import Rozdzial1Strategy.kaczki.DzikaKaczka;
import Rozdzial1Strategy.kaczki.Kaczka;
import Rozdzial1Strategy.kaczki.Kaczka40K;
import Rozdzial1Strategy.kaczki.NiemaKaczka;
import Rozdzial1Strategy.zachowania.LatamZNapedemRakietowym;

/*
 * 
 * Wzorzec Strategia
 * 
 */

public class SymulatorKaczki {
	public static void main(String[] args) {
		Kaczka dzikaKaczka = new DzikaKaczka();
		Kaczka niemaKaczka = new NiemaKaczka();
		Kaczka kaczka40K = new Kaczka40K();
		
		dzikaKaczka.info();
		dzikaKaczka.lec();
		dzikaKaczka.kwicz();
		
		niemaKaczka.info();
		niemaKaczka.lec();
		niemaKaczka.kwicz();
		
		kaczka40K.info();
		kaczka40K.lec();
		kaczka40K.kwicz();
		
		niemaKaczka.setLatanie(new LatamZNapedemRakietowym());
		niemaKaczka.lec();
	}
}
