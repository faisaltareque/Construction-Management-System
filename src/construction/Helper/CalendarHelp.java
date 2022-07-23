/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construction.Helper;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author faisa
 */
public class CalendarHelp {    
    public static String getMeWeekday(){
        Date now = new Date(); 
        SimpleDateFormat simpleDateformat = new SimpleDateFormat("EEEE"); // the day of the week spelled out completely
        return simpleDateformat.format(now);
    } 
    
    public static String getCurrentMonth(){
        Date now = new Date();
        String mo="";
        int month=now.getMonth()+1;
        if(month<10){
             mo="-0"+String.valueOf(month)+"-";
        }else {
            mo="-"+String.valueOf(month)+"-";
        }
        return mo;
    }
}
