package designpatterns.old.Rozdzial2Obserwator;

import java.util.Observable;

public class DanePogodowe extends Observable {
	private float temperatura;
	private float wilgotnosc;
	private float cisnienie;
	
	public DanePogodowe() {}
	
	public void odczytyZmiana() {
		setChanged();
		notifyObservers();
	}
	
	public void ustawOdczyt(float temperatura, float wilgotonosc, float cisnienie) {
		this.temperatura = temperatura;
		this.wilgotnosc = wilgotonosc;
		this.cisnienie = cisnienie;
		odczytyZmiana();
	}
	
	public float getTemperatura() {
		return temperatura;
	}
	
	public float getWilgotnosc() {
		return wilgotnosc;
	}
	
	public float getCisnienie() {
		return cisnienie;
	}
}
