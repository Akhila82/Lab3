/**
 * @author Akhila
 *Create a method that accepts a String and checks if it is a positive string.
 *A string is considered a positive string, if on moving from left to right each character in the String comes after the previous characters in the Alphabetical order.
 *For Example: ANT is a positive String (Since T comes after N and N comes after A). 
 *The method should return true if the entered string is positive.
 */
	import java.util.*;
	public class Exercise8 {
		public static void main(String[] args) {
			String s = getInputString();
			if(checkString(s)) {
				System.out.println(s+" is positive.");
			}
			else {
				System.out.println(s+" is not positive.");
			}
			
		}
		private static boolean checkString(String s) {
			int l = s.length();
			char a[] = s.toCharArray();
			char beforeChar=a[0];
			for(int i=0;i<l;i++) {
				if(a[i]<beforeChar) {
					return false;
				}
				beforeChar = a[i];
			}
			return true;
		}
		private static String getInputString() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter String ");
			String s = sc.nextLine();
			return s;
		}
	}

