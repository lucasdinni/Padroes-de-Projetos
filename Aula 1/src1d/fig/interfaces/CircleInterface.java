package fig.interfaces;

/**
 * Interface para representar c�rculos.
 * @author   Vladimir Oliveira Di Iorio
 */
public interface CircleInterface extends FigPosColorInterface {

	/**
	 * Obt�m o raio do c�rculo.
	 * @return Raio do c�rculo.
	 */
	int getRadius();
	
	/**
	 * Altera o raio do c�rculo, sem modificar
	 * os demais atributos.
	 * @param radius Novo valor do raio.
	 */
	void setRadius(int radius);
	
}
