package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ArithmeticCalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("message", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstNumber = request.getParameter("first");
        String secondNumber = request.getParameter("second");

        if (!isNumeric(firstNumber) || !isNumeric(secondNumber)) {
            request.setAttribute("message", "invalid");
        } else {
            if(request.getParameter("+") != null) {
                request.setAttribute("message", Integer.parseInt(firstNumber)+Integer.parseInt(secondNumber));
            } else if (request.getParameter("-") != null) {
                request.setAttribute("message", Integer.parseInt(firstNumber)-Integer.parseInt(secondNumber));
            } else if(request.getParameter("*") != null) {
                request.setAttribute("message", Integer.parseInt(firstNumber)*Integer.parseInt(secondNumber));
            } else if (request.getParameter("%") != null) {
                request.setAttribute("message", Integer.parseInt(firstNumber)%Integer.parseInt(secondNumber));
            } else {
                request.setAttribute("message", firstNumber + " " + secondNumber);
            }
        }
        request.setAttribute("first", firstNumber);
        request.setAttribute("second", secondNumber);
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
    }

    //Checks if string can be parsed to a number
    private boolean isNumeric(String string) {
        if (string == null || string.equals("")){
            return false;
        }
        try {
            Integer.parseInt(string);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
}
