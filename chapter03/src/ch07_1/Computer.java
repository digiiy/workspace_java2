package ch07_1;

public abstract class Computer {
	public abstract void display();
	
	public abstract void typing();
	
	public void trunOn() {
		System.out.println("컴퓨터를 킵니다.");
	}
	public void turnOff() {
		System.out.println("컴퓨터를 끕니다.");
	}

} // end of class
