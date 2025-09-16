package first;

public class Newreverse {

	public static void main(String[] args) {
		String s = "my name is vishal gupta";
		String reversed = "";
		
		for(int i = s.length()-1;i>=0;i--) {
			reversed += s.charAt(i);
		}
		System.out.println(reversed);

	}

}
