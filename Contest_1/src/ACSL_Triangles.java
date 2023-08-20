import java.util.*;
public class ACSL_Triangles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int [][] arr = new int [2][3];
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		int ans = 0;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(arr[0][i] == arr[1][j]) {
					ans++;
				}
			}
		}
		System.out.println(ans);
	}

}
