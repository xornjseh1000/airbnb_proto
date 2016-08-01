package guide;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import global.Constants;

public class GuideBookDAO {
	Connection con;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	
private static GuideBookDAO instance = new GuideBookDAO();

public static GuideBookDAO getInstance() {
	return instance;
}

private GuideBookDAO() {
	try {
		Class.forName(Constants.ORACLE_DRIVER);
		con = DriverManager.getConnection(Constants.ORACLE_URL, Constants.USER_ID, Constants.USER_PW);
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}

