Given an array A[] of size N and a positive integer K, find the first negative integer for each and every window(contiguous subarray) of size K.

 

Example 1:

Input : 
N = 5
A[] = {-8, 2, 3, -6, 10}
K = 2
Output : 
-8 0 -6 -6
Explanation :
First negative integer for each window of size k
{-8, 2} = -8
{2, 3} = 0 (does not contain a negative integer)
{3, -6} = -6
{-6, 10} = -6



  

//User function Template for Java


class Compute {
    
    public long[] printFirstNegativeInteger(long A[], int N, int K)
    {
        long[] res = new long[N-K+1];
        Queue<Integer> q = new LinkedList<>();
        
        for(int i=0; i< N ;i++){ //adding -ve value indices
            if(A[i]<0){
                q.add(i);
            }
        }
        for(int i=0; i<N-K+1; i++){
            if(q.size()>0 && q.peek()<i){
                q.remove();
            }
            if(q.size()>0 && q.peek()<=i+K-1){
                res[i]=A[q.peek()];
            }
            else if(q.size()==0){
                    res[i]=0;
                    }
            else{
                res[i] = 0;
            }
            
        }
        return res;
         
    }
}
