package controller;

import model.User;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Створюємо модель
        User user = new User("John Doe", 25);

        // Передаємо дані моделі до JSP
        req.setAttribute("user", user);

        // Перенаправляємо на JSP
        req.getRequestDispatcher("user.jsp").forward(req, resp);
    }
}
