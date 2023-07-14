/*Bobble BackgroundBobble Head
Refresh

Time (IST)	Status	Lang	Test Cases	Code
2023-06-15 14:52:08	Correct	java	335 / 335	View


//User function Template for Java*/


public class missingNum {
    
    public static int missingNumber(int A[])
    {
         int count = 1;
         int missing =0;
         int j=0;
         for(int i=0; i<A.length; i++)
         {
             if(A[j]==count)
             {
                 count++;
                 j=0;
             }
             else{
                 i=0;
                 j++;
                 missing = count;
                 if(j==A.length)
                 {
                     break;
                 }
             }
         }
         return missing;
    }
//ava.util.*;

/*public class missingNum {
    public static int mN(int arr[]){
        
        int count = 1;
        int index = 0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[index] == count){
                count++;
                index++;
            }
            else{
                index++;
                i--;
                if(index == arr.length){
                    if(arr[index] != count){
                        break;
                    }
                }
            }
        }
        
        return count;
    }*/
    
    public static void main(String args[]){
        
        int arr1[] = {1,4,3};
        int arr2[] = {2,5,3,1};
        
        missingNumber(arr1);
        missingNumber(arr2);
    }
}