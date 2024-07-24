import java.util.*;
class DoesNotContain{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int key=sc.nextInt();
        int n=sc.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        //linear
        boolean present=false;
        for(int i=0;i<n;i++){
            if(array[i]==key){
                present=true;
            }
        }
        System.out.println(present?"Yes":"NO");

    }
}