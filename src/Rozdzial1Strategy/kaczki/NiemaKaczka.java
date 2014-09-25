package Rozdzial1Strategy.kaczki;

import Rozdzial1Strategy.zachowania.NieKwicze;
import Rozdzial1Strategy.zachowania.NieLatam;


public class NiemaKaczka extends Kaczka {
	public NiemaKaczka() {
		latanieInterface = new NieLatam();
		kwiczenieInterfejs = new NieKwicze();
	}
}
