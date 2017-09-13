package fig.interfaces;

import java.awt.Color;

/**
 * Interface para figuras que armazenam posi��o e cor.
 * @author   Vladimir Oliveira Di Iorio
 */
public interface FigPosColorInterface
extends FigInterface {
	
	/**
	 * Obt�m posi��o horizontal.
	 * @return Posi��o horizontal da figura.
	 */
	int getPosX();
	
	/**
	 * Obt�m posi��o vertical.
	 * @return Posi��o vertical da figura.
	 */
	int getPosY();
	
	/**
	 * Altera posi��o horizontal da figura,
	 * sem alterar os demais atributos.
	 * @param posX Nova posi��o horizontal.
	 */
	void setPosX(int posX);
	
	/**
	 * Altera posi��o vertical da figura,
	 * sem alterar os demais atributos.
	 * @param posY Nova posi��o vertical.
	 */
	void setPosY(int posY);
	
	/**
	 * Obt�m cor da figura.
	 * @return Cor da figura, no formato de classe
	 * java.awt.Color.
	 */
	Color getAWTColor();
	
	/**
	 * Altera cor da figura,
	 * sem alterar os demais atributos.
	 * @param color Nova cor da figura.
	 */
	void setAWTColor(Color color);

}
