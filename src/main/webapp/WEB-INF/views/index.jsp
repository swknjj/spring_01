<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-04-20
  Time: 오전 10:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Hello Spring Framework!!</h2>
<%--  /home 주소 요청하면 home.jsp가 출력되도록  --%>
<a href="/home">home으로 가자</a>
<%-- 버튼을 클릭하면 fun1 함수를 호출하고
    fun1 함수는 /wakeup 주소를 호출하자
    컨트롤러에 /wakeup 주소 요청에 대한 메서드를 정의하고 wakeup.jsp를 출력하도록 하자--%>
<input type="button" value="함수호출" onclick="fun1()">
<button onclick="fun1()">함수호출</button>

<%-- 주소에 파라미터를 함께 보내기 --%>
<%-- 목적지: /req-param1, email="aa@aa.com", password="1q2w3e"를 요청 --%>
<a href="req-param1?email=aa@aa.com&password=1q2w3e">파라미터 보내기</a>
<a href="req-param2?name=하츄핑&age=5">파라미터 보내기2</a>
</body>
<script>
    const fun1 = () => {
        location.href = "/wakeup"
    }
</script>
</html>
