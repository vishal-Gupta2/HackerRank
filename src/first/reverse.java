package first;

public class reverse {

	public static void main(String[] args) {
		String s = "my name is vishal gupta";

		System.out.println(reverse(s));
	}

	public static String reverse(String s) {
		String reversedString = "";

		for(int i = s.length()-1;i>=0;i--) {
			reversedString += s.charAt(i);
		}


		return reversedString;
	}

}
