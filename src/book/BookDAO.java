package book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import global.Constants;
import host.CityService;
import host.CityServiceImpl;
import member.MemberBean;
import member.MemberService;
import member.MemberServiceImpl;

public class BookDAO {

	MemberService mService = MemberServiceImpl.getInstance();
	CityService cService = CityServiceImpl.getInstance();
	private static BookDAO instance = new BookDAO();

	Connection con;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;

	static BookDAO getInstance() {
		return instance;
	}

	private BookDAO() {
		try {
			Class.forName(Constants.ORACLE_DRIVER);
			con = DriverManager.getConnection(Constants.ORACLE_URL, Constants.USER_ID, Constants.USER_PW);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int book(BookBean bBean) {
		int result = 0;
		String sql = "insert into book(ADDRESS, CHECK_IN, CHECK_OUT, COUNT, ID) values(?,?,?,?,?)";
		try {
			pstmt = con.prepareStatement(sql);
			/*
			 * pstmt.setString(1, mService.getSession().getAddress()); // 멤버에서
			 * 어드레스
			 * System.out.println("어드레스 : "+mService.getSession().getAddress());
			 */
			pstmt.setString(1, cService.session().getAddress()); // 호스팅에서 어드레스
			System.out.println("어드레스 : " + cService.session().getAddress());
			pstmt.setString(2, bBean.getCheckIn());
			System.out.println("체크인 :" + bBean.getCheckIn());
			pstmt.setString(3, bBean.getCheckOut());
			System.out.println("체크아웃 :" + bBean.getCheckOut());
			pstmt.setInt(4, bBean.getCount());
			System.out.println("카운트 :" + bBean.getCount());
			pstmt.setString(5, mService.getSession().getId()); // 멤버에서 ID
			System.out.println("세션 저장된 아이디 : " + mService.getSession().getId());
			result = pstmt.executeUpdate();
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (result == 1) {
			System.out.println("예약성공");
		} else {
			System.out.println("예약실패");
		}
		return result;
	}

	public int cancel(BookBean bBean) {
		String sql = "delete from book where id=?";
		int result = 0;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, mService.getSession().getId());
			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		if (result == 1) {
			System.out.println("==BookDAO== 삭제성공");
		} else {
			System.out.println("==BookDAO== 삭제실패");
		}
		return result;
	}

	public int reigst(BookBean bBean) {
		int result = 0;
		String sql = "update book set CHECK_IN=?, CHECK_OUT=?, COUNT=? where id = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bBean.getCheckIn());
			pstmt.setString(2, bBean.getCheckOut());
			pstmt.setInt(3, bBean.getCount());
			pstmt.setString(4, mService.getSession().getId());
			pstmt.executeUpdate();
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public List<BookCityBean> search() {
		List<BookCityBean> list = new ArrayList<BookCityBean>();
		String sql = "";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		return list;
	}
}