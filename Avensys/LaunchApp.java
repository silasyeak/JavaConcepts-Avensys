package com.java.programs;

class Student {
	String name;
	int age;
	float marks;
	
	void play() {
		System.out.println("Student is playing");
	}
	void read() {
		System.out.println("Student is reading");
	}
	void eat() {
		System.out.println("Student is eating");
	}

}

class LaunchApp{
	public static void main(String[] args) {
		Student siddu = new Student();
		Student silas = new Student();
		Student siyuan = new Student();
		siddu.read();
		silas.play();
		siyuan.eat();
		
	}
	
}

	