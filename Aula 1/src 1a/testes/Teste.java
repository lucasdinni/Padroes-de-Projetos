package testes;

import exibicao.ExibidorSemPolimorfismo;
import fig.impl.Circle;
import fig.impl.Composite;
import fig.impl.FigList;
import fig.impl.Line;
import fig.impl.Rectangle;
import fig.interfaces.FigListInterface;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

/**
 * Este teste demonstra o uso de um exibidor de figuras sem polimorfismo,
 * mas que utiliza apenas as interfaces propostas, sem acessar nenhuma
 * classe concreta.
 * @author  Vladimir Oliveira Di Iorio
 */
public class Teste extends JFrame {
	
	/**
	 * Documento com figuras.
	 */
	private FigListInterface figDoc;
	
	/**
	 * Exibidor de figuras que não usa polimorfismo.
	 */
	private ExibidorSemPolimorfismo exibidor;

	/**
	 * Construtor, sem parâmetros.
	 */
	public Teste() {
		super("Teste");
		figDoc = constroiDados();
		exibidor = new ExibidorSemPolimorfismo(figDoc);
		add(exibidor);
	    setSize (400, 300);
	    setVisible(true);
	}
	
	/**
	 * Constrói uma lista com um retângulo, um círculo e
	 * um objeto composto, formado por outro círculo e outro retângulo.
	 * @return Lista de figuras construída.
	 */
	private FigListInterface constroiDados() {
		FigListInterface figs = new FigList();
		figs.addFig(new Rectangle(60, 40, Color.BLUE, 50, 30));
		figs.addFig(new Line(90, 100, Color.RED, 20, 80));
		Composite c = new Composite();
		c.addFig(new Circle(150, 50, Color.ORANGE, 20));
		figs.addFig(new Line(300, 130, Color.GREEN, 0, 42));
		c.addFig(new Rectangle(180, 60, Color.BLACK, 50, 30));
		figs.addFig(c);
		return figs;
	}
	
	public static void main(String[] args) {
		Teste app = new Teste();
	    app.addWindowListener(
    		new WindowAdapter() {
    			public void windowClosing(WindowEvent e) {
    				System.exit( 0 );
    	        }
    		}
	    );
	}

}
