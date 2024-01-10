public class Capitalize {
    public static void main(String[] args) {
        String sentence = "the quick brown fox jumps over the lazy dog";
        System.out.println(capitalizeWords(sentence));
    }

    public static String capitalizeWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
        }

        return result.toString().trim();
    }
}

