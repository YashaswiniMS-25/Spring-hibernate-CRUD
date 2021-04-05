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
    
    var teamnm=document.f1.teamName.value;
    var cptn=document.f1.teamCaptain.value;
    if(teamnm!="" && cptn!=""){
    	
    	document.getElementById("namelocation").innerHTML=alert("enter values");
    }
    else{
    	document.getElementById("namelocation").innerHTML=alert("enter values");
    }

}
</script>









<form action="update.do;"name="f1" onsubmit="return validate()">
Team name:<input type="text" name="teamName"><span id="namelocation" style="color:red;"></span>
Captain:<input type="text" name="teamCaptain"><span id="namelocation" style="color:red;"></span>
<input type="submit" value="update">



</form>

</body>
</html>