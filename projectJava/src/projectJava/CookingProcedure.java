package projectJava;
public class CookingProcedure {
	private int code;
	private String name;
	private Ingredient ingredient;
	
	/////////////////////////////////////////////////////////////////////////
	//				CONSTRUCTOR DE LA CLASE COOKINGPROCEDURE.
	public CookingProcedure(int code, String name, Ingredient ingrediente) {
		super();
		this.code = code;
		this.name = name;
		this.ingredient = ingrediente;
	}
	//				FIN CONSTRUCTOR DE LA CLASE COOKINGPROCEDURE.
	/////////////////////////////////////////////////////////////////////////

	
	/////////////////////////////////////////////////////////////////////////
	//				GETTERS AND SETTERS.
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
	public Ingredient getIngredient() {
		return ingredient;
	}
	public void setIngredient(Ingredient ingredient) {
		this.ingredient = ingredient;
	}	
	//				GETTERS AND SETTERS.
	/////////////////////////////////////////////////////////////////////////

	
	/////////////////////////////////////////////////////////////////////////
	// 				METODOS DE LA CLASE COOKINGPROCEDURE
	/* ******************************************
	 * processarIngrediente()
	 * 		-> Procesa un ingrediente
	 * 
	 * @param codProcedimiento, codigo del procedimiento
	 * @param codIngrediente, codigo del ingrediente
	 * @param cantidad
	 * @param veces
	 * @param tiempo
	 * @param temperatura
	 * @return String que contiene el procedimiento del ingrediente / null
	 */
	public String processarIngrediente(int codProcedimiento, Ingredient codIngrediente, int cantidad, 
									   int veces, int tiempo, int temperatura) {
		// Se define el procedimiento
		String procedimiento;
		try {
			procedimiento = "";

			// Nombre del procedimiento añadido
			// Ex: "bake in oven "
			procedimiento += this.getName() + " ";
			
			// Ex: "bake in oven 500g tomatoes"
			if (codIngrediente.getMeasurement().toLowerCase() == "grams"){
				String medida = "g";
				procedimiento += Integer.toString(cantidad) + medida +" "+codIngrediente.getName();
			}else{
				String medida = codIngrediente.getMeasurement().toLowerCase();
				procedimiento += Integer.toString(cantidad) + medida +" "+codIngrediente.getName();
			}
			
			// Ex: "bake in oven 500g tomatoes for 45 minutes at 220º"
			// Ex: "bake in oven 500g tomatoes for 1 minut at 220º"
			if (tiempo>1){
				procedimiento += " for " + Integer.toString(tiempo) + " minutes at 220º";
			}else{
				procedimiento += " for " + Integer.toString(tiempo) + " minut at 220º";
			}
			
			return procedimiento;
		} catch (Exception e) {
			System.err.println("Se ha producido el siguiente error: " + e.toString());
			System.err.println("El error está en la linea de la clase CookingProcedure: "
				+ e.getStackTrace()[0].getLineNumber());
		}
		return null;
	}
	// 				METODOS DE LA CLASE COOKINGPROCEDURE
	/////////////////////////////////////////////////////////////////////////

	
	@Override
	public String toString() {
		return "CookingProcedure [code=" + code + ", name=" + name + "]";
	}
		
}
