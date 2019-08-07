package cn.com.zx.travelcompanion.daoimp;

import java.util.List;

import cn.com.zx.travelcompanion.bean.PictureInfoBean;

public interface PictureInfoDaoImp {
     public List<PictureInfoBean> getPicture(int hotelid);
}
