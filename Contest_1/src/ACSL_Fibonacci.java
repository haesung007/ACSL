import java.util.*;
public class ACSL_Fibonacci {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		HashMap<String, Integer> map2 = new HashMap<String, Integer>();
		String []arr = new String [5];
		for(int i = 0; i < 5; i++) {
			arr[i] = in.nextLine();
		}

		int hour = 0;
		int min = 0;
		int j = 0;
		for(int i = 0; i < 5; i++) {
			if(j <= 1) {
				map.put(arr[i], 1);
				j++;
			}
			else if(j == 2) {
				map.put(arr[i], 2);
				j++;
			}
			else if(j == 3) {
				map.put(arr[i], 3);
				j++;
			}
			else if(j == 4) {
				map.put(arr[i], 5);
				j++;
			}
			if(map.containsKey("R")) {
				hour += map.get("R");
		//		System.out.println(map.get("R"));
				map.remove("R");

			}
			if(map.containsKey("B")) {
				hour += map.get("B");
			//	System.out.println(map.get("B"));
				map.remove("B");
			}
		}
	//	System.out.println(hour);
		j = 0;
		for(int i = 0; i < 5; i++) {
			if(j <= 1) {
				map2.put(arr[i], 1);
				j++;
			}
			else if(j == 2) {
				map2.put(arr[i], 2);
				j++;
			}
			else if(j == 3) {
				map2.put(arr[i], 3);
				j++;
			}
			else if(j == 4) {
				map2.put(arr[i], 5);
				j++;
			}
			if(map2.containsKey("G")) {
				min += map2.get("G");
		//		System.out.println(map2.get("G"));

				map2.remove("G");
			}
			if(map2.containsKey("B")) {
				min += map2.get("B");
			//	System.out.println(map2.get("B"));
				map2.remove("B");

			}
		}
		min = min * 5;
		if(min >= 60) {
			hour ++;
			min = min % 60;
		}
		String aaa = hour + "";
		if(hour < 10) {
			aaa = "0" + aaa;
		}
		if(min > 9) {
			System.out.println(aaa + ":" + min);
		}
		else {
			System.out.println(aaa + ":0" + min);
		}



	}

}
