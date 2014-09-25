package Rozdzial1Strategy.cwiczenia.model;

import Rozdzial1Strategy.cwiczenia.bron.BronInterfejs;

abstract public class Postac {
	protected String name;
	private int hp;
	protected BronInterfejs bronInterfejs;
	
	public Postac(String name) {
		this.name = name;
		hp = 10;
	}
	
	public int getHp() {
		return hp;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public BronInterfejs getBronInterfejs() {
		return bronInterfejs;
	}
	
	public void setBron(BronInterfejs bronInterfejs) {
		this.bronInterfejs = bronInterfejs;
	}
	
	public String getStatus() {
		return name + ": " + hp + "hp";
	}
}
