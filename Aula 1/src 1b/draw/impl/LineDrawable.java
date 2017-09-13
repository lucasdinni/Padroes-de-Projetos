package draw.impl;

import java.awt.Color;
import java.awt.Graphics;

import draw.interfaces.DrawableInterface;
import fig.impl.Line;
import fig.interfaces.LineInterface;

public class LineDrawable extends Line
implements LineInterface, DrawableInterface {

	/**
	 * Constrói um retângulo que pode ser desenhado.
	 * @param posX Posição horizontal.
	 * @param posY Posição vertical.
	 * @param color Cor da borda.
	 * @param width Largura.
	 * @param height Altura.
	 */
	public LineDrawable(int posX, int posY, Color color, int posX2, int posY2) {
		super(posX, posY, color, posX2, posY2);
	}

	/**
	 * @see draw.interfaces.DrawableInterface#awtDraw(java.awt.Graphics)
	 */
	public void awtDraw(Graphics g) {
		g.setColor(getAWTColor());
		g.drawLine(getPosX(), getPosY(), getPosX2(), getPosY2());
	}
}
