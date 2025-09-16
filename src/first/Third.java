package first;

public class Third {

	public static void swap(int[] values) {


		values[0] = values[0] - values[1];
		values[1] = values[0] + values[1];
		values[0] = values[1] - values[0];
	}
	public static void main(String[] args) {
		int[] value = {40,30};
		swap(value);
		//System.out.println("values of values[0] = "+value[0]+" value of values[1] "+value[1]);

	}

}
