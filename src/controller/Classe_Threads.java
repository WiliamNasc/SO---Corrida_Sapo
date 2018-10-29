package controller;

import java.awt.Rectangle;
import java.util.Random;

import javax.swing.JLabel;

import view.Corrida;

public class Classe_Threads extends Thread {
	
	private Rectangle r = new Rectangle();
	private Random rd = new Random ();
	private JLabel lblS1,lblS2,lblCheg;
	static int i;
	
	public Classe_Threads(JLabel lblS1,JLabel lblS2,JLabel lblCheg) {
		
		this.lblS1 = lblS1;
		this.lblS2 = lblS2;
		this.lblCheg = lblCheg;
	}
	
	@Override
	public void run() {
		
		sapo_1();
		sapo_2();
	}
	
	
	public void sapo_1 (){
		
		if (lblS1.getAlignmentX() == lblCheg.getAlignmentX()){
			
			i +=1;
			lblS1.setBounds(i, 106, 20, 20);
			
		}else {System.out.println("Merda");}
		
	}
	
	public void sapo_2 (){
		
		if (lblS2.getAlignmentX() == lblCheg.getAlignmentX()){
			
			i +=1;
			lblS2.setBounds(i,  168, 41, 14);
			
		}else {System.out.println("Merda");}
	}

}
 