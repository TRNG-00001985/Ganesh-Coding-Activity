public class WordCount {

    public static void main(String[] args) {
        String input = "This is an example";
        String[] words = input.split(" ");
        int wordCount = words.length;
        System.out.println("The number of words in the string is: " + wordCount);
    }
}
