package conditional_statements.if_else_statements;

public class IfElseSyntax {
    public static void main(String[] args) {
        /* IF BLOCK CAN BE USED BY ITSELF. BUT ELSE WITHOUT IF CANNOT.
        Needs a condition in if(condition).if (true) whatever below will be executed. vice versa.
        if(false==false) --. result will be true in this case.
        if or else statements are used to control the flow of the program based
        on conditions. Conditions are always boolean statements . true or false
         compiler error because expression need boolean
         if condition-executes with the condition true.
         else condition - executes with the condition false.
         BECAREFUL OF THE BRACKETS / BLOCKS.IF CLOSE BRACKETS THEN ELSE.
         Can you have if without else?ex: allergy to pollen. if i go out my allergy
         will make me feel bad. if not i am fine. IF CAN BE USED WITHOUT ELSE.
         If compiler becomes false. no result unless stated.
         can else be used without if?else doesn't make sence without if.
         getting privacy error/cookies. will use only if. agreed to enter. the next time didnt get.maybe will
         appear on website.accept the cookies ex same. next time is not giving the cookies.
         */
        boolean condition= true;
        if(condition){
            System.out.println("AAA");
        }
        else{ // if not that condition.
            System.out.println("BBB");
        }
        System.out.println("End of the program!"); // does not have to do with the condition
    }

}
