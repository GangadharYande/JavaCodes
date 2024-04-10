public class Solution {
    public long[] prefixSum(int A[]){
        // Prefix sum Algorithm
        int n = A.length;
        long pSum[] = new long[n];
        pSum[0] = A[0];
        for(int i =1 ;i< n;i++){
            pSum[i]=A[i]+A[i-1];
        }
        return pSum;
    }
    public long[] rangeSum(int[] A, int[][] B) {
        long psum[] = prefixSum(A);
        long res[] = new long[B.length];
        for(int i =0 ;i < B.length ;i++){
            int L = B[i][0];
            int R = B[i][1];
            long sum =0;
            if(L!=0){
                sum = psum[R] - psum[L-1];
                res[i]=sum;
            }
            else{
                sum=psum[R];
                res[i]=sum;
            }
        }
        return res;
    }
}

/* You are given an integer array A of length N.
You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
For each query, you have to find the sum of all elements from L to R indices in A (0 - indexed).
More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.  */
public static void main(String[] args) {
    int A[]={7,3,1,5,5,5,1,2,4,5};
    int B[][] = {{6,9},{2,9},{2,4},{0,9}};
}