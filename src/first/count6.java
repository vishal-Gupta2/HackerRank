package first;

public class count6 {

	public static void main(String[] args) {
		String s = "my name is vishal gupta";

		System.out.println(count(s));
	}

	public static int count(String s) {
		int count = 0;
		char target = 'a';
		for(int i = 0;i<s.length();i++) {
			if(s.charAt(i) == target) {
				count++;
			}
		}


		return count;
	}

}
