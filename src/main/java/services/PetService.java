package services;

import pets.PetEntity;
import dao.PetDao;

import java.util.ArrayList;
import java.util.List;

public class PetService
{
    private PetDao petDao = new PetDao();
    public PetService(){}
    public PetEntity findPet(int id)
    {
        return petDao.findById(id);
    }
    public void savePet(PetEntity pet)
    {
        petDao.save(pet);
    }
    public void updatePet(PetEntity pet)
    {
        petDao.update(pet);
    }
    public void deletePet(PetEntity pet)
    {
        petDao.delete(pet);
    }

    public List<PetEntity> getAllPets() { return petDao.getAllPets(); }
}