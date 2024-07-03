
public class Test {

	public static void main(String[] args) {
		
		//만들어진 물고기 마릿수
		//int count = 0;

		
		Fish fish1 = new Fish();
		fish1.name = "붕어빵1";
		
		
		//Fish.count = Fish.count + 1;
		
		Shark shark1 = new Shark();
		shark1.name = "상어빵1";
		
		//Fish.count = Fish.count + 1;
		
		System.out.println("상어빵의 이름 : " + shark1.name);
		System.out.println("몇 마리? : " + Fish.count);
		
		
		fish1.swim();
		shark1.swim();
		shark1.run();

		Fish shark2 = new Shark();
		shark2.name = "상어빵2";
		
		//Fish.count = Fish.count + 1;
		
		//shark2.run();
		
		//형변환은 서로 상속관계에 있을 때 가능하다.
		Shark shark3 = (Shark) shark2;
		
		//Fish.count = Fish.count + 1;
		
		System.out.println("몇 마리? : " + Fish.count);
		
		
		double temp = 36.5;
		double temp2 = Math.floor(temp);
		System.out.println("원래 값 : " + temp + ", 바뀐 값 : " + temp2);
		
		
	}

}
