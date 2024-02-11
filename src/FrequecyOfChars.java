import java.util.*;

public class FrequecyOfChars {

    public static void main(String args[]){

        String inputString =  "dsfafsf sdfsd fsdf fffffff";
        String [] strArray = inputString.split("");
        ArrayList<String> list = new ArrayList<String>();
        for(int i=0; i<strArray.length; i++)
        {
            list.add(strArray[i].toString());
        }
        HashSet<String> hs = new HashSet<>(list);
        for(String s : hs){
            System.out.println(s + " is " + Collections.frequency(list, s)+ " times");
        }


        frequencyOfChars();
    }

    public static void frequencyOfChars(){

        String inputString =  "dsfafsf sdfsd fsdf fffffff";
        String [] strArray = inputString.split("");
        HashMap<String, Integer> hm = new HashMap<>();

        for(String s: strArray){
            if(hm.containsKey(s)){
                hm.put(s, hm.get(s)+1);
            }else{
                hm.put(s,1);
            }
        }
        for(Map.Entry m : hm.entrySet()){
            System.out.println(m.getKey()+ "--" + m.getValue());
        }


    }


}


// count[]
