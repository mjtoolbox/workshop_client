<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<jsp:useBean id="test" class="com.workshop.clientTest.VariousServiceTest"/>
<jsp:useBean id="restclient" class="com.workshop.restclient.RestServiceClient"/>

<h1>VariousService callDisplayName() result:</h1> <%=test.callDisplayName()%>
</h1>
<h1>RestService getUsername() result: </h1><%=restclient.getUserName("Michael")%>
</h1>
</body>
</html>