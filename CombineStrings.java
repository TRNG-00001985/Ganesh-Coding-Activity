import java.util.*;
class CombineStrings{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        String s3;
        String s4;
        s3=s1+s2;
        s4=s1.concat(s2);
        System.out.println(s3);
        System.out.println(s4);

    }
}


