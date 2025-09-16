package first;

public class Palindromeasy {

	public static void main(String[] args) {
		String s = "madam";
		String reversed = "";

	for(int i = s.length()-1;i>=0;i--) {
		reversed += s.charAt(i);
	}
	
	if(reversed.equals(s)) {
		System.out.println(s + " is a palindrom");
	}
	else {
		System.out.println("this is not a palindrom");
	}
	
	}

}
