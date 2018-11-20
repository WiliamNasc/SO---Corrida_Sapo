package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.Classe_Threads;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;

public class Corrida extends JFrame {

	private JPanel contentPane;
	private JLabel lblSapo_1 = new JLabel();
	private JLabel lblSapo_2 = new JLabel();
	private JLabel lblChegada = new JLabel();
	Random rd = new Random ();
	
	public JLabel getLblS1(){return  lblSapo_1;};
	public JLabel setLblS1(JLabel lblSapo_1){return this.lblSapo_1 = lblSapo_1;};
	
	public JLabel getLblS2(){return  lblSapo_2;};
	public JLabel setLblS2(JLabel lblSapo_1){return this.lblSapo_2 = lblSapo_2;};
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Corrida frame = new Corrida();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Corrida() {
		setTitle("Corrida de Sapos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 401);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblSapo_1 = new JLabel("S1");
		lblSapo_1.setBounds(0, 99, 41, 29);
		contentPane.add(lblSapo_1);
		
		lblSapo_2 = new JLabel("S2");
		lblSapo_2.setBounds(0, 153, 41, 29);
		contentPane.add(lblSapo_2);
		
		lblChegada = new JLabel("CHEGADA");
		lblChegada.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblChegada.setBounds(384, 43, 74, 14);
		contentPane.add(lblChegada);
		
		JButton btnStart = new JButton("Start");
		btnStart.setBounds(247, 261, 89, 23);
		contentPane.add(btnStart);
		
		JLabel label = new JLabel("|");
		label.setFont(new Font("Tahoma", Font.PLAIN, 99));
		label.setBounds(401, 80, 46, 120);
		contentPane.add(label);
		
		ActionListener start = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				corrida();
				
			}
		};
		
		btnStart.addActionListener(start);
	}
	
			
	public void corrida(){
		
		//for(int i = 1; i <= 2; i++){
			
			Classe_Threads c = new Classe_Threads(lblSapo_1,lblSapo_2,lblChegada);
			c.start();
			
		//}
		
	}
}
