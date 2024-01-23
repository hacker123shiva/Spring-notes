package springmvcsearch;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class MyInterceptore extends HandlerInterceptorAdapter {

    // This method is called before the controller method is invoked
     
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        System.out.println("This is preHandle");
        String name = request.getParameter("name");
        if (name.startsWith("d")) {
            response.setContentType("text/html");
            response.getWriter().println("Invalid name... Name should not start with 'd'");
            return false;
        } else {
            return true;
        }
    }

    // This method is called after the controller method is invoked but before the view is rendered
    
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
            ModelAndView modelAndView) throws Exception {
        System.out.println("This is postHandle");
        // You can perform operations after the controller method has been executed, but before the view is rendered.
    }

    // This method is called after the view has been rendered
   
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        System.out.println("This is afterCompletion");
        // You can perform cleanup or logging tasks after the view has been rendered.
    }
}
