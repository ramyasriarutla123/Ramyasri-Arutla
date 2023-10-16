public class PangramChecker {
    public static boolean isPangram(String input) {
        input = input.toLowerCase();
        boolean[] alphabetPresent = new boolean[26];
        int index;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if ('a' <= c && c <= 'z') {
                index = c - 'a';
                alphabetPresent[index] = true;
            }
        }

        for (boolean b : alphabetPresent) {
            if (!b) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String inputSentence = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = isPangram(inputSentence);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}