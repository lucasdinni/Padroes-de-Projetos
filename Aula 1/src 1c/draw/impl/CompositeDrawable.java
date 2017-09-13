package draw.impl;

import draw.interfaces.DrawableInterface;
import fig.interfaces.CompositeInterface;

/**
 * Classe concreta que representa figura composta
 * que pode ser desenhada, usando composi��o e delega��o.
 * @author Vladimir Oliveira Di Iorio
*/
public class CompositeDrawable
extends FigListDrawable
implements CompositeInterface, DrawableInterface  {

	/**
	 * Constr�i figura composta que pode ser desenhada.
	 * @param c Interface que representa figura composta.
	 */
	public CompositeDrawable(CompositeInterface c) {
		super(c);
	}
	
}
