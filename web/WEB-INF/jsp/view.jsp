<%-- 
    Document   : view
    Created on : Jan 14, 2021, 10:52:27 PM
    Author     : User
--%>
<%@taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<s:form  method="post" action="Add" modelAttribute="signupDetails" >

            <s:label path="UserFirstName">Enter your user-Firstname</s:label>
        <s:input id="UserFirstName" name="UserFirstName" path="UserFirstName" /><br>       

        <s:label path="UserLastName">Enter your userLastname</s:label>
        <s:input id="UserLastName" name="UserLastName" path="UserLastName" /><br>   

        <s:label path="PhoneNumber">Enter your Phonenumber</s:label>
        <s:input id="PhoneNumber" name="PhoneNumber" path="PhoneNumber" /><br>  

        <s:label path="UserFirstName">Please enter your password</s:label>
        <s:password id="Password" name="Password" path="Password" /><br>

        <input type="submit" value="Register"/>
       
    </s:form>
        
</head>
<body>

</body>
</html>
