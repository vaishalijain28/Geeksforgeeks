Given a sorted array of size N and an integer K, find the position(0-based indexing) at which K is present in the array using binary search.
  Your Task:  
You dont need to read input or print anything. Complete the function binarysearch() which takes arr[], N and K as input parameters and returns the index of K in the array. If K is not present in the array, return -1.
  
  //{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

  public class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int key = sc.nextInt();
            Solution g = new Solution();
            System.out.println(g.binarysearch(arr, n, key));
            T--;
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int binarysearch(int arr[], int n, int k) {
        // code here
         int low = 0, high = n-1;
      
      while(low <= high){
      int mid = (low+high)/2;
      
      if(arr[mid] == k)
      return mid;
      
      else if(arr[mid] > k)
      high = mid - 1;
      
      else
      low = mid+1;
      }
      
      return -1;
    }
}
  
