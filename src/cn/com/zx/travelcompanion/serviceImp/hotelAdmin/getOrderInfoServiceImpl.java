package cn.com.zx.travelcompanion.serviceImp.hotelAdmin;

import java.util.List;

import cn.com.zx.travelcompanion.bean.OrderInfoBean;
import cn.com.zx.travelcompanion.dao.hotelAdmin.OrderInfoDao;
import cn.com.zx.travelcompanion.daoimp.hotelAdmin.OrderInfoDaoImpl;
import cn.com.zx.travelcompanion.service.hotelAdmin.getOrderInfoService;

public class getOrderInfoServiceImpl implements getOrderInfoService{
    OrderInfoDao oid=new OrderInfoDaoImpl();
	@Override
	public List<OrderInfoBean> getOrderInfo(int hotelid) {
		List<OrderInfoBean> oi=oid.getOrderInfo(hotelid);
		
		return oi;
	}
	@Override
	public List<OrderInfoBean> getOrderInfoBy(int hotelid, String State) {
		// TODO Auto-generated method stub
  List<OrderInfoBean> oi=oid.getWOrderInfo(hotelid, State);
	
  return oi;
	
	}
	@Override
	public OrderInfoBean getOrderInfoByOrderid(int orderid) {
		// TODO Auto-generated method stub
		OrderInfoBean oi=oid.getOrderInfoByOrderid(orderid);
		return oi;
	}

}
