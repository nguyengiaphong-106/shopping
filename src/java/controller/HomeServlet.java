
package controller;

import data.dao.Database;
import java.io.IOException;
import java.util.List;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Category;

@WebServlet(name = "HomeServlet", urlPatterns = {"/HomeServlet"})
public class HomeServlet extends HttpServlet {

    protected void hienThi(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<Category> lstCategory = Database.getCategoryDao().findAll();

        request.setAttribute("lstCategory", lstCategory);

        request.getRequestDispatcher("/views/home.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        hienThi(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        hienThi(request, response);
    }

    @Override
    public String getServletInfo() {
        return "HomeServlet";
    }
}
