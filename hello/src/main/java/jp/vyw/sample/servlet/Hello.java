package jp.vyw.sample.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Hello extends HttpServlet {
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    PrintWriter writer = response.getWriter();

    writer.println("<html>");
    writer.println("<body>");

    String name = request.getParameter("name");
    name = name == null ? "world" : name;

    writer.format("<p>Hello, %s!</p>%n", name);
    writer.println("</body>");
    writer.println("</html>");
  }
}
