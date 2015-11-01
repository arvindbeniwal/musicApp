<%@ page contentType="text/html; charset=UTF-8" %>
 <%@ taglib prefix="s" uri="/struts-tags" %> 
<html>
<title>Login</title>
<style>
body {
    background: url('http://i.imgur.com/Eor57Ae.jpg') no-repeat fixed center center;
    background-size: cover;
    font-family: Montserrat;
}

/* .logo {
    width: 613px;
    height: 360px;
    background: url('https://d85wutc1n854v.cloudfront.net/live/products/600x375/WB0PGGM81.png?v=1.0') no-repeat;
    margin: 30px auto;
} */

.login-block {
    width: 320px;
    padding: 20px;
    background: #fff;
    border-radius: 5px;
    border-top: 5px solid #ff656c;
    margin: 0 auto;
}

.login-block h1 {
    text-align: center;
    color: #000;
    font-size: 18px;
    text-transform: uppercase;
    margin-top: 0;
    margin-bottom: 20px;
}

.login-block input {
    width: 100%;
    height: 42px;
    box-sizing: border-box;
    border-radius: 5px;
    border: 1px solid #ccc;
    margin-bottom: 20px;
    font-size: 14px;
    font-family: Montserrat;
    padding: 0 20px 0 50px;
    outline: none;
}

.login-block input#username {
    background: #fff url('http://i.imgur.com/u0XmBmv.png') 20px top no-repeat;
    background-size: 16px 80px;
}

.login-block input#username:focus {
    background: #fff url('http://i.imgur.com/u0XmBmv.png') 20px bottom no-repeat;
    background-size: 16px 80px;
}

.login-block input#password {
    background: #fff url('http://i.imgur.com/Qf83FTt.png') 20px top no-repeat;
    background-size: 16px 80px;
}

.login-block input#password:focus {
    background: #fff url('http://i.imgur.com/Qf83FTt.png') 20px bottom no-repeat;
    background-size: 16px 80px;
}

.login-block input:active, .login-block input:focus {
    border: 1px solid #ff656c;
}

.login-block button {
    width: 100%;
    height: 40px;
    background: #ff656c;
    box-sizing: border-box;
    border-radius: 5px;
    border: 1px solid #e15960;
    color: #fff;
    font-weight: bold;
    text-transform: uppercase;
    font-size: 14px;
    font-family: Montserrat;
    outline: none;
    cursor: pointer;
}

.login-block button:hover {
    background: #ff7b81;
}

</style>
<head>
</head>
<body>
<div class="logo"></div>
<div class="login-block">
<s:form action="Welcome">
<s:text name="LOG IN"></s:text>
    <s:textfield name="email" label="Email ID"/>
    <s:password name="password" label="Password"/>
    <s:submit/>
 
</s:form>
<s:form action="WelcomeReg">
<s:text name="REGISTER"></s:text>
    <s:textfield name="username" label="Username"/>
    <s:textfield name="email" label="Email ID"/>
    <s:password name="password" label="Password"/>
    <s:submit/>
 
</s:form>
</div>
</body>


</html>