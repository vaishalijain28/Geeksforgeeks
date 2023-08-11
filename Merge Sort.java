Given an array arr[], its starting position l and its ending position r. Sort the array using merge sort algorithm.


  

class Solution
{
    void merge(int arr[], int l, int m, int r)
    {
         // Your code here
          int a[]=new int [m-l+1];
         int b[]= new int[r-m+1];
           int x=0;
         for(int i=l;i<=m;i++)
         {
             a[x]=arr[i];
             x++;
         }
         int y=0;
         for(int j=m+1;j<=r;j++)
         {
             b[y]=arr[j];
             y++;
         }
            int indx1=0;
         int indx2=0;
         int inc=l;
         while(indx1<x&&indx2<y)
         {
             if(a[indx1]<b[indx2])
             {
                 arr[inc]=a[indx1];
                 inc++;
                 indx1++;
             }
             else{
                  arr[inc]=b[indx2];
                 inc++;
                 indx2++;
             }
         }
         while(indx1<x){
              arr[inc]=a[indx1];
                 inc++;
                 indx1++;
         }
             
         while(indx2<y)
         {
              arr[inc]=b[indx2];
                 inc++;
                 indx2++;
    }
}
    void mergeSort(int arr[], int l, int r)
    {
        //code here
          if(l<r)
        {    int mid=(l+r)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
    }
}
