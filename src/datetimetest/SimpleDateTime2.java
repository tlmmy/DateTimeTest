/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datetimetest;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author trogers8
 */
public class SimpleDateTime2 {
    public static void main(String[] args) {
        //create simple date formatter
        SimpleDateFormat sdf = new SimpleDateFormat();
        
        // current date and time
        Calendar date1 = Calendar.getInstance();
        System.out.println("Current: " + date1);
        // add 30 days
        date1.add(Calendar.DATE, 30);
        System.out.println("Future: " + date1);
    }
}
