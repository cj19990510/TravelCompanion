package cn.com.zx.travelcompanion.service.admin;

import java.util.List;

import cn.com.zx.travelcompanion.bean.UserInfoBean;
import cn.com.zx.travelcompanion.bean.YongHuGL;
import cn.com.zx.travelcompanion.dao.admin.YongHuGLDao;
import cn.com.zx.travelcompanion.daoimp.admin.YongHuGLDaoImpl;

public class YongHuService {
	
    public List<UserInfoBean> chaxun(int userId){
    	YongHuGLDao yongHuGLDao=new YongHuGLDaoImpl();
    	return yongHuGLDao.chaxun(userId);
    }
	
	public List<YongHuGL> chaxunDingDan(int userId){
		YongHuGLDao yongHuGLDao=new YongHuGLDaoImpl();
    	return yongHuGLDao.chaxunDingDan(userId);
	}

	public String show(int userId) {
		YongHuGLDao yongHuGLDao=new YongHuGLDaoImpl();
		return yongHuGLDao.show(userId);
	}

}
