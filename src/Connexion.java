import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class Connexion extends HttpServlet {
    public static final String CHAMP_PASS = "motdepasse";
    public static final String CHAMP_NOM = "nom";


    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(req, res);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /* Récupération des champs du formulaire. */
        String nom = request.getParameter( CHAMP_NOM );
        String motDePasse = request.getParameter( CHAMP_PASS );
        PrintWriter out=response.getWriter();
        if(nom.equals("max") && motDePasse.equals("max")){
            HttpSession session=request.getSession();
            session.setAttribute("name",nom);
            String connected = "true";
            request.setAttribute("connected", "true");
            request.getRequestDispatcher("/WEB-INF/home.jsp").forward(request, response);
            //response.sendRedirect("index");
        }
        else{
            response.setContentType("text/html");
            out.print("<div class=\"alert alert-dark text-center\" role=\"alert\">\n" +
                    "  Mauvais identifiants !\n" +
                    "</div>");
            request.getRequestDispatcher("/WEB-INF/login.jsp").include(request, response);
            out.close();
        }
    }


    private void validationMotDePasse( String motDePasse) throws Exception{
    }
    private void validationNom( String nom ) throws Exception{

    }

}

