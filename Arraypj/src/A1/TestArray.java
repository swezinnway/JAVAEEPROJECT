package A1;

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double[] myList= {1.9,2.3,3.4,5.6};
for (int i = 0; i < myList.length; i++) {
    System.out.println(myList[i] + " ");
 }

double total=0;
for (int i = 0; i < myList.length; i++) {
	 total += myList[i];
 }
System.out.println("Total is " + total);
	
	double max = myList[0];
    for (int i = 1; i < myList.length; i++) {
       if (myList[i] > max) max = myList[i];
    }
    System.out.println("Max is " + max);  
 }
}
