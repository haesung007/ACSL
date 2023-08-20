import java.util.*;
public class ACSL_Numeral_Triangles {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int str = in.nextInt();
		int d = in.nextInt();
		int row = in.nextInt();
		int num = str - d;
		for(int i = 1; i <= row - 1; i++) {
			for(int j = 1; j <= i; j++) {
				num += d;
				if(num % 10 >= 8 || num % 10 == 0) {
					num += 2;
				}				
			}
		}
		int sum = 0;
		for(int i = 1; i <= row; i++) {
			num += d;
			if(num % 10 >= 8 || num % 10 == 0) {
				num += 2;
			}

			String len = num + "";
			int s = num;
			int zero = 1;
			for(int z = 2; z <= len.length(); z++) {
				zero *= 10;
			}
			for(int z = zero; z >= 10; z = z/10) {
				sum += s / z;
				s = s % z;
			}
			sum += s;
			
		}
		System.out.println(sum);

		
	}
}
