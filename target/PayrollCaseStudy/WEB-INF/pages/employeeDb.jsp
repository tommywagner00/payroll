<%@ taglib prefix="cp" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<link href="<cp:url value="/resources/style.css" />" rel="stylesheet">
<script src="<cp:url value="/resources/js/jquery-1.7.2.min.js" />"></script>
<script src="<cp:url value="/resources/js/script.js" />"></script>
<body>

	<h1>Employee Database</h1>

    <c:if test="${not empty EMPLOYEES}">

        <c:choose>
            <c:when test="${EMPLOYEES.size() == 1}">
                <h3>Showing employee ${EMPLOYEES.get(0).empId}</h3>
            </c:when>
            <c:otherwise>
                <h3>Showing all employees</h3>
            </c:otherwise>
        </c:choose>

        <table style="width:300px">
            <tr>
                <td>Id</td>
                <td>Name</td>
                <td>Address</td>
            </tr>
            <c:forEach items="${EMPLOYEES}" var="employee">
            <tr>
                <td>${employee.empId}</td>
                <td>${employee.name}</td>
                <td>${employee.address}</td>
            </tr>
            </c:forEach>
        </table>
    </c:if>
</body>
</html>