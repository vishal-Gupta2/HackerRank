package first;

import java.util.HashMap;

public class Occurencechar {

	public static void main(String[] args) {
		//int [] sequence = {3,7,3,8,4,9,4,5,8,5,4,0,1,3,0,5,4,7,8,45};
		
		String [] sequence = {"test","value","test","test","value","test","job","value"};
		
		HashMap<String, Integer> map = new  HashMap<String,Integer>();
		
		for(int i = 0 ; i<= sequence.length-1;i++) {
			String value = sequence[i];
			if(map.containsKey(value)) {
				map.put(value,map.get(value)+1);
			}
			else {
				map.put(value, 1);
			}
			
		}
		for (String key : map.keySet()) {
            if (map.get(key) > 1) {
                System.out.println(key + " repeats " + map.get(key) + " times");
            }
        }

	}

}
