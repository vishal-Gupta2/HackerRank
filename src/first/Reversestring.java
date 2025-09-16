package first;

public class Reversestring {

	public static void main(String[] args) {
		String s = "this is testing";
		System.out.println(reverse(s));

	}

	public static String reverse(String s) {
	    return new StringBuilder(s).reverse().toString();
	}


}

