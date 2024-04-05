package aula3.arqweb.aula3.model;

public class Student {
    private String name;
    private String lastName;
    private String Adress;
    private Long id;
    private String Hobby;

    public void Student(String name, String lastName, String Adress, Long id, String Hobby) {
        this.name = name;
        this.lastName = lastName;
        this.Adress = Adress;
        this.id = (long) id;
        this.Hobby = Hobby;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String adress) {
        Adress = adress;
    }

    public Long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = (long) id;
    }

    public String getHobby() {
        return Hobby;
    }

    public void setHobby(String hobby) {
        Hobby = hobby;
    }
}
