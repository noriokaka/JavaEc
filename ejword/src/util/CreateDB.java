package util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class CreateDB {

	public static void main(String[] args) {
		try {
			//ファイル読み込みfis
			FileInputStream fis = new FileInputStream("assets/ejdic-hand-utf8.txt");
			InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
			BufferedReader br = new BufferedReader(isr);

			//データソースを利用せずにダイレクトにDBに接続
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/ejword?useUnicode=true&characterEncoding=utf8";
			String user = "root";
			String pass = "root";
			Connection db = DriverManager.getConnection(url,user,pass);
			//トランザクション処理開始
			db.setAutoCommit(false);

			PreparedStatement ps=db.prepareStatement("INSERT INTO words(title,body) VALUES(?,?)");
			String line;
			try {
				while((line=br.readLine())!=null) {
					String[] vals=line.split("\t");
					ps.setString(1, vals[0]);
					ps.setString(2, vals[1]);
					ps.executeUpdate();
				}
				db.commit();
				db.close();
				br.close();
				System.out.println("Done!!");

			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	}

}