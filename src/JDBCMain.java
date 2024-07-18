import java.util.List;
import java.util.Scanner;

public class JDBCMain {

	public static void main(String[] args) throws Exception {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("입사년도(0은 종료) : ");
		int year = scan.nextInt();
		while (year != 0) {
			List<Emp> list = EmpDAO.getEmpListByYear(year);
			
			for (Emp emp : list) {
				System.err.println(emp);
			}
			System.out.println("부서번호(0은 종료) : ");
			year = scan.nextInt();
		}
	}
}
