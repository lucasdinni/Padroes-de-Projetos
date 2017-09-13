package fig.impl;

import java.awt.Color;

import fig.interfaces.LineInterface;

public class Line extends FigPosColor implements LineInterface {
	/**
	 * Obtém posição horizontal do segundo ponto.
	 * @return Posição horizontal do segundo ponto.
	 */
	public int posX2;
	public int posY2;
	public Line(int posX, int posY, Color color, int posX2, int posY2) {
		super(posX, posY, color);
		this.posX2 = posX2;
		this.posY2 = posY2;
	}
	public int getPosX2() {
		return posX2;
	};
	
	/**
	 * Obtém posição vertical do segundo ponto.
	 * @return Posição vertical do segundo ponto.
	 */
	public int getPosY2(){
		return posY2;
	};
	
	/**
	 * Altera posição horizontal do segundo ponto,
	 * sem alterar os demais atributos.
	 * @param posX2 Nova posição horizontal do segundo ponto.
	 */
	public void setPosX2(int posX2){
		 this.posX2 = posX2;
	};
	
	/**
	 * Altera posição vertical do segundo ponto,
	 * sem alterar os demais atributos.
	 * @param posY2 Nova posição vertical do segundo ponto.
	 */
	public void setPosY2(int posY2){
		this.posY2 = posY2;
	};
}
