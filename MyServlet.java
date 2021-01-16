package HelloWorld;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MyServlet extends HttpServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//        super.service(req, res);

        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;

        request.setCharacterEncoding("utf-8");
        String name = request.getParameter("name");
        System.out.println(name);

        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.print("<h3>这是一个SERVICE方法</h3>");
        out.print("<h3>name参数 : " + name + ".</h3>");
        out.close();


    }

//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
//
//        req.setCharacterEncoding("utf-8");
//
//        String name = req.getParameter("name");
//
//        System.out.println(name);
//
//        PrintWriter out = resp.getWriter();
//
//        out.print("<h3>这是一个POST请求</h3>");
//        out.print("<h3>name参数 : " + name + ".</h3>");
//        out.close();
//    }
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
//
//        resp.setContentType("text/html,charset=utf-8");
//
//        String name = req.getParameter("name");
//
//        System.out.println(name);
//
//        PrintWriter out = resp.getWriter();
//
//        out.print("<h3>这是一个GET请求</h3>");
//        out.print("<h3>name参数 : " + name + ".</h3>");
//        out.close();
//    }
}
