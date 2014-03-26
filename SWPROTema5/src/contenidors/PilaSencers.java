package contenidors;

public class PilaSencers {
	private ElementSencer pila;

	public PilaSencers() {
		super();
		this.pila = null;
	}

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
	public void push(int valor) {
		ElementSencer nou = new ElementSencer(valor, pila);
		pila = nou;

	}

	/**
	 * muestra el elemento de la parte superior pero no lo borra
	 * 
	 * @return
	 */
	public int peek() {
		int temp = pila.getInfo();
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
	public int poll() {

		// getInfo muestra el valor
		int temp = pila.getInfo();
		// referencia indica la siguiente posicion

		pila = pila.getReferencia();
		return temp;
	}

}
