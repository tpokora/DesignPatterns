package designpatterns.old.Rozdzial1Strategy.kaczki;

import designpatterns.old.Rozdzial1Strategy.zachowania.Kwik;
import designpatterns.old.Rozdzial1Strategy.zachowania.LatamZNapedemRakietowym;

public class Kaczka40K extends Kaczka {
	public Kaczka40K() {
		latanieInterface = new LatamZNapedemRakietowym();
		kwiczenieInterfejs = new Kwik();
	}
}
