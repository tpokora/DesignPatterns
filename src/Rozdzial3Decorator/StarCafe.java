package Rozdzial3Decorator;


public class StarCafe {
	public static void main(String[] args) {
		Drink drink = new Espresso();
		System.out.println(drink.description + ": "
				+ drink.price());
		
		Drink drink2 = new StarCafeSpecial();
		drink2 = new SoyMilk(drink2);
		drink2 = new Chocolade(drink2);
		drink2 = new Cream(drink2);
		System.out.println(drink2.description + ": "
				+ drink2.price());
	}
}


abstract class Drink {
	String description = "Drink";
	
	public String getDescription() {
		return description;
	}
	
	public abstract double price();
}

abstract class ComponentDecorator extends Drink {
	public abstract String getDescription();
}

class Espresso extends Drink {
	public Espresso() {
		description = "Espresso";
	}
	
	public double price() {
		return 1.99;
	}
}

class StarCafeSpecial extends Drink {
	public StarCafeSpecial() {
		description = "Star Cafe Special";
	}
	
	public double price() {
		return 0.89;
	}
}

class Chocolade extends ComponentDecorator {
	Drink drink;
	
	public Chocolade(Drink drink) {
		this.drink = drink;
	}
	
	public String getDescription() {
		return drink.getDescription() + ", Chocolade";
	}
	
	public double price() {
		return drink.price() + 0.20;
	}
}

class SoyMilk extends ComponentDecorator {
	Drink drink;
	
	public SoyMilk(Drink drink) {
		this.drink = drink;
	}
	
	public String getDescription() {
		return drink.getDescription() + ", Soy milk";
	}
	
	public double price() {
		return drink.price() + 0.15;
	}
}

class Cream extends ComponentDecorator {
	Drink drink;
	
	public Cream(Drink drink) {
		this.drink = drink;
	}
	
	public String getDescription() {
		return drink.getDescription() + ", Cream";
	}
	
	public double price() {
		return drink.price() + 0.10;
	}
}
