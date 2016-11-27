package com.alaya35.stage1e;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by gauge on 2016/11/24.
 */

@WebServlet("/demo")
public class ServletDemo extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentTime = dateFormat.format(new Date());
        String  myName = "gauge";
        req.setAttribute("currentTime", currentTime);
        req.setAttribute("myName", myName);
        req.getRequestDispatcher("/WEB-INF/jsp/demo.jsp").forward(req, resp);
    }
}