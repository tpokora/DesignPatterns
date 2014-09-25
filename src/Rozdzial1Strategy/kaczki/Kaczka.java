package Rozdzial1Strategy.kaczki;

import Rozdzial1Strategy.zachowania.KwiczenieInterfejs;
import Rozdzial1Strategy.zachowania.LatanieInterfejs;

public abstract class Kaczka {
	protected LatanieInterfejs latanieInterface;
	protected KwiczenieInterfejs kwiczenieInterfejs;
	
	public void lec() {
		latanieInterface.lec();
	}
	
	public void kwicz() {
		kwiczenieInterfejs.kwiczenie();
	}
	
	public void setLatanie(LatanieInterfejs latanieInterfejs) {
		this.latanieInterface = latanieInterfejs;
	}
	
	public void setKwiczenie(KwiczenieInterfejs kwiczenieInterfejs) {
		this.kwiczenieInterfejs = kwiczenieInterfejs;
	}
	
	public void info() {
		System.out.println("Kaczka: " + this.getClass() + 
				"\nLatanie: " + latanieInterface.getClass() +
				"\nKwiczenie: " + kwiczenieInterfejs.getClass());
	}
}
