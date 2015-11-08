package designpatterns.old.Rozdzial1Strategy.kaczki;

import designpatterns.old.Rozdzial1Strategy.zachowania.Kwik;
import designpatterns.old.Rozdzial1Strategy.zachowania.Latam;

public class DzikaKaczka extends Kaczka {
	
	public DzikaKaczka() {
		latanieInterface = new Latam();
		kwiczenieInterfejs = new Kwik();
	}
}
