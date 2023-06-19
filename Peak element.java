An element is called a peak element if its value is not smaller than the value of its adjacent elements(if they exists).
Given an array arr[] of size N, Return the index of any one of its peak elements.
  
  
  
class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n){
	    
        if(n==1)
        return 0;
        if(n==2 && arr[1]>arr[0])
        return 1;
        
       for(int i=1;i<n-2;i++){
           if(arr[i-1]<=arr[i] && arr[i]>=arr[i+1])
           return i;
       }
       if(arr[n-1]>arr[n-2])
       return n-1;
       return 0;
       
    
    }
}
