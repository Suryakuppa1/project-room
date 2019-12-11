package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



public class HotelModel extends Model {
	private int id;
	private String hotelname;
	private String hoteltype;
	private String starrank;
	private String noofrooms;
	private String hoteladdress;
	private String minprice;
	private String price;
	private Connection con = null;
	private PreparedStatement pstmt = null;
	private  ResultSet res = null;
	
	public String getPrice() {
		return price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getHotelname() {
		return hotelname;
	}
	public void setHotelname(String hotelname) {
		this.hotelname = hotelname;
	}
	public String getHoteltype() {
		return hoteltype;
	}
	public void setHoteltype(String hoteltype) {
		this.hoteltype = hoteltype;
	}
	public String getStarrank() {
		return starrank;
	}
	public void setStarrank(String starrank) {
		this.starrank = starrank;
	}
	public String getNoofrooms() {
		return noofrooms;
	}
	public void setNoofrooms(String noofrooms) {
		this.noofrooms = noofrooms;
	}
	public String getHoteladdress() {
		return hoteladdress;
	}
	public void setHoteladdress(String hoteladdress) {
		this.hoteladdress = hoteladdress;
	}
	public String getMinprice() {
		return minprice;
	}
	public void setMinprice(String minprice) {
		this.minprice = minprice;
	}
	
	
	public HotelModel() {
		try 
		{
		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oyo","root","root");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public ArrayList<String> hotelslist() {
		ArrayList<String> al = new ArrayList<String>();
		String query ="select * from oyo.hotel";
		try {
			 pstmt = con.prepareStatement(query);
			 res = pstmt.executeQuery();
			 while (res.next() == true) 
			 {
				 al.add(res.getString(1));
				 al.add(res.getString(2));
				 al.add(res.getString(3));
				 al.add(res.getString(4));
				 al.add(res.getString(5));
				 al.add(res.getString(6));
				 al.add(res.getString(7));		 
			 }
	
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return al;
	}
	
}
