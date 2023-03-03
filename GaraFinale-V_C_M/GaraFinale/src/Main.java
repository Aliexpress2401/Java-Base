import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main extends JFrame implements ActionListener{
	
	//variabili 
	private JButton btnInvia, btnUtente, btnVincitore;
	private boolean run;
	private int width = 250, height = 200;
	private int vincitore = 0;
	MyPanel panel;
	ImageIcon car1, car2, car3, car4, car5;
	Image carResize1, carResize2, carResize3, carResize4, carResize5, resize1, resize2, resize3, resize4, resize5;
	InserisciUtenti i;
	
	Macchina[] macchine = {
			new Macchina(),
			new Macchina(),
			new Macchina(),
			new Macchina(),
			new Macchina(),
	};
	
	//-----------------------------------------------------------------------------------------------------------------------------------------

	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		
		run = false;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1800,1600);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		creaImmagini();

		panel = new MyPanel();
		c.add(panel);

		btnInvia = new JButton("START");
		btnInvia.addActionListener(this);
		c.add(btnInvia);
		//btnInvia.setEnabled(false);

		btnUtente = new JButton("AGGIUNGI UTENTE");
		btnUtente.addActionListener(this);
		c.add(btnUtente);
		
		btnVincitore = new JButton("VISUALIZZA VINCITORE");
		btnVincitore.addActionListener(this);
		c.add(btnVincitore);
		//btnVincitore.setEnabled(false);

		panel.repaint();
		pack();		
		setVisible(true);
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == btnInvia) {	//se premo il bottone invia
			run=true;
			btnInvia.setEnabled(false);
			panel.repaint();
			
		} 
		else if(e.getSource() == btnUtente) {							// se premo aggiungi utente
			aggiungiUtente();
			btnUtente.setEnabled(false);
			btnInvia.setEnabled(true);
		} 
		else if(e.getSource() == btnVincitore) {
			i.getNomeVincitore(vincitore);
		}
			
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------

	public class MyPanel extends JPanel {		
		private int y = 0;

		public MyPanel() {

		}

		public Dimension getPreferredSize() {
			return new Dimension(1400,1000);
		}

		@Override
		public Color getBackground() {
			// TODO Auto-generated method stub
			return Color.BLACK;
		}

	//-----------------------------------------------------------------------------------------------------------------------------------------
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.GRAY); // colore di sfondo
			g.fillRect(0,0, 1400, 1000);

			g.setColor(Color.WHITE); // finish
			g.fillRect(1300,0, 8, 1000);
			g.setColor(Color.BLACK);
			g.fillRect(1308,0, 4, 1000);
			g.setColor(Color.WHITE);
			g.fillRect(1312,0, 8, 1000);
			
			g.setColor(Color.BLACK);
			g.fillRect(0, 200, 1300, 8);
			g.setColor(Color.BLACK);
			g.fillRect(0, 400, 1300, 8);
			g.setColor(Color.BLACK);
			g.fillRect(0, 600, 1300, 8);
			g.setColor(Color.BLACK);
			g.fillRect(0, 800, 1300, 8);
			
			g.setColor(Color.WHITE);
			g.fillRect(0, 202, 1300, 3);
			g.setColor(Color.WHITE);
			g.fillRect(0, 402, 1300, 3);
			g.setColor(Color.WHITE);
			g.fillRect(0, 602, 1300, 3);
			g.setColor(Color.WHITE);
			g.fillRect(0, 802, 1300, 3);

			g.drawImage(resize1, macchine[0].metri, y, null);
			g.drawImage(resize2, macchine[1].metri, y+200, null);
			g.drawImage(resize3, macchine[2].metri, y+400, null);
			g.drawImage(resize4, macchine[3].metri, y+600, null);
			g.drawImage(resize5, macchine[4].metri, y+800, null);
			
	//-----------------------------------------------------------------------------------------------------------------------------------------

			if (run) { //starta la gara e muovi le macchine
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				for(Macchina macchina:macchine) {
					macchina.cambiaMarcia();
					macchina.avanza();

					if(macchina.metri>=1100) {	        		
						run=false;
						btnVincitore.setEnabled(true);
						vincitore = macchina.corsia;
						System.out.println(vincitore);
					}
				}

				repaint();

			}
		}
	//-----------------------------------------------------------------------------------------------------------------------------------------
	}
	
	public void creaImmagini() {
		URL car1URL = getClass().getResource("img/Cricchetto.png");
		car1 = new ImageIcon(car1URL);
		carResize1 = car1.getImage();
		resize1 = carResize1.getScaledInstance(width, height, Image.SCALE_DEFAULT);

		URL car2URL = getClass().getResource("img/Hudson.png");
		car2 = new ImageIcon(car2URL);
		carResize2 = car2.getImage();
		resize2 = carResize2.getScaledInstance(width, height, Image.SCALE_DEFAULT);
		
		URL car3URL = getClass().getResource("img/Ramone.png");
		car3 = new ImageIcon(car3URL);
		carResize3 = car3.getImage();
		resize3 = carResize3.getScaledInstance(300, 250, Image.SCALE_DEFAULT);
		
		URL car4URL = getClass().getResource("img/Saetta.png");
		car4 = new ImageIcon(car4URL);
		carResize4 = car4.getImage();
		resize4 = carResize4.getScaledInstance(width, height, Image.SCALE_DEFAULT);
		
		URL car5URL = getClass().getResource("img/Sally.png");
		car5 = new ImageIcon(car5URL);
		carResize5 = car5.getImage();
		resize5 = carResize5.getScaledInstance(width, height, Image.SCALE_DEFAULT);
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------
	
	public void aggiungiUtente() {
		i = new InserisciUtenti();
	}

}