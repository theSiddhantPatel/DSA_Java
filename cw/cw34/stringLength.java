package cw34;

public class stringLength {
    public static void main(String[] args) {
        String paragraph = "I am a boy";
        String[] words = paragraph.trim().split("\\s+");
        int wordsCount = words.length;
        System.out.println(wordsCount);

    }
}
