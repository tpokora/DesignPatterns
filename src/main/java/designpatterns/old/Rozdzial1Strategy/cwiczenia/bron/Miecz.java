package designpatterns.old.Rozdzial1Strategy.cwiczenia.bron;

import designpatterns.old.Rozdzial1Strategy.cwiczenia.model.Postac;

public class Miecz implements BronInterfejs {
	private int dmg;
	
	public Miecz() {
		dmg = 3;
	}

	public void atakuj(Postac postac) {
		postac.setHp(postac.getHp() - dmg);
	}
}
