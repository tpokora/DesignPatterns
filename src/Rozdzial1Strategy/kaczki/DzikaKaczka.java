package Rozdzial1Strategy.kaczki;

import Rozdzial1Strategy.zachowania.Kwik;
import Rozdzial1Strategy.zachowania.Latam;

public class DzikaKaczka extends Kaczka {
	
	public DzikaKaczka() {
		latanieInterface = new Latam();
		kwiczenieInterfejs = new Kwik();
	}
}
