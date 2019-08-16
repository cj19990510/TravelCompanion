package cn.com.zx.travelcompanion.dao.hotelAdmin;

import java.util.List;
import cn.com.zx.travelcompanion.bean.OrderInfoBean;

public interface OrderInfoDao {
	//获取此酒店的全部订单信息
	public List<OrderInfoBean> getOrderInfo(int hotelid);
	//获取此酒店的未接单信息
	public List<OrderInfoBean>  getWOrderInfo(int hotelid,String orderState);
	//改变此订单状态
	public  Boolean updateOrderInfo(int i, String string);
	//通过订单号获取订单信息
	public OrderInfoBean getOrderInfoByOrderid(int orderid);
	
}
