

package DateManipulations;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Dateformat {
    public static void main(String[] args) {
        Date mydate=new Date();
        
        //SimpleDateFormat dateformat=new SimpleDateFormat("MM/dd/YY");
        SimpleDateFormat dateformat=new SimpleDateFormat("dd/MM/YY");

        System.out.println(dateformat.format(mydate));
    }
}
//op:01/30/24
