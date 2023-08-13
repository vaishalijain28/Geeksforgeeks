Given an unsorted array arr[] of n positive integers. Find the number of triangles that can be formed with three different array elements as lengths of three sides of triangles. 

Example 1:

Input: 
n = 3
arr[] = {3, 5, 4}
Output: 
1
Explanation: 
A triangle is possible 
with all the elements 5, 3 and 4.


  

//User function Template for Java

class Solution
{
    //Function to count the number of possible triangles.
    static int findNumberOfTriangles(int arr[], int n)
    {
        // code here
        int count=0;
        Arrays.sort(arr);
        for(int i=n-1; i>1;i--){
            int l=0;
            int r= i-1;
            
            while(l<r){
                if(arr[r]+arr[l]>arr[i]){
                    count+=(r-l);
                    r--;
                }
                else{
                    l++;
                }
            }
        }
        return count;
    }
}
