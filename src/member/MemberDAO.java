package member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import global.Constants;

public class MemberDAO {
	Connection con;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	private static MemberDAO instance = new MemberDAO();
	public static MemberDAO getInstance() {
		return instance;
	}
	private MemberDAO() {
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
	public int regist(MemberBean mBean){
		int result = 0;
		String sql = "insert into member(ID,PW,NAME,GENDER,EMAIL,BIRTH,PHONE,ADDRESS,INTRO,SNS,PROFILE_IMG) values(?,?,?,?,?,?,?,?,?,?,?);";
		try {
			pstmt = con.prepareStatement(sql);
	
			pstmt.setString(1, mBean.getId());
			pstmt.setString(2, mBean.getPw());
			pstmt.setString(3, mBean.getName());
			pstmt.setString(4, mBean.getGender());
			pstmt.setString(5, mBean.getEmail());
			pstmt.setString(6, mBean.getBirth());
			pstmt.setString(7, mBean.getPhone());
			pstmt.setString(8, mBean.getAddress());
			pstmt.setString(9, mBean.getIntro());
			pstmt.setString(10, mBean.getSns());
			pstmt.setString(11, mBean.getProfileImg());
			result = pstmt.executeUpdate();
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	
	public MemberBean findById(String findID) {
		String sql = "select * from member where id = ?";
		MemberBean temp = null; 
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, findID);
			rs = pstmt.executeQuery();
			if(rs.next()){
				temp = new MemberBean();
				temp.setId(rs.getString("ID"));
				temp.setPw(rs.getString("PW"));
				temp.setName(rs.getString("NAME"));
				temp.setGender(rs.getString("GENDER"));
				temp.setEmail(rs.getString("EMAIL"));
				temp.setBirth(rs.getString("BIRTH"));
				temp.setPhone(rs.getString("PHONE"));
				temp.setAddress(rs.getString("ADDRESS"));
				temp.setIntro(rs.getString("INTRO"));
				temp.setSns(rs.getString("SNS"));
				temp.setProfileImg(rs.getString("PROFILE_IMG"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return temp;
	}
	
	public boolean login(MemberBean mBean) {
		boolean loginCheck= false;
		if(mBean.getId()!=null && mBean.getPw()!=null){
			MemberBean member = this.findById(mBean.getId());
			if(member.getPw().equals(mBean.getPw())){
				loginCheck = true;
			}
		}
		System.out.println("===DAO=== 로그인 체크 : "+loginCheck);
		return loginCheck;
}

	public int update(MemberBean mBean){
		String sql = "update mBeanber set pw = ? , email = ?, phone = ?, address = ?, intro =?,"
				+ "sns = ?, profile_img = ?, where id = ?";
		int result = 0;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, mBean.getPw());
			pstmt.setString(2, mBean.getEmail());
			pstmt.setString(3, mBean.getPhone());
			pstmt.setString(4, mBean.getAddress());
			pstmt.setString(5, mBean.getIntro());
			pstmt.setString(6, mBean.getSns());
			pstmt.setString(7, mBean.getProfileImg());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (result==1) {
			System.out.println("===DAO=== 수정 성공");
		} else {
			System.out.println("===DAO=== 수정 실패");	
		}
		return result;
	}
		public int delete(MemberBean mBean) {
			String sql = "delete from member where id=? and pw = ?";
			int result = 0;
			try {
				pstmt=con.prepareStatement(sql);
				pstmt.setString(1, mBean.getId());
				pstmt.setString(2, mBean.getPw());
				result = pstmt.executeUpdate();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (result == 1) {
				System.out.println("성공");
			} else {
				System.out.println("실패");
			}
			return result;
		}

	}

}
