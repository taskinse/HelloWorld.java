package arrays;

import java.util.Arrays;

public class SearchingInAStringArray {
    public static void main(String[] args) {
        String[] objects = {"Remote", "Mouse", "Mouse", "Keyboard", "iPad"};

/*
TASK-1
Check the collection you have above and print true if it contains Mouse
Print false otherwise

RESULT:
true
*/
    Boolean hasMouse = false;
    for(String object : objects){
        if(object.equals("Mouse")){ // checking actual value don't use ==.
            hasMouse=true;
            break;// redundant. when its checking the mouse, 2nd time.
        }
    }
        System.out.println(hasMouse);
        System.out.println("\n-------- Binary Searching ---------\n");
        Arrays.sort(objects);
        System.out.println(Arrays.binarySearch(objects,"Mouse")>=0);// true
        System.out.println(Arrays.binarySearch(objects,"Computer")>=0);// false.
        System.out.println(Arrays.binarySearch(objects,"iPad")>=0);// true
    }
}
