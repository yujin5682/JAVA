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

# HomeWork1_2

public class Homework1_2 {

	public static void main(String[] args) {
		
		int adultNum = 5;
		int childNum = 0;
		int adultPrice = 20000;
		int childPrice = 9900;
		
		int result = totalPrice(adultNum, childNum, adultPrice, childPrice);
		System.out.println(result);

	}
	
	static int totalPrice(int adultNum, int childNum, int adultPrice, int childPrice) {
		
		int totalPrice = 0;
		
		int totalNum = adultNum + childNum;
		
		if (totalNum >= 5) {
			
			totalPrice = (adultNum * adultPrice + childNum * childPrice) * 8 / 10;
		
		} else {
			
			totalPrice = adultNum * adultPrice + childNum * childPrice;
		}
		
		return totalPrice;
		
	}

}

# HomeWork1_3

public class Homework1_3 {

	public static void main(String[] args) {
		
		int a = 1; //어른 수
		int c = 2; //아이 수
		//int total = totalPrice(a, c);
		
		System.out.println(totalPrice(a, c) + "원");
	}
	
	static int totalPrice(int adultNum, int childNum) {
		
		int totalNum = adultNum + childNum;
		
		int result = adultNum * 20000 + childNum * 9900;
		
		if (totalNum >= 5) {
			result = result * 8 / 10;
		} else {
			result = result;
		}
		
		return result;
	}

}
