package designpatterns.old.Rozdzial2Obserwator;

import java.util.Observable;
import java.util.Observer;

public class ProgonozaWyswietl implements Observer, WyswietlElement {
	private Observable observable;
	private float biezaceCisnienie = 1010.1f;
	private float ostatnieCisnienie;
	
	public ProgonozaWyswietl(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		if(observable instanceof DanePogodowe) {
			DanePogodowe danePogodowe = (DanePogodowe)o;
			ostatnieCisnienie = biezaceCisnienie;
			biezaceCisnienie = danePogodowe.getCisnienie();
			wyswietl();
		}
	}
	
	@Override
	public void wyswietl() {
		if(ostatnieCisnienie > biezaceCisnienie) {
			System.out.println("Poprawa pogody");
		} else {
			System.out.println("Pogorszenie sie pogody");
		}
	}

	

}
