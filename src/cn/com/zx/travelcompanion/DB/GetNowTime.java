package cn.com.zx.travelcompanion.DB;

import java.sql.Timestamp;
import java.util.Date;

import org.junit.Test;

public class GetNowTime {
	public static Timestamp getNowTime(){
		Timestamp d = new Timestamp(System.currentTimeMillis()); 
		return d;
	}
}
