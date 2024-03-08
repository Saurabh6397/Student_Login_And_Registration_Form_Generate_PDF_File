<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/html2pdf.js/0.10.1/html2pdf.bundle.min.js"></script>"

<style type="text/css">

h1{
color:red;
text-align: center;
}
</style>
<script src="pdf.js"></script>
</head>
<body>
<div id="invoice">
<h1>Student Registration Form</h1>
<br><br><hr><hr>
<center>
<table class="table">
  <thead class="thead-dark">
    <tr>
    	<th scope="col"></th>
    	<th scope="col"></th>
    	<th scope="col">#</th>
      <th scope="col">Student</th>
      <th scope="col">Information</th>
    </tr>
  </thead>
  <tbody>
    <tr>
    	<td></td>
    	<td></td>
    	<th scope="col">1</th>
      <td>Student FirstName:</td>
      <td><%=session.getAttribute("Firstname") %></td>
    </tr>
    <tr>
    	<td></td>
    	<td></td>
    	<th scope="col">2</th>
      <td>Student LastName:</td>
      <td><%=session.getAttribute("Lastname") %></td>
    </tr>
    <tr>
    	<td></td>
    	<td></td>
    	<th scope="col">3</th>
      <td>Gender:</td>
      <td><%=session.getAttribute("Gender") %></td>
    </tr>
    <tr>
    	<td></td>
    	<td></td>
    	<th scope="col">4</th>
      <td>Birth Date:</td>
      <td><%=session.getAttribute("Date") %></td>
    </tr>
    <tr>
    	<td></td>
    	<td></td>
    	<th scope="col">5</th>
      <td>Email:</td>
      <td><%=session.getAttribute("Email") %></td>
    </tr>
    <tr>
    	<td></td>
    	<td></td>
    	<th scope="col">6</th>
      <td>Address:</td>
      <td><%=session.getAttribute("Address") %></td>
    </tr>
    <tr>
    	<td></td>
    	<td></td>
    	<th scope="col">7</th>
      <td>State:</td>
      <td><%=session.getAttribute("State") %></td>
    </tr>
    <tr>
    	<td></td>
    	<td></td>
    	<th scope="col">8</th>
      <td>Pincode:</td>
      <td><%=session.getAttribute("Pincode") %></td>
    </tr>
    <tr>
    	<td></td>
    	<td></td>
    	<th scope="col">9</th>
      <td>Phone No.:</td>
      <td><%=session.getAttribute("Phoneno") %></td>
    </tr>
    <tr>
    	<td></td>
    	<td></td>
    	<th scope="col">10</th>
      <td>Age:</td>
      <td><%=session.getAttribute("Age") %></td>
    </tr>
  </tbody>
</table>
</center>
</div>

<center>
<button type="submit" class="btn btn-success" onclick="generatepdf()">Submit Form</button>
</center>


</body>
</html>