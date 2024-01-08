package com.javaex.ex15;

public class Student extends Person {
	// extends 클래스명 을하면 상속을 할 수 있다

	// 필드

	private String schoolName;

	// 생성자
	
	public Student() {
		System.out.println("Student(1)");
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
		System.out.println("Student(2)");
	}
	
	public Student(String name, int age, String schoolName) {
		//부모의 생성자 호출
		//자신메모리에 올리는일
		
		super(name, age); //부모쪽의 생성자를 불러온다
		                  //부모쪽 생성자가 일을 다 한 후 메모리에 올린다
		
		// super();                -> 부모쪽의 생성자가 없는데 추가해야 할 경우
 		// super.setName(name);    -> 부모쪽의 생성자를 변경하지 않고 setter 를 통해 추가
		// super.setAge(age);      -> 
		
		
		//name,age  부모
		//schoolName 자신
		
		this.schoolName = schoolName;
		
		System.out.println("Student(3)");
	
		
		
	}

	// 메소드-g/s

	public String getSchoolName() {
		return schoolName;
	}

	public Student(String schoolName) {
		super();
		this.schoolName = schoolName;
	}

	// 메소드-일반

	@Override
	public String toString() {
		return "학교: "+ schoolName + ", 이름: " + this.getName() + " , 나이: " + this.getAge();
	}
	
	// toString은 똑같이 부모-자식간 똑같이 사용되고 있으면 자식의 toString 값만 사용됨
	
	
	/*
	상속의 이유
	부모의 필드 메소드 공짜로 사용
	부모와 자식의 메소드 이름이 같을 경우 자식의 메소드가 사용됨
	- 굳이 같은 이름으로 만드는 이유는?
	-> 부모의 메소드를 자식이 사용할 경우 오류가 생기는 경우(사용하면안되는경우)
	->그래서 같은 이름으로 만든다
	->그러면 자식의 메소드가 사용됨
	
	-부모의 메소드도 사용하고 자식이 더 좋게 만들경우
	이름을 다르게 만든다
	
	
	** 생성자 규칙 (상속일때)
	*main() --> 자식의 생성자를 호출
	* 일의 시작은 자식의 생성자가 시작(완료까진x)
	* 자식생성자가 부모생성자 호출(부모의 생성자 호출내용대로) super(), super(parameter)
	* 부모의 생성자 완료
	* 자식의 생성자 완료
	
	본인의 생성자를 부를때는 this(parameter)
	본인의 필드, 메소드를 부를때는 this.필드명 / this.메소드명(parameter)
	
	부모의 생성자를 부를때는 super(parameter)
	부모의 필드, 메소드를 부를때는 super.필드명 / super.메소드명(parameter)
	
	-> 부모쪽의 private 사용 불가, public 작성된 것만 사용 가능
	
	
	*/
	
	
	
	
	
	
	
	
	
	
	
	
}
