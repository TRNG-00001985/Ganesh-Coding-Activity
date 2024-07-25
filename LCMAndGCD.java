public class LCMAndGCD {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 18;
        int gcd = num1;
        int tempNum2 = num2;
        while (tempNum2 != 0) {
            int temp = tempNum2;
            tempNum2 = gcd % tempNum2;
            gcd = temp;
        }
        int lcm = (num1 * num2) / gcd;
        System.out.println("GCD of " + num1 + " and " + num2 + " is " + gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " is " + lcm);
    }
}
