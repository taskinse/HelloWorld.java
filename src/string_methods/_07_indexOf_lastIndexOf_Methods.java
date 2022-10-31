package string_methods;

public class _07_indexOf_lastIndexOf_Methods {
    public static void main(String[] args) {
        /*
        1.Return type
        2.returns int which matching index
        3.non-static envoke the method with an object.
        4.It takes a char or string. there are overload of method.

         */
        String company ="TechGlobal School";

        int firstIndexOf= company.indexOf('o');// 6 returns a int.
        System.out.println(firstIndexOf);
        int lastIndexOf=company.lastIndexOf('o'); //15
        System.out.println(lastIndexOf);

        //find the first and last indexes of l
        System.out.println(company.indexOf('l'));//5
        System.out.println(company.lastIndexOf('l')); //16

        System.out.println(company.indexOf('x'));//-1 because not found. when a developer wants to give you a message. gives -1
        System.out.println(company.indexOf("School"));//11


    }
}
