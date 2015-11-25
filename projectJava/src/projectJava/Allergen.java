package projectJava;

import java.util.Map;
import java.util.TreeMap;

public class Allergen {
	private TreeMap<Integer, String> allergens;
	
	public Allergen() {
		this.allergens = new TreeMap<Integer, String>();
		allergens.put(1, "gluten");
		allergens.put(2, "shellfish");
		allergens.put(3, "eggs");
		allergens.put(4, "fish");
		allergens.put(5, "peanuts");
		allergens.put(6, "soy");
		allergens.put(7, "dairy");
		allergens.put(8, "nuts");
		allergens.put(9, "celery");
		allergens.put(10, "mustard");
		allergens.put(11, "sesame");
		allergens.put(12, "sulphites");
		allergens.put(13, "mollusk");
		allergens.put(14, "lupin");
		allergens.put(15, "pine nuts");
	}
	
	
	/*
	 * 
	 * @param codigo: codigo de los ingredientes
	 * @return Object, que es el ingrediente completo.
	 */
	public Object obtenerElementoPorCodigo(int codigo){
		for (Map.Entry<Integer, String> entrada : this.allergens.entrySet()) {
			if (entrada.getKey() == codigo) {
				return entrada;
			}
		}
		// Si no encuentra nada, devuelve null.
		return null;
	}

	/*
	 * 
	 * @param nombre: nombre del ingrediente
	 * @return Object, que es el ingrediente completo.
	 */
	public Object obtenerElementoPorNombre(String nombre){
		for (Map.Entry<Integer, String> entrada : this.allergens.entrySet()) {
			if (entrada.getValue().equals(nombre)) {
				return entrada;
			}
		}
		// Si no encuentra nada, devuelve null.
		return null;
	}
	
}