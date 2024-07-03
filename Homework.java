import java.util.ArrayList;

import com.lx.animal.Dog;
import com.lx.house.House;

public class Homework {

	public static void main(String[] args) {
		
		//강아지 배열만들기
		ArrayList<Dog> dogs = new ArrayList<Dog>();

		Dog dog1 = new Dog();
		
		dog1.setName("강아지1");
		dog1.setInt(10);
		dog1.setNumber("010-1111-1111");
		dogs.add(0, dog1);
		
		
		
		Dog dog2 = new Dog();
		
		dog2.setName("강아지2");
		dog2.setInt(20);
		dog2.setNumber("010-2222-2222");
		dogs.add(1, dog2);
		
		Dog dog3 = new Dog();
		
		dog3.setName("강아지3");
		dog3.setInt(30);
		dog3.setNumber("010-3333-3333");
		dogs.add(2, dog3);
		
		Dog dog4 = new Dog();

		dog4.setName("강아지4");
		dog4.setInt(40);
		dog4.setNumber("010-4444-4444");
		dogs.add(3, dog4);
		
		Dog dog5 = new Dog();
		
		dog5.setName("강아지5");
		dog5.setInt(50);
		dog5.setNumber("010-5555-5555");
		dogs.add(4, dog5);
		
		
		//집에 강아지들 묶음 넣기
		House house = new House();
		house.setName("우리집");
		house.setDogs(dogs);
		
		//마지막 강아지 정보 출력
		Dog lastDog = dogs.get(dogs.size()-1);
		
		//강아지 수 출력
		System.out.println("강아지 마릿 수 : " + dogs.size() + "마리");
		System.out.println();
		
		
		//모든 강아지 출력
		for (Dog dog : house.getDogs()) {
			System.out.println(house.getName() + " || 이름 : " + dog.getName() + " ||나이 : " + dog.getAge() + "살 || 번호 : " + dog.getNumber());
		}
		System.out.println();
		
		
		//모든 강아지의 이름 출력
		for (Dog dog : house.getDogs()) {
			System.out.println("강아지 이름 : " + dog.getName());
		}
		System.out.println();
		
		
		//마지막 강아지 정보 출력
		System.out.println("마지막 강아지 : " + lastDog.getName() + " || 나이 : " + lastDog.getAge() + " || 번호 : " + lastDog.getNumber());
		System.out.println();
		
		house.dogRun(dogs);
		
		
//		System.out.println(dogs.get(0).getName());
//		System.out.println(dogs.get(0).getAge());
//		System.out.println(dogs.get(0).getNumber());

	}

}
