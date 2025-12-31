package test1230;


/*
다음 결과가 출력되도록 구동클래스(Test02)를 구현하기
구동클래스에서 출력은 Animal 클래스를 이용하기       

[결과]
     이름(name):원숭이
     나이(age):20
     맛있게 얌얌   
*/

public class Test02_A {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.name = "원숭이";
		a.age = 20;
		System.out.println(a);
		a.eat();
	}
}
