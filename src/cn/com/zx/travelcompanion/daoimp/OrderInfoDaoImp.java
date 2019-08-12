package cn.com.zx.travelcompanion.daoimp;

import java.util.HashMap;
import java.util.List;

import cn.com.zx.travelcompanion.bean.IntAndInt;

public interface OrderInfoDaoImp {
  public String[] getValueToAI(String type);
  public String getPersonValueToAI(String type,int userid);
}
