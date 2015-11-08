package designpatterns.old.Rozdzial1Strategy.cwiczenia;

import designpatterns.old.Rozdzial1Strategy.cwiczenia.bron.Miecz;
import designpatterns.old.Rozdzial1Strategy.cwiczenia.bron.Topor;
import designpatterns.old.Rozdzial1Strategy.cwiczenia.model.Postac;
import designpatterns.old.Rozdzial1Strategy.cwiczenia.model.Wojownik;

public class Cwiczenie {
	public static void main(String[] args) {
		Postac p1 = new Wojownik("Ziom 1");
		Postac p2 = new Wojownik("Ziom 2");
		
		p1.setBron(new Miecz());
		p2.setBron(new Topor());
		
		System.out.println(p1.getStatus());
		System.out.println(p2.getStatus());
		
		p1.getBronInterfejs().atakuj(p2);
		p2.getBronInterfejs().atakuj(p1);
		
		System.out.println(p1.getStatus());
		System.out.println(p2.getStatus());
	}
}
