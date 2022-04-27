package day1;

public class Main{
	public static void main(String[] args) {
		Hero h = new Hero();
		h.setName("TEST");
		h.setHp(100);
		System.out.println(h);
		Wand wa = new Wand();
		wa.setName("TSUE");
		wa.setPower(20);
		Wizard wi = new Wizard();
		wi.setName("MAHO");
		wi.setHp(90);
		wi.setMp(100);
		wi.setWand(wa);
		wi.heal(h);
	}
}
