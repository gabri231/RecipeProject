package projectJava;
import java.util.ArrayList;
import java.util.List;

public class Ingredient {
	private int code;
	private String name;
	private String measurement;
	private double kCal;
	private double carbohydrates;
	private double protein;
	private double fat;
	private double salt;
	private List<Allergen> allergens;
	
	
	
	public Ingredient(int code, String name, String measurement, double kCal, double carbohydrates, double protein,
			double fat, double salt) {
		super();
		this.code = code;
		this.name = name;
		this.measurement = measurement;
		this.kCal = kCal;
		this.carbohydrates = carbohydrates;
		this.protein = protein;
		this.fat = fat;
		this.salt = salt;
		this.allergens = new ArrayList<Allergen>();
	}

	// Getters and setters
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
		return carbohydrates;
	}
	public void setCarbohydrates(double carbohydrates) {
		this.carbohydrates = carbohydrates;
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
	public List<Allergen> getAllergens() {
		return allergens;
	}
	public void setAllergens(ArrayList<Allergen> allergens) {
		this.allergens = allergens;
	}
	
	/*
	 * 
	 * @param listaIngredientes, lista de ingredientes
	 * @param nombre, codigo de ingrediente a buscar
	 * @return
	 */
	public Ingredient buscarPorCodigo(List<Ingredient> ingrediente,int codigo){
		for (int i = 0; i< ingrediente.size(); i++){
			if (ingrediente.get(i).getCode() == codigo){
				// Si encuentra un ingrediente se devuelve el ingrediente.
				return ingrediente.get(i);
			}
		}
		// Si no encuentra nada se devuelve null.
		return null;	
	}

	/*
	 * 
	 * @param listaIngredientes, lista de ingredientes
	 * @param nombre, nombre de ingrediente a buscar
	 * @return el ingrediente encontrado 
	 */
	public Ingredient buscarPorNombre(List<Ingredient> listaIngredientes,String nombre){
		for (int i = 0; i< listaIngredientes.size(); i++){
			if (listaIngredientes.get(i).getName() == nombre){
				// Si encuentra un ingrediente, se devuelve el ingrediente
				return listaIngredientes.get(i);
			}
		}
		// Si no encuentra nada, devuelve null
		return null;
	}
	
	
	/*
	 * @param allergen, alergia a comprobar 
	 * @return true/false.
	 */
	public boolean verificarAllergen(Allergen allergen) {
		if (this.allergens.contains(allergen)) {
			// Si lo encuentra dentro del mapa, devuelve TRUE,
			return true;
		}
		//Si no lo encuentra dentro del mapa, devuelve false,
		return false;
	}
	
	@Override
	public String toString() {
		return "Ingredient [code=" + code + ", name=" + name + ", measurement=" + measurement + ", kCal=" + kCal
				+ ", carbohydrates=" + carbohydrates + ", protein=" + protein + ", fat=" + fat + ", salt=" + salt
				+ ", allergens=" + allergens + "]";
	}
	

}
