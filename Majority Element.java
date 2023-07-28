Given an array A of N elements. Find the majority element in the array. A majority element in an array A of size N is an element that appears more than N/2 times in the array.



  

//User function Template for Java

class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here
        int count=1;
        int res=0;
        for(int i=0;i<size;i++){
            if(a[i]==a[res]){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                count=1;
                res=i;
            }
        }
         count = 0;
        for(int i=0; i<size; i++) {
            if(a[res] == a[i])
               count++;
        }
        return (count > size/2) ? a[res] : -1;
    }
}
