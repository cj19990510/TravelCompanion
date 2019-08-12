package cn.com.zx.travelcompanion.bean;

import java.sql.Timestamp;

public class RemarkInfoBean {
	public int remarkId;//评论id
	public int userId;//评论用户id
    public String remark;//评论
	public double remarkLevel;//评论等级
    public Timestamp remarkTime;//评论时间
    private String hotleName;
    
	public int getRemarkId() {
		return remarkId;
	}
	public void setRemarkId(int remarkId) {
		this.remarkId = remarkId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public double getRemarkLevel() {
		return remarkLevel;
	}
	public void setRemarkLevel(double remarkLevel) {
		this.remarkLevel = remarkLevel;
	}
	public Timestamp getRemarkTime() {
		return remarkTime;
	}
	public void setRemarkTime(Timestamp remarkTime) {
		this.remarkTime = remarkTime;
	}
	public String getHotleName() {
		return hotleName;
	}
	public void setHotleName(String hotleName) {
		this.hotleName = hotleName;
	}
	@Override
	public String toString() {
		return "RemarkInfoBean [remarkId=" + remarkId + ", userId=" + userId + ", remark=" + remark + ", remarkLevel="
				+ remarkLevel + ", remarkTime=" + remarkTime + ", hotleName=" + hotleName + "]";
	}
	
	
}
