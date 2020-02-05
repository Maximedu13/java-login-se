import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class Planning extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        checkSession(request, response);
        request.getRequestDispatcher("/WEB-INF/planning.jsp").include(request, response);
    }

    private void checkSession(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        HttpSession session=req.getSession();
        if(null == session.getAttribute("name")){
            String connected = "false";
            req.setAttribute("connected", "false");
        }else{
            String connected = "true";
            req.setAttribute("connected", "true");
        }
        this.getServletContext().getRequestDispatcher("/WEB-INF/planning.jsp").forward(req, res);
    }
}
