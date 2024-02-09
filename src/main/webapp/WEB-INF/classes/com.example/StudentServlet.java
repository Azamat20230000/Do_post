import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Student Information (GET)</h1>");
        out.println("<p>Name: " + request.getParameter("studentName") + "</p>");
        out.println("<p>Age: " + request.getParameter("studentAge") + "</p>");
        out.println("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Обработка POST запроса
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Student Information (POST)</h1>");
        out.println("<p>Name: " + request.getParameter("studentName") + "</p>");
        out.println("<p>Age: " + request.getParameter("studentAge") + "</p>");
        out.println("</body></html>");
    }
}