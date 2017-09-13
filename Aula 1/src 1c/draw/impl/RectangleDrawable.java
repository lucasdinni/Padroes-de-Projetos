package draw.impl;

import draw.interfaces.DrawableInterface;
import fig.interfaces.RectangleInterface;
import java.awt.Color;
import java.awt.Graphics;

/**
 * Classe concreta que representa retângulo que pode ser desenhado, usando composição e delegação.
 * @author  Vladimir Oliveira Di Iorio
 */
public class RectangleDrawable
implements RectangleInterface, DrawableInterface {
	
	private RectangleInterface rect;
	
	/**
	 * Constrói retângulo que pode ser desenhado.
	 * @param r Interface que representa retângulo.
	 */
	public RectangleDrawable(RectangleInterface rect) {
		this.rect = rect;
	}
	
	/**
	 * @see draw.interfaces.DrawableInterface#awtDraw(java.awt.Graphics)
	 */
	public void awtDraw(Graphics g) {
		g.setColor(getAWTColor());
		g.drawRect(getPosX(), getPosY(), getWidth(), getHeight());
	}

	public Color getAWTColor() {
		return rect.getAWTColor();
	}

	public int getHeight() {
		return rect.getHeight();
	}

	public int getPosX() {
		return rect.getPosX();
	}

	public int getPosY() {
		return rect.getPosY();
	}

	public int getWidth() {
		return rect.getWidth();
	}

	public void setAWTColor(Color color) {
		rect.setAWTColor(color);
	}

	public void setHeight(int height) {
		rect.setHeight(height);
	}

	public void setPosX(int posX) {
		rect.setPosX(posX);
	}

	public void setPosY(int posY) {
		rect.setPosY(posY);
	}

	public void setWidth(int width) {
		rect.setWidth(width);
	}
	
}
