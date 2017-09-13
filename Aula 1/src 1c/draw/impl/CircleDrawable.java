package draw.impl;

import draw.interfaces.DrawableInterface;
import fig.interfaces.CircleInterface;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Classe concreta que representa círculo que pode ser desenhado, usando composição e delegação.
 * @author  Vladimir Oliveira Di Iorio
 */
public class CircleDrawable
implements CircleInterface, DrawableInterface {
	
	private CircleInterface circle;

	/**
	 * Constrói círculo que pode ser desenhado.
	 * @param circle Interface que representa círculo.
	 */
	public CircleDrawable(CircleInterface circle) {
		this.circle = circle;
	}

	/**
	 * @see draw.interfaces.DrawableInterface#awtDraw(java.awt.Graphics)
	 */
	public void awtDraw(Graphics g) {
		g.setColor(getAWTColor());
		g.drawOval(getPosX() - getRadius(), getPosY() - getRadius(),
				getRadius() * 2, getRadius() * 2);
	}

	public Color getAWTColor() {
		return circle.getAWTColor();
	}

	public int getPosX() {
		return circle.getPosX();
	}

	public int getPosY() {
		return circle.getPosY();
	}

	public int getRadius() {
		return circle.getRadius();
	}

	public void setAWTColor(Color color) {
		circle.setAWTColor(color);
	}

	public void setPosX(int posX) {
		circle.setPosX(posX);
	}

	public void setPosY(int posY) {
		circle.setPosY(posY);
	}

	public void setRadius(int radius) {
		circle.setRadius(radius);
	}	
	
}
