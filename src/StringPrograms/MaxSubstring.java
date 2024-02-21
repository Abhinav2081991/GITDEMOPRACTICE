package StringPrograms;

public class MaxSubstring {


    public static void main(String[] args) {


           String str1 = "asdkjhshkashdkjahskdjh";
           String str2 = "hdkj";

//        System.out.println(str2.indexOf('j'));

           String[] strArray1 = str1.split("");
        String[] strArray2 = str2.split("");
           if(str1.contains(str2)) {

               for (int i = 0; i < strArray1.length; i++) {

                   for(int j =0; j<strArray2.length; i++){

                       if(strArray2[j].equals(strArray1[j])){

                           System.out.println(str1.indexOf(strArray1[j]));

                       }


                   }


               }
           }





    }


    public void test(int a, long b){

    }

    public void test(long a, int b){

    }
    

}
