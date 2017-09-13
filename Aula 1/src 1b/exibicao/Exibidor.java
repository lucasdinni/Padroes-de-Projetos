package exibicao;

import draw.interfaces.DrawableInterface;
import java.awt.Graphics;
import javax.swing.JPanel;


/**
 * Exibidor de figuras que usa polimorfismo.
 * @author  Vladimir Oliveira Di Iorio
 */
public class Exibidor extends JPanel {
	
	/**
	 * Objeto desenh�vel.
	 */
	private DrawableInterface drawable;

	/**
	 * Constr�i exibidor, dado um objeto desenh�vel.
	 * @param drawable Objeto desenh�vel.
	 */
	public Exibidor(DrawableInterface drawable) {
		this.drawable = drawable;
	}

	/**
	 * @see javax.swing.JComponent#paint(java.awt.Graphics)
	 */
	public void paint(Graphics g) {
		super.paint(g);
		drawable.awtDraw(g);
	}	
	
}
