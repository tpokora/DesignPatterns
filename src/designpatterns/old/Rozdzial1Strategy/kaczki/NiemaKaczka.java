package designpatterns.old.Rozdzial1Strategy.kaczki;

import designpatterns.old.Rozdzial1Strategy.zachowania.NieKwicze;
import designpatterns.old.Rozdzial1Strategy.zachowania.NieLatam;


public class NiemaKaczka extends Kaczka {
	public NiemaKaczka() {
		latanieInterface = new NieLatam();
		kwiczenieInterfejs = new NieKwicze();
	}
}
