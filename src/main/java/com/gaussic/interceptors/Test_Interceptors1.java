package com.gaussic.interceptors;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2016-06-07.
 */
public class Test_Interceptors1 implements HandlerInterceptor{


    //返回值：是否将该请求拦截下来
    // true：请求继续；
    // false：请求终止
    // boject 表示的是被拦截的请求的目标对象，即该controller实例
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        System.out.println("method : preHandle1");
        return true;
    }

    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println("method : postHandle1");
    }

    //该方法主要用于一些资源的销毁
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println("method : afterCompletion1");
    }
}
