import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

import com.lx.animal.BabyDog;
import com.lx.animal.Cat;
import com.lx.animal.Dog;
import com.lx.animal.Farm;
import com.lx.animal.IAnimal;

public class Test {

	public static void main(String[] args) {
		
		// 강아지와 고양이 만들어서 리스트에 넣기
		Farm farm1 = new Farm();
		
		Dog dog1 = new BabyDog();
		farm1.animals.add(dog1);
		
		
		Dog dog2 = new BabyDog();
		farm1.animals.add(dog2);
		
		//이런 식으로 직접 만들어도 가능
		Cat cat1 = new Cat() {
			public void walk(int speed) {
				speed = 10;
				System.out.println("고양이가 걸어갑니다.");
			}
		};
		farm1.animals.add(cat1);
		
		
		
		IAnimal animal1 = new IAnimal() {
			public void run() {
				System.out.println("동물이 뛰어갑니다.");
			}
			
			public void walk(int speed) {
				System.out.println("동물이 걸어갑니다.");
			}
		};
		farm1.animals.add(animal1);
		
		
		// 리스트 안에 들어있는 모든 아이템(원소, Element)을 꺼내와서 run 함수 실행하기
		
		// C-스타일 for문
		for (int i=0; i<farm1.animals.size(); i++) {
			IAnimal animal = farm1.animals.get(i);
			animal.run();
		}
		
		
		// for문의 형태 : 축약
		for (IAnimal animal : farm1.animals) {
			animal.run();
		}
		
		
		// 해시에 넣기
		HashMap<String, IAnimal> hash1 = new HashMap<>();
		
		hash1.put("dog1", dog1);
		hash1.put("dog2", dog2);
		hash1.put("cat1", cat1);
		
		System.out.println("dog1이라는 이름으로 들어간 강아지 : " + hash1.get("dog1"));
		
		for (String key : hash1.keySet()) {
			System.out.println("키 : " + key + ", 값 : " + hash1.get(key));
		}
		
		
		//날짜 확인하기
		Date date1 = new Date();
		System.out.println("지금 이 순간 : " + date1.getTime());
		System.out.println("지금 이 순간 : " + date1);
		
		SimpleDateFormat format1 = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		String now = format1.format(date1);
		System.out.println("지금 이 순간 : " + now);
		
		SimpleDateFormat format2 = new SimpleDateFormat("YYYY-MM-dd");
		String today = format2.format(date1);
		System.out.println("오늘 : " + today);
		// 2024-07-08 14:50:40 
		
		// 어제 날짜 구하기
		
		//다른 개발자가 만든 Calendar의 getInstance 메소드를 호출
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date1);
		
		//calendar.add(Calendar.DATE, 원하는 날짜 계산할 값)
		calendar.add(Calendar.DATE, -1);
		
		String yesterday = format2.format(calendar.getTime());
		
		System.out.println("어제 : " + yesterday);
		
		

	}

}
