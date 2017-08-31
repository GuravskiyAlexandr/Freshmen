package test;


import java.util.ArrayList;
import java.util.List;


public class Group {
    private String nameGrup;
    private List<Student> studentsLict = new ArrayList<>();

    public Group() {

    }

    public Group(String nameGroup) {
        this.nameGrup = nameGroup;

    }

    public String getNameGroup() {
        return nameGrup;
    }

    public void addStudent(Student student) {
        studentsLict.add(student);
    }

    public List<Student> getStudentsLict() {
        return studentsLict;
    }

    @Override
    public String toString() {
        return "Group{" +
                ", nameGrup= " + nameGrup + '\'' +
                ", studentsLict=" + studentsLict +
                '}';
    }
}
