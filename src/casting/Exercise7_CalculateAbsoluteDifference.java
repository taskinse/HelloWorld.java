package casting;

public class Exercise7_CalculateAbsoluteDifference {
    public static void main(String[] args) {
       /*
       find the absolute difference between s1 and s2
       find the absolute difference between s3 and s2
       find the absolute difference between s3 and s1

       Math.abs(i1-i2).sout when you put . when come out soutv
        */

        String s1="100",s2="150",s3="50";
        int i1=Integer.parseInt(s1), i2=Integer.parseInt(s2),i3=Integer.parseInt(s3);
        System.out.println(Math.abs(i1-i2));
        System.out.println(Math.abs(i3-i2));
        System.out.println(Math.abs(i3-i1));

    }
}
