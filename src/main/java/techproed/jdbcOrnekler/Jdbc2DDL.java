package techproed.jdbcOrnekler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc2DDL {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		
		Class.forName("com.mysql.cj.jdbc.Driver");

	 Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?serverTimezone=UTC", "root", "1012");
		
		 Statement st= con.createStatement();
		
//		
//		// executeQuery  select islemlerinde kullanilir
//		// execute 	 select disinda	hepsi ile kullanilabilir bunu yazdirirsak false doner
//		 // executeUpdate bundada select disinda herseyde kullanilir bunu yazdirirsak kac satir girilirse 
//		 //o kadar sayi dondurur
//		
//	//	 String sorgu = "CREATE TABLE isciler"
//	//			 + " (id int primary key,"
//	//	         + " birim VARCHAR(10),"
//	//	         + " maas int)";
//	    
//	    
//	    //1.yöntem 
//	    
////	    boolean s1=st.execute(sorgu);
//	//    
////	    System.out.println("isciler tablosu oluşturuldu" +s1);
//	    
//		    
//	 //   st.execute(sorgu);
//	//    System.out.println("isciler tablosu oluşturuldu");
//	    
//		
//	    /*======================================================================
//		  ORNEK2:isciler tablosunu siliniz 		
//		========================================================================*/
//	    
//	//st.execute("drop table isciler");
//	  
//	// System.out.println("isciler tablosu silindi");
//	    
//	    
//	    /*=======================================================================
////		  ORNEK3:isciler tablosuna yeni bir sutun {isim Varchar(20)} ekleyiniz.   
////////		========================================================================*/
//	    
//	    
//	    
//	 //   st.execute("alter table isciler ADD isim varchar(20)");
//	    
//	//    System.out.println("sutun eklendi");
//	    
//	    
//	    
// 
//	    /*=======================================================================
////		  ORNEK4:isciler tablosuna soyisim VARCHAR(20) ve sehir VARCHAR(10)) 
////		  adinda 2 yeni sutun ekleyiniz.  
////		========================================================================*/
//		 
//		 
////		 st.execute("alter table isciler ADD (soyisim varchar(20,sehir varchar(20))");
//		 
///		 System.out.println("islem tamam");
//		 
//		 
//		 
//		 /*=======================================================================
////		  ORNEK5:isciler tablosundaki soyisim sutunu siliniz.
////		========================================================================*/ 
///		String alterQuery3 = "ALTER TABLE isciler DROP COLUMN birim";
////		st.execute(alterQuery3);
//////		
//		System.out.println("isciler tablosundan birim sutunu silindi..");
//	
//		/*=======================================================================
//		  ORNEK6:isciler tablosunun adini calisanlar olarak degistiriniz.  
//		========================================================================*/
//		String alterQuery4 = "ALTER TABLE isciler RENAME TO calisanlar5";
//		st.execute(alterQuery4);
//		System.out.println("isciler tablosunun adi calisanlar olarak degismistir..");
////		
////		/*=======================================================================
////		  ORNEK7:calisanlar tablosunu siliniz.  
////		========================================================================*/
		String dropQuery2 = "DROP TABLE calisanlar5 ";
		st.execute(dropQuery2);
	
		System.out.println("calisanlar tablosu silindi..");
		
		
		
		
	}

}
