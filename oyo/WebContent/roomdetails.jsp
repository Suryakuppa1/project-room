<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Enter details to proceed for payment</h1>
<br>
<br>
<br>
<br>
<form action = "RoomDetails">
 <fieldset>
  <legend>Book Your Room:</legend>
  <label class="label">Select Hotel</label>
<div>
<select name="hotelname">
<option disabled="disabled" selected="selected">Choose option</option>
<option>Taj Banjara</option>
<option>Novtel</option>
<option>Grand Nagarjuna </option>
<option>Conrad Benguluru</option>
</select>
<div class="select-dropdown"></div>
</div>
<br>
<br>
  <label for = "date"> Booking Date</label><input id = "date" type = "date" name = "date">
  <label for = "number"> No of Guests</label><input id = "number" type = "number" name = "noofguests" min ="1"max = "6">
  <h3>Do you Require meals</h3>
 <label for = "meals"> Yes</label> <input type = "radio" name = "meals" value = "yes">
 <label for = "meals"> No</label> <input type = "radio" name = "meals" value = "No">
 <br>
   <br>
 <input type = "submit" name= "submit" value="pay and checkin ">
  
  </fieldset>
  </form>
  

</body>
</html>