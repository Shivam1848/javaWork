//in this it using external loop

class practice{
    public static void main(String args[]){
        int arr[] = {2,3,4,6,7};
        
        for(int n : arr){
            System.out.println(n);
            //plz read line 1
        }
        
        arr.forEach(n -> System.out.println(n));
    }
}