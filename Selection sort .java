Given an unsorted array of size N, use selection sort to sort arr[] in increasing order.

  

class Solution
{
	int  select(int arr[], int i)
	{
        // code here such that selectionSort() sorts arr[]
        int n =arr.length;
        int min= arr[i];
        int j=i+1;
        int index = i;
        
        while(j<n){
            if(min>arr[j]){
                min = arr[j];
                index=j;
            }
            j++;
        }
        return index;
	}
	
	void selectionSort(int arr[], int n)
	{
	    //code here
	    for(int i=0; i<n-1;i++){
	        int index=select(arr,i);
	        int temp=arr[i];
	        arr[i]=arr[index];
	        arr[index]=temp;
	    }
	}
}
