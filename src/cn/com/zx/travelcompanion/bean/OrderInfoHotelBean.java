package cn.com.zx.travelcompanion.bean;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class OrderInfoHotelBean {
	public int orderId;//订单id
    public int userId;//用户id
    public int hotelId;//酒店id
    public int roomId;//房间号
    public int dayNum;//预定天数
    public BigDecimal orderMoney;//订单金额
    public Timestamp orderTime;//订单时间
    public String orderState;//订单状态
    public Timestamp inTime;//入住时间
    public String hotelName;//酒店名
    public String pictureUrl;//酒店图片
    public String type;
    public String hotelInfomation;//
    public String getHotelInfomation() {
		return hotelInfomation;
	}
	public void setHotelInfomation(String hotelInfomation) {
		this.hotelInfomation = hotelInfomation;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
    public String getPictureUrl() {
		return pictureUrl;
	}
	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}

    
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getHotelId() {
		return hotelId;
	}
	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}
	public int getRoomId() {
		return roomId;
	}
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}
	public int getDayNum() {
		return dayNum;
	}
	public void setDayNum(int dayNum) {
		this.dayNum = dayNum;
	}
	public BigDecimal getOrderMoney() {
		return orderMoney;
	}
	public void setOrderMoney(BigDecimal orderMoney) {
		this.orderMoney = orderMoney;
	}
	public Timestamp getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(Timestamp orderTime) {
		this.orderTime = orderTime;
	}
	public String getOrderState() {
		return orderState;
	}
	public void setOrderState(String orderState) {
		this.orderState = orderState;
	}
	public Timestamp getInTime() {
		return inTime;
	}
	public void setInTime(Timestamp inTime) {
		this.inTime = inTime;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	@Override
	public String toString() {
		return "OrderInfoBean [orderId=" + orderId + ", userId=" + userId + ", hotelId=" + hotelId + ", roomId="
				+ roomId + ", dayNum=" + dayNum + ", orderMoney=" + orderMoney + ", orderTime=" + orderTime
				+ ", orderState=" + orderState + ", inTime=" + inTime + ", hotelName=" + hotelName + ", pictureUrl="
				+ pictureUrl + ", type=" + type + "]";
	}
	
	
	
    
}

