package com.javaex.ex15;

public class Student extends Person{ //부모(Person)를 상속(extends)받는다.
	
	//필드
		//public String name;
		//public int age;
		public String schoolName;

	//생성자
		public Student() {
			super();
		}
		
		
		public Student(String name, int age, String schoolName) {
			//메모리에 올리는 일
		super(name, age);//부모의 생성자를 호출->super();=Person();. 본인의 생성자는->this.
		//setName(name); = sper.setName(name); 이렇게 써도 됨.
		//setAge(age); = sper.setName(name); 이렇게 써도 됨.
		this.schoolName = schoolName;
	}
		
		/*
		public Student(String schoolName) {
			super();
			this.schoolName = schoolName;
		}
		 */

	//메소드-gs
	public String getSchoolName() {
		return schoolName;
	}

	

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	
	//메소드-일반
	//@Override
	//public String toString() {
	//	return "Student [schoolName=" + schoolName + "]";
	//}
	
	@Override
	public String toString() {
		
		return "학교:" + schoolName + "이름:" + getName() + "나이" + getAge();
		}
		//return "Person [name=" + name + ", age=" + age + "]";
		//같은 이름으로 만들어지면 자식의 기능으로 실행된다. 만약에 부모의 기능을 사용하고 싶으면 이름을 다르게 사용한다.
	
		

}
