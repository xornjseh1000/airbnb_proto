package community;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import global.Constants;

public class CommunityDAO {
	Connection con;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	
	
	private static CommunityDAO instance = new CommunityDAO();
	
	public static CommunityDAO getInstance() {
		return instance;
	}

	private CommunityDAO() {
		try {
			Class.forName(Constants.ORACLE_DRIVER);
			con = DriverManager.getConnection(Constants.ORACLE_URL, Constants.USER_ID, Constants.USER_PW);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void insert(CommunityBean bean) {
		String sql = "";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bean.getSymbol());
			pstmt.setString(2, bean.getStory());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void update(CommunityBean bean) {
		String sql = "";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bean.getSymbol());
			pstmt.setString(2, bean.getStory());
			pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void delete(CommunityBean bean) {
		String sql = "delete symbol where id = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bean.getId());
			pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}


