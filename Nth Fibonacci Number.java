Given a positive integer n, find the nth fibonacci number. Since the answer can be very large, return the answer modulo 1000000007.


  

//User function Template for Java

//User function Template for Java
class Solution {
    static int nthFibonacci(int n){
        // code here
        if(n==1){
            return n;
        }
        int[] fibArr = new int[n+1];
        
        fibArr[0]=0;
        fibArr[1]=1;
        
        for(int i=2; i<=n;i++){
            fibArr[i]=(fibArr[i-1]+fibArr[i-2])% 1000000007;
        }
        return fibArr[n];
        }
}
