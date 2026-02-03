package ex01_connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
/*
 *  ResultSet executeQuery(sql) : select 구문 실행시 호출하는 메서드
 *                                조회된 레코드를 리턴
 *  int  executeUpdate(sql)     : select 구문 외 (create,insert,update, delete...)
 *                                실행시 호출하는 메서드
 *                                변경된 레코드의 건수 리턴
*/
public class MainEx02_update {
	public static void main(String[] args) throws Exception {
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn = DriverManager.getConnection
				("jdbc:mariadb://localhost:3306/gdjdb","gduser","1234");
		Statement stmt = conn.createStatement();
		String sql = "create table jdbctest1 (no int primary key, name varchar(30))";
		int result = stmt.executeUpdate(sql);
		System.out.println("result=" + result); //0 => create table 명령어는 레코드의 변경이 없음 
	}
}
