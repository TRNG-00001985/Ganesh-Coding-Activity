import java.util.*;

public class Leap {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        boolean leapyear=false;
        if(year%400==0 || (year%4==0&&year%100!=0)){
            leapyear=true;
        }
        System.out.println(leapyear?"leap Year":"Not a Leap Year");
    }
}