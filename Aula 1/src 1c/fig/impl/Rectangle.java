/**
 * 
 */
package fig.impl;

import fig.interfaces.RectangleInterface;
import java.awt.Color;

/**
 * Classe concreta para representar ret�ngulos.
 * @author   Vladimir Oliveira Di Iorio
 */
public class Rectangle extends FigPosColor implements RectangleInterface {
	
	/**
	 * Largura do ret�ngulo.
	 */
	private int width;
	
	/**
	 * Altura do ret�ngulo.
	 */
	private int height;
	
	/**
	 * Constr�i um ret�ngulo.
	 * @param posX Posi��o horizontal.
	 * @param posY Posi��o vertical.
	 * @param color Cor da borda.
	 * @param width Largura.
	 * @param height Altura.
	 */
	public Rectangle(int posX, int posY, Color color, int width, int height) {
		super(posX, posY, color);
		this.width = width;
		this.height = height;
	}
	
	/**
	 * @see fig.interfaces.RectangleInterface#getWidth()
	 */
	public int getWidth() { return width; }
	
	/**
	 * @see fig.interfaces.RectangleInterface#getHeight()
	 */
	public int getHeight() { return height; }
	
	/**
	 * @see fig.interfaces.RectangleInterface#setWidth(int)
	 */
	public void setWidth(int width) { this.width = width; }
	
	/**
	 * @see fig.interfaces.RectangleInterface#setHeight(int)
	 */
	public void setHeight(int height) { this.height = height; }
	
}