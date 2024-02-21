package InternMethod;

public class InternPractice {

    public static void main(String[] args) {

        String s1 = "Abhinav";
        String s2 = "Abhinav";

        String s3 = new String("Abhinav");

        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);

        System.out.println(s1.equals(s3));
        System.out.println(s1==s3);

        s3 = s1.intern();

        System.out.println(s1.equals(s3));
        System.out.println(s1==s3);

//        throw new ArithmeticException();

    }
}
