import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.net.Socket;

public class Contact extends HttpServlet {
    public static final String CHAMP_OBJECT = "object";
    public static final String CHAMP_MESSAGE = "message";
    public static final String CHAMP_GARAGE = "garage";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String sujet = request.getParameter( CHAMP_OBJECT);
        String message = request.getParameter( CHAMP_MESSAGE);
        String garage = request.getParameter( CHAMP_GARAGE );
        System.out.println(sujet + message + garage);
        //Socket c = new Socket();
        //ServerSocket server = new ServerSocket(8080);
        //System.out.println(server);
        Socket c = new Socket();
        JavaHTTPServer java = new JavaHTTPServer(c);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        checkSession(request, response);
        this.getServletContext().getRequestDispatcher("/WEB-INF/contact.jsp").forward(request, response);

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
        this.getServletContext().getRequestDispatcher("/WEB-INF/contact.jsp").forward(req, res);
    }

}
