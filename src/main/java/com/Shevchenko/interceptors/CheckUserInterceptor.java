package com.Shevchenko.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Shevchenko.model.User;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import java.io.IOException;


/**
 * Created by vlad on 26.07.16.
 */
public class CheckUserInterceptor extends HandlerInterceptorAdapter {

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws IOException {
        if(request.getRequestURI().contains("check-user")){
            User user = (User) modelAndView.getModel().get("user");
            if(user == null || user.isTruOrFalse()==false){
                response.sendRedirect(request.getContextPath()+"/failed");
            }
        }
    }
}
