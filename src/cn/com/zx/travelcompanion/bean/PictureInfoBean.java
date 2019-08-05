package cn.com.zx.travelcompanion.bean;

//图片信息
public class PictureInfoBean {
	public int pictureId;//图片id
	public String pictureUrl;//图片路径
    public int hotelId;//酒店id
    
    public int getPictureId() {
		return pictureId;
	}
	public void setPictureId(int pictureId) {
		this.pictureId = pictureId;
	}
	public String getPictureUrl() {
		return pictureUrl;
	}
	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}
	public int getHotelId() {
		return hotelId;
	}
	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}


}
