import java.util.*;

public class Fibonacci Series{
    
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("how many number do you want in Fibbonacci series: ");
        int num = sc.nextInt();
        
        int sum=0;
        int temp = 1;
        int temp1=0;
        
        System.out.println(sum);
        
        for(int i=0; i<num-1; i++){
            temp1 = sum;
            sum=sum+temp;
            System.out.println(sum);
            temp=temp1;
        }
        
    }
}