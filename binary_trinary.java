package DSA;
import java.util.Scanner;
public class binary_trinary {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be searched: ");
        int q=sc.nextInt();
        sc.close();



        int[] arr=new int[10000000];
        for(int i=0;i<10000000;i++){arr[i]=i;}
        



        System.out.println(" is at index "+"\n"+trinary(arr, q));
        
        // for(int i=0;i<10000000;i++){
        //     if(arr[i]!=trinary(arr,i)){
        //         System.out.println("problem is at index "+i+"\n"+trinary(arr, i));
        //         break;
        //     }
        // }
        
        
    }



 

    public static int trinary(int[] arr,int q){
        int lo=0,hi=arr.length-1,mid1=(hi+lo)/3,mid2=2*(hi+lo)/3;


        while(hi-lo>50){
            // System.out.println("mid1 is :"+mid1+"\n"+"mid2 is : "+mid2 );
            
            mid1=lo+((hi-lo)/3);mid2=lo+(2*(hi-lo)/3);
            
            if(arr[mid1]==q){
                return mid1;
            }
            else if(arr[mid2]==q){
                return mid2;
            }
            if(arr[mid1]>q){
                hi=mid1-1;
            }
            else if(arr[mid1]<q && q<arr[mid2]){
                lo=mid1+1;
                hi=mid2-1;
            }
            else if(arr[mid2]<q){
                lo=mid2+1;
            }            
        }
        
               return binary_helper(arr, q, lo, hi);

            
        
        
    }


    static int binary_helper(int[] arr,int q,int lo,int hi){
        
        while(hi>=lo){
            int mid=(hi+lo)/2;
            // System.out.println("mid is-> "+mid);
            
            
            if(arr[mid]==q){
                System.out.println("query is at index "+mid);
                return mid;
            }
            else if(arr[mid]>q){
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }       
        }

        return (-1);
    }




}

