package day3;

public class Cat extends Animal {
	Cat(String name){
		super(name);
	}

	@Override
	void makeNoise() {

		System.out.println("にゃー");
	}
	public void sleep() {
		System.out.println("すやすや");
	}
}
