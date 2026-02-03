package ex01_connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 교수의 번호,이름,id,입사일,급여,보너스,학과코드를 화면에 출력하기
 */
public class Exam01 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn = DriverManager.getConnection
				("jdbc:mariadb://localhost:3306/gdjdb","gduser","1234");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery
		("select no,name,id,hiredate,salary,bonus,deptno from professor");
		while(rs.next()) {
			System.out.print("번호:"+rs.getString("no"));
			System.out.print(",이름:"+rs.getString(2));
			System.out.print(",아이디:"+rs.getString(3));
			System.out.print(",입사일:"+rs.getString(4));
			System.out.print(",급여:"+rs.getString(5));
			System.out.print(",보너스:"+rs.getString(6));
			System.out.println(",부서코드:"+rs.getString(7));
		}
	}
}

