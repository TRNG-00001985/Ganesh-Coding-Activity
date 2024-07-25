class HexaToOcta {
  public static void main(String[] args) {
        String hexNumber = "1A3";
        int decimal = Integer.parseInt(hexNumber, 16);
        String octalResult = Integer.toOctalString(decimal);
        System.out.println("Hexadecimal " + hexNumber + " to Octal is " + octalResult);
    }
}


