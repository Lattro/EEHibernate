package com.example.eehibernate;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import  pets.Pet;
import  pets.PetEntity;
import  services.PetService;

@WebServlet(name = "delete", value = "/delete")
public class DeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        int id = Integer.parseInt(request.getParameter("id"));
        PetService petService = new PetService();
        PetEntity petEntity = petService.findPet(id);
        petService.deletePet(petEntity);
        response.sendRedirect(request.getContextPath()+"/index");
        //  Pet pet = new Pet(id);
        // pet.deletePet();
    }
}
