package first;

public class Second {

	public static void swapping(int a , int b) {
//		 int temp = a;
//		 a = b ;
//		 b = temp;
//		 System.out.println("value of a = "+a +" value of b = "+b);
//		 
		 a = a+b;
		 b = a-b;
		 a = a-b;
		 System.out.println("a = " + a + " b = " + b);
	}

	public static void main(String[] args) {


		int a = 3;
		int b = 9;
		swapping(a,b);

	}

}
