package draw.impl;

import java.awt.Color;
import java.awt.Graphics;

import fig.interfaces.FigInterface;
import fig.interfaces.FigPosColorInterface;
import fig.interfaces.RectangleInterface;

public class FigPosColorDrawable implements FigPosColorInterface{

	protected FigPosColorInterface fig;
	/**
	 * Obtém posição horizontal.
	 * @return Posição horizontal da figura.
	 */
	
	FigPosColorDrawable(FigPosColorInterface fig){
		this.fig = fig;
	}
	public Color getAWTColor() {
		return fig.getAWTColor();
	}



	public int getPosX() {
		return fig.getPosX();
	}

	public int getPosY() {
		return fig.getPosY();
	}


	public void setAWTColor(Color color) {
		fig.setAWTColor(color);
	}


	public void setPosX(int posX) {
		fig.setPosX(posX);
	}

	public void setPosY(int posY) {
		fig.setPosY(posY);
	}

	
}
