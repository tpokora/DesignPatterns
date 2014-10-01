package Rozdzial2Obserwator;

import java.util.Observable;
import java.util.Observer;

public class WarunkiBiezaceWyswietl implements Observer, WyswietlElement {
	private Observable observalbe;
	private float temperatura;
	private float wilgotnosc;
	private float cisnienie;
	
	public WarunkiBiezaceWyswietl(Observable observable) {
		this.observalbe = observable;
		observable.addObserver(this);
	}
	
	@Override
	public void wyswietl() {
		System.out.println("Warunki biezace " + temperatura
				+ " stopni C oraz " + wilgotnosc + "% wilgotnosci");
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof DanePogodowe) {
			DanePogodowe danePogodowe = (DanePogodowe)o;
			this.temperatura = danePogodowe.getTemperatura();
			this.wilgotnosc = danePogodowe.getWilgotnosc();
			this.cisnienie = danePogodowe.getCisnienie();
			wyswietl();
		}
	}

}
