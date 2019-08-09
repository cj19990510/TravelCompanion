package cn.com.zx.travelcompanion.dao.admin;

import java.util.List;

import cn.com.zx.travelcompanion.bean.UserInfoBean;
import cn.com.zx.travelcompanion.bean.YongHuGL;

public interface YongHuGLDao {

	public List<UserInfoBean> chaxun(int userId);
	
	public List<YongHuGL> chaxunDingDan(int userId);

	public void shanchu(int userId);
}
