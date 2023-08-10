package ch05;

public class FruitMainTest1 {

	public static void main(String[] args) {
		
		// 다형성 
	    // ! 용어 - 업캐스팅 
		Fruit fruit1 = new Banana("델몬트바나나", 2_000); 
		Fruit fruit2 = new Peach("청도복숭아", 3_000);
		
		fruit1.showInfo();
		fruit2.showInfo();	
				
				
	}

}
