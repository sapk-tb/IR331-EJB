package api;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sapk
 */
@WebServlet("/api")
public class APIServlet extends HttpServlet {

    public APIServlet() {
        super();
    }

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Flot de sortie pour écriture des résultats.
        PrintWriter out = response.getWriter();
        out.println("Hello World !");
    }
}
