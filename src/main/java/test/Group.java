package test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alexsandr on 21.04.2017.
 */
public class Group {
    private String starosta = "нет";
    private Students students = new Students() ;
    private String name_Grup;
    private List<Students> students_Lict = new ArrayList<>();

    public Group() {

    }

    public void setStarosta(String starosta) {
        this.starosta = starosta;
    }

    public String getStarosta() {
        return starosta;
    }


    Group(String name_Grup){
        this.name_Grup = name_Grup;
        this.starosta = starosta;

    }

    public String getName_Grup() {
        return name_Grup;
    }

    public void addStudentGroup(Students student) {
        students_Lict.add(student);
    }
    public List<Students> getStud(){
        return students_Lict;
    }
}
