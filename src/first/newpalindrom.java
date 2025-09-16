package first;

public class newpalindrom {

	public static void main(String[] args) {
		String s = "tert";
		String compare = "";
		
		for(int i = s.length()-1;i>=0;i--) {
			
			compare += s.charAt(i);
		}
		if(compare.equals(s)) {
			System.out.println(s+ " is a palindrom");
		}
		else {
			System.out.println("not");
		}

	}

}
