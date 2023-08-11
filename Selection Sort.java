The task is to complete the insert() function which is used to implement Insertion Sort.

  

class Solution
{
  static void insert(int arr[],int i)
  {
       // Your code here
       int n= arr.length;
       for(i=0; i< n;i++){
           int curr=arr[i];
            int j=i-1;
            while(j>=0 && curr < arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=curr;
       }
       
       
  }
  //Function to sort the array using insertion sort algorithm.
  public void insertionSort(int arr[], int n)
  {
      //code here
      for( int a =0; a<arr.length;a++){
          insert(arr, n);
      }
    
  }
}
