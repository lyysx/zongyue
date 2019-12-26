package com.shiki.zongyue.interceptor;

import com.github.pagehelper.util.StringUtil;
import com.shiki.zongyue.pojo.Admin;
import com.shiki.zongyue.pojo.User;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Arrays;

public class AdminLoginInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession httpSession = request.getSession();
        String contextPath = httpSession.getServletContext().getContextPath();
        String[] noNeedAdminPage = new String[]{
                "/login",
                "/not_logged"
        };
        String uri = request.getRequestURI();
        uri = StringUtils.remove(uri, contextPath);
        if (uri.startsWith("/admin")) {
            String method = StringUtils.substringAfterLast(uri, "/admin");
//            System.out.println(method);
            if (!Arrays.asList(noNeedAdminPage).contains(method)) {
                Admin admin = (Admin) httpSession.getAttribute("admin");
                if (null == admin) {
                    response.sendRedirect(contextPath+"/admin/not_logged");
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
