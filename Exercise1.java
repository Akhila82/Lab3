
/**
 * Java program that reads a line of integers and then displays each integer and the sum of all integers. (Use String Tokenizer class)?
 * @author Akhila
 *
 */
	import java.util.*;
	class Exercise1
	{
		public static void main(String args[])
		{
				Scanner s = new Scanner(System.in);
				System.out.print("Enter the line of num with space: ");
				String input = s.nextLine();
				StringTokenizer str = new StringTokenizer(input," ");
				int sum = 0;
				while(str.hasMoreTokens())
				{
					int n = 0;
					n = Integer.parseInt(str.nextToken());
					System.out.println("Num : "+n);
					sum += n;
				}
				System.out.println("Sum of the numbers is: "+sum);
		}
	}

