/**
 * @author Akhila
 *Create a method to accept date and print the duration in days, months and years with regards to current system date.
 */
	import java.time.*;
	import java.util.*;

	public class Exercise09{  
	   public static void main(String[] args)
	    {
	        LocalDate randomdate = LocalDate.of(1998, 9, 29);
	        LocalDate systemdate = LocalDate.now();
	 
	        Period diff = Period.between(randomdate, systemdate);
	 
	     System.out.printf("\nDifference is %d years, %d months and %d days \n\n", 
	                    diff.getYears(), diff.getMonths(), diff.getDays());
	  }
	}

