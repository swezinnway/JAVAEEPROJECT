package D1;

public class LeapYearExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int year=2020;
if(((year % 4 ==0) && (year % 100 !=0)) || (year % 400==0)) {
	System.out.print("LEAP YEAR");
}
else {
	System.out.print("Acdamic Year");
}
	}

}
