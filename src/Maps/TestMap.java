package Maps;

import java.util.HashMap;
import java.util.TreeMap;

public class TestMap {

    public static void main(String[] args) {


        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, null);
        map.put(2, null);
        map.put(3, null);
        map.put(4, null);
        map.put(5, null);
        map.put(6, null);

        System.out.println(map);
        // Output - {1=null, 2=null, 3=null, 4=null, 5=null, 6=null}

        TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();
        treemap.put(1, null);
        treemap.put(2, null);
        treemap.put(3, null);
        treemap.put(4, null);
        treemap.put(5, null);
        treemap.put(6, null);

        System.out.println(treemap);




    }
}
