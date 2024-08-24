public class ReverseWords {
    public static void main(String[] args) {
        String input = "MY NAME IS RAJA";
        String result = reverseEachWord(input);
        System.out.println(result);
    }

    private static String reverseEachWord(String s) {
        String[] words = s.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (String word : words) {
            reversed.append(new StringBuilder(word).reverse().toString()).append(" ");
        }
        return reversed.toString().trim();
    }
}
