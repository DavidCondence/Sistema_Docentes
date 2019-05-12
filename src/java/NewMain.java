
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class NewMain {

public static void main(String [] args){
    String dateString = "2015-07-16 17:07:21";
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    Date date;
    try {
        date = sdf.parse(dateString);
    } catch (ParseException e) {
        e.printStackTrace();
        return;
    } 
    System.out.println(date); // Displays date in it's default format Jul 16 17:00:21 IST 2015
    System.out.println(dateString.equals(date)); // Returns false since 'Jul 16 17:00:21 IST 2015' is not equal to dateString (2015-07-16 17:07:21)
}
    
}
