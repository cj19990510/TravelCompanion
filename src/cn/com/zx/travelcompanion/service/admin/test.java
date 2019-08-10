package cn.com.zx.travelcompanion.service.admin;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class test {

	public static void main(String[] args) throws ParseException {

		String time="2019-07-08";
		System.out.println(time+1);
		//int time1=Integer.parseInt(time);
		//System.out.println(time1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
        String str1 = "2018-11-13";  
        String str=str1+" 00:00:00";
        Date dt = sdf.parse(str);  
        Calendar rightNow = Calendar.getInstance();  
        rightNow.setTime(dt);  
        rightNow.add(Calendar.YEAR, -1);// 日期减1年  
        System.out.println(sdf.format(rightNow.getTime()));  
          
        rightNow.add(Calendar.MONTH, 3);// 日期加3个月  
        System.out.println(sdf.format(rightNow.getTime()));  
          
        rightNow.add(Calendar.DAY_OF_YEAR, 10);// 日期加10天  
        System.out.println(sdf.format(rightNow.getTime()));
        
        String format = sdf.format(rightNow.getTime());
        String t= format.substring(0,str.indexOf(" "));
        System.out.println(t);

	}

}
