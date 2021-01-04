/**
 * 
 */
package ie.lyit;

/**
 * @author marty
 *
 */
public class HelloIreland {

	/**
	 * @param args
	 * @return 
	 */
	public String Greeting() {
		String Greeting = "Hello to everyone in ireland";
		return Greeting; 

	}
	
	//Main Method to execute the Greeting method
	public static void main(String[] args) {
		
		HelloIreland Hello = new HelloIreland();
		System.out.println(Hello.Greeting()); 
	}
}