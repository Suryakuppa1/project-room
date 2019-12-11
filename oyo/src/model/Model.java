package model;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Model {
private String name;
private String mobilenumber;
private String email;
private String username;
private String password;
private String hotelname;
private String datebook;
private String noofguests;
private String meals;
private Connection con = null;
private PreparedStatement pstmt=null;
private ResultSet res = null;


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMobilenumber() {
	return mobilenumber;
}
public void setMobilenumber(String mobilenumber) {
	this.mobilenumber = mobilenumber;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getHotelname() {
	return hotelname;
}
public void setHotelname(String hotelname) {
	this.hotelname = hotelname;
}
public String getDatebook() {
	return datebook;
}
public void setDatebook(String datebook) {
	this.datebook = datebook;
}
public String getNoofguests() {
	return noofguests;
}
public void setNoofguests(String noofguests) {
	this.noofguests = noofguests;
}
public String getMeals() {
	return meals;
}
public void setMeals(String meals) {
	this.meals = meals;
}

public Model()  {
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
public boolean register()
{
	
	String query = "insert into oyo. user(name,mobilenumber,email,username,password) VALUES(?,?,?,?,?)";
	try {
		pstmt = con.prepareStatement(query);
		pstmt.setString(1, name);
		pstmt.setString(2, mobilenumber);
		pstmt.setString(3, email);
		pstmt.setString(4, username);
		pstmt.setString(5, password);
		int rows = pstmt.executeUpdate();
		if(rows == 0) {
			return false;
		}
		else
			return true;
		
		
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	return false;	
	
}

public boolean login() {
	String query ="select * from oyo.user where username=? and password=? ";
	try 
	{
		pstmt = con.prepareStatement(query);
		pstmt.setString(1, username);
		pstmt.setString(2, password);
		res = pstmt.executeQuery();
		while(res.next()==true) {
			name = res.getString("name");
			return true;
		}
		
	}
catch (SQLException e) {
		
		e.printStackTrace();
	}
	
	return false;
	}
public boolean roomdetails()
{
	String query = "insert into oyo.user (hotelname, datebook , noofguests , meals) Values(?,?,?,?)"
			+  "where username =username" ;
	try {
		pstmt = con.prepareStatement(query);
		pstmt.setString(1, hotelname);
		pstmt.setString(2, datebook);
		pstmt.setString(3, noofguests);
		pstmt.setString(1, meals);
		int rows = pstmt.executeUpdate();
		if(rows == 0) {
			return false;
		}
		else
			return true;
		
		
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	return false;
	 
}
}


