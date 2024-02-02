package BasicJava1;

import java.io.*;

public interface A {

	public void Area(int r);
}

interface B {
	public void show(int a,int b);
}

class Child implements A, B {
	private Int b;

	public void Area(int r) {
		System.out.println("Area of circle =" + (3.14 * r * r));
	}

	public void show(int a,Int b) {
		
		System.out.println("area of triangle =" + (a*b*0.5));
	}

	void output() {
		System.out.println("Child class method");
	}
}

