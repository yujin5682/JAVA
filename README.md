# JAVA
java

# HomeWork1
import java.util.*;

public class Homework1 {

	
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("성인 수: ");
		int a = sc.nextInt();
		
		System.out.print("어린이 수: ");
		int c = sc.nextInt();
		
		
		int adult = a * 20000;
		
		
		int child = c * 9900;

		double coast = adult + child;
		
		if(a+c >= 5) {
			coast = coast - coast * 0.2;
			
		} else {	
			
		}
		
		System.out.println("입장료: " + coast + "원");
		

	}
}
