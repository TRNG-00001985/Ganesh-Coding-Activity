import java.util.*;
class ContainsDuplicates{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        Arrays.sort(array);
        boolean present=false;
        for(int i=1;i<n;i++){
            if(array[i]==array[i-1]){
                present=true;
            }
        }
        System.out.println(present?"Yes contains duplicate":"NO doesnot contain duplicate");

    }
}