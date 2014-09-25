package Rozdzial1Strategy.cwiczenia.bron;

import Rozdzial1Strategy.cwiczenia.model.Postac;

public class Topor implements BronInterfejs {
	private int dmg = 4;
	
	@Override
	public void atakuj(Postac postac) {
		postac.setHp(postac.getHp() - dmg);
	}
}
