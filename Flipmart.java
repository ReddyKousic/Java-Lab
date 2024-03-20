public class Flipmart {

    public String[] stopwordremoval(String[] comments) {
        String[] stopWords = { "the", "a", "for", "of", "and", "in", "on", "at", "to", "with" }; // Stop words array
        String[] processedComments = new String[comments.length];
        System.out.println(comments.length);

        for (int i = 0; i < comments.length; i++) {
            StringBuilder processedComment = new StringBuilder();
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
                    processedComment.append(word).append(" ");
                }
            }
            processedComments[i] = processedComment.toString().trim();
        }

        return processedComments;
    }

    public static void main(String[] args) {
        String[] commnet = { "This is a Comment", "Products are bad", "Its not worth the price" };
        Flipmart n = new Flipmart();
        String[] processedComments = n.stopwordremoval(commnet);
        // System.out.println();
        for (String comment : processedComments) {
            System.out.println(comment);
        }
    }
}
