package first;

public class Findfirstunique {

	public static void main(String[] args) {
		String text = "this is the string";
		boolean flag = false;
		for(int i = 0; i<text.length(); i++) {
			char ch = text.charAt(i);
			if(text.indexOf(ch) == text.lastIndexOf(ch)) {
				System.out.println("non repeating charcater is : "+ch);
				flag = true;
				break;
			}
			
		}
		if(!flag) {
			System.out.println("no non repeating char found");
		}

	}

}
