package first;

import java.util.HashMap;

public class Newsequence {

	public static void main(String[] args) {
		int [] arr = {1,3,5,3,2,9,6,33,55,44,33,2,1,0,2,0};
		
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i = 0; i< arr.length ; i++) {
		
			int value = arr[i];
			if(map.containsKey(value)) {
				map.put(value, map.get(value)+1);
			}
			else {
				map.put(value, 1);
			}
		
		}

		for(int key : map.keySet()) {
		if(map.get(key)>1) {
			System.out.println(key + " repeats " + map.get(key) + " times ");
		}
		}
		
	}

}
