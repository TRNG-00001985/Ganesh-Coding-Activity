class MostCommomCharacter {

    public static void main(String[] args) {
        String input = "abracadabra";
        input = input.toLowerCase();
        int[] frequency = new int[256]; 
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            frequency[c]++;
        }
        char mostCommonChar = '\0';
        int maxCount = 0;

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > maxCount) {
                mostCommonChar = (char) i;
                maxCount = frequency[i];
            }
        }
        System.out.println("The most common character is: " + mostCommonChar);
        System.out.println("It appears " + maxCount + " times.");
    }
}
