import java.util.*;

public class noIncreRevPy4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i =0 ; i<=n ; i++){
			for (int j =1 ; j<= n-i; j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
    }
}


/* Expected Output :
 * n = 5

1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 
 */


