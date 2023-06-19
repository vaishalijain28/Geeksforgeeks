Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.
  

import java.io.*;
import java.util.*;

class Solution
{
    public static void sort012(int a[], int n)
    {
          int a0=0,a1=0,a2=0;
        for(int i=0;i<n;i++){
            if(a[i]==0)
            a0++;
            if(a[i]==1)
            a1++;
            if(a[i]==2)
            a2++;
        }
        
        int count = 0;
        while(a0>0 || a1>0 || a2>0){
            if(a0>0){
            a[count++] = 0;
            a0--;
            }
            else if(a1 > 0){
                a[count++]=1;
                a1--;
            }
            else if(a2>0){
                a[count++]=2;
                a2--;
            }
        }
    }
}

