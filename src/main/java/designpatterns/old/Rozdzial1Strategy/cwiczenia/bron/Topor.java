package designpatterns.old.Rozdzial1Strategy.cwiczenia.bron;

import designpatterns.old.Rozdzial1Strategy.cwiczenia.model.Postac;

public class Topor implements BronInterfejs {
	private int dmg = 4;

	public void atakuj(Postac postac) {
		postac.setHp(postac.getHp() - dmg);
	}
}
