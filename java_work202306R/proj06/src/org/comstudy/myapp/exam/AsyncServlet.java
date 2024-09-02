package org.comstudy.myapp.exam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(asyncSupported = true, urlPatterns = "/asyncServlet")
public class AsyncServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");
        
    	final AsyncContext asyncContext = req.startAsync();

        // 비동기 작업 실행
        asyncContext.start(() -> {
            try {
                Thread.sleep(5000); // 시간이 오래 걸리는 작업 시뮬레이션
                PrintWriter out = asyncContext.getResponse().getWriter();
                out.println("비동기 작업 완료");
                asyncContext.complete(); // 비동기 작업 완료 처리
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        
        resp.getWriter().println("<h1>Finished!</h1>");
    }
}