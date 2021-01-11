
/**
 * Create a method that accepts a number and modifies it such that the each of the digit in the newly formed number is equal to the difference between two consecutive digits in the original number. 
 * The digit in the units place can be left as it is. 
 * @author Akhila
 *
 */
	import java.util.*;
	public class Exercise4 {
		public static void main(String[] args) {
			int num = getInputNumber();
			System.out.println("Changed Num "+modifyNumber(num));	
		}
		private static int modifyNumber(int num) {
			String s =Integer.toString(num);
			StringBuffer  modifiedString = new StringBuffer();
			int len = s.length(),modifiedNumber=0;
			for(int i=0;i<len-1;i++) {
				 modifiedString.append(Math.abs(Character.getNumericValue(s.charAt(i+1))-Character.getNumericValue(s.charAt(i))));
			}
			modifiedString.append(s.charAt(len-1));
			modifiedNumber=Integer.parseInt(modifiedString.toString());
			return modifiedNumber;
		}
		private static int getInputNumber() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter num ");
			int n = sc.nextInt();
			return n;
		}
}
