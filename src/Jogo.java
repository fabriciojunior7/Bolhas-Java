//Fabricio Vidal da Costa Junior
//21/11/2017

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Jogo extends JPanel implements ActionListener, MouseListener, MouseMotionListener{

	public static final int LARGURA = 500, ALTURA = 500;
	public static ArrayList<Bolha> bolhas = new ArrayList<Bolha>();
	public static JFrame tela;
	
	public static void main(String[] args) {
		
		//SETUP
		Jogo j = new Jogo();
		tela = new JFrame("Bolhas");
		tela.setVisible(true);
		tela.setResizable(false);
		tela.setSize(LARGURA, ALTURA);
		tela.setLocationRelativeTo(null);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setBackground(new Color(0, 0, 0));
		tela.add(j);
		tela.addMouseListener(j);

		int numBolhas = 0;
		for(int i=0; i<numBolhas; i++) {
			bolhas.add(new Bolha());
		}
		
		Timer t = new Timer(16, j);
		t.start();
		
	}
	
	//DRAW
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		tela.setTitle("Bolhas (" + bolhas.size() + ") - Fabricio Junior (21/11/2017)");
		if(bolhas.size() > 0) {
			for(int i=0; i<bolhas.size(); i++) {
				Bolha b = bolhas.get(i);
				b.vibrar();
				g.setColor(b.getCor());
				g.drawOval(b.getX(), b.getY(), b.getLargura(), b.getAltura());
			}
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		repaint();
	}

	@Override
	public void mouseClicked(MouseEvent mouse) {
		
	}

	@Override
	public void mouseEntered(MouseEvent mouse) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent mouse) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent mouse) {
		if(mouse.getButton() == 1) {
			for(int i = 10; i>0; i--) {
				bolhas.add(new Bolha(mouse.getX(), mouse.getY()));
			}	
		}
		else if(bolhas.size() > 0 && mouse.getButton() == 3) {
			bolhas.clear();
		}
	}

	@Override
	public void mouseReleased(MouseEvent mouse) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent mouse) {
		
	}

	@Override
	public void mouseMoved(MouseEvent mouse) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}