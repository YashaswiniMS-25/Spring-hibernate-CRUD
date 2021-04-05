<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: #7FFFD4;margin-left: auto;
    margin-right: auto;
    width: 8em">
    <h1>Welcome</h1>
    <script type="text/javascript">
    function validate(){
    	var id=document.f1.teamId.value;
    	var nm=document.f1.teamName.value;
    	var hg=document.f1.homeGround.value;
    	var tc=document.f1.teamCaptain.value;
    	if(id!="" && nm!="" && hg!="" && tc!=""){
    		
    	}else{
    		document.getElementById("namelocation").innerHTML=alert("enter the values");
    	}
    	
    	
    	
    	
    }
    
    
    
    
    
    </script>
    
    
    
    
    
<form action="teams.do" name="f1" onsubmit="return validate()">

Team id:<input type="number" name="teamId"><br><span id="namelocation"></span>
Team Name:<input type="text" name="teamName"><br><span id="namelocation"></span>
Home Ground:<input type="text" name="homeGround"><br><span id="namelocation"></span>
Team captain:<input type="text" name="teamCaptain"><br><span id="namelocation"></span>
<input type="submit" value="Go">


</form>

</body>
</html>