package Rozdzial3Decorator;

public class MojNapoj {
	protected String opis;
	protected boolean mleko;
	protected boolean czekolada;
	
	public MojNapoj() {}
	
	public double koszt() {
		double koszt = 0.0;
		double kosztMleka = 0.20;
		double kosztCzekolady = 0.30;
		if(this.hasMilk()) {
			koszt += kosztMleka;
		}
		if(this.hasChocolade()) {
			koszt += kosztCzekolady;
		}
		return koszt;
	}
	
	public String getOpis() {
		return opis;
	}
	
	public boolean hasMilk() {
		return mleko;
	}
	
	public void addMilk() {
		this.opis += " z mlekiem";
		this.mleko = true;
	}
	
	public void removeMilk() {
		this.mleko = false;
	}
	
	public boolean hasChocolade() {
		this.opis += " z czekolada";
		return czekolada;
	}
	
	public void addChocolade() {
		this.czekolada = true;
	}
	
	public void removeChocolade() {
		this.czekolada = false;
	}
	
	public static void main(String[] args) {
		MojNapoj kawa = new Kawa();
		MojNapoj bialakawa = new BialaKawa();
		System.out.println(kawa.getOpis() + ": " + kawa.koszt());
		System.out.println(bialakawa.getOpis() + ": " + bialakawa.koszt());
		bialakawa.removeMilk();
		System.out.println("Usuniecie mleka z kawy");
		System.out.println(bialakawa.getOpis() + ": " + bialakawa.koszt());
	}
}

class Kawa extends MojNapoj {
	public Kawa() {
		super();
		this.opis = "Kawa";
	}
	
	public double koszt() {
		return super.koszt() + 2.0;
	}
}

class BialaKawa extends Kawa {
	public BialaKawa() {
		super();
		this.addMilk();
	}
	
	public double koszt() {
		return super.koszt();
	}
}


