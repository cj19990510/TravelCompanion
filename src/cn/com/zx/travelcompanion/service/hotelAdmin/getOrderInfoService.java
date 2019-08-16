package cn.com.zx.travelcompanion.service.hotelAdmin;

import java.util.List;
import cn.com.zx.travelcompanion.bean.OrderInfoBean;


//获取此酒店订单信息
public interface getOrderInfoService {
 //获取此酒店全部用户订单
	public List<OrderInfoBean> getOrderInfo(int hotelid);
 //获取状态为未接单的用户订单
	public List<OrderInfoBean> getOrderInfoBy(int hotelid,String State);
	//通过订单号获取订单信息
	public OrderInfoBean getOrderInfoByOrderid(int orderid);

}
