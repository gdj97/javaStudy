package ex02_preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 * 교수테이블에서 학과별 교수의 목록 출력하기
 *  출력컬럼 : 교수번호,이름,직급,급여,보너스,부서코드,입사일
 */
public class Exam01 {
	public static void main(String[] args) throws Exception {
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn = DriverManager.getConnection
				("jdbc:mariadb://localhost:3306/gdjdb","gduser","1234");
		PreparedStatement pstmt1 = conn.prepareStatement
				 ("select distinct deptno from professor where deptno is not null");
		PreparedStatement pstmt2 = conn.prepareStatement
				 ("select * from professor where deptno = ?"); //db에서 미리 번역하여 대기.
		ResultSet rs1 = pstmt1.executeQuery();
		while(rs1.next()) {
			int deptno = rs1.getInt(1);
			pstmt2.setInt(1,deptno);
			System.out.println("======" + deptno);
			ResultSet rs2 = pstmt2.executeQuery();
			while(rs2.next()) {
				System.out.printf("교수번호:%s,이름:%s,직급:%s,급여:%s,보너스:%s,부서코드:%s,입사일:%s\n",
						rs2.getString("no"),
						rs2.getString("name"),
						rs2.getString("position"),
						rs2.getString("salary"),
						rs2.getString("bonus"),
						rs2.getString("deptno"),
						rs2.getString("hiredate")
				);
			}
		}

	}
}
