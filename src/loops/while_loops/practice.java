package loops.while_loops;

public class practice {
    public static void main(String[] args) {
        System.out.println(findFirstIndexOf("I love Java", 'a'));

        System.out.println(findLastIndexOf("I love Java", 'a'));

        System.out.println(clearChar("I love Java",'a'));
    }
    public static int findFirstIndexOf(String s, char c) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                return i;
            }
        }
            return -1;
        }
        public static int findLastIndexOf(String s, char c){
            for (int i = s.length()-1; i >0; i--) {
                if (s.charAt(i)== c){
                    return i;
                }
            }
            return -1;
        }
        public static String clearChar(String s, char c){
        String newS= "";
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != c) {
                    newS += s.charAt(i);
                }
            }
            return newS;
        }

        public static String clearWord(String s, String word) {
            if (word.length() > s.length()) ;
            String newS = "";
            for(int i = 0; i < s.length(); i++) { // i = s.length - 3
                if (!s.substring(i).startsWith(word)){
                    newS += s.charAt(i);
                }else {
                    i += word.length() - 1;
                }
            }
            return newS;
        }
}
