<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
  </style>
  <title>Your Form Title</title>
</head>
<body>

<div class="container">
  <div class="row">
    <div class="col-md-6 offset-md-3 bg-white py-5">
    <h1 class="text-center">Complex Form</h1>
      <form action="handleform", method="post">
        <div class="mb-3">
          <label for="name" class="form-label">Name</label>
          <input type="text" class="form-control" id="name" name="name">
        </div>

        <div class="mb-3">
          <label for="id" class="form-label">ID</label>
          <input type="text" class="form-control" id="id" name="id">
        </div>

        <div class="mb-3">
          <label for="dob" class="form-label">Date of Birth</label>
          <input type="text" placeholder="dd/mm/yyyy" class="form-control" id="dob" name="dob">
        </div>

        <div class="mb-3">
          <label for="skills" class="form-label">Select Skills</label>
          <select multiple class="form-select" id="skills" name="skills">
            <option value="java">Java</option>
            <option value="spring">Spring</option>
            <option value="spring-boot">Spring Boot</option>
            <option value="hibernate">Hibernate</option>
          </select>
        </div>

     <div class="mb-3">
          <label class="form-check-label">Gender</label>
          <div class="form-check">
            <input class="form-check-input" type="radio" name="gender" id="male" value="male">
            <label class="form-check-label" for="male">Male</label>
          </div>
          <div class="form-check">
            <input class="form-check-input" type="radio" name="gender" id="female" value="female">
            <label class="form-check-label" for="female">Female</label>
          </div>
        </div>
        <div class="mb-3">
          <label for="studentType" class="form-label">Student Type</label>
          <select class="form-select" id="studentType" name="studentType">
            <option value="newStudent">New Student</option>
            <option value="oldStudent">Old Student</option>
          </select>
        </div>
<div class="text-center">
  <button type="submit" class="btn btn-primary text-center">Submit</button>
</div>
       
      </form>
    </div>
  </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
