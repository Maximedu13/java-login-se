import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class Deconnexion extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("<div class=\"alert alert-dark text-center\" role=\"alert\">\n" +
                "  Déconnecté!\n" +
                "</div>");
        request.getRequestDispatcher("/WEB-INF/home.jsp").include(request, response);
        HttpSession session = request.getSession();
        session.invalidate();
        out.close();

    }
}
