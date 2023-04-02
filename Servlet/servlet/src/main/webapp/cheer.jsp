<html>
    <body>
        <%
        String user = (String)session.getAttribute("user");
        String password = (String)pageContext.getAttribute("password",PageContext.SESSION_SCOPE);
        out.print("Cheer "+user);
        out.print("Here is your password: "+password);
        %>
        <%@ include file="index.jsp"%>
    </body>
</html>