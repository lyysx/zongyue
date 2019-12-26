package com.shiki.zongyue.interceptor;

import com.shiki.zongyue.pojo.Author;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Arrays;

public class AuthorLoginInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession httpSession = request.getSession();
        String contextPath = httpSession.getServletContext().getContextPath();
        String[] needAuthorLogin = {
                "home",
                "fiction",
                "setting"
        };
        String uri = request.getRequestURI();
        uri = StringUtils.remove(uri, contextPath);
        if (uri.startsWith("/author")) {
            String method = StringUtils.substringAfterLast(uri, "/author_0");
            if (Arrays.asList(needAuthorLogin).contains(method)) {
                Author author = (Author) httpSession.getAttribute("author");
                if (null == author) {
                    response.sendRedirect("author_login_page");
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        super.afterCompletion(request, response, handler, ex);
    }
}
