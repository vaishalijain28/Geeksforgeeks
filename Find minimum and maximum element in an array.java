Given an array A of size N of integers. Your task is to find the minimum and maximum elements in the array.
Your Task:  
You don't need to read input or print anything. Your task is to complete the function getMinMax() which takes the array A[] and its size N as inputs and returns the minimum and maximum element of the array.

	
	//code 
 class Compute 
{
    static pair getMinMax(long a[], long n)  
    {
       
        long min=a[0];
				long max=a[0];
        for(int i=0; i<n; i++){
            if(min>a[i]){
                min=a[i];
            }
            if(max<a[i]){
                max=a[i];
            }
        }
        pair p=new pair(min,max);
        return p;
    }
}
