import java.util.*;
class ArraysEqual{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int array[]=new int[n];
        System.out.println("Array1");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        int array2[]=new int[n];
        System.out.println("Array2");
        for(int i=0;i<n;i++){
            array2[i]=sc.nextInt();
        }
        boolean equals=true;
        Arrays.sort(array);
        Arrays.sort(array2);
        for(int i=0;i<n;i++){
            if(array[i]!=array2[i]){
                equals=false;
            }
        }
        System.out.println(equals?"Both arrays are equal":"Both arrays are not equal");
        

    }
}