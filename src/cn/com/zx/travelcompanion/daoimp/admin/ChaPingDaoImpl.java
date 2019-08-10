package cn.com.zx.travelcompanion.daoimp.admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import cn.com.zx.travelcompanion.DB.DbUtil;
import cn.com.zx.travelcompanion.bean.RemarkInfoBean;
import cn.com.zx.travelcompanion.dao.admin.ChaPingDao;

public class ChaPingDaoImpl implements ChaPingDao {

	@Override
	public List<RemarkInfoBean> chaxunName(String hotelName) {
		String sql="select remarkinfo.remarkId,remarkinfo.userId,remarkinfo.remarkTime,remarkinfo.remark,hotelinfo.hotelname from remarkinfo,hotelinfo "
                +"where remarkinfo.hotelid=hotelinfo.hotelId and remarkinfo.remarkLevel<3 "
                +"and hotelinfo.hotelname=?";
  
          List<RemarkInfoBean> list=new  ArrayList<RemarkInfoBean>();
  
         Connection con = null;
         PreparedStatement pre = null;
         ResultSet rs = null;
           try {
                 con = DbUtil.getConnection();
                 pre = con.prepareStatement(sql);
                 pre.setObject(1,hotelName);
                 rs = pre.executeQuery();
              while (rs.next()) {
            	  RemarkInfoBean remarkInfoBean=new RemarkInfoBean();
            	  remarkInfoBean.setRemarkId(rs.getInt(1));
            	  remarkInfoBean.setUserId(rs.getInt(2));
            	  remarkInfoBean.setRemark(rs.getString(4));
            	  remarkInfoBean.setRemarkTime(rs.getTimestamp(3));
            	  remarkInfoBean.setHotleName(rs.getString(5));
            	  
            	  list.add(remarkInfoBean);
      }
      } catch (Exception e) {
      e.printStackTrace();
     }	finally {
      DbUtil.closeConnection(con,pre,rs);
     }
       return list;
	}

	@Override
	public List<RemarkInfoBean> chaxun(String userId) {
		String sql="select remarkinfo.remarkId,remarkinfo.userId,remarkinfo.remarkTime,remarkinfo.remark,hotelinfo.hotelname from remarkinfo,hotelinfo "
                +"where remarkinfo.hotelid=hotelinfo.hotelId and remarkinfo.remarkLevel<3 "
                +"and remarkinfo.userId=?";
  
          List<RemarkInfoBean> list=new  ArrayList<RemarkInfoBean>();
  
         Connection con = null;
         PreparedStatement pre = null;
         ResultSet rs = null;
           try {
                 con = DbUtil.getConnection();
                 pre = con.prepareStatement(sql);
                 pre.setObject(1,userId);
                 rs = pre.executeQuery();
              while (rs.next()) {
            	  RemarkInfoBean remarkInfoBean=new RemarkInfoBean();
            	  remarkInfoBean.setRemarkId(rs.getInt(1));
            	  remarkInfoBean.setUserId(rs.getInt(2));
            	  remarkInfoBean.setRemark(rs.getString(4));
            	  remarkInfoBean.setRemarkTime(rs.getTimestamp(3));
            	  remarkInfoBean.setHotleName(rs.getString(5));
            	  
            	  list.add(remarkInfoBean);
      }
      } catch (Exception e) {
      e.printStackTrace();
     }	finally {
      DbUtil.closeConnection(con,pre,rs);
     }
       return list;
	}

	public String show1(String userid) {
		String sql ="select * from remarkinfo where userId=?";
		
		Connection con = null;
        PreparedStatement pre = null;
        ResultSet rs = null;
        String res="0";
        try {
            con = DbUtil.getConnection();
            pre = con.prepareStatement(sql);
            pre.setObject(1,userid);
            rs = pre.executeQuery();
            while (rs.next()){
                res="1";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            DbUtil.closeConnection(con,pre,rs);
        }
        return res;
		}
	
	public String show(String hotelname) {
		String sql ="select * from hotelinfo where hotelname=?";
		
		Connection con = null;
        PreparedStatement pre = null;
        ResultSet rs = null;
        String res="0";
        try {
            con = DbUtil.getConnection();
            pre = con.prepareStatement(sql);
            pre.setObject(1,hotelname);
            rs = pre.executeQuery();
            while (rs.next()){
                res="1";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            DbUtil.closeConnection(con,pre,rs);
        }
        return res;
		}
}
