Given two strings a and b consisting of lowercase characters. The task is to check whether two given strings are an anagram of each other or not. An anagram of a string is another string that contains the same characters, only the order of characters can be different. For example, act and tac are an anagram of each other.


  

class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        
        // Your code here
        a=a.toLowerCase();
        b=b.toLowerCase();
        
        if(a.length()==b.length()){
            char[] charArray1 = a.toCharArray();
            char[] charArray2 = b.toCharArray();
            
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            
            
            boolean result=Arrays.equals(charArray1,charArray2);
            
            if(result){
            return true;
        }
        else{
            return false;
        }
        }
        return false;
    }
}
