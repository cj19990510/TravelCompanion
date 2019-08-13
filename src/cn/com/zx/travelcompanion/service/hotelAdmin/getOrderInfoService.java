package cn.com.zx.travelcompanion.service.hotelAdmin;

import java.util.List;
import cn.com.zx.travelcompanion.bean.OrderInfoBean;


//获取此酒店订单信息
public interface getOrderInfoService {
  public List<OrderInfoBean> getOrderInfo(int hotelid);
}
