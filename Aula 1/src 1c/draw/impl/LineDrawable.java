package draw.impl;

import java.awt.Color;
import java.awt.Graphics;

import draw.interfaces.DrawableInterface;
import fig.interfaces.LineInterface;

public class LineDrawable implements LineInterface, DrawableInterface {
	private LineInterface line;
	public LineDrawable(LineInterface line) {
		super();
		this.line = line;
	}

	public int getPosX2() {
		return line.getPosX2();
	}

	public int getPosX() {
		return line.getPosX();
	}

	public int getPosY2() {
		return line.getPosY2();
	}

	public int getPosY() {
		return line.getPosY();
	}

	public void setPosX(int posX) {
		line.setPosX(posX);
	}

	public void setPosX2(int posX2) {
		line.setPosX2(posX2);
	}

	public void setPosY(int posY) {
		line.setPosY(posY);
	}

	public void setPosY2(int posY2) {
		line.setPosY2(posY2);
	}

	public Color getAWTColor() {
		return line.getAWTColor();
	}

	public void setAWTColor(Color color) {
		line.setAWTColor(color);
	}
	public void awtDraw(Graphics g) {

		g.setColor(getAWTColor());
		g.drawLine(getPosX(), getPosY(), getPosX2(), getPosY2());
	}

}
