package fig.impl;

import fig.interfaces.CircleInterface;
import java.awt.Color;

/**
 * Classe concreta para representar c�rculos.
 * @author   Vladimir Oliveira Di Iorio
 */
public class Circle extends FigPosColor
implements CircleInterface {
	
	/**
	 * Raio do c�rculo.
	 */
	private int radius;
	
	/**
	 * Constr�i um c�rculo.
	 * @param posX Posi��o horizontal.
	 * @param posY Posi��o vertical.
	 * @param color Cor da borda.
	 * @param radius Raio do c�rculo.
	 */
	public Circle(int posX, int posY, Color color, int radius) {
		super(posX, posY, color);
		this.radius = radius;
	}
	
	/**
	 * @see fig.interfaces.CircleInterface#getRadius()
	 */
	public int getRadius() { return radius; }
	
	/**
	 * @see fig.interfaces.CircleInterface#setRadius(int)
	 */
	public void setRadius(int radius) { this.radius = radius; }
	
}
