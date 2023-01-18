package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework15 {
    public static void main(String[] args) {
        System.out.println("------- TASK -1 -------");
        System.out.println(Arrays.toString(fibonacciSeries1(7)));
        System.out.println("------- TASK -2 -------");
        System.out.println(fibonacciSeries2(4));
        System.out.println("------- TASK -3 -------");
        System.out.println(Arrays.toString(findUniques(new int[]{8,9}, new int[]{9,8,9})));
        System.out.println("------- TASK -4 -------");
        System.out.println(isPowerOf3(81));
        System.out.println("------- TASK -5 -------");
        int [] numbers={};
        System.out.println(firstDuplicate(numbers));
    }
        public static int[] fibonacciSeries1(int n){

        int[] arr = new int[n];
        arr[0]=0;
        arr[1]=1;

        int firstNum=0;
        int secondNum=1;

            for (int i = 2; i < n; i++) {
                int nextNum=firstNum+secondNum;
                arr[i]=nextNum;
                firstNum=secondNum;
                secondNum=nextNum;
            }
            return arr;
        }
        public static int fibonacciSeries2(int nth){
        if(nth == 0)return 0;
        if(nth == 0)return 1;

        int firstNum=0;
        int secondNum=1;
        int nextNum=0;


            for (int i = 3; i <=nth; i++) {
                nextNum=firstNum+secondNum;
                firstNum=secondNum;
                secondNum=nextNum;
            }
            return nextNum;
        }
        public static int[] findUniques(int []a, int[] b){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

            for (int element :a) {
                list1.add(element);
            }
            for (int element: b) {
                list2.add(element);
            }
            for (int i = 0; i < list1.size(); i++) {
                if (!list.contains(list1.get(i)) && !list2.contains(list1.get(i))) list.add(list1.get(i));
            }
            for (int i = 0; i < list2.size(); i++) {
                if (!list.contains(list2.get(i)) && !list1.contains(list2.get(i))) list.add(list2.get(i));
            }
            int[] unique= new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                unique[i]=list.get(i);
            }
            return unique;
            }

        public static boolean isPowerOf3(int number){
        int power= 3;
        while(power<number){
                power=power*3;
            }
            return power ==number;
            }

        public static int firstDuplicate(int[] number){
        int duplicate = -1;
        int ifDuplicate = Integer.MIN_VALUE;
            for (int i = 0; i < number.length; i++) {
                for (int j = i+1; j < number.length; j++) {
                    if (number[i] == number[j] && j > ifDuplicate) {
                        duplicate = number[i];
                        ifDuplicate = j;
                    }
                }
            }
            return duplicate;
    }
}

