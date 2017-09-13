package draw.interfaces;

import java.awt.Graphics;

/**
 * Interface para objetos que podem ser desenhados
 * em um contexto gr�fico.
 * @author Vladimir Oliveira Di Iorio
 */
public interface DrawableInterface {
	
	/**
	 * Desenha um objeto em contexto gr�fico.
	 * @param g Contexto gr�fico onde objeto ser� desenhado.
	 */
	void awtDraw(Graphics g);
}
