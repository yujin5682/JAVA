import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class EmpDAO {
	

	public static List<Emp> getEmpListByYear(int year) throws Exception {
		
		List<Emp> result = new ArrayList<>();
		Connection con = DBUtil.getConnection();
		Statement stmt = con.createStatement();
		String sql = "select * from employees where year(hire_date) = " + year;
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			double salary = rs.getDouble("salary");
			String lastName = rs.getString("last_name");
			String firstName = rs.getString("first_name");
			String hireDate = rs.getString("hire_date");
			
			Emp emp = new Emp();
			emp.salary = salary;
			emp.lastName = lastName;
			emp.firstName = firstName;
			emp.hireDate = hireDate;
			result.add(emp);
		}
		
		return result;
	}

}
