package contenidors;

/*
 * Crea el paquet contenidors. Dins aquest paquet:
 * Crea una classe ElementSencer amb dos atributs:
 * Un anomenat info de tipus int, el valor de guardat a l'element.
 * Un de tipus ElementSencer, que serà la referència al següent element de la llista.
 * Programa un constructor amb paràmetres per els dos atributs, els dos getters, 
 * el setter per al següent i el toString que mostri només info.
 * Crea una classe PilaSencers que implementi totes les operacions d'una pila. 
 * Utilitza la classe ElementSencer per als elements. Els mètodes reben com a 
 * paràmetre i tornen com a resultat només el valor del camp info dels elements, 
 * no els elements complets.
 * A la classe Proves crea un mètode provaPilaSencers que utilitzi un objecte 
 * d'aquesta classe. Provau tots els seus mètodes.
 */

public class ElementSencer {

	/**
	 * @param info
	 * @param referencia
	 */
	
	// Un anomenat info de tipus int, el valor de guardat a l'element.

	int info;
	ElementSencer referencia;

	// Un de tipus ElementSencer, que serà la referència al següent element de
	// la llista.
	
	//Constructor

	public ElementSencer(int info, ElementSencer referencia) {
		super();
		this.info = info;
		this.referencia = referencia;
	}

	public int getInfo() {
		return info;
	}

	public ElementSencer getReferencia() {
		return referencia;
	}

	public void setReferencia(ElementSencer referencia) {
		this.referencia = referencia;
	}

	@Override
	public String toString() {
		return "ElementSencer [info=" + info + "]";
	}
	
	
	

}
