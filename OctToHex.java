public class OctToHex {

    public static void main(String[] args) {
        String octalNumber = "643";
        int decimal = Integer.parseInt(octalNumber, 8);
        String hexResult = Integer.toHexString(decimal).toUpperCase();
        System.out.println("Octal " + octalNumber + " to Hexadecimal is " + hexResult);
    }
}
