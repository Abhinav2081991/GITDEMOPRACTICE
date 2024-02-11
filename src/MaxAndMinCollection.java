import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxAndMinCollection   {

    public static void main(String[] args) {
//        maxAndMinCollection();

        rotateElementsOfAList();
    }

    public static void maxAndMinCollection(){

        List<Integer> list  = new ArrayList<>();
        list.add(1);
        list.add(6);
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(3);

        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));


    }

    public static void rotateElementsOfAList(){

        List<Integer> list  = new ArrayList<>();
        list.add(7);
        list.add(6);
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(3);

        System.out.println(list);
        Collections.rotate(list,3);
        System.out.println(list);

    }

}
