package pets;

import jakarta.persistence.*;

@Entity
@Table(name = "pet", schema = "pets", catalog = "")
public class PetEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "breed")
    private String breed;
    @Basic
    @Column(name = "age")
    private Integer age;
    @Basic
    @Column(name = "price")
    private Integer price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public PetEntity() {

    }

    public PetEntity(String name, String breed, Integer age, Integer price) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.price = price;
    }

    public PetEntity(int id, String name, String breed, Integer age, Integer price) {
        this.id = id;
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PetEntity petEntity = (PetEntity) o;

        if (id != petEntity.id) return false;
        if (name != null ? !name.equals(petEntity.name) : petEntity.name != null) return false;
        if (breed != null ? !breed.equals(petEntity.breed) : petEntity.breed != null) return false;
        if (age != null ? !age.equals(petEntity.age) : petEntity.age != null) return false;
        if (price != null ? !price.equals(petEntity.price) : petEntity.price != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (breed != null ? breed.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        return result;
    }
}
