package cn.com.zx.travelcompanion.DB;
//酒店热度计算
/*酒店热度排名
预定量X，搜索量Y（一周），好评M，差评N，最后一次预定时间T1，最后一次搜索T2
时间衰减函数*/

import java.sql.Timestamp;

public class HotelHot {
	/*logX*8+logY*4+log(M-N)*6/(now-last)—log（T1+T2）*4*/
	public static int getHot(int X,int Y,int M,int N,Timestamp last,Timestamp T1,Timestamp T2) {
		Timestamp now=GetNowTime.getNowTime();
		double log =Math.log10(X)*8+Math.log10(Y)*4+Math.log10(M-N)*6/((now.getMinutes()-last.getMinutes())/60.0); 
		double log1=Math.log10((T1.getMinutes()+T2.getMinutes())/60.0)*4;
		int Hot=(int) (log-log1);
		return Hot;
	}
}
