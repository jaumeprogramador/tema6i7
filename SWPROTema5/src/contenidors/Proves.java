package contenidors;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.HashMap;

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
	/*
	 * public void provaCoa() { Coa<String> coaCine; coaCine = new Coa<>();
	 * 
	 * }
	 */

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
	public void provesHashSet() {
		// Crea una preferència amb els valors 1, “Paella”. Afegeix-lo al
		// conjunt.
		Preferencia paella = new Preferencia(1, "Paella");
		Preferencia paella2 = new Preferencia(1, "Paella");
		// cream un hash set
		HashSet preferencia = new HashSet();
		preferencia.add(paella);
		// Crea un altre objecte Preferencia amb les mateixes dades. L'ha
		// inserit?
		preferencia.add(paella2);
		// És el que esperàvem? Per què? Explica-ho amb un println.
		System.out
				.println("No detecta que sigui un duplicat perquè la posiciò"
						+ " de memòria que ocupa és diferent a l'altre malgrat siguin idèntics.");
		System.out.println("Mostra: " + preferencia);
		// Crea un altre objecte Preferencia amb valors diferents i afegeix-lo.
		Preferencia tortilla = new Preferencia(2, "Omelette");
		preferencia.add(tortilla);
		// Mostra per pantalla tot el conjunt.
		System.out.println("Mostra: " + preferencia);
		// Comprova si una determinada Preferencia ja és al mapa. Mostra el
		// resultat per pantalla.
		System.out.println(preferencia.contains(tortilla));
		// Mostra per pantalla el nombre d'elements del conjunt.
		System.out.println(preferencia.size() + " elements al conjunt");
		// Elimina el primer objecte creat del conjunt. Digues si ha anat bé.
		preferencia.remove(paella);
		// Comprova si el conjunt és buid o no . Mostra el resultat per
		// pantalla.
		System.out.println("Està buit?: " + preferencia.isEmpty());
		System.out.println("Mostra: " + preferencia);
	}

	public void provesHashSet2() {
		// Crea una preferència amb els valors 1, “Paella”. Afegeix-lo al
		// conjunt.
		Preferencia2 paella = new Preferencia2(1, "Paella");
		Preferencia2 paella2 = new Preferencia2(1, "Paella");
		// cream un hash set
		HashSet preferencia = new HashSet();
		preferencia.add(paella);
		// Crea un altre objecte Preferencia amb les mateixes dades. L'ha
		// inserit?
		preferencia.add(paella2);
		// És el que esperàvem? Per què? Explica-ho amb un println.
		System.out.println("Ara SÍ que funciona.");
		System.out.println("Mostra: " + preferencia);
		// Crea un altre objecte Preferencia amb valors diferents i afegeix-lo.
		Preferencia2 tortilla = new Preferencia2(2, "Omelette");
		preferencia.add(tortilla);
		// Mostra per pantalla tot el conjunt.
		System.out.println("Mostra: " + preferencia);
		// Comprova si una determinada Preferencia ja és al mapa. Mostra el
		// resultat per pantalla.
		System.out.println(preferencia.contains(tortilla));
		// Mostra per pantalla el nombre d'elements del conjunt.
		System.out.println(preferencia.size() + " elements al conjunt");
		// Elimina el primer objecte creat del conjunt. Digues si ha anat bé.
		preferencia.remove(paella);
		// Comprova si el conjunt és buid o no . Mostra el resultat per
		// pantalla.
		System.out.println("Està buit?: " + preferencia.isEmpty());
		System.out.println("Mostra: " + preferencia);
	}

	// A la classe Proves crea el mètode provesHashMap. Crea un HashMap de tipus
	// Preferencia, on la clau del mapa sigui el nom del plat:
	public void provesHashMap() {
		HashMap<String, Integer> preferencia = new HashMap();

		// Afegeix al mapa tres preferències. Clau=nom del plat, valor=id
		preferencia.put("Arròs brut", 1);
		preferencia.put("Filet mignon", 2);
		preferencia.put("Braciola", 3);

		// Crea una preferència amb un plat que ja existeixi i un ordre
		// diferent. Mostra el que torna el put.
		System.out.println(preferencia.put("Arròs brut", 4));
		System.out.println("Torna el valor del plat del mateix nom que"
				+ " havíem inserit abans. Ara ens queden els seguents:");
		
		// Comprova si una clau és al mapa o no.
		System.out.println("Hi és la clau? "
				+ preferencia.containsKey("Arròs brut"));

		// Comprova si un valor és al mapa o no.
		System.out.println("Hi és el valor? " + preferencia.containsValue(1));

		// Recupera un objecte a partir de la seva clau. Mostra el resultat per
		// pantalla.
		System.out.println(preferencia.get("Braciola"));
		
		//Recorrem. S'ha "machacat" el valor 1 pel 4??
		for(Integer i:preferencia.values()){
			System.out.println(i);
		}

		//Mostra per pantalla tot el mapa.
		System.out.println("************MAPA***********\n" + preferencia);
		//
		
		//Mostra per pantalla el nombre d'elements del mapa.
		System.out.println("Nombre d'elements: " + preferencia.size());
		
		//Elimina una preferència del mapa. Digues si ha anat bé.
		preferencia.remove("Filet mignon");
		System.out.println("************MAPA***********\n" + preferencia);
		
		//Comprova si el mapa és buid o no . Mostra el resultat per pantalla.
		System.out.println("Es buit? " + preferencia.isEmpty());
		
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
		//Executar mètode genèric
		p.ProvaPilaGenerict();
		//Executar conjunt HashSet
		p.provesHashSet();
		//Executar conjunt HashSet2
		p.provesHashSet2();
		//Executar mapa
		p.provesHashMap();

	}

}