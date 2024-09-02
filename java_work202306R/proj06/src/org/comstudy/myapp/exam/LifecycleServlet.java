package org.comstudy.myapp.exam;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import java.io.IOException;

@WebServlet("/lifecycle")
public class LifecycleServlet extends HttpServlet {

    public LifecycleServlet() {
        System.out.println("호출된 생성자: 서블릿이 인스턴스화되고 있습니다.");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("호출된 초기화 메소드: Servlet이 초기화 중입니다.");
    }

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        System.out.println("호출된 서비스 메소드: Servlet이 요청을 처리 중입니다.");
        // 요청 처리 및 응답 생성
        response.setContentType("text/html");
        ServletOutputStream out = response.getOutputStream();
        out.println("<html><body>");
        out.println("<h1>Hello, Servlet!</h1>");
        out.println("</body></html>");
    }

    @Override
    public void destroy() {
        System.out.println("Destroy 메소드 호출: Servlet이 파괴되고 있습니다.");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public String getServletInfo() {
        return null;
    }
}