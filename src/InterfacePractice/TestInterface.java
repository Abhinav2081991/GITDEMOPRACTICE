package InterfacePractice;

public interface TestInterface {


    public void test();

    default void testWIthBody(){
        System.out.println("Default Method with body");
    }

    static void testStaticMethodWithBody(){
        System.out.println("Static Default method with body");
    }


}
