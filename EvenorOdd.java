import java.util.*;

public class EvenorOdd {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println((num&1)==0?"even":"odd");
    }
}