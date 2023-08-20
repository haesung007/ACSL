import java.util.*;
public class ACSL_Probability {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int red = in.nextInt();
		int blue = in.nextInt();
		String a = in.next();
		if(a.equals("R") || a.equals("B")) {
			if(a.equals("R")) {
				System.out.println(red + "/" + (red + blue));
			}
			else if(a.equals("B")) {
				System.out.println(blue + "/" + (red + blue));
			}
		}
		else if(a.equals("Y")){
			String[] arr = new String[n];
			for(int i = 0; i < n; i++) {
				arr[i] = in.next();
			}
			int amount = 1;
			int amount2 = 1;
			for(int i = 0; i < arr.length; i++) {
				if(arr[i].equals("R")) {
					amount *= red;
					amount2 *= (red + blue);
				}
				else if (arr[i].equals("B")){
					amount *= blue;
					amount2 *= (red + blue);
				}
			}
			System.out.println(amount + "/" + amount2);
		}
		else if(a.equals("N")) {
			String[] arr = new String[n];
			for(int i = 0; i < n; i++) {
				arr[i] = in.next();
			}
			int amount = 1;
			int amount2 = 1;
			int count = red + blue;
			for(int i = 0; i < arr.length; i++) {
				if(arr[i].equals("R")) {
					amount *= red;
					amount2 *= count;
					count--;
				}
				else if(arr[i].equals("B")){
					amount *= blue;
					amount2 *= count;
					count--;
				}
			}
			System.out.println(amount + "/" + amount2);
		}
		

	}

}
