import java.awt.Color;
import java.util.Random;

public class Bolha {
	
	//Atributos
	private int x, y, largura, altura;
	private Color cor;
	
	//Construtor
	public Bolha() {
		Random r = new Random();
		this.x = r.nextInt(475) + 1;
		this.y = r.nextInt(475) + 1;
		this.largura = 25;
		this.altura = this.largura;
		this.cor = new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256));
	}
	
	//Construtor
	public Bolha(int x, int y) {
		Random r = new Random();
		this.largura = 25;
		this.altura = this.largura;
		this.x = x - this.largura;
		this.y = y - this.altura*2;
		this.cor = new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256));
	}
	
	//Metodos
	public void vibrar() {
		Random r = new Random();
		this.x += r.nextInt((2 + 2) + 1) - 2;
		this.y += r.nextInt((2 + 2) + 1) - 2;
		
		if(this.x < 0) {
			this.x = 0;
		}
		else if(this.x > Jogo.LARGURA-this.largura) {
			this.x = Jogo.LARGURA-this.largura;
		}
		if(this.y < 0) {
			this.y = 0;
		}
		else if(this.y > Jogo.ALTURA-this.altura*2) {
			this.y = Jogo.ALTURA-this.altura*2;
		}
	}
	
	//Metodos Especiais
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getLargura() {
		return largura;
	}

	public void setLargura(int largura) {
		this.largura = largura;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public Color getCor() {
		return cor;
	}

	public void setCor(Color cor) {
		this.cor = cor;
	}
	
}
