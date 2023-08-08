package ch03;

public class Hero {
	
	String name;
	int hp;
	
	public Hero(String name, int hp) {
		this.name = name;
		this.hp = hp;
		
	}
	protected void attack() {
		System.out.println("적을 공격합니다.");
	}

} // end of class
