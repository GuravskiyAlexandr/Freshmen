package test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alexsandr on 28.08.2017.
 */
public class University {
    private List<Group> groupsList = new ArrayList<>();
    private List<Professor> professorsList = new ArrayList<>();

    public University() {

        String group1 = "Computer techologies";
        String group2 = "engineering";

        groupsList.add(new Group(group1));
        groupsList.add(new Group(group2));

        Group group = groupsList.get(0);
        Student student = new Student("John", "Smit", "Cool", false);
        group.addStudent(student);

        group = groupsList.get(0);
        student = new Student("Tramp", "Alexsndr", "Greedy", false);
        group.addStudent(student);

        group = groupsList.get(1);
        student = new Student("Cucerman", "Kris", "Cunning", false);
        group.addStudent(student);

        group = groupsList.get(1);
        student = new Student("Barek", "Abama", "Reveler", false);
        group.addStudent(student);

        Professor professor = new Professor("Mendeleev", "Dmitry", groupsList.get(0));
        Professor professor1 = new Professor("Зубов", "Андрей", groupsList.get(1));
        professorsList.add(professor);
        professorsList.add(professor1);

    }

    public void qualityLIst() {
        System.out.println("With what personal quality should be the captain ");
        for (int i = 0; i < groupsList.size(); i++) {
            List<Student> st = groupsList.get(i).getStudentsLict();
            for (int f = 0; f < st.size(); f++) {
                System.out.println(groupsList.get(i).getStudentsLict().get(f).getQuality().toString());
            }
        }
        System.out.println();
        System.out.println(" Select it from the list and enter it into the console and it will be assigned");
    }

    public void allStudentsGroupsProfessorsPrint() {
        for (Professor pp : professorsList) {
            System.out.println("Professor " + pp.getFullname());
            System.out.println("Group " + pp.getGroup().getNameGroup());
            for (Student ss : pp.getGroup().getStudentsLict()) {
                System.out.println("Student " + ss.getFullName());
            }
            System.out.println();
        }
    }

    public void checkPresenceOfStudent(String lastName) {
        boolean presence = true;
        for (int i = 0; i < groupsList.size(); i++) {
            List<Student> st = groupsList.get(i).getStudentsLict();
            for (int j = 0; j < st.size(); j++) {
                if (lastName.equalsIgnoreCase(groupsList.get(i).getStudentsLict().get(j).getSurname())) {
                    System.out.println(" There is such a student " + lastName + "\n");
                    presence = false;
                }
            }
        }
        if (presence) {
            System.out.println(" There isn't such a student " + lastName + "\n");
        }
    }

    public void chooseCaptain(String quality) {
        boolean search = true;
        for (int i = 0; i < groupsList.size(); i++) {
            List<Student> st = groupsList.get(i).getStudentsLict();
            for (int j = 0; j < st.size(); j++) {
                if (quality.equalsIgnoreCase(groupsList.get(i).getStudentsLict().get(j).getQuality().toString())) {
                    System.out.println(" Captain  " + groupsList.get(i).getStudentsLict().get(j).getFullName());
                    quality = groupsList.get(i).getStudentsLict().get(j).getFullName() + "  quality " + quality;
                    //group.setCaptain(quality);
                    groupsList.get(i).getStudentsLict().get(j).setCaptain(true);
                    search = false;
                    System.out.println();
                }
            }
        }
        if (search) {
            System.out.println(" There is no such quality = '" + quality + "\n");
        }
        search = true;
    }

    public void showGroup(String nameGroup) {
        boolean such = true;
        for (int i = 0; i < groupsList.size(); i++) {
            if (nameGroup.equalsIgnoreCase(groupsList.get(i).getNameGroup())) {
                System.out.println("Group  " + nameGroup);
                List<Student> st = groupsList.get(i).getStudentsLict();
                for (int j = 0; j < st.size(); j++) {
                    System.out.println("Student  " + st.get(j).getFullName());
                    such = false;
                }
            }
        }
        System.out.println();
        if (such) {
            System.out.println(" There isn't such a group \n");
        }
    }

    public String showCaptain() {
        for (int i = 0; i < groupsList.size(); i++) {
            List<Student> st = groupsList.get(i).getStudentsLict();
            for (int j = 0; j < st.size(); j++) {
                if (groupsList.get(i).getStudentsLict().get(j).getCaptain()) {
                    return groupsList.get(i).getStudentsLict().get(j).getFullName();
                }
            }
        }
        return " Captain not selected";
    }
}
