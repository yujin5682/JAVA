
public class Fish {

	// Fish라는 이름의 붕어빵 틀에 붙어있는 진짜 변수상자
	static int count = 0;
	
	String name;
	int age;
	
	Fish() {
		Fish.count = Fish.count + 1;
	}
	
	
	void swim() {
		System.out.println("붕어빵이 헤엄칩니다.");
	}
	
}
