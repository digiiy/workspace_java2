package ch04;

// 자동차와 엔진의 관계에 있어서
// 절대 상속을 사용하지 말자.
// 차와 엔진의 관계는 포함 관계로 설계 해주어야한다.

public class Car {

	private String name;
	private int price;
	private Engin engin; // 포함 관계

	public Car(String name, int price, Engin engin) {

		this.name = name;
		this.price = price;
		this.engin = engin;
	}
	
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public Engin getEngin() {
		return engin;
	}
	
	
	
	
	

} // end of class
