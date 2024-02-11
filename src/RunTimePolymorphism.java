import java.lang.reflect.Constructor;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class RunTimePolymorphism {
    public static void main(String[] args) {



        A a = new A();
        a.print();  // this will print A
        System.out.println("a-----"+a.integer);

        B b = new B();
        b.print();  // This will print B
        System.out.println("b-----"+b.integer);

         A a1  =  new B();
         a1.print();  // this will print B
        System.out.println("a1-----"+a1.integer);

         //B b1  =  new A();  // Compile time error
         // Reference variable of child class cannot call object of parent class

        //B b1  =  (B)new A();  // this will give ClassCastException


        A a3 = new C(); // new keyword allocate memory during the runtime.
        a3.print();  // this will print C
        // - reference variable of parent class refers to object of child class
        System.out.println("a3-----"+a3.integer);


        B b2 =  new C();
        b2.print();// this will print C
        // - reference variable of parent class refers to object of child class
        System.out.println("b2-----"+b2.integer);
        //Runtime Polymorphism is only possible for methods and not variables


        }

        public void test(){
            int i=0;
            for(;i<10; i++){
                System.out.println(i);
            }


        }
    }