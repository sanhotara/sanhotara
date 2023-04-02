<%@ taglib uri="/WEB-INF/mytags.tld" prefix="tl"%>
<html>
    <body>
        <tl:randomNumber/>
        <%
        String name = request.getParameter("userName");
        String pw =  request.getParameter("userPassword");
        String driver = config.getInitParameter("dname");
        session.setAttribute("user",name);
        pageContext.setAttribute("password",pw,PageContext.SESSION_SCOPE);
        %>
        <a href="cheer.jsp">Cheer user</a>
        <%=name+"dep trai"%>
        <%="Driver name: " + driver%>
    </body>
</html>