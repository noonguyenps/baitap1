package com.example.baitap1.Controllers.Admin;

import com.example.baitap1.Models.CategoryModel;
import com.example.baitap1.Services.ICategoryService;
import com.example.baitap1.Services.Impl.ICategoryServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = {"/admin/category/list"})
public class CategoryController extends HttpServlet {
    ICategoryService categoryService = new ICategoryServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<CategoryModel> categoryModels = categoryService.findAll();
        req.setAttribute("categoryList",categoryModels);
        RequestDispatcher rq = req.getRequestDispatcher("/views/admin/list-category.jsp");
        rq.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
