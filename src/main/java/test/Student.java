package test;

/**
 * Created by Alexsandr on 21.04.2017.
 */
public class Student {
    private String surname;
    private String name;
    private String quality;
    private String fullName;
    private Boolean captain;

    Student() {

    }

    public Student(String surname, String name, String quality, Boolean captain) {
        this.surname = surname;
        this.name = name;
        this.quality = quality;
        this.captain = captain;
        fullName = "Surname " + surname + " Name " + name;
    }

    public Boolean getCaptain() {
        return captain;
    }

    public void setCaptain(Boolean captain) {
        this.captain = captain;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
