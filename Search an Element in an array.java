Given an integer array and another integer element. The task is to find if the given element is present in array or not.
  Your Task:
The task is to complete the function search() which takes the array arr[], its size N and the element X as inputs and returns the index of first occurrence of X in the given array. If the element X does not exist in the array, the function should return -1.
  
  
  class Solution{
        
    static int search(int arr[], int N, int X)
    {
        for(int i=0; i<N; i++){
            if(arr[i]==X){
                return i;
            }
        }
        return -1;
    }
    
}
