public class tryCatchpractice {


    public static void main(String[] args) {


        System.out.println(method());

    }

    static int method(){
        try {
            int a = 1/0;
            return 1;
        }
        catch(Exception e){
            return 3;
        }
        finally {
            return 2;
        }
    }


}
