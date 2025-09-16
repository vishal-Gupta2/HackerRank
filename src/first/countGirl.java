package first;

public class countGirl {

	public static void main(String[] args) {
		 String s = "my name is vishal gupta kowejhfowejaa pwirqa ajj da a a0d a0 dia0 d0ad anoiah";

		 System.out.println(count(s));
	}

	public static int count(String s) {

		int count = 0;
		char target = 'g';
		
		for(int i = 0; i<s.length();i++) {
			if(s.charAt(i) == target) {
				count++;
			}
		}
        return count;
	}

}
