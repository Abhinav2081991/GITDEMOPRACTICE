package StringPracticePackage;

public class StringPalindrome {


    public static void main(String[] args) {

        String str = "PARAP";
        String[] strArray =  str.split("");
        String output = "";

        for(int i=strArray.length-1; i>=0;i--){
            output = output + strArray[i];
        }

        System.out.println(output);

        if(str.equals(output)){
            System.out.println("PALINDORME");
        }
        else{
            System.out.println("NOT PALINDORME");
        }

    }
}
