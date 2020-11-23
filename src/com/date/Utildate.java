package com.date;

import java.util.Date;
import java.text.SimpleDateFormat;
public class Utildate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Date d=new Date();
            System.out.println(d);
            System.out.println(d.getDate());
            System.out.println(d.getDay());
            System.out.println(d.getTimezoneOffset());
            System.out.println(d.getYear());
            System.out.println(d.toInstant());
            System.out.println(d.hashCode());
            System.out.println(d.after(d));
            System.out.println(d.before(d));
         
            
            
            
            SimpleDateFormat s=new SimpleDateFormat();
            
            System.out.println(s.toPattern());
            System.out.println(s.toLocalizedPattern());
            System.out.println(s.get2DigitYearStart());
            System.out.println(s.getDateFormatSymbols());
            
            
	}

}
