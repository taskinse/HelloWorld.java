package loops.do_while_loops;

public class UnderstandingDoWhileLoop {
    public static void main(String[] args) {
        /*
        no difference in the outcome. But the difference is when you change the start
         */
        System.out.println("\n ===== do while loop ======");
        int i =0;
        do {
            System.out.println(i); // 0 . block first and then the conditioin (0)
            i++;
        }
        while (i<5);
        System.out.println("\n ===== while loop ======");
        int j=0;
        while(j<5){
            System.out.println(j); // will not give anything if you switch to >0
            j++;
        }
        System.out.println("End of the Program");
    }
}
