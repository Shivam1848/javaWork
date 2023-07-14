import java.util.*;

public class negNumEnd  {
    public static void fun(int arr[]){
        int newarr[] = new int[arr.length];
        int count =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>=0){
                newarr[count] = arr[i];
                count++;
            }
        }
        
        for(int i= 0; i<arr.length; i++){
            if(arr[i]<0){
                newarr[count] = arr[i];
                count++;
            }
        }
        
        for(int i=0; i<arr.length; i++){
            System.out.print(newarr[i]+" ");
        }
        System.out.println();
    }
    
    public static void main(String args[]){
        int arr1[] ={1,-1,3,2,-7,-5,11,6};
        int arr2[] ={-5,7,-3,-4,9,10,-1,11};
        
        fun(arr1);
        fun(arr2);
    }
}