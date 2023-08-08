package starcraft;

public class Unit {

	protected String name;
	protected int power;
	protected int hp;

	public Unit(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public void beAttacked(int powr) {
		if (hp <= 0) {
			System.out.println(name + "이미 사망하였습니다");
			return;
		}
		hp -= power;
	}

	public void showInfo() {
		System.out.println("=== 상태창 ===");
		System.out.println("이름 : " + name);
		System.out.println("공격력 : " + power);
		System.out.println("체력 : " + hp);
	}
	public void attack(Zergling zergling) {
		zergling.beAttacked(power);
		System.out.println(name + "가" + zergling.getName() + "을 공격합니다.");
	}
	public void attack(Zealot zealot) {
		zealot.beAttacked(power);
		System.out.println(name + "가" + zealot.getName() + "을 공격합니다.");
	}
	public void attack(Marine marine) {
		marine.beAttacked(power);
		System.out.println(name + "가" + marine.getName() + "을 공격합니다.");
	}

} // end of class
