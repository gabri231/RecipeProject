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
		try {
			System.out.println("Hola ingredientes");
		} catch (Exception e) {
			System.err.println("Se ha producido el siguiente error: " + e.toString());
			System.err.println("El error está en la linea: "
				+ e.getStackTrace()[0].getLineNumber());	
		}
	}

}
