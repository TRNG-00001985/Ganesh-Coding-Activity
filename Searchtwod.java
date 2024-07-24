import java.util.*;
class Searchtwod{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int key=sc.nextInt();
        int m=sc.nextInt();
        int n=sc.nextInt();
        int a[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        boolean present=false;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(a[i][j]==key){
                    present=true;
                }
            }
        }
        System.out.println(present?"Yes":"NO");

    }
}