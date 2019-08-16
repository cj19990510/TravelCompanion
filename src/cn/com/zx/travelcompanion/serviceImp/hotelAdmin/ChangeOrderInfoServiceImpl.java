package cn.com.zx.travelcompanion.serviceImp.hotelAdmin;

import cn.com.zx.travelcompanion.bean.OrderInfoBean;
import cn.com.zx.travelcompanion.dao.hotelAdmin.OrderInfoDao;
import cn.com.zx.travelcompanion.daoimp.hotelAdmin.OrderInfoDaoImpl;
import cn.com.zx.travelcompanion.service.hotelAdmin.ChangeOrderInfoService;

public class ChangeOrderInfoServiceImpl implements ChangeOrderInfoService{
        
	OrderInfoDao oid=new OrderInfoDaoImpl();
	@Override
	public Boolean changeOrder(int orderid, String state) {
		// TODO Auto-generated method stub
			return oid.updateOrderInfo(orderid, state);
		
	}

}
