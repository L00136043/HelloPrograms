/**
 * 
 */
package ie.lyit.testers;
import ie.lyit.HelloIreland;
/**
 * @author marty
 *
 */
public class HelloIrelandTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloIreland Hello = new HelloIreland();
		if(Hello.Greeting() == "Hello to everyone in ireland") {
			System.out.println(true); 
		}
		else {
			System.out.println(false); 
		}
	}

}
