package contenidors;

public class Pila<I> {
	private Element<I> pila;

	
	
	public Pila() {
		super();
		this.pila = null;
	}

	/*public Pila() {
		super();
		this.pila = null;
	}*/

	/**
	 * Muestra true si la pila está vacia
	 * 
	 * @return
	 */
	public boolean empty() {

		if (this.pila == null) {

			return true;
		} else {
			return false;
		}

	}

	/**
	 * introduce un valor a la pila
	 * 
	 * @param valor
	 */
	public void push(I valor) {
		Element nou = new Element(valor, pila);
		pila = nou;

	}

	/**
	 * muestra el elemento de la parte superior pero no lo borra
	 * 
	 * @return
	 */
	public I peek() {
		I temp = pila.getInfo();
		return temp;

	}

	/**
	 * borra el elemento de la parte superior pero no lo borra
	 */
	public void pop() {

		// coge el ultimo plato, lo aparta y pila apunta a la siguiente posicion

		pila = pila.getReferencia();

	}

	/**
	 * borra y devuelve el último valor de la pila
	 * 
	 * @return
	 */
	public I poll() {

		// getInfo muestra el valor
		I temp = pila.getInfo();
		// referencia indica la siguiente posicion

		pila = pila.getReferencia();
		return temp;
	}
}