import java.util.*;

public class Arrays1{
    
    public static int minmax(int a[]){
        int min = a[0];
        int max = 0;
        
        for(int i=0; i<a.length; i++){
            if(a[i]>max){
                max = a[i];
            }
            else if(a[i]<min){
                min = a[i];
            }
        }
        System.out.println("min = "+min);
        System.out.print("max = ");
        return max;
    }
    
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        int arr1[] = {3,5,4,1,9};
        int arr2[] = {22,14,8,17,35,3};
        int arr3[] = {3,2,1,56,1000,167};
        int arr4[] = {1,345,234,21,56789};
        
        System.out.println(minmax(arr1));
        System.out.println(minmax(arr2));
        System.out.println(minmax(arr3));
        System.out.println(minmax(arr4));
    }
}