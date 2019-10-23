package com.interceptor;

import org.springframework.context.ApplicationContext;
import org.springframework.lang.Nullable;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
 import  com.entity.*;
 import java.util.*;
import com.service.*;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static org.springframework.web.context.support.WebApplicationContextUtils.*;

public class BaseInterceptor  {

protected Object getBean(ServletContext ctx,String beanName){
    ApplicationContext ac = WebApplicationContextUtils.getRequiredWebApplicationContext(ctx);
    Object obj= ac.getBean(beanName);

    return obj;
}
}
