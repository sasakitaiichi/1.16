package HelloWorld;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class MyServlet2 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);

        req.setCharacterEncoding("utf-8");

        String[] c1s = req.getParameterValues("c1");
        String[] selectedlangs = req.getParameterValues("selectedlang");
        String name = req.getParameter("username");

        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        out.print("<h3>你喜欢那些语言:</h3>");
        out.print(Arrays.toString(c1s));
        out.print("<h3>请选择你喜欢的计算机编程语言:</h3>");
        out.print(Arrays.toString(selectedlangs));
        out.print("<h3>用户名:</h3>");
        out.print(name);

        out.close();


    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
}
