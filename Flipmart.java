import java.util.Scanner;

public class Flipmart {

    // Method to remove stop words from comments
    public String[] stopwordremoval(String[] comments) {
        String[] stopWords = { "the", "a", "for", "of", "and", "in", "on", "at", "to", "with" }; // Stop words array
        String[] processedComments = new String[comments.length];

        for (int i = 0; i < comments.length; i++) {
            String processedComment = "";
            String[] words = comments[i].split(" ");
            for (String word : words) {
                boolean isStopWord = false;
                for (String stopWord : stopWords) {
                    if (word.toLowerCase().equals(stopWord)) {
                        isStopWord = true;
                        break;
                    }
                }
                if (!isStopWord) {
                    processedComment += word + " ";
                }
            }
            processedComments[i] = processedComment.trim();
        }

        return processedComments;
    }

    public void printWordFrequency(String[] processedComments) {
        // Arrays to store unique words and their corresponding frequencies
        String[] uniqueWords = new String[processedComments.length * 10]; // Assuming each comment has maximum 10 words
        int[] frequencies = new int[processedComments.length * 10];
        int index = 0; // Current index in uniqueWords array

        for (String comment : processedComments) {
            String[] words = comment.split("\\s+");
            for (String word : words) {
                boolean isNewWord = true;
                // Check if word is already present in uniqueWords
                for (int i = 0; i < index; i++) {
                    if (uniqueWords[i].equalsIgnoreCase(word)) {
                        frequencies[i]++;
                        isNewWord = false;
                        break;
                    }
                }
                if (isNewWord) {
                    uniqueWords[index] = word;
                    frequencies[index] = 1;
                    index++;
                }
            }
        }
        // Print the word frequency
        for (int i = 0; i < index; i++) {
            System.out.println(uniqueWords[i] + ": " + frequencies[i]);
        }
    }

    public static void main(String[] args) {
        Scanner comment_in = new Scanner(System.in);

        String[] comments = { "This is a comment", "Another comment with stop words" };
        Flipmart flipmart = new Flipmart();
        String[] processedComments = flipmart.stopwordremoval(comments);
        for (String comment : processedComments) {
            System.out.println(comment);
        }
        flipmart.printWordFrequency(processedComments);
    }
}
