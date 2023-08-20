import java.util.*;

public class ACSL_2 {
	static Scanner in;
	static int n1, n2;
	static char c;
	public static void main(String[] args) {
		in = new Scanner(System.in);
		init(); 
		solve();		
	}
	static void init() {
		c = in.next().charAt(0);
		n1 = in.nextInt();
		if(c == 'B') { n2 = in.nextInt();}		
		
	}
	static void solve() {
		if(c == 'S') {
			for(int i = 1; i <= n1; i++) {
				for(int j = 1; j <= n1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		else if(c == 'H') {
			for(int i = 1; i <= n1; i++) {
				for(int j = n1-i; j < n1 - 1; j++) {
					System.out.print(" ");
				}
				for(int j = i - 1; j < n1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		else if(c == 'L') {
			for(int i = 1; i <= n1; i++) {
				for(int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				for(int j = i - 1; j < n1; j++) {
					System.out.print(" ");
				}
				System.out.println();
			}
		}
		else {
			for(int i = 1; i <= n2; i++) {
				for(int j = 1; j <= n1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		} 
	}

}

