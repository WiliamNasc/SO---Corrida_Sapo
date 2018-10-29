package controller;

import java.awt.Rectangle;
import java.util.Random;

import javax.swing.JLabel;

import view.Corrida;

public class Classe_Threads extends Thread {
	
	private Rectangle r = new Rectangle();
	private Random rd = new Random ();
	private JLabel lblS1,lblS2,lblCheg;
	static int i1,i2;
	long tempo = 100;
	
	public Classe_Threads(JLabel lblS1,JLabel lblS2,JLabel lblCheg) {
		
		this.lblS1 = lblS1;
		this.lblS2 = lblS2;
		this.lblCheg = lblCheg;
	}
	
	@Override
	public void run() {
		
			sapo();
			//sapo_2();
		
		
	}
	
	
	public void sapo(){
		
		if (lblS1.getAlignmentX() == lblCheg.getAlignmentX()){
			
			while (i1 <= 401){
				try {
					sleep(tempo);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				i1 += rd.nextInt(10);
				i2 += rd.nextInt(10);
				lblS1.setBounds(i1, 106, 20, 20);
				lblS2.setBounds(i2,  168, 41, 14);
				
			}
			
		}else {System.out.println("Merda");}
		
	}
	

}
 