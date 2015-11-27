package projectJava;
import java.util.HashSet;

public class Ingredient {
	private int code;
	private String name;
	private String measurement;
	private double kCal;
	private double carboHidrates;
	private double protein;
	private double fat;
	private double salt;
	private HashSet<Allergen> allergens;
	
	/////////////////////////////////////////////////////////////////////////
	//				CONSTRUCTOR DE LA CLASE INGREDIENTES.
	// 	Creamos un *HashSet* ya que no importa el orden. 
	// 	Si un alergeno ya existe en el ingrediente, no es necesario volver a introducirlo.	
	public Ingredient(int code, String name, String measurement, double kCal, 
					  double carbohydrates, double protein,	double fat, double salt) {
		super();
		this.code = code;
		this.name = name;
		this.measurement = measurement;
		this.kCal = kCal;
		this.carboHidrates = carbohydrates;
		this.protein = protein;
		this.fat = fat;
		this.salt = salt;
		this.allergens = new HashSet<Allergen>();
	}
	//				FIN CONSTRUCTOR DE LA CLASE INGREDIENTES.
	/////////////////////////////////////////////////////////////////////////

	
	/////////////////////////////////////////////////////////////////////////
	// 				GETTERS AND SETTERS
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMeasurement() {
		return measurement;
	}
	public void setMeasurement(String measurement) {
		this.measurement = measurement;
	}
	public double getkCal() {
		return kCal;
	}
	public void setkCal(double kCal) {
		this.kCal = kCal;
	}
	public double getCarbohydrates() {
		return carboHidrates;
	}
	public void setCarbohydrates(double carbohydrates) {
		this.carboHidrates = carbohydrates;
	}
	public double getProtein() {
		return protein;
	}
	public void setProtein(double protein) {
		this.protein = protein;
	}
	public double getFat() {
		return fat;
	}
	public void setFat(double fat) {
		this.fat = fat;
	}
	public double getSalt() {
		return salt;
	}
	public void setSalt(double salt) {
		this.salt = salt;
	}
	public HashSet<Allergen> getAllergens() {
		return allergens;
	}
	public void setAllergens(HashSet<Allergen> allergens) {
		this.allergens = allergens;
	}
	//				FIN GETTERS AND SETTERS
	/////////////////////////////////////////////////////////////////////////

	
	/////////////////////////////////////////////////////////////////////////
	// 				METODOS DE LA CLASE INGREDIENTES
	/* *********************************************
	 * buscarPorCodigo()
	 * 		-> Devuelve un ingrediente completo.
	 * 
	 * @param listaIngredientes, lista de ingredientes
	 * @param codigo, codigo de ingrediente a buscar
	 * @return objeto 'Ingredient'.
	 */
	public Ingredient buscarPorCodigo(HashSet<Ingredient> listaIngredientes,int codigo){
		if (!listaIngredientes.isEmpty()){	// Si la lista no está vacia se busca en ella.
			for (Ingredient ingrediente : listaIngredientes){
				if (ingrediente.getCode() == codigo){ // Se compara cada ingrediente en la lista.
					// Si encuentra el codigo del ingrediente, lo devuelve.
					return ingrediente;
				}
			}
		}
		return null;
	}

	/* *********************************************
	 * buscarPorNombre()
	 * 		-> Devuelve un ingrediente completo.
	 * 
	 * @param listaIngredientes, lista de ingredientes
	 * @param nombre, nombre de ingrediente a buscar
	 * @return objeto 'Ingredient'.
	 */
	public Ingredient buscarPorNombre(HashSet<Ingredient> listaIngredientes,String nombre){
		if (!listaIngredientes.isEmpty()){	// Si la lista no está vacia se busca en ella.
			for (Ingredient ingrediente : listaIngredientes){
				if (ingrediente.getName() == nombre){ // Se compara cada ingrediente en la lista.
					// Si encuentra el nombre del ingrediente, lo devuelve.
					return ingrediente;
				}
			}
		}
		return null;
	}
	
	
	/* *********************************************
	 * verificarAllergen()
	 * 		-> Verifica si el ingrediente contiene el alergeno especificado.
	 * 
	 * @param codigoAllergen, codigo del alergeno a comprobar.
	 * @return boolean TRUE/FALSE
	 */
	public boolean verificarAllergen(int codigoAllergen) {
		if (this.allergens.contains(codigoAllergen)) {
			// Si lo encuentra dentro del hash de alergenos, devuelve TRUE,
			return true;
		}
		//Si no lo encuentra dentro del hash de alergenos, devuelve false,
		return false;
	}
	// 				FIN METODOS DE LA CLASE INGREDIENTES	
	/////////////////////////////////////////////////////////////////////////

	
	@Override
	public String toString() {
		return "Ingredient [code=" + code + ", name=" + name + ", measurement=" + measurement + ", kCal=" + kCal
				+ ", carboHidrates=" + carboHidrates + ", protein=" + protein + ", fat=" + fat + ", salt=" + salt
				+ ", allergens=" + allergens + "]";
	}
	

}
