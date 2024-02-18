package com.example.eehibernate;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import  pets.Pet;
import pets.PetEntity;
import services.PetService;

@WebServlet(name = "edit", value = "/edit")
public class EditServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        int id = Integer.parseInt(request.getParameter("id"));
        PetService petService = new PetService();
        PetEntity petEntity = petService.findPet(id);
        request.setAttribute("pet",petEntity);
        getServletContext().getRequestDispatcher("/edit.jsp").forward(request,response);
        // Pet pet = new Pet();
        // request.setAttribute("pet",pet.selectPet(id));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        int id =Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String breed = request.getParameter("breed");
        int age = Integer.parseInt(request.getParameter("age"));
        int price = Integer.parseInt(request.getParameter("price"));
        PetEntity petEntity = new PetEntity(id,name, breed,age,price);
        PetService petService = new PetService();
        petService.updatePet(petEntity);
        response.sendRedirect(request.getContextPath()+"/index");
        // Pet pet = new Pet(id,name,breed,age,price);
        // pet.updatePet();
    }
}
