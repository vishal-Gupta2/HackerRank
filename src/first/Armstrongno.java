package first;

public class Armstrongno {

	public static void main(String[] args) {
		long given = 24678050;
		long no = given;
		long sum = 0;
		int frequency = String.valueOf(given).length();
		
		while(given>0) {
			
			long remainder= given%10;
			sum += Math.pow(remainder, frequency);
			//sum += remainder*remainder*remainder;
			given = given/10;;
			
		}
		
		if(sum == no) {
			System.out.println(no +" this is armstrong");
		}
		else {
			System.out.println(no + " this is not an armstrong");
		}

	}

}
