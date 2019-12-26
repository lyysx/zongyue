<%--
  Created by IntelliJ IDEA.
  User: liuyangyang
  Date: 2019/9/3
  Time: 22:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<script>
    $(function(){
        $("ul.pagination li.disabled a").click(function(){
            return false;
        });
    });

</script>
<div class="pageDiv">
    <nav>
        <ul class="pagination">
            <li <c:if test="${!page.hasPrevious}">class="disabled"</c:if>>
                <a  href="author/fiction/list?start=0${page.param}" aria-label="Previous" >
                    <span aria-hidden="true">«</span>
                </a>
            </li>

            <li <c:if test="${!page.hasPrevious}">class="disabled"</c:if>>
                <a  href="author/fiction/list?start=${page.start-page.count}${page.param}" aria-label="Previous" >
                    <span aria-hidden="true">‹</span>
                </a>
            </li>

            <c:forEach begin="0" end="${page.totalPage-1}" varStatus="status">
                <li <c:if test="${status.index*page.count==page.start}">class="disabled"</c:if>>
                    <a
                            href="author/fiction/list?start=${status.index*page.count}${page.param}"
                            <c:if test="${status.index*page.count==page.start}">class="current"</c:if>
                    >${status.count}</a>
                </li>

            </c:forEach>

            <li <c:if test="${!page.hasNext}">class="disabled"</c:if>>
                <a href="author/fiction/list?start=${page.start+page.count}${page.param}" aria-label="Next">
                    <span aria-hidden="true">›</span>
                </a>
            </li>
            <li <c:if test="${!page.hasNext}">class="disabled"</c:if>>
                <a href="author/fiction/list?start=${page.last}${page.param}" aria-label="Next">
                    <span aria-hidden="true">»</span>
                </a>
            </li>
        </ul>
    </nav>
</div>

