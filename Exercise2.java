

/**
 * Create a class containing a method to create the mirror image of a String. 
 * The method should return the two Strings separated with a pipe(|) symbol .
 * @author Akhila
 *
 */
import java.util.*; 
public class Exercise2 {
	public static String rev(String reversed)
	{ 
	return new StringBuffer(reversed).reverse().toString(); 
	} 

	public static void main(String[] args){ 
	String word= "EARTH"; 
	String reversed= rev(word); 
	System.out.println(word+"|"+reversed); 
	} 
	}
	


