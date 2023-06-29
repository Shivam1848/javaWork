import java.util.Scanner;
public class linearsearch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);


        System.out.print("enter the target here:");
        int target=sc.nextInt();


        System.out.print("enter the size of array:");
        int size=sc.nextInt();


        int[] ar=new int[size];
        int result=0;

        for(int i=0;i<size;i++){
            ar[i]=sc.nextInt();
            if(target==ar[i]){
                result=i;
            }
        }
        System.out.println("\n Your item is at index->" +result );
}
    
}
