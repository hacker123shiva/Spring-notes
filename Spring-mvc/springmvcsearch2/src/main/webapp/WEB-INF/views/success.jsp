<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@page isELIgnored="false" %>
  <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #e2e2e2;
        }
        table {
            background-color: white;
            margin-top: 20px;
        }
    </style>
    <title>Student Details</title>
</head>
<body>
    <div class="container">
        <table class="table">
            <tbody>
                <tr>
                    <th scope="row">Name</th>
                    <td>${student.name}</td>
                </tr>
                <tr>
                    <th scope="row">ID</th>
                    <td>${student.id}</td>
                </tr>
                <tr>
                    <th scope="row">Date of Birth</th>
                    <td>${student.dob}</td>
                </tr>
                <tr>
                    <th scope="row">Skills</th>
                    <td>
                        <ul>
                            <c:forEach var="skill" items="${student.skills}">
                                <li>${skill}</li>
                            </c:forEach>
                        </ul>
                    </td>
                </tr>
                <tr>
                    <th scope="row">Gender</th>
                    <td>${student.getGender()}</td>
                </tr>
                <tr>
                    <th scope="row">Student Type</th>
                    <td>${student.studentType}</td>
                </tr>
                <tr>
                    <th scope="row">Address</th>
                    <td>
                        <p>City: ${student.address.city}</p>
                        <p>Street: ${student.address.street}</p>
                    </td>
                </tr>
            </tbody>
        </table>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
