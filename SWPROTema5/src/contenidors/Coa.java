package contenidors;


public class Coa <I>{

	private Element<I> coa;

	/**
	 * @param coa
	 */
	public Coa(Element<I> coa) {
		super();
		this.coa = coa;
	}
	
	/**
	 * Buidar la coa
	 * @return
	 */
	public boolean empty() {

		if (this.coa == null) {

			return true;
		} else {
			return false;
		}

	}
	
	/**
	 * introdueix un valor a la caa
	 * @param valor
	 */
	public void add(I valor) {
		Element nou = new Element(valor, coa);
		coa = nou;

	}
	
	/**
	 * Torna l'element de la capçalera de la coa, però no l'esborra
	 * 
	 * @return
	 */
	public int element() {
		int temp = coa.getInfo();
		return temp;

	}

	/**
	 * borra el elemento de la parte superior pero no lo borra
	 */
	public void pop() {

		// coge el ultimo plato, lo aparta y pila apunta a la siguiente posicion

		coa = coa.getReferencia();

	}

	/**
	 * borra y devuelve el último valor de la pila
	 * 
	 * @return
	 */
	public int poll() {

		// getInfo muestra el valor
		int temp = coa.getInfo();
		// referencia indica la siguiente posicion

		coa = coa.getReferencia();
		return temp;
	}

}
