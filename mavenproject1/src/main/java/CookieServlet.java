/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kumar
 */
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get the value from the form
        String cookieValue = request.getParameter("cookieValue");

        // Create a new cookie
        Cookie cookie = new Cookie("myCookie", cookieValue);

        // Set the cookie's max age (in seconds)
        cookie.setMaxAge(3600); // 1 hour

        // Add the cookie to the response
        response.addCookie(cookie);

        response.getWriter().println("Cookie has been set.");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Read cookies from the request
        Cookie[] cookies = request.getCookies();

        response.setContentType("text/html");
        response.getWriter().println("<html><body>");

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                String name = cookie.getName();
                String value = cookie.getValue();
                response.getWriter().println(name + " = " + value + "<br>");
            }
        } else {
            response.getWriter().println("No cookies found.");
        }

        response.getWriter().println("</body></html>");
    }
}

