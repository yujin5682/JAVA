package com.lx.house;

import java.util.ArrayList;

import com.lx.animal.Dog;

public class House {

	String name;
	Dog dog;
	
	ArrayList<Dog> dogs = new ArrayList<>();
	
//	House(String name, Dog dog) {
//		this.name = name;
//		this.dog = dog;	
//	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	
	public void setDog(Dog dog) {
		this.dog = dog;
	}
	public Dog getDog() {
		return dog;
	}

	
	public void setDogs(ArrayList<Dog> dogs) {
		this.dogs = dogs;
	}
	
	public ArrayList<Dog> getDogs() {
		return dogs;
	}
	
	
	public void dogRun(ArrayList<Dog> dogs) {
		//강아지가 한 마리도 없으면 없다, 있으면 첫번째 강아지 출력
		if (dogs.size() > 0) {
			System.out.println("첫 번째 강아지 이름 : " + dogs.get(0).getName());
		} else {
					System.out.println("강아지가 없다.");
		}
	}
}
