import java.util.*;

public class binaryArraySorting{
    
    /*public static int swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println(a);
        return b;
        
    }
    */
    public static int fun(int arr[]){
        int low = 0;
        int high= arr.length-1;
        
        for(int i=0; i<arr.length; i++){
            if(arr[low] == 0){
                low++;
            }
            else if(arr[low] == 1){
                if(arr[high] == 0){
                    //swap(arr[low], arr[high]);
                    int temp = arr[low];
                    arr[low] = arr[high];
                    arr[high]= temp;
                }
                else{
                    high--;
                
                }
            }
            if(low == high){
                break;
            }
        }
        
        
        
        for(int i=0; i<arr.length-1; i++){
            System.out.print(arr[i]+" ");
        }
        return arr[arr.length-1];
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int arr1[] = {1,0,1,1,1,1,1,0,0,0};
        int arr2[] = {1,0,1,1,0};
        int arr3[] = {0,1,0,1,0,1};
        
        fun(arr1);
        fun(arr2);
        fun(arr3);
        
    }
}