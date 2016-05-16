<%@ page import="com.workshop.clientTest.VariousServiceTest" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<jsp:useBean id="test" class="com.workshop.clientTest.VariousServiceTest"/>
<h1><%=test.callDisplayName()%></h1>
</body>
</html>