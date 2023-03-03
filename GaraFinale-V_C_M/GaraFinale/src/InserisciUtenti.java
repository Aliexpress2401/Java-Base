import javax.swing.*;

import java.awt.event.*;
import java.net.URL;  
public class InserisciUtenti implements ActionListener{  
	JTextField tf1,tf2;  
	JCheckBox cb1, cb2, cb3, cb4, cb5;
	JButton btnUtente;
	UtenteScommessa[] giocatori = new UtenteScommessa[5];
	int cont = 0;
	int macchina;

	InserisciUtenti(){  

		JFrame f= new JFrame();  				
		tf1=new JTextField("nome utente");  	//creo le caselle di testo
		tf1.setBounds(50,50,150,20);  
		tf2=new JTextField("importo scommessa");  
		tf2.setBounds(50,100,150,20);  
		
		cb1=new JCheckBox("Cricchetto", false); //chechbox per scommettere sulla macchina
		cb1.setBounds(50,150,150,20);
		cb2=new JCheckBox("Dr Hudson", false);
		cb2.setBounds(50,200,150,20);
		cb3=new JCheckBox("Ramon", false);
		cb3.setBounds(50,250,150,20);
		cb4=new JCheckBox("Saetta mcQueen", false);
		cb4.setBounds(50,300,150,20);
		cb5=new JCheckBox("Sally", false);
		cb5.setBounds(50,350,150,20);
		
		btnUtente=new JButton("SCOMMETTI");  	
		btnUtente.setBounds(50,400,150,30);   
		btnUtente.addActionListener(this);  
		
		
		f.add(tf1);f.add(tf2);f.add(cb1);f.add(cb2);f.add(cb3);f.add(cb4);f.add(cb5);f.add(btnUtente);  //aggiungo tutto alla schermata
		f.setSize(600,600);  
		f.setLayout(null);  
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f.setVisible(true);  
	}

	public void actionPerformed(ActionEvent e) {  
		
		if (cont == 4) {
			btnUtente.setEnabled(false);			//quando ho inserito tutte le macchine disabilito il bottone per non aggiungere più utenti 
		}
		
		String nomeUtente = tf1.getText();  
		
		String importoScommessa = tf2.getText();
		int importo = Integer.parseInt(importoScommessa);
		
		if (cb1.isSelected()) {						//controllo se ho selezionato la checkbox, quando premo li bottone la disabilito
			macchina = 1;							//ogni utente cosi può selezionare solo una checkbox
			cb1.setSelected(false);
			cb1.setEnabled(false);
		} else if (cb2.isSelected()) {
			macchina = 2;
			cb2.setSelected(false);
			cb2.setEnabled(false);
		} else if (cb3.isSelected()) {
			macchina = 3;
			cb3.setSelected(false);
			cb3.setEnabled(false);
		} else if (cb4.isSelected()) {
			macchina = 4;
			cb4.setSelected(false);
			cb4.setEnabled(false);
		} else if (cb5.isSelected()) {
			macchina = 5;
			cb5.setSelected(false);
			cb5.setEnabled(false);
		}

		giocatori [cont] = new UtenteScommessa(nomeUtente, importo, macchina); 		//riempio l'array con gli scomettitori
		cont++;
	} 
	
	public void getNomeVincitore(int vincitore) {    
		for (int i=0; i<5; i++) {
			if (vincitore == giocatori[i].getScelta()) {
				JOptionPane.showMessageDialog(null, "IL VINCITORE E': " + giocatori[i].getNome() + " E HA VINTO: " + giocatori[i].getImporto()*5,"VINCITORE", JOptionPane.NO_OPTION);

				//controllo chi ha inserito la macchina vincente e lo mostro in output
				
				URL fireworkURL = getClass().getResource("img/firework.gif");
				Icon firework = new ImageIcon(fireworkURL);
				JLabel fireworkLabel = new JLabel(firework);
				
				JFrame f= new JFrame(); 
				f.add(fireworkLabel);
				f.setSize(500,500);  
				f.setLocationRelativeTo(null);
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				f.setVisible(true);
				
			}
		}
	}
}  