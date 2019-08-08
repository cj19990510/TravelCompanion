package cn.com.zx.travelcompanion.DB;

import java.sql.Timestamp;

/**
 * @author 陈杰
 *
 */
/*城市热度排名
搜索量X 预定量Y 最后一次预定时间T1，最后一次搜索T2
logX*4+logY*8—log（T1+T2）*4*/
public class CityHot {
	public static int getHot(int X,int Y,Timestamp last,Timestamp T1,Timestamp T2) {
		Timestamp now=GetNowTime.getNowTime();
		double log =Math.log10(X)*8+Math.log10(Y)*4; 
		double log1=Math.log10((T1.getMinutes()+T2.getMinutes())/60.0)*4;
		int Hot=(int) (log-log1);
		return Hot;
	}
}
