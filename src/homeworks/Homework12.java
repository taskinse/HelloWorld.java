package homeworks;

import java.util.Arrays;

public class Homework12 {
    public static void main(String[] args) {
        System.out.println(" ====== Task-1 ===== ");
        String str1= "123Hello";
        System.out.println(noDigit(str1));

        System.out.println(" ====== Task-2 ===== ");
        String str2="TechGlobal";
        System.out.println(noVowel(str2));

        System.out.println(" ====== Task-3 ===== ");
        String str3="John's age is 29";
        System.out.println(sumOfDigits(str3));

        System.out.println(" ====== Task-4 ===== ");
        String str4="John's age is 29";
        System.out.println(hasUpperCase(str4));

        System.out.println(" ====== Task-5 ===== ");
        System.out.println(middleInt(5, 3, 5));

        System.out.println(" ====== Task-6 ===== ");
        int [] number6={13, 13, 13 , 13, 13};
        System.out.println(Arrays.toString(no13(number6)));

        System.out.println(" ====== Task-7 ===== ");
        int [] number7={1, 2, 3, 4};
        System.out.println(Arrays.toString(arrFactorial(number7)));

        System.out.println(" ====== Task-8 ===== ");
        String str8=" ";
        System.out.println(Arrays.toString(categorizeCharacters(str8)));
        }

    public static String noDigit(String str1){
        return str1.replaceAll("[0-9]", "");
    }
    public static String noVowel(String str2){
       return str2.replaceAll("[aeiouAEIOU]", "");

    }
    public static int sumOfDigits(String str3){
    int sum=0;
        for (int i = 0; i < str3.length(); i++) {
            if(Character.isDigit(str3.charAt(i)))
                sum+=Integer.parseInt(str3.substring(i,i+1));
        }
        return sum;
        }
    public static boolean hasUpperCase(String str4){
            for (int i = 0; i < str4.length(); i++) {
                if(Character.isUpperCase(str4.charAt(i)))return true;
            }
            return false;
        }
        public static int middleInt(int number1, int number2, int number3){
        int [] arr={number1,number2,number3};
        return arr[1];
        }
        public static int[] no13(int [] numbers6){
            for (int i = 0; i < numbers6.length; i++) {
              if(numbers6[i]==13)numbers6[i]=0;
                }
            return numbers6;
            }
        public static int[] arrFactorial(int [] numbers7){
            for (int i = 0; i < numbers7.length; i++) {
                if(numbers7[i]==0 || numbers7[1]==1)numbers7[i]=1;
                else{
                    int number=numbers7[i];
                    for (int j = 2; j < number ; j++) {
                        numbers7[i]*=j;
                    }
                }
            }
            return numbers7;
        }
        public static String [] categorizeCharacters(String str8){
            String [] arr = {"", "", ""};
            for (int i = 0; i < str8.length(); i++) {
                if(str8.charAt(i)== ' ')return  arr;
                if(Character.isLetter(str8.charAt(i)))arr[0]+=str8.charAt(i);
                else if(Character.isDigit(str8.charAt(i)))arr[1]+=str8.charAt(i);
                else arr[2]+=str8.charAt(i);
            }
            return arr;
        }
}



