import java.lang.*;
import java.util.*;

public class noTriangle2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i =1 ; i<=n ; i++){
			for( int j =1 ; j<=n-i ;j++){
				System.out.print(" ");
			}
			for(int j =1 ;j<=i ;j++){
				System.out.print(i+" ");
			}
			System.out.println();
		}
    }
}

/* Expected Output :
 * n = 5

    1 
   2 2 
  3 3 3 
 4 4 4 4 
5 5 5 5 5 
 */




