package test;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alexsandr on 21.04.2017.
 */
public class Group {
    private Student students = new Student();
    private String nameGrup;
    private List<Student> studentsLict = new ArrayList<>();

    public Group() {

    }

    public Group(String name_Grup) {
        this.nameGrup = name_Grup;

    }

    public String getNameGrup() {
        return nameGrup;
    }

    public void addStudent(Student student) {
        studentsLict.add(student);
    }

    public List<Student> getStudentsLict() {
        return studentsLict;
    }

    public List<Student> studentList() {
        return studentsLict;
    }

    @Override
    public String toString() {
        return "Group{" +
                ", students=" + students +
                ", nameGrup='" + nameGrup + '\'' +
                ", studentsLict=" + studentsLict +
                '}';
    }
}
