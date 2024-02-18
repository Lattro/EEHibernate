package com.example.eehibernate;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import pets.PetEntity;
import services.PetService;

@WebServlet(name = "insert", value = "/insert")
public class InsertServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/insert.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String name = request.getParameter("name");
        String breed = request.getParameter("breed");
        int age = Integer.parseInt(request.getParameter("age"));
        int price = Integer.parseInt(request.getParameter("price"));
        PetService petService = new PetService();
        PetEntity pet = new PetEntity(name,breed,age,price);
        petService.savePet(pet);
        response.sendRedirect(request.getContextPath() +"/index");
    }
}
