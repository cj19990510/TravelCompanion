package cn.com.zx.travelcompanion.servlet.hotelAdmin;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.com.zx.travelcompanion.DB.RowMapper;
import cn.com.zx.travelcompanion.bean.RoomByTypeBean;
import cn.com.zx.travelcompanion.bean.RoomInfoBean;
import cn.com.zx.travelcompanion.service.hotelAdmin.TongJiRoomService;
import cn.com.zx.travelcompanion.service.hotelAdmin.getRoomInfoService;
import cn.com.zx.travelcompanion.serviceImp.hotelAdmin.TongJiRoomServiceImpl;
import cn.com.zx.travelcompanion.serviceImp.hotelAdmin.getRoomInfoServiceImpl;




@WebServlet("/getRoomInfoServlet")
public class getRoomInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//获取房间信息 

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    //获取此酒店全部房间信息 
	    //将他们存入
		HttpSession session = req.getSession();	 
	    getRoomInfoService gri=new getRoomInfoServiceImpl();
	    Object a=session.getAttribute("hotelid");//获取酒店id
		int hotelid=(int) a;
		List<RoomInfoBean> ri= gri.getRoomInfo(hotelid);
		
		
		
		//创建rt保存
		ArrayList<String> hoteltype=new ArrayList<String>();
		
		TongJiRoomService tj=new TongJiRoomServiceImpl();
		ArrayList<BigDecimal> RoomPrice=new ArrayList<BigDecimal>();
		ArrayList<Integer> RoomAll=new ArrayList<Integer>();
		ArrayList<Integer> RoomE=new ArrayList<Integer>();
	    //获取此酒店所有的房间类型
		for(int i=0;i<ri.size();i++)
	    {
	    	int flag=0;
	    	for(int j=0;j<hoteltype.size();j++)
	    		{
	    		if(ri.get(i).roomType.equals(hoteltype.get(j)))
	    				    	flag=1;
	    			
	    		}
	    	if(flag==0)
	    		{
	    		hoteltype.add(ri.get(i).roomType);
	    	
	    		}
	    }
	    
		
		RoomByTypeBean rit=new RoomByTypeBean();
	

		for(int i=0;i<hoteltype.size();i++){
			
			RoomPrice.add(tj.getPriceByType(hoteltype.get(i),hotelid));
			RoomAll.add(tj.getAllRoomByType(hoteltype.get(i),hotelid));
			 RoomE.add(tj.getEmRoomByType(hoteltype.get(i),hotelid));
		}
	for(int i=0;i<hoteltype.size();i++)
		{		
			rit.setRoomType(hoteltype.get(i));
			rit.setEmptyRoom(tj.getEmRoomByType(hoteltype.get(i),hotelid));
			rit.setAllRoom(tj.getAllRoomByType(hoteltype.get(i),hotelid));
			rit.setRoomPrice(tj.getPriceByType(hoteltype.get(i),hotelid));
			
		}
 System.out.println(RoomPrice);

	
	  session.setAttribute("RoomE",RoomE);
	
	  session.setAttribute("RoomAll",RoomAll);
   
         session.setAttribute("RoomPrice",RoomPrice);
	
	     session.setAttribute("hoteltype",hoteltype);
	
	     //获取此酒店此类型的其他数据
	     req.getRequestDispatcher("dist/html/pages/Room.jsp").forward(req, resp);
			
	    
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		doGet(request, response);
	}

}
