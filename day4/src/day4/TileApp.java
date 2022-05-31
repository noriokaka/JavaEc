package day4;
import java.util.Scanner;
public class TileApp {

	public static void main(String[] args) {
		System.out.print("縦>>");
		int tate=new Scanner(System.in).nextInt();
		System.out.print("横>>");
		int yoko=new Scanner(System.in).nextInt();
		int kouyaku=kouyaku(tate,yoko);
		int num=tate*yoko/(kouyaku*kouyaku);
		System.out.printf("1辺が%dのタイルを%d枚で埋めます。%n", kouyaku,num);

	}
	static int kouyaku(int tate,int yoko) {
		int result=1;
		for(int i=1;i<=Math.min(tate,yoko);i++) {
			if(tate%i==0 && yoko%i==0) {
				result=i;
			}
		}
		return result;
	}

}
