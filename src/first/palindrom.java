package first;

public class palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static boolean plaindrom(String s) {

		int i = 0, j=s.length()-1;
		while(i<j) {
			if (s.charAt(i++) != s.charAt(j--)) {
				return false;
			}
		}
	return true;

}
}
