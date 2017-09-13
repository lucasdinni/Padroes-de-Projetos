package draw.impl;

import java.awt.Color;
import java.awt.Graphics;
import draw.interfaces.DrawableInterface;
import fig.impl.Rectangle;
import fig.interfaces.RectangleInterface;

/**
 * Classe concreta que representa ret�ngulo
 * que pode ser desenhado, usando heran�a.
 * @author Vladimir Oliveira Di Iorio
 */
public class RectangleDrawable
extends Rectangle
implements RectangleInterface, DrawableInterface {

	/**
	 * Constr�i um ret�ngulo que pode ser desenhado.
	 * @param posX Posi��o horizontal.
	 * @param posY Posi��o vertical.
	 * @param color Cor da borda.
	 * @param width Largura.
	 * @param height Altura.
	 */
	public RectangleDrawable(int posX, int posY, Color color, int width, int height) {
		super(posX, posY, color, width, height);
	}

	/**
	 * @see draw.interfaces.DrawableInterface#awtDraw(java.awt.Graphics)
	 */
	public void awtDraw(Graphics g) {
		g.setColor(getAWTColor());
		g.drawRect(getPosX(), getPosY(), getWidth(), getHeight());
	}
	
}
