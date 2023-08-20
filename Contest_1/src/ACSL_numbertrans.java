import java.util.*;
public class ACSL_numbertrans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String a = in.nextLine();
		int n = in.nextInt();
		int [] arr = new int [a.length()];
		for(int i = 0; i < a.length(); i++) {
			arr[i] = (a.charAt(i) - 48); 
		}
		int pos = a.length() - n;
		int c = arr[pos];
		for(int i = 0; i < pos; i++) {
			if(arr[i] + c > 9) {
				System.out.print((arr[i] + c) % 10);
			}
			else {
				System.out.print(arr[i] + c);
			}
		}
		System.out.print(c);
		for(int i = pos + 1; i < a.length(); i++) {
			System.out.print(Math.abs(arr[i] - c));
		}
		
	}

}
