package host;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
		String sql = "insert into city_member(seq,address,explain,review,price,option2,local2,facilities,policy,house_type,language,photo,room,toilet,bed,count,id) values(seq.nextval,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			System.out.println(bean);
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bean.getAddress());
			pstmt.setString(2, bean.getExplain());
			pstmt.setString(3, "default");
			pstmt.setString(4, "default");
			pstmt.setString(5, "default");
			pstmt.setString(6, "default");
			pstmt.setString(7, bean.getFacilities());
			pstmt.setString(8, "default");
			pstmt.setString(9, bean.getHouseType());
			pstmt.setString(10, "default");
			pstmt.setString(11, "default");
			pstmt.setInt(12, bean.getRoom());
			pstmt.setInt(13, bean.getToilet());
			pstmt.setInt(14, bean.getBed());
			pstmt.setInt(15, bean.getCount());
			pstmt.setString(16, bean.getId());
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
	public void delete(String address) {
		String sql = "delete from city_member where address = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, address);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<CityBean> list() {
		String sql = "select * from city_member";
		List<CityBean> list = new ArrayList<CityBean>();
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				CityBean bean = new CityBean();
				bean.setAddress(rs.getString("ADDRESS"));
				bean.setExplain(rs.getString("EXPLAIN"));
				bean.setReview(rs.getString("REViEW"));
				bean.setPrice(rs.getString("PRICE"));
				bean.setOption(rs.getString("OPTION2"));
				bean.setLocal(rs.getString("LOCAL2"));
				bean.setFacilities(rs.getString("FACILITIES"));
				bean.setPolicy(rs.getString("POLICY"));
				bean.setHouseType(rs.getString("HOUSE_TYPE"));
				bean.setLanguage(rs.getString("LANGUAGE"));
				bean.setPhoto(rs.getString("PHOTO"));
				bean.setRoom(rs.getInt("ROOM"));
				bean.setToilet(rs.getInt("TOILET"));
				bean.setBed(rs.getInt("BED"));
				bean.setCount(rs.getInt("COUNT"));
				bean.setId(rs.getString("ID"));
				list.add(bean);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	public CityBean findBy(String seq) {
		String sql = "select * from city_member where address = ?";
		CityBean temp = null;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, seq);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				CityBean bean = new CityBean();
				bean.setAddress(rs.getString("ADDRESS"));
				bean.setExplain(rs.getString("EXPLAIN"));
				bean.setReview(rs.getString("REViEW"));
				bean.setPrice(rs.getString("PRICE"));
				bean.setOption(rs.getString("OPTION2"));
				bean.setLocal(rs.getString("LOCAL2"));
				bean.setFacilities(rs.getString("FACILITIES"));
				bean.setPolicy(rs.getString("POLICY"));
				bean.setHouseType(rs.getString("HOUSE_TYPE"));
				bean.setLanguage(rs.getString("LANGUAGE"));
				bean.setPhoto(rs.getString("PHOTO"));
				bean.setRoom(rs.getInt("ROOM"));
				bean.setToilet(rs.getInt("TOILET"));
				bean.setBed(rs.getInt("BED"));
				bean.setCount(rs.getInt("COUNT"));
				bean.setId(rs.getString("ID"));
				temp=bean;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return temp;
	}
	public List<?> myhost(String id) {
		String sql = "select * from city_member where id = ?";
		List<CityBean> list = new ArrayList<CityBean>();
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				CityBean bean = new CityBean();
				bean.setAddress(rs.getString("ADDRESS"));
				bean.setExplain(rs.getString("EXPLAIN"));
				bean.setReview(rs.getString("REViEW"));
				bean.setPrice(rs.getString("PRICE"));
				bean.setOption(rs.getString("OPTION2"));
				bean.setLocal(rs.getString("LOCAL2"));
				bean.setFacilities(rs.getString("FACILITIES"));
				bean.setPolicy(rs.getString("POLICY"));
				bean.setHouseType(rs.getString("HOUSE_TYPE"));
				bean.setLanguage(rs.getString("LANGUAGE"));
				bean.setPhoto(rs.getString("PHOTO"));
				bean.setRoom(rs.getInt("ROOM"));
				bean.setToilet(rs.getInt("TOILET"));
				bean.setBed(rs.getInt("BED"));
				bean.setCount(rs.getInt("COUNT"));
				bean.setId(rs.getString("ID"));
				list.add(bean);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}
