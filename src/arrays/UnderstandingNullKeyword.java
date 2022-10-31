package arrays;

public class UnderstandingNullKeyword {
    public static void main(String[] args) {

        String s = null;// "null" if in paranthesis this is separate. Null is a reserved keyword is an issue. not having a value. Null exception
        String [] objects = {"remote" , "null" , "", null};
        for(String object : objects) {
            System.out.println(object.toUpperCase());
        }
    }
}
