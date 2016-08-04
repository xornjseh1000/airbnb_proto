package book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import global.Constants;
import host.CityBean;

public class BookDAO {
	private static BookDAO instance = new BookDAO();
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;

	static BookDAO getInstance() {
		return instance;
	}
	private BookDAO() {
		try {
			Class.forName(Constants.ORACLE_DRIVER);
			con = DriverManager.getConnection(
					Constants.ORACLE_URL,
					Constants.USER_ID,
					Constants.USER_PW);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public int regist(BookCityBean bean) {
		int result = 0;
		String sql = "insert into book_member(seq2,address,check_in,check_out,explain,"
				+ "review,price,option2,local2,facilities,"
				+ "policy,house_type,language,photo,room,"
				+ "toilet,bed,count,id) "
				+ "values(seq2.nextval,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bean.getAddress());
			pstmt.setString(2, bean.getCheckIn());
			pstmt.setString(3, bean.getCheckOut());
			pstmt.setString(4, bean.getExplain());
			pstmt.setString(5, "default");
			pstmt.setString(6, "default");
			pstmt.setString(7, "default");
			pstmt.setString(8, "default");
			pstmt.setString(9, bean.getFacilities());
			pstmt.setString(10, "default");
			pstmt.setString(11, bean.getHouseType());
			pstmt.setString(12, "default");
			pstmt.setString(13, "default");
			pstmt.setInt(14, bean.getRoom());
			pstmt.setInt(15, bean.getToilet());
			pstmt.setInt(16, bean.getBed());
			pstmt.setInt(17, bean.getCount());
			pstmt.setString(18, bean.getId());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	public List<CityBean> list(String id) {
		String sql = "select * from book_member where id = ?";
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
			e.printStackTrace();
		}
		return list;
	}
	
	public BookCityBean check(String address) {
		String sql = "select * from book_member where address = ?";
		BookCityBean bean = null;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, address);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				bean = new BookCityBean();
				bean.setAddress(rs.getString("ADDRESS"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bean;
	}
	
	public void delete(String address) {
		String sql = "delete from book_member where address = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, address);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<?> search(String address) {
		String sql = "select * from city_member where address like ?";
		List<CityBean> list = new ArrayList<CityBean>();
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, address+"%");

			System.out.println("DAO Address2 "+ address);
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
			e.printStackTrace();
		}
		return list;
}
}

