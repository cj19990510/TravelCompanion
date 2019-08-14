package cn.com.zx.travelcompanion.service.admin;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import cn.com.zx.travelcompanion.dao.admin.ShouYiDao;
import cn.com.zx.travelcompanion.daoimp.admin.ShouYiDaoImpl;
import cn.com.zx.travelcompanion.bean.ChartBean;

public class ShouYiService {
	
   public int month(String stime,String etime){
	   ShouYiDao shouYiDao=new ShouYiDaoImpl();
	   return shouYiDao.month(stime, etime);
   }
	
	public int months(String stime,String etime){
		ShouYiDao shouYiDao=new ShouYiDaoImpl();
		  return shouYiDao.months(stime, etime);
	}
	
	public int chauxun(String time) throws ParseException{
		ShouYiDao shouYiDao=new ShouYiDaoImpl();
		  return shouYiDao.chaxun(time);
	}

	public List<ChartBean> chart() throws ParseException{
		List<ChartBean> list=new ArrayList<ChartBean>();
		
		int y1=chauxun("2019-08-13");
		int y2=chauxun("2019-08-12");
		int y3=chauxun("2019-08-11");
		int y4=chauxun("2019-08-10");
		int y5=chauxun("2019-08-09");
		int y6=chauxun("2019-08-08");
		int y7=chauxun("2019-08-07");
		
		String x1="2019-08-13";
		String x2="2019-08-12";
		String x3="2019-08-11";
		String x4="2019-08-10";
		String x5="2019-08-09";
		String x6="2019-08-08";
		String x7="2019-08-07";
		
		ChartBean  ChartBean1=new ChartBean();
			ChartBean1.setX(x7);
			ChartBean1.setY(y7);
			list.add(ChartBean1);
		
			ChartBean  ChartBean2=new ChartBean();
			ChartBean2.setX(x6);
			ChartBean2.setY(y6);
			list.add(ChartBean2);
			
			ChartBean  ChartBean3=new ChartBean();
			ChartBean3.setX(x5);
			ChartBean3.setY(y5);
			list.add(ChartBean3);
			
			ChartBean  ChartBean4=new ChartBean();
			ChartBean4.setX(x4);
			ChartBean4.setY(y4);
			list.add(ChartBean4);
			
			ChartBean  ChartBean5=new ChartBean();
			ChartBean5.setX(x3);
			ChartBean5.setY(y3);
			list.add(ChartBean5);
			
			ChartBean  ChartBean6=new ChartBean();
			ChartBean6.setX(x2);
			ChartBean6.setY(y2);
			list.add(ChartBean6);
			
			ChartBean  ChartBean7=new ChartBean();
			ChartBean7.setX(x1);
			ChartBean7.setY(y1);
			list.add(ChartBean7);
		
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i).toString());
		}
		return list;
	}
	
}
