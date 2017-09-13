package exibicao;

import fig.interfaces.CircleInterface;
import fig.interfaces.CompositeInterface;
import fig.interfaces.FigInterface;
import fig.interfaces.FigListInterface;
import fig.interfaces.LineInterface;
import fig.interfaces.RectangleInterface;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 * Exibidor de figuras que não usa polimorfismo, mas emprega apenas interfaces,
 * sem fazer referência a classes concretas.
 * @author  Vladimir Oliveira Di Iorio
 */
public class ExibidorSemPolimorfismo extends JPanel {
	
	/**
	 * Documento com figuras.
	 */
	private FigListInterface figs;

	/**
	 * Constrói exibidor, dado um documento de figuras.
	 * @param figs Documento a ser exibido.
	 */
	public ExibidorSemPolimorfismo(FigListInterface figs) {
		this.figs = figs;
	}

	/**
	 * @see javax.swing.JComponent#paint(java.awt.Graphics)
	 */
	public void paint(Graphics g) {
		super.paint(g);
		drawList(figs, g);
	}	

	
	/**
	 * Desenha lista de figuras.
	 * @param list Lista a ser desenhada.
	 * @param g Contexto gráfico.
	 */
	private void drawList(FigListInterface list, Graphics g) {
		for (FigInterface x : list) {
			if (x instanceof CircleInterface) {
				drawCircle((CircleInterface) x, g);
			} else if (x instanceof RectangleInterface) {
				drawRectangle((RectangleInterface) x, g);
			} else if (x instanceof CompositeInterface) {
				drawList((CompositeInterface) x, g);
			}else if (x instanceof LineInterface) {
				drawLine((LineInterface) x, g);
			}
		}
	}
		
	/**
	 * Desenha círculo.
	 * @param c Círculo a ser desenhado.
	 * @param g Contexto gráfico.
	 */
	private void drawCircle(CircleInterface c, Graphics g) {
		g.setColor(c.getAWTColor());
		g.drawOval(c.getPosX() - c.getRadius(), c.getPosY() - c.getRadius(),
				c.getRadius() * 2, c.getRadius() * 2);
	}
	
	/**
	 * Desenha retângulo.
	 * @param r Retângulo a ser desenhado.
	 * @param g Contexto gráfico.
	 */
	private void drawRectangle(RectangleInterface r, Graphics g) {
		g.setColor(r.getAWTColor());
		g.drawRect(r.getPosX(), r.getPosY(), r.getWidth(), r.getHeight());
	}
	private void drawLine(LineInterface r, Graphics g) {
		g.setColor(r.getAWTColor());
		g.drawLine(r.getPosX(), r.getPosY(), r.getPosX2(), r.getPosY2());
	}
	
}
