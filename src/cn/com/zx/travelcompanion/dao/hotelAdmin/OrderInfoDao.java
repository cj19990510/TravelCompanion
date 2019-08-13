package cn.com.zx.travelcompanion.dao.hotelAdmin;

import java.util.List;
import cn.com.zx.travelcompanion.bean.OrderInfoBean;

public interface OrderInfoDao {
	//获取此酒店的用户信息
	public List<OrderInfoBean> getOrderInfo(int hotelid);
	
}
