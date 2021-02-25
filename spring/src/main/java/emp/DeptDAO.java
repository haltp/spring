package emp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DeptDAO {
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;

	private static DeptDAO instance;

	public static DeptDAO getinstance() {
		if (instance == null) {
			instance = new DeptDAO();
		}
		return instance;
	}

	public List<DeptVO> selectList() {
		ArrayList<DeptVO> list = new ArrayList<DeptVO>();
		DeptVO vo = null;
		try {
			conn = JdbcUtil.connect();
			String sql = "SELECT DEPARTMENT_ID, DEPARTMENT_NAME, MANAGER_ID, LOCATION_ID FROM DEPARTMENTS ORDER BY 1";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				vo = new DeptVO();
				vo.setDepartment_id(rs.getString("DEPARTMENT_ID"));
				vo.setDepartment_name(rs.getString("DEPARTMENT_NAME"));
			
				list.add(vo);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			JdbcUtil.disconnect(conn);
		}
		return list;
	}
}
