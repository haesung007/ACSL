import java.util.*;
public class ACSL_Next_Base {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int b = in.nextInt();
		int s = in.nextInt();
		int limit = b - 1;
		int amount = s - 1;
		int [] arr = new int [n];
		int count = 0;
		for(int i = 1; i <= n; i ++) {
			amount++;
			if(amount % 10 == b) {
				amount += (10 - b);
				count++;
			}
			arr[i - 1] = amount;
			System.out.print(amount + " ");

			
		}
		System.out.println(count);

		
	}

}
