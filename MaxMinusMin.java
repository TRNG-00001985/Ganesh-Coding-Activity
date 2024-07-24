import java.util.*;
class MaxMinusMin{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int array[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        Arrays.sort(array);
        System.out.println("Minimum of Array is:"+array[0]);
        System.out.println("Maximum of Array is:"+array[n-1]);
        System.out.println("Maimum Minus Minimum is:"+ (array[n-1]-array[0]));

    }
}