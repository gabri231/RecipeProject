package projectJava;

import java.util.HashMap;
import java.util.Map;

public class Allergen {
	private Map<Integer, String> allergens;
	
	/////////////////////////////////////////////////////////////////////////
	//				CONSTRUCTOR DE LA CLASE ALERGENOS.
	// 	Creamos un HashMap ya que no importa el orden. 
	// 	A través del key podemos acceder a los datos.
	public Allergen() {
		this.allergens = new HashMap<Integer, String>();
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
	}
	
	/////////////////////////////////////////////////////////////////////////
	// 				GETTERS AND SETTERS
	public Map<Integer, String> getAllergens() {
		return allergens;
	}

	public void setAllergens(Map<Integer, String> allergens) {
		this.allergens = allergens;
	}
	
	/////////////////////////////////////////////////////////////////////////
	// 				METODOS DE LA CLASE ALERGENOS
	/* ******************************************
	 * obtenerAlergenoPorCodigo()
	 * 		-> Devuelve el nombre del alergeno
	 * 
	 * @param codigo: codigo del alergeno
	 * @return String, es el nombre del alergeno.
	 */
	public String obtenerAlergenoPorCodigo(int codigo){
		for (Map.Entry<Integer, String> entrada : this.allergens.entrySet()) {
			if (entrada.getKey() == codigo) {
				// Si encuentra el codigo, devuelve su nombre.
				return entrada.getValue();
			}
		}
		// Si no encuentra nada, devuelve null.
		return null;
	}

	/* ******************************************
	 * obtenerAlergenoPorNombre()
	 * 		-> Devuelve el codigo del alergeno
	 * 
	 * @param nombre: nombre del alergeno
	 * @return Integer, es el codigo del alergeno.
	 */
	public Integer obtenerAlergenoPorNombre(String nombre){
		for (Map.Entry<Integer, String> entrada : this.allergens.entrySet()) {
			if (entrada.getValue().equals(nombre)) {
				// Si encuentra el nombre, devuelve su codigo.
				return entrada.getKey();
			}
		}
		// Si no encuentra nada, devuelve null.
		return null;
	}
	
}