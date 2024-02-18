package com.example.eehibernate;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import  pets.Pet;
import pets.PetEntity;
import services.PetService;


@WebServlet(name = "index", value = "/index")
public class HelloServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {

        PetService petService = new PetService();
         List<PetEntity> petEntities;
        petEntities=petService.getAllPets();
        request.setAttribute("petList",petEntities);
        getServletContext().getRequestDispatcher("/index.jsp").forward(request,response);
        //Pet pet = new Pet();
        //   request.setAttribute("petList",pet.selectAllPets());
    }
    public void destroy() {
    }
}