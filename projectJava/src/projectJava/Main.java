/**
 * 
 */
package projectJava;

/**
 * @author 	iaw26567249
 * 			iaw47647361
 *			iaw7315498
 * @since	
 */
public class Main {

	public static void main(String[] args) {
		Ingredient banana		= new Ingredient(1, "banana", "unit", 10.0, 10.0, 1.0, 0.0, 0.0);
		Ingredient kiwi 		= new Ingredient(2, "kiwi", "unit", 20.0, 20.00, 20.00, 20.00, 20.00);
		Ingredient apple 		= new Ingredient(3, "apple", "unit", 30.00, 30.00, 30.00, 30.00, 30.00);
		Ingredient sugar 		= new Ingredient(100, "sugar", "g", 0.38, 1.10, 0, 0, 0);
		Ingredient orangeJuice 	= new Ingredient(500, "orange juice", "ml", 0.85, 0.05, 0.2, 0.091, 0);
		
		CookingProcedure procedure1 = new CookingProcedure(1, "slice", banana);
		CookingProcedure procedure2 = new CookingProcedure(2, "cut into cubes", kiwi);
		CookingProcedure procedure3 = new CookingProcedure(3, "cut into cubes", apple);
		CookingProcedure procedure4 = new CookingProcedure(4, "add into a bowl", banana);
		CookingProcedure procedure5 = new CookingProcedure(5, "add into a bowl", kiwi);
		CookingProcedure procedure6 = new CookingProcedure(6, "add into a bowl", apple);
		CookingProcedure procedure7 = new CookingProcedure(7, "add into a bowl", sugar);
		CookingProcedure procedure8 = new CookingProcedure(8, "add into a bowl", orangeJuice);
		
		Recipe receta1 = new Recipe();
		try {
			receta1.agregarIngrediente(banana);
			receta1.agregarIngrediente(kiwi);
			receta1.agregarIngrediente(apple);
			receta1.agregarIngrediente(sugar);
			receta1.agregarIngrediente(orangeJuice);
			
			receta1.agregarProcedimiento(procedure1);
			receta1.agregarProcedimiento(procedure2);
			receta1.agregarProcedimiento(procedure3);
			receta1.agregarProcedimiento(procedure4);
			receta1.agregarProcedimiento(procedure5);
			receta1.agregarProcedimiento(procedure6);
			receta1.agregarProcedimiento(procedure7);
			receta1.agregarProcedimiento(procedure8);
					
			System.out.println(receta1);
			
		} catch (Exception e) {
			System.err.println("Se ha producido el siguiente error: " + e.toString());
			System.err.println("El error está en la linea: "
				+ e.getStackTrace()[0].getLineNumber());	
		}
	}

}
//─ │ ┌ ┐ └ ┘ ├ ┤ ┬ ┬ ┴ ┼═ ║ ╒ ╒ ╓ ╔ ╕ ╖ ╗ ╘ ╙ ╚ ╛ ╜ ╝ ╞ ╟╠ ╠ ╡ ╢ ╣ ╤ ╥╥ ╦ ╧ ╨ ╩ ╪ ╫ ╫ ╬  ▲ ► ▼ ◄ ● ▄▀ ▒ ░
