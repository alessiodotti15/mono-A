
package it.marconicivitavecchia.as2018_19.c5Binf.verifica;

import javax.swing.*;

public class Main extends JFrame {
	
	public Main() {
		super("Project X");
		super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		super.setSize(800,400);
		
		StringBuilder sb = new StringBuilder();
		sb.append("<html>");
		sb.append("<h1>Almanacco astronomico</h1>");
		
		sb.append("<h3>Novembre 2018</h3>");
		
		sb.append("<div style='display:table'>");
		// TODO Creare la stringa HTML per il wireframe
		
		// TODO Convertire lo StringBuilder in String
		
		// TODO Assegnare correttamente la stringa create a JLabel
		String htmlText = sb.toString();
		super.add(new JLabel(htmlText));
		super.setVisible(true);
		 
		System.out.println(htmlText);
		
		System.out.println("Verifica Swing-GitHub");
		
		
	}
	
	public static void main (String[] args) {
		new Main();
	}
}

