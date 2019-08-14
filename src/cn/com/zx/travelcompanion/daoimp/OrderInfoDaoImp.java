package cn.com.zx.travelcompanion.daoimp;

import java.util.HashMap;
import java.util.List;

import cn.com.zx.travelcompanion.bean.IntAndInt;
import cn.com.zx.travelcompanion.bean.OrderInfoBean;

public interface OrderInfoDaoImp {
  public String[] getValueToAI(String type);
  public String getPersonValueToAI(String type,int userid);
  
  //订单查询
  public List<OrderInfoBean> getOrderInfoByuserid(int userid);
}
