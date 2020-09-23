package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String age = request.getParameter("age");
        //
        if (!isNumeric(age)) {
            request.setAttribute("message", "You must give your current age.");
        } else {
            request.setAttribute("message", "Your age next birthday will be " + (Integer.parseInt(age)+1));
        }
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);

    }

    //Checks if string can be parsed to a number and that is greater than 0
    private boolean isNumeric(String age) {
        try {
            int greaterThen = Integer.parseInt(age);
            return greaterThen >= 0;
        } catch(NumberFormatException e){
            return false;
        }
    }
}
