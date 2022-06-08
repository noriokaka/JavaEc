package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import model.Mutter;

/*
public class MutterDAO {
	private Connection db;
	private PreparedStatement ps;
	private ResultSet rs;

	//接続共通処理
	private void connect() throws NamingException, SQLException {
		Context context = new InitialContext();
		DataSource ds = (DataSource) context.lookup("java:comp/env/jdbc/jsp");
		this.db = ds.getConnection();
	}

	//切断共通処理
	private void disconnect() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
			if (db != null) {
				db.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Mutter> findAll() {
		List<Mutter> list = new ArrayList<>();
		try {
			this.connect();
			ps = db.prepareStatement("SELECT * FROM mutters");
			rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String text = rs.getString("text");
				Mutter mutter = new Mutter(id, name, text);
				list.add(mutter);
			}
		} catch (NamingException | SQLException e) {

			e.printStackTrace();
		}finally {
			this.disconnect();
		}

		return list;
	}
	public void insertOne(Mutter mutter) {
		try {
			this.connect();
			ps=db.prepareStatement("INSERT INTO mutters(name,text) VALUES(?,?)");
			ps.setString(1,mutter.getUserName());
			ps.setString(2,mutter.getText());
			ps.executeUpdate();
		} catch (NamingException | SQLException e) {
			e.printStackTrace();
		}finally {
			this.disconnect();
		}
	}
	public Mutter findOne(int id) {
		Mutter mutter=null;
		try {
			this.connect();
			ps=db.prepareStatement("SELECT * FROM mutters WHERE id=?");
			ps.setInt(1, id);
			rs=ps.executeQuery();
			if(rs.next()) {
				String name=rs.getString("name");
				String text=rs.getString("text");
				mutter=new Mutter(id,name,text);
			}
		} catch (NamingException | SQLException e) {
			e.printStackTrace();
		}finally {
			this.disconnect();
		}

		return mutter;
	}
	public void updateOne(Mutter mutter) {
		try {
			this.connect();
			ps=db.prepareStatement("UPDATE mutters SET name=?,text=? WHERE id=?");
			ps.setString(1, mutter.getUserName());
			ps.setString(2, mutter.getText());
			ps.setInt(3, mutter.getId());
			ps.executeUpdate();
		} catch (NamingException | SQLException e) {
			e.printStackTrace();
		}finally {
			this.disconnect();
		}
	}
	public void deleteOne(int id) {
		try {
			this.connect();
			ps=db.prepareStatement("DELETE FROM mutters WHERE id=?");
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (NamingException | SQLException e) {
			e.printStackTrace();
		}finally {
			this.disconnect();
		}
	}

public boolean create(Mutter mutter) {
		try (Connection conn=DriverMantextr.getConnection(null, null, null)){
			String sql="INSERT INTO MUTTER(NAME,TEXT) VALUE(?,?)";
			PreparedStatement pStmt=conn.prepareStatement(sql);

			pStmt.setNString(1, mutter.getUserName());
			pStmt.setNString(2, mutter.getText());

			int result=pStmt.executeUpdate();
			if(result!=1) {
				return false;
			}
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			return false;
		}
		return false;
	}
}
*/

public class MutterDAO {
	/*private final String JDBC_URL = "jdbc:h2:tcp://localhost/~/docoTsubu";
	private final String DB_USER = "sa";
	private final String DB_PASS = "";*/

	private Connection db;
	private PreparedStatement ps;
	private ResultSet rs;

	//接続共通処理
	private void connect() throws NamingException, SQLException {
		Context context = new InitialContext();
		DataSource ds = (DataSource) context.lookup("java:comp/env/jdbc/jsp");
		this.db = ds.getConnection();
	}

	//切断共通処理
	private void disconnect() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
			if (db != null) {
				db.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


	/*public List<Mutter> findAll() {
		List<Mutter> mutterList = new ArrayList<>();

		try (Connection conn = DriverMantextr.getConnection(JDBC_URL, DB_USER, DB_PASS)) {
			String sql = "SELECT ID,NAME,TEXT FROM MUTTER ORDER BY ID DESC";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			ResultSet rs = pStmt.executeQuery();

			while (rs.next()) {
				int id = rs.getInt("ID");
				String userName = rs.getString("NAME");
				String text = rs.getString("TEXT");
				Mutter mutter = new Mutter(id, userName, text);
				mutterList.add(mutter);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return mutterList;
	}

	public boolean create(Mutter mutter) {
		try (Connection conn = DriverMantextr.getConnection(JDBC_URL, DB_USER, DB_PASS)) {
			String sql = "INSERT INTO MUTTER(NAME,TEXT) VALUE(?,?)";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			pStmt.setNString(1, mutter.getUserName());
			pStmt.setNString(2, mutter.getText());

			int result = pStmt.executeUpdate();
			if (result != 1) {
				return false;
			}
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			return false;
		}
		return true;
	}
	*/

	public List<Mutter> findAll() {
		List<Mutter> list = new ArrayList<>();
		try {
			this.connect();
			ps = db.prepareStatement("SELECT * FROM mutter");
			rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String text = rs.getString("text");
				Mutter mutter = new Mutter(id, name, text);
				list.add(mutter);
			}
		} catch (NamingException | SQLException e) {

			e.printStackTrace();
		}finally {
			this.disconnect();
		}

		return list;
	}

	public void create(Mutter mutter) {
		try {
			this.connect();
			ps=db.prepareStatement("INSERT INTO mutter(name,text) VALUES(?,?)");
			ps.setString(1,mutter.getUserName());
			ps.setString(2,mutter.getText());
			ps.executeUpdate();
		} catch (NamingException | SQLException e) {
			e.printStackTrace();
		}finally {
			this.disconnect();
		}
	}

}
