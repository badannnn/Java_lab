package controller;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class TaylorSeriesServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double x = Double.parseDouble(req.getParameter("x"));
        int n = Integer.parseInt(req.getParameter("n"));
        double e = Double.parseDouble(req.getParameter("e"));

        // a. Обчислити суму n доданків
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Math.pow(-1, i) * Math.pow(x, 2 * i) / factorial(i);
        }

        // b. Обчислити суму тих доданків, які за абсолютним значенням більше e
        double sumGreaterE = 0;
        int countGreaterE = 0;
        for (int i = 0; i < n; i++) {
            double term = Math.pow(-1, i) * Math.pow(x, 2 * i) / factorial(i);
            if (Math.abs(term) > e) {
                sumGreaterE += term;
                countGreaterE++;
            }
        }

        // c. Точне значення функції e^(-x^2)
        double exactValue = Math.exp(-Math.pow(x, 2));

        // Відправка результатів на JSP
        req.setAttribute("taylorSum", sum);
        req.setAttribute("sumGreaterE", sumGreaterE);
        req.setAttribute("countGreaterE", countGreaterE);
        req.setAttribute("exactValue", exactValue);
        req.getRequestDispatcher("result.jsp").forward(req, resp);
    }

    private double factorial(int n) {
        if (n == 0) return 1;
        double fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
