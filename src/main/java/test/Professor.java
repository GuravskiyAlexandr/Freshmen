package test;


/**
 * Created by Alexsandr on 28.08.2017.
 */
public class Professor {
    private String surname;
    private String name;
    private String fullname;
    private Group group = new Group();


    public Professor(String surname, String name, Group group) {
        this.surname = surname;
        this.name = name;
        this.group = group;
        this.fullname =  surname+" "+name;

    }

    public String getFullname() {
        return fullname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "surname=' " + surname + '\'' +
                ", name=' " + name + '\'' +
                ", group= " + group.getNameGrup() +
                '}';
    }
}
