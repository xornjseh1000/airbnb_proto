package host;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import global.Constants;


public class CityDAO {
	Connection con;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	
	private static CityDAO instance = new CityDAO();
	private CityDAO() {
		try {
			Class.forName(Constants.ORACLE_DRIVER);
			con = DriverManager.getConnection(Constants.ORACLE_URL, Constants.USER_ID, Constants.USER_PW);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static CityDAO getInstance() {
		return instance;
	}
	public void insert(CityBean bean) {
		String sql = "insert into city(seq,address,explain,review,price,option2,local2,facilities,policy,house_type,language,photo,room,toilet,bed,id) values(seq.nextval,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			System.out.println(bean);
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bean.getAddress());
			pstmt.setString(2, bean.getExplain());
			pstmt.setString(3, "default");
			pstmt.setString(4, "default");
			pstmt.setString(5, "default");
			pstmt.setString(6, "default");
			pstmt.setString(7, "default");
			pstmt.setString(8, "default");
			pstmt.setString(9, bean.getHouseType());
			pstmt.setString(10, "default");
			pstmt.setString(11, "default");
			pstmt.setInt(12, bean.getRoom());
			pstmt.setInt(13, bean.getToilet());
			pstmt.setInt(14, bean.getBed());
			pstmt.setString(15, bean.getId());;
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void update(CityBean bean) {
		String sql = "update city set address=?, explain=?, review=?, price=?, option2=?, local2=?, facilities=?, policy=?, house_type=?, language=?, photo=?, room=?, toilet=?, bed=? where id=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bean.getAddress());
			pstmt.setString(2, bean.getExplain());
			pstmt.setString(3, bean.getReview());
			pstmt.setString(4, bean.getPrice());
			pstmt.setString(5, bean.getOption());
			pstmt.setString(6, bean.getLocal());
			pstmt.setString(7, bean.getFacilities());
			pstmt.setString(8, bean.getPolicy());
			pstmt.setString(9, bean.getHouseType());
			pstmt.setString(10, bean.getLanguage());
			pstmt.setString(11, bean.getPhoto());
			pstmt.setInt(12, bean.getRoom());
			pstmt.setInt(13, bean.getToilet());
			pstmt.setInt(14, bean.getBed());
			pstmt.setString(15, bean.getId());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void delete(CityBean bean) {
		String sql = "delete member where id = ? and pw = ? ";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bean.getId());
			pstmt.setString(2, bean.getPw());
			pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}