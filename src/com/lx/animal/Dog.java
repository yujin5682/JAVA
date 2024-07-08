package com.lx.animal;

//abstract : 추상 클래스 -> 기능 미완성일 때 사용, interface에서 만든 함수 상자를 다 못만들었을 때, 일단 에러를 지운다.
public abstract class Dog implements IAnimal {

	public void run() {
		System.out.println("강아지가 뛰어갑니다.");
	}
	
	
	
}
