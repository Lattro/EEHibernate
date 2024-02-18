package pets;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Pet implements Serializable
{
    private int id;
    private String name;
    private String breed;
    private int age;
    private int price;
    public Pet()
    {

    }
    public Pet(int id)
    {
        this.id=id;
    }
    public Pet(int id,String name,String breed,int age, int price)
    {
        this.id=id;
        this.name = name;
        this.breed = breed;
        this.age=age;
        this.price = price;
    }
    public Pet(String name,String breed,int age, int price)
    {
        this.name = name;
        this.breed = breed;
        this.age=age;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public int getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ArrayList<Pet> selectAllPets()
    {
        ArrayList<Pet> petList = new ArrayList<>();
        try
        {
            String query = "select * from pet";
            Connection connection = GetMySQLConnection.getConnection();
            Statement statement = connection.createStatement();
            ResultSet set = statement.executeQuery(query);
            while (set.next())
            {
                petList.add(new Pet(set.getInt(1),set.getString(2),set.getString(3),set.getInt(4),set.getInt(5)));
            }
        }
        catch (Exception exception)
        {
            System.out.println(exception);
        }
        return petList;
    }
    public Pet selectPet(int id)
    {
        Pet pet = new Pet();
        String query = "select * from pet where id=?";
        try
        {
            Connection connection = GetMySQLConnection.getConnection();
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1,id);
            ResultSet set = statement.executeQuery();
            while (set.next())
            {
                pet.id = set.getInt(1);
                pet.name = set.getString(2);
                pet.breed=set.getString(3);
                pet.age=set.getInt(4);
                pet.price=set.getInt(5);
            }
            statement.close();
            set.close();
        }
        catch (Exception exception)
        {
            System.out.println(exception);
        }
        return pet;
    }
    public void insertPet()
    {
        try
        {
            String query = "insert into pet(name,breed,age,price) values(?,?,?,?)";
            Connection connection = GetMySQLConnection.getConnection();
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1,name);
            statement.setString(2,breed);
            statement.setInt(3,age);
            statement.setInt(4,price);
            statement.executeUpdate();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public void updatePet()
    {
        try
        {
            String query = "update pet set name=?, breed=?, age=?, price=? where id=?";
            Connection connection = GetMySQLConnection.getConnection();
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1,name);
            statement.setString(2,breed);
            statement.setInt(3,age);
            statement.setInt(4,price);
            statement.setInt(5,id);
            statement.executeUpdate();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    public void deletePet()
    {
        try
        {
            String query = "delete from pet where id=?";
            Connection connection = GetMySQLConnection.getConnection();
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1,id);
            statement.executeUpdate();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
