<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<script type="text/javascript">
function validate(){
	var tn=document.f1.teamName.value;
	if(tn==""){
		document.getElementById("namelocation").innerHTML=alert("enter proper values");
	}
}



</script>




<form action="delete.do" name="f1" onsubmit="return validate()">

 TeamName:<input type="text" name="teamName"><span id="namelocation"></span>
 

<input type="submit" value="delete">


</form>

</body>
</html>