
public class Homework2 {

	public static void main(String[] args) {

		Person person1 = new Person("홍길동1", 10, "010-1111-1111");
		Person person2 = new Person("홍길동2", 20, "010-2222-2222");
		Person person3 = new Person("홍길동3", 30, "010-3333-3333");

		Dog dog1 = new Dog("흰둥이1");
		Dog dog2 = new Dog("흰둥이2");
		Dog dog3 = new Dog("흰둥이3");

		Cat cat1 = new Cat("흰냥이1");
		Cat cat2 = new Cat("흰냥이2");
		Cat cat3 = new Cat("흰냥이3");

		House house1 = new House("1번집", person1, dog1, cat1);

		House house2 = new House("2번집", person2, dog2, cat2);

		House house3 = new House("3번집", person3, dog3, cat3);

		House[] houses = { house1, house2, house3 };

//		for (House house : houses) {
//			
//			System.out.println(house.name + "= [(사람) 이름 : " + house.person.name + "], [나이 : " + house.person.age + "살"
//					+ "], [전화번호 : " + house.person.number + "]" + "		||	" + "[(강아지) 이름 : " + house.dog.name + "]"
//					+ "	||	" + "[(고양이)이름 : " + house.cat.name + "]");
//			System.out.println();
//
//			
//			
//		}

		System.out.println(house1.name + "= [(사람) 이름 : " + house1.person.name + "], [나이 : " + house1.person.age + "살"
				+ "], [전화번호 : " + house1.person.number + "]" + "		||	" + "[(강아지) 이름 : " + house1.dog.name + "]"
				+ "	||	" + "[(고양이)이름 : " + house1.cat.name + "]");
		System.out.println();

		System.out.println(house2.name + "= [(사람) 이름 : " + house2.person.name + "], [나이 : " + house2.person.age + "살"
				+ "], [전화번호 : " + house2.person.number + "]" + "		||	" + "[(강아지) 이름 : " + house2.dog.name + "]"
				+ "	||	" + "[(고양이)이름 : " + house2.cat.name + "]");

		System.out.println();

		System.out.println(house3.name + "= [(사람) 이름 : " + house3.person.name + "], [나이 : " + house3.person.age + "살"
				+ "], [전화번호 : " + house3.person.number + "]" + "		||	" + "[(강아지) 이름 : " + house3.dog.name + "]"
				+ "	||	" + "[(고양이)이름 : " + house3.cat.name + "]");

	}

}
