import java.util.*;
import java.util.stream.Collectors;

public class SortMap{


    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, Integer> sortedMap = new HashMap<>();
        ArrayList<Integer> al = new ArrayList<Integer>();
        map.put("Abhinav", 2);
        map.put("Abhi", 4);
        map.put("Tiwari", 7);
        map.put("John", 6);
        map.put("Alex", 9);

        //sort by Keys.
        TreeMap<String, Integer> tm = new TreeMap<>(map);
        System.out.println(tm);

        sortedMap = sortByValue(map);

        for (Map.Entry<String, Integer> mm : sortedMap.entrySet()) {
            System.out.println(mm.getKey() + "--" + mm.getValue());
        }
    }

    public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm) {

        List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(hm.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
        HashMap<String, Integer> temp = new HashMap<String, Integer>();
        for (Map.Entry<String, Integer> m : list) {
            temp.put(m.getKey(), m.getValue());
        }
        return temp;
    }

}
