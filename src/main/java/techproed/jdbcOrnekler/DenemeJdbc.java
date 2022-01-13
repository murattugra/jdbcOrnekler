package techproed.jdbcOrnekler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DenemeJdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		
	Class.forName("com.mysql.cj.jdbc.Driver");
		
	Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?serverTimezone=UTC", "root", "1012");
		
	 Statement st=  con.createStatement();
	    
		
		st.execute(
				"CREATE TABLE boluk ("
				+ " numara int, "
				+ " isim varchar(40),"
				+ " soyisim varchar(40), "
				+ " gorev varchar(40)"
				);
		
		 
//		   st.execute(
//			   "CREATE TABLE urunler("
//		       + " id int,"
//		       + " isim VARCHAR(10),"
//		       + " fiyat double)"
//		       );
		
		
		
		 String [] arr={"insert into boluk values (101,'Ali ','Can','sofor'),"
		 		+ "insert into boluk values (102,'Veli ','Der','Dalgic'),"
		 		+ "insert into boluk values (101,'Ali ','Can','sofor')"};
		
		 int count=0;
			for (String each : arr) {
				st.executeUpdate(each);
				count++;
			}
		
			System.out.println(count+" kadar veri eklendi");
	
	 
	 
	 
		
	}

}
