package controller;

import java.awt.Rectangle;

import view.Corrida;

public class Classe_Threads extends Thread {
	
	private int x,y,width,heigth;
	
	
	
	public void corri(){
		
		Corrida c = new Corrida();
		System.out.println(c.getLblS1().getBounds());
		System.out.println(c.getLblS2().getBounds());
		
	}

}
 