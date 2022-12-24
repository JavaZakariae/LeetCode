import java.util.Arrays;

//2114. Maximum Number of Words Found in Sentences
public class LeetCodeSolution2114 {
    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println("mostWordsFound(sentences) = " + mostWordsFound(sentences));
        //System.out.println("mostWordsFound(null) = " + mostWordsFound(new String[]{}));
    }
    public static int mostWordsFound(String[] sentences) {
        return
                Arrays.stream(sentences)
                      .mapToInt( sentence -> {
                                 String[] words = sentence.split("\\s");
                                 return words.length;
                      })
                      .max().orElse(0);
    }
}
