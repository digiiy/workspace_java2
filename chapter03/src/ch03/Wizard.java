package ch03;

public class Wizard extends Hero {

	public Wizard(String name, int hp) {
		super(name, hp);
		
	}
	public void freezing() {
		System.out.println("적을 얼려버립니다.");
	}
	@Override
	protected void attack() {
		System.out.println(name + "이 기본 공격을 합니다.");
	}
	
	

} // end of class
