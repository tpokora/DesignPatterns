package Rozdzial1Strategy.kaczki;

import Rozdzial1Strategy.zachowania.Kwik;
import Rozdzial1Strategy.zachowania.LatamZNapedemRakietowym;

public class Kaczka40K extends Kaczka {
	public Kaczka40K() {
		latanieInterface = new LatamZNapedemRakietowym();
		kwiczenieInterfejs = new Kwik();
	}
}
