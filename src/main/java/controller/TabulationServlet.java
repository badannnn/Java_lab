package controller;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TabulationServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double a = Double.parseDouble(req.getParameter("a"));
        double b = Double.parseDouble(req.getParameter("b"));
        double h = Double.parseDouble(req.getParameter("h"));

        List<Double> xValues = new ArrayList<>();
        List<Double> yValues = new ArrayList<>();

        for (double x = a; x <= b; x += h) {
            xValues.add(x);
            yValues.add(Math.cbrt(x)); // y = ∛x
        }

        req.setAttribute("xValues", xValues);
        req.setAttribute("yValues", yValues);
        req.getRequestDispatcher("tabulationResult.jsp").forward(req, resp);
    }
}
