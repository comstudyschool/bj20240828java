package org.comstudy.myapp.exam;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/concurrency")
public class ConcurrencyServlet extends HttpServlet {

    private int counter = 0; // 공유 변수

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    	request.setCharacterEncoding("UTF-8");
    	response.setCharacterEncoding("UTF-8");
    	response.setContentType("text/html; charset=UTF-8");

        int currentCounter;

        synchronized (this) {
            currentCounter = counter;
            counter++;
        }

        response.getWriter().println("<h1>요청 처리 중...</h1>");
        response.getWriter().println("<p>현재 요청 번호: " + currentCounter + "</p>");
    }
}