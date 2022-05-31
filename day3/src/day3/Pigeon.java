package day3;

public class Pigeon extends Animal implements Flyable{

	Pigeon(String name) {
		super(name);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public void Fly() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("ばさばさばさ");

	}

	@Override
	void makeNoise() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("ぽぽぽ");
	}

}
