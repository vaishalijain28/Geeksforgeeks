Given an array of even size N, task is to find minimum value that can be added to an element so that array become balanced. An array is balanced if the sum of the left half of the array elements is equal to the sum of right half.



  //User function Template for Java


class Solution
{
    long minValueToBalance(long a[] ,int n)
    {
        long leftsum=0;
        long rightSum=0;
        for(int i=0; i< n/2;i++){
            leftsum+=a[i];
        }
        for(int i=n/2;i<n;i++){
            rightSum+=a[i];
        }
        return Math.abs(leftsum-rightSum);

    }
}
