import java.util.*;
class HardCodedLogin{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String Username="Ganesh";
        String Password="Ganesh@123";
        String Userinput=sc.nextLine();
        String Passwordinput=sc.nextLine();
        System.out.println(((Username.equals(Userinput))&&(Password.equals(Passwordinput)))?"You Loggedin Sucessfully":"Invalid Credationals");
    }
}