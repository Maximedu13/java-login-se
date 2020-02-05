
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class Index extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  {
        String message = "Ciao !!!!";
        req.setAttribute("variable", message);
        System.out.println(req.getServletPath());
        System.out.println((res).getStatus());
        checkSession(req, res);
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

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
        this.getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward(req, res);
    }

}
