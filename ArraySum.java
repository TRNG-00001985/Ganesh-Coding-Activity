import java.util.*;
class ArraySum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int array[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
            sum+=array[i];
        }
        System.out.println("Sum of Array is:"+sum);

    }
}