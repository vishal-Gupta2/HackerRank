package first;

public class Findrepeating {

	public static void main(String[] args) {
		int [] test = {2,5,3,9,4,0,7,5,11,22,4,33,55,6,90,33,55};
		
		for(int i=0; i<test.length; i++) {
			for(int j=i+1; j<test.length; j++) {
				if(test[i] == test[j]) {
					System.out.println("repeating element is : " + test[i]);
				}
			}
		}
	}

}
