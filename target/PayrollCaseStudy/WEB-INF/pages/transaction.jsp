<%@ taglib prefix="cp" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<link href="<cp:url value="/resources/style.css" />" rel="stylesheet">
<script src="<cp:url value="/resources/js/jquery-1.7.2.min.js" />"></script>
<script src="<cp:url value="/resources/js/script.js" />"></script>
<body>

	<h1>Add an Employee</h1>
    <h3>Add an hourly employee</h3>
    <form action="transaction/hourly" method="post">
        <table style="width:300px">
            <td> Employee id : <input type="number" name="empId"><br> </td>
            <td> Employee name: <input type="text" name="name"><br> </td>
            <td> Employee address: <input type="text" name="address"><br> </td>
            <td> Employee rate: <input type="number" name="rate"><br> </td>
        </table>
        <input type="submit" value="Submit">
    </form>

    <h3>Add a salaried employee</h3>
    <form action="transaction/salaried" method="post">
        <table style="width:300px">
            <td> Employee id : <input type="number" name="empId"><br> </td>
            <td> Employee name: <input type="text" name="name"><br> </td>
            <td> Employee address: <input type="text" name="address"><br> </td>
            <td> Employee salary: <input type="number" name="salary"><br> </td>
        </table>
        <input type="submit" value="Submit">
    </form>

    <h3>Add a commissioned employee</h3>
    <form action="transaction/commissioned" method="post">
        <table style="width:300px">
            <td> Employee id : <input type="number" name="empId"><br> </td>
            <td> Employee name: <input type="text" name="name"><br> </td>
            <td> Employee address: <input type="text" name="address"><br> </td>
            <td> Employee salary: <input type="number" name="salary"><br> </td>
            <td> Employee commission: <input type="number" name="commission"><br> </td>
        </table>
        <input type="submit" value="Submit">
    </form>
</body>
</html>