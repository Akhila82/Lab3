/**
 * Create a method which accepts a String and replaces all the consonants in the String with the next alphabet. 
 * @author Akhila
 *
 */
	import java.util.*;
	public class Exercise3 {
		public static void main(String[] args) {
			String s = getInputString();
			System.out.println("Modified string "+alterString(s));	
		}
		private static String alterString(String s) {
			String vowels ="aeiouAEIOU";
			int len = s.length();
			String s1="";
			char[]stringArray = s.toCharArray();
			for(int i=0;i<len;i++) {
				if(vowels.contains(stringArray[i]+"")) {
					s1+=stringArray[i]+"";
				}
				else {
					char ch =stringArray[i];
					if(ch=='z') {
						ch='a';
					}
					else if(ch=='Z') {
						ch='A';
					}
					else {
						ch++;
					}
					s1+=ch+"";
				}
			}
			return s1;
		}
		private static String getInputString() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter String ");
			String s = sc.next();
			return s;
		}

	}

