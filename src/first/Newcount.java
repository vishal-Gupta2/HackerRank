package first;

public class Newcount {

	public static void main(String[] args) {
		String s = "my nam eis vishal gupta";
		 char target = 'a';
		 int count = 0;
		 
		 for(int i = 0 ; i<=s.length()-1;i++) {
			 if(s.charAt(i) == target) {
				 count ++ ;
			 }
		 }
		 System.out.println(count);
		
	}

}
