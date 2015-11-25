package projectJava;
public class CookingProcedure {
	private int code;
	private String name;
	
	
	
	public CookingProcedure(int code, String name) {
		super();
		this.code = code;
		this.name = name;
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

	
	// Procedimiento
	public String procedimientoReceta(int codProcedimiento, Ingredient codIngrediente, int cantidad, int veces, int tiempo, int temperatura) {
		String procedimiento =this.getName()+" "+cantidad +" "+ codIngrediente.getName()+" "+ tiempo+ " "+ temperatura ; 
		return procedimiento;
	}
	
	@Override
	public String toString() {
		return "CookingProcedure [code=" + code + ", name=" + name + "]";
	}
		
}
