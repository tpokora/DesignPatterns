package designpatterns.old.Rozdzial2Obserwator;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class PrzykladowyObserwatorSwinga {
	private JFrame frame;
	
	public static void main(String[] args) {
		PrzykladowyObserwatorSwinga przyklad = 
				new PrzykladowyObserwatorSwinga();
		przyklad.uruchom();
		
	}
	
	public void uruchom() {
		frame = new JFrame();
		JButton button = new JButton("Czy powinienem to zrobic?");
		button.addActionListener(new AniolSluchacz());
		button.addActionListener(new DiabelSluchacz());
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(BorderLayout.CENTER, button);
		frame.setVisible(true);
		frame.setSize(300, 300);
	}
	
	class AniolSluchacz implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Nie rob tego! Mozesz tego pozniej zalowac!");
		}
	}
	
	class DiabelSluchacz implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Tak! Zrob to!");
		}
		
	}

}
