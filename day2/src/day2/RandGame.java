package day2;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Random;
import java.util.Scanner;
public class RandGame {
	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		Random rand=new Random();
		System.out.println("****乱数ゲーム****");

		FileReader fr=new FileReader("data.txt");
		int highScore=fr.read();
		fr.close();
		System.out.printf("HighScore %d%n",highScore);


		String select;
		int score;
		FileWriter fw=new FileWriter("data.txt");
		while(true) {
			System.out.print("やりますかyes…y no…n>");
			select=sc.nextLine();
			if(select.equals("y")) {
				score=rand.nextInt(100000)+1;
				System.out.println(score);
				if(score>highScore) {
					highScore=score;
					System.out.println("new Record");
					//FileWriter fw=new FileWriter("data.txt");
					fw.write(highScore);
					fw.close();
				}
			}else {
				System.out.println("アプリを終了します");
				break;
			}
		}
	}

}
