<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student Information</title>
</head>
<body>
    <h1>Student Information Form</h1>
    <form action="/StudentServlet" method="post">
        <label for="studentName">Name:</label>
        <input type="text" id="studentName" name="studentName" required>
        <br>
        <label for="studentAge">Age:</label>
        <input type="number" id="studentAge" name="studentAge" required>
        <br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>