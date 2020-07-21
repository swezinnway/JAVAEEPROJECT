package p1;

public class RelationalOperators {

	public static void main(String[] args) {
		int a = 21;
		   int b = 10;
		   int c ;

		   if( a == b ) {
		      System.out.println("Line 1 - a is equal to b\n" );
		   } else {
			   System.out.println("Line 1 - a is not equal to b\n" );
		   }
			
		   if ( a < b ) {
			   System.out.println("Line 2 - a is less than b\n" );
		   } else {
			   System.out.println("Line 2 - a is not less than b\n" );
		   }
			
		   if ( a > b ) {
			   System.out.println("Line 3 - a is greater than b\n" );
		   } else {
			   System.out.println("Line 3 - a is not greater than b\n" );
		   }
		   
		   /* Lets change value of a and b */
		   a = 5;
		   b = 20;
			
		   if ( a <= b ) {
			   System.out.println("Line 4 - a is either less than or equal to  b\n" );
		   }
			
		   if ( b >= a ) {
			   System.out.println("Line 5 - b is either greater than  or equal to b\n" );
		   }
	}

}
