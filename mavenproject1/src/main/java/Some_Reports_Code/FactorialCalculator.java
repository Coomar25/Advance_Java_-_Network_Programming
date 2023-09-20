/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Some_Reports_Code;

/**
 *
 * @author kumar
 */
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FactorialCalculator")
public class FactorialCalculator extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>Factorial Calculator</title></head>");
        out.println("<body>");
        out.println("<h1>Factorial Calculator</h1>");
        out.println("<form method='POST'>");
        out.println("Enter a number: <input type='text' name='number'><br>");
        out.println("Factorial: <input type='text' name='result' readonly><br>");
        out.println("<input type='submit' value='Calculate'>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String numberStr = request.getParameter("number");
        int number = Integer.parseInt(numberStr);

        long factorial = calculateFactorial(number);

        out.println("<html>");
        out.println("<head><title>Factorial Calculator</title></head>");
        out.println("<body>");
        out.println("<h1>Factorial Calculator</h1>");
        out.println("<form method='POST'>");
        out.println("Enter a number: <input type='text' name='number' value='" + number + "'><br>");
        out.println("Factorial: <input type='text' name='result' value='" + factorial + "' readonly><br>");
        out.println("<input type='submit' value='Calculate'>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
    }

    private long calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
