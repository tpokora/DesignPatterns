package Rozdzial1Strategy.cwiczenia.bron;

import Rozdzial1Strategy.cwiczenia.model.Postac;

public class Miecz implements BronInterfejs {
	private int dmg;
	
	public Miecz() {
		dmg = 3;
	}
	
	@Override
	public void atakuj(Postac postac) {
		postac.setHp(postac.getHp() - dmg);
	}
}
