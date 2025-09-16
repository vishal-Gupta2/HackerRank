package first;

public class count {

	public static void main(String[] args) {
		String s = "my name is vishal gupta";
		
		//count the target
//		char target = 'a';
//		int count = 0;
//		for(int i = 0 ; i<s.length();i++){
//
//		if(s.charAt(i) == target){
//
//		count++;
//		}
//
//		}
//		System.out.println(count);
		
		
		//reverse the string
		String reversed = "";
		for(int i = s.length()-1;i>=0;i--) {
			 reversed += s.charAt(i); 
		}
		
		System.out.println(reversed);
		
	}
}

