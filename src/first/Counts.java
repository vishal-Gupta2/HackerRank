package first;

public class Counts {

	public static void main(String[] args) {
		String name = "my name is Vishal gupta";
		char target = 'a';
		int count = 0;
		for(int i = 0; i<name.length(); i++) {
			if(name.charAt(i) == target) {
				count++;
			}
		}
		System.out.println("String "+name+" has " +target +" = " + count);

	}

}
