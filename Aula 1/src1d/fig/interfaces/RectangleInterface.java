package fig.interfaces;

/**
 * Interface para representar ret�ngulos.
 * @author   Vladimir Oliveira Di Iorio
 */
public interface RectangleInterface extends FigPosColorInterface {

	/**
	 * Obt�m a largura do ret�ngulo.
	 * @return Largura do ret�ngulo.
	 */
	int getWidth();
	
	/**
	 * Obt�m a altura do ret�ngulo.
	 * @return Altura do ret�ngulo.
	 */
	int getHeight();
	
	/**
	 * Altera a largura do ret�ngulo,
	 * sem modificar os demais atributos.
	 * @param width Nova largura.
	 */
	void setWidth(int width);

	/**
	 * Altera a altura do ret�ngulo,
	 * sem modificar os demais atributos.
	 * @param height Nova altura.
	 */
	void setHeight(int height);
	
}
