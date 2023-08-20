import java.util.*;

public class ACSL_changedigits {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String x = in.nextLine();
		int max = -99;
		int maxq = 0;
		for(int i = x.length() - 1; i >= 0; i--) {
			if(max <= x.charAt(i)) {
				max = x.charAt(i);
				maxq = i;
			}
		}
		max = max - 48;
		if(max % 2 == 1) {
			for(int i = 0; i < x.length(); i++) {
				if(i != maxq) {
					System.out.print(x.charAt(i));
				}
				else {
					System.out.print("0");
				}
			}
		}
		else if(max % 2 == 0) {
			for(int i = 0; i < x.length(); i++) {
				if(i != maxq) {
					System.out.print(x.charAt(i));
				}
				else {
					if(max + 4 > 9) {
						System.out.print((max + 4) % 10);
					}
					else {
						System.out.print(max + 4);
					}
				}
			}
		}

	}

}
