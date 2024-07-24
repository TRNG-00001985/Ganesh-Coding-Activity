import java.util.*;
class Indexof{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int key=sc.nextInt();
        int n=sc.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        //linear
        int index=0;
        for(int i=0;i<n;i++){
            if(array[i]==key){
                index=i;
            }
        }
        System.out.println("Index of the given number is:"+index);

    }
}