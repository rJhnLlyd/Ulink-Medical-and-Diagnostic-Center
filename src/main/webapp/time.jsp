<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Time and Date</title>
  <!-- CSS code -->
  <style>
    body{
    
    }
    .date{
      width: 135px;
      padding-left: 0.5rem;
      color: white;
      margin: 0 auto;
      font-size: 18px;
      font-weight: bolder;
    }
   
  </style>
   
</head>
<body onload="startTime()">
  <!-- Auto refreshing Current Date and time -->
  
  <div class="date" id="currentDate" ></div>
  <div class="date" id="currentTime"></div>
  <strong class="date" id="DateTime" hidden=></strong>
 
</body>  
<script src="script/time.js"></script>  
</html>