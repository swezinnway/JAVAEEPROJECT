package p2;

public class LabeledForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
aa:
	for(int i=1;i<=3;i++) {
		bb:
			for(int j=1;j<=3;j++) {
				if(i==3 && j==3) {
					break aa;
				}
				System.out.println(i+""+j);
			}
	}
	}

}
