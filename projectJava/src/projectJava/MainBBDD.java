/**
 * 
 */
package projectJava;


/**
 * @author iaw26567249
 *
 */
public class MainBBDD {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			MySQLAccess dao = new MySQLAccess();
			dao.readDataBase();
						
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
