package ex01_connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * jdbctest1 테이블에 데이터 추가하기
 */
public class MainEx03_update {
	public static void main(String[] args) throws Exception {
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn = DriverManager.getConnection
				("jdbc:mariadb://localhost:3306/gdjdb","gduser","1234");
		Statement stmt = conn.createStatement();
		String sql = "insert into jdbctest1 values (2,'홍길동')";
		int result = stmt.executeUpdate(sql);
		System.out.println("result=" + result); //1 => 레코드가 변경된 갯수 리턴
		ResultSet rs = stmt.executeQuery("select * from jdbctest1");
		while(rs.next()) {
			System.out.print("번호:" + rs.getString(1));
			System.out.println(",이름:" + rs.getString(2));
		}
	}
}
