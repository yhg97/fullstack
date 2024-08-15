<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.rtl.min.css" integrity="sha384-dpuaG1suU0eT09tx5plTaGMLBsfDLzUCCUXOY2j/LSvXYuG6Bqs43ALlhIqAJVRb" crossorigin="anonymous">
    .<link rel="stylesheet" href="/resources/css/main.css"/>
    <title>회원가입</title>
</head>
<body>

<div class="container">
    <h2>회원가입</h2>
<form action="/user/join" method="post">
    <div class="mb-3">
    <label for="disabledTextInput" class="form-label">이메일:</label>
    <input type="email" id="disabledTextInput" name="email" required class="form-control" placeholder="aaaa@AAAA.com"><br><br>
    </div>
    <div class="mb-3">
    <label for="password" class="form-label">비밀번호:</label>
    <input type="password" class="form-control" id="password" name="password" required placeholder="*******"><br><br>
    </div>
    <div class="mb-3">
    <label for="name" class="form-label">이름:</label>
    <input type="text" class="form-control" id="name" name="name" required><br><br>
    </div>
    <div class="mb-3">
    <label for="birth" class="form-label">생년월일:</label>
    <input type="date" class="form-control" id="birth" name="birth" required><br><br>
    </div>
    <div class="mb-3">
    <label for="phone" class="form-label">전화번호:</label>
    <input type="text" class="form-control" id="phone" name="phone" placeholder="01012345678" required><br><br>
    </div>
    <div class="mb-3">
    <label for="gender" class="form-label">성별:</label>
    <select id="gender" name="gender" required class="form-select">
        <option selected>성별</option>
        <option value="M">남성</option>
        <option value="F">여성</option>
    </select><br><br>
    </div>
    <button type="submit" class="btn btn-primary">회원가입</button>
</form>
</div>
</body>
</html>
