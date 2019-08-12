package cn.com.zx.travelcompanion.DB;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.com.zx.travelcompanion.bean.SearchInfoBean;


public class JdbcTemplate {
	//查询
	public <T> List<T> queryForList(RowMapper<T> mapper, String sql, Object[] params) throws ClassNotFoundException, IOException, SQLException{
		List<T> returnResult = new ArrayList<T>();
		Connection conn = null;
		PreparedStatement pre = null;
		ResultSet rs = null;
		try {
			conn = DbUtil.getConnection();
			pre = conn.prepareStatement(sql);
			setParams(params, pre);
			rs = pre.executeQuery();
			int rownum = 0;
			while (rs.next()) {
				rownum++;
				returnResult.add(mapper.mappingRow(rs, rownum));
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DbUtil.closeConnection(conn, pre, rs);
		}

		return returnResult;
	}
	//智能推荐
	public <T> List<T> recommend(RowMapper<T> mapper, String sql, Object[] params) throws ClassNotFoundException, IOException, SQLException{
		List<T> returnResult = new ArrayList<T>();
		Connection conn = null;
		PreparedStatement pre = null;
		ResultSet rs = null;
		try {
			conn = DbUtil.getConnection();
			for (Object t :params) {
				Object[] s=new Object[]{t};
				pre = conn.prepareStatement(sql);
				setParams(s, pre);
				rs = pre.executeQuery();
				int rownum = 0;
				while (rs.next()) {
					rownum++;
					returnResult.add(mapper.mappingRow(rs, rownum));
				}
			}
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DbUtil.closeConnection(conn, pre, rs);
		}

		return returnResult;
	}
	//更新
	public <T> int set(String sql, Object[] params) throws ClassNotFoundException, IOException, SQLException{
		Connection conn = null;
		PreparedStatement pre = null;
		try {
			conn = DbUtil.getConnection();
			pre = conn.prepareStatement(sql);
			setParams(params, pre);
			pre.execute();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DbUtil.closeConnection(conn, pre,null);
		}
		return 1;
	}

	protected void setParams(Object[] params, PreparedStatement pre) throws SQLException {
		if (params != null) {
			for (int i = 0; i < params.length; i++) {
				pre.setObject(i + 1, params[i]);
			}
		}
	}

}
