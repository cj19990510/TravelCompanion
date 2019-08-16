package cn.com.zx.travelcompanion.bean;

import java.math.BigDecimal;

public class RoomByTypeBean {
	private String roomType;
	private  BigDecimal roomPrice;
	private int allRoom;
	private int emptyRoom;
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public BigDecimal getRoomPrice() {
		return roomPrice;
	}
	public void setRoomPrice(BigDecimal roomPrice) {
		this.roomPrice = roomPrice;
	}
	public int getAllRoom() {
		return allRoom;
	}
	public void setAllRoom(int allRoom) {
		this.allRoom = allRoom;
	}
	public int getEmptyRoom() {
		return emptyRoom;
	}
	public void setEmptyRoom(int emptyRoom) {
		this.emptyRoom = emptyRoom;
	}
	
	

}
