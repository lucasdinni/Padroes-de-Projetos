package draw.impl;

import java.awt.Color;
import java.awt.Graphics;
import draw.interfaces.DrawableInterface;
import fig.impl.Circle;
import fig.interfaces.CircleInterface;

/**
 * Classe concreta que representa c�rculo
 * que pode ser desenhado, usando heran�a.
 * @author Vladimir Oliveira Di Iorio
 */
public class CircleDrawable
extends Circle
implements CircleInterface, DrawableInterface {
	
	/**
	 * Constr�i um c�rculo que pode ser desenhado.
	 * @param posX Posi��o horizontal.
	 * @param posY Posi��o vertical.
	 * @param color Cor da borda.
	 * @param radius Raio do c�rculo.
	 */
	public CircleDrawable(int posX, int posY, Color color, int radius) {
		super(posX, posY, color, radius);
	}
	
	/**
	 * @see draw.interfaces.DrawableInterface#awtDraw(java.awt.Graphics)
	 */
	public void awtDraw(Graphics g) {
		g.setColor(getAWTColor());
		g.drawOval(getPosX() - getRadius(), getPosY() - getRadius(),
				getRadius() * 2, getRadius() * 2);
	}
	
}
