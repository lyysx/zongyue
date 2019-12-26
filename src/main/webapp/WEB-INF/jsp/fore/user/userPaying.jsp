<%--
  Created by IntelliJ IDEA.
  User: liuyangyang
  Date: 2019/11/12
  Time: 18:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>充值</title>
    <script src="/zongyue/js/jquery/2.0.0/jquery.min.js"></script>
    <script>
        function investRecommend() {
            console.log($('#number').children("checked").val());
            // console.log($('#number').children())
            $.ajax({
                type:"POST",
                url:"paying_ajax",
                data:{"_method":"PUT","user_id":$('#uid').val(),"user_recommend_ticket":$('input:radio:checked').val()},
                success:function (result) {
                    if (result.state == "success") {
                        alert("成功");
                    } else {
                        alert("失败");
                    }
                }

            });
        }
    </script>
</head>
<body>
        <div>
            充值用户id
            <input type="text" name="user_id" value="${user.user_id}" id="uid">
        </div>
            1张<input type="radio" value="1" name="user_recommend_ticket" checked="checked">
            5张<input type="radio" value="5" name="user_recommend_ticket">
            10张<input type="radio" value="10" name="user_recommend_ticket">
            <%--<input type="text"><input type="radio" name="number" value="">--%>
        <div>
            <button onclick="investRecommend()">确定</button>
        </div>


</body>
</html>
