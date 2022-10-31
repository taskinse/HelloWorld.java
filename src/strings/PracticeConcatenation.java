package strings;

public class PracticeConcatenation {
    public static void main(String[] args) {
        String wordPart1 ="le";
        String wordPart2 ="ar";
        String wordPart3 ="ning";
        String word = wordPart1 +wordPart2 + wordPart3;
        System.out.println(word);

        /*
        TASK 2
        String sentencePart1 = “I can”;
        String sentencePart2 = “learn Java”;
         */
        String sentencePart1 = "I can";
        String sentencePart2 = "learn Java";
        String sentence = sentencePart1.concat(" ").concat(sentencePart2).concat(".");
        System.out.println(sentence);



    }
}
