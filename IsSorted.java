import java.util.*;
class contains{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        boolean issorted=true;
        if(array[0]<array[1]){
        for(int i=1;i<n-2;i++){
            for(int j=2;j<n-1;j++){
                if(array[i]>array[j]){
                    issorted=false;
                }
            }
        }
        }
        else{
            for(int i=1;i<n-2;i++){
            for(int j=2;j<n-1;j++){
                if(array[i]<array[j]){
                    issorted=false;
                }
            }
        }
        }
        System.out.println(issorted?"Yes it is sorted":"No it is not sorted");

    }
}