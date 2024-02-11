import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.Date;

public class DataPractive {


    public static void main(String[] args) {

        LocalDate l = LocalDate.now();
        System.out.println(l);

        LocalDate furtureDate = l.plusDays(5);



    }

}
