import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

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
    }


}
