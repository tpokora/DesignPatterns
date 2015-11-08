package designpatterns.old.Rozdzial2Obserwator;

public class StacjaMeteo {
	public static void main(String[] args) {
		DanePogodowe danePogodowe = new DanePogodowe();
		
		WarunkiBiezaceWyswietl wbw = 
				new WarunkiBiezaceWyswietl(danePogodowe);
		ProgonozaWyswietl pw = 
				new ProgonozaWyswietl(danePogodowe);
		
		danePogodowe.ustawOdczyt(12.5f, 65f, 1013.3f);
		danePogodowe.ustawOdczyt(14.5f, 62f, 1050.3f);
		danePogodowe.ustawOdczyt(10.5f, 45f, 1009.3f);
		
	}
}
