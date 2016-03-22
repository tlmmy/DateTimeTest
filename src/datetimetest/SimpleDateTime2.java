/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datetimetest;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author trogers8
 */
public class SimpleDateTime2 {
    public static void main(String[] args) throws ParseException {
        //create simple date formatter
        String format = "M/d/yy h:mm:ss a";
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        DateFormat df = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);
        
        
        // current date and time
        Calendar date1 = Calendar.getInstance();
        System.out.println("Current: " + df.format(date1.getTime()));
        // add 30 days
        date1.add(Calendar.DATE, 30);
        System.out.println("Future: " + df.format(date1.getTime()));
        
        
        //turn string into date
        String dateString = "1/1/16 0:00:00 am";
        Date date2 = sdf.parse(dateString);
        sdf.format(date2);
        System.out.println(date2);
    }
}
