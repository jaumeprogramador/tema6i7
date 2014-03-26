package contenidors;

import java.util.ArrayDeque;

public class Proves {
	public void ProvaPilaGenerict() {
		Pila<String> pilaPlats;
		pilaPlats = new Pila<>();
		System.out.println("Mira si la pila está vacia /empty/");
		System.out.println(pilaPlats.empty());
		System.out.println("Se introduce un plato tortilla /push/");
		pilaPlats.push("Tortilla");
		System.out.println("se muestra el ultimo valor que es Tortilla/peek/");
		System.out.println(pilaPlats.peek());
		System.out.println("Mira si la pila está vacia");
		System.out.println(pilaPlats.empty());
		System.out.println("borra el ultimo resultado de la pila");
		pilaPlats.pop();
		System.out.println("Mira si la pila está vacia");
		System.out.println(pilaPlats.empty());
		System.out.println("Se introduce el valor Tortilla");
		pilaPlats.push("Tortilla");
		System.out.println("Se introduce el valor Pasta");
		pilaPlats.push("Pasta");
		System.out.println("Borra y devuelve el valor borrado de la pila");
		System.out.println(pilaPlats.poll());

	}

	/*
	 * (Opcional) Implementa una classe Coa amb totes les operacions vistes per
	 * aquest contenidor. Utilitza la classe Element. A la classe Proves crea un
	 * mètode anomenat provaCoa on creis una coa de Preferencia i hi posis na
	 * sèrie d'elements i els treguis.
	 */
	public void provaCoa() {
		Coa<String> coaCine;
		coaCine = new Coa<>();

	}

	/*
	 * A la classe Proves crea el mètode provaCoaArrayDeque que utilitzi una coa
	 * utilitzant els mètodes de la classe ArrayDeque.
	 */
	public void provaCoaArrayDeque() {
		ArrayDeque arrDeque = new ArrayDeque();
		System.out.println("posa l'element x al final de la coa /addLast/");
		arrDeque.add("Jaume");
		arrDeque.add("Josep");
		System.out.println("Mira si la coa està buida /empty/");
		arrDeque.isEmpty();
		System.out
				.println("Torna l'element de la capçalera de la coa i l'esborra.  /remove/");
		arrDeque.remove("Jaume");
		System.out
				.println("Torna l'element de la capçalera de la coa, però no l'esborra /element/");
		arrDeque.element();
		System.out.println("Esborra tots els elements de la coa. /clear/");
		arrDeque.clear();
		System.out
				.println("Torna el nombre d'elements que hi ha a la coa /size/");
		arrDeque.size();

	}

	/*
	 * A la classe Proves crea el mètode provesHashSet. Crea un HashSet de tipus
	 * Preferencia:
	 */
	public void provesHashSet(){
		//Crea una preferència amb els valors 1, “Paella”. Afegeix-lo al conjunt.
		Preferencia hashSet = new Preferencia(1, "Paella");
		//Crea un altre objecte Preferencia amb les mateixes dades. L'ha inserit? 
		//És el que esperàvem? Per què? Explica-ho amb un println.
		Preferencia hashSet2 = new Preferencia(1, "Paella");
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PilaSencers pila = new PilaSencers();
		System.out.println("Mira si la pila está vacia /empty/");
		System.out.println(pila.empty());
		System.out.println("Se introduce el valor 6 /push/");
		pila.push(6);
		System.out.println("se muestra el ultimo valor que es 6/peek/");
		System.out.println(pila.peek());
		System.out.println("Mira si la pila está vacia");
		System.out.println(pila.empty());
		System.out.println("borra el ultimo resultado de la pila");
		pila.pop();
		System.out.println("Mira si la pila está vacia");
		System.out.println(pila.empty());
		System.out.println("Se introduce el valor 8");
		pila.push(8);
		System.out.println("Se introduce el valor 1");
		pila.push(1);
		System.out.println("Borra y devuelve el valor borrado de la pila");
		System.out.println(pila.poll());

		System.out.println("-----------------------");
		Proves p = new Proves();
		p.ProvaPilaGenerict();

	}

}