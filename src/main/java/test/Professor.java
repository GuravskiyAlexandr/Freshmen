package test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alexsandr on 21.04.2017.
 */
public class Professor {
    private boolean b = false;
    private String group_1 = "9_B";
    private String group_2 = "5_K";

    Group group = new Group();
    private String profesor = "Менделеев";
    private List<Group> list_Group = new ArrayList<>();
    private List<Students> students_Lict = new ArrayList<>();

    Professor(){
       list_Group.add(new Group(group_1));
       list_Group.add(new Group(group_2));

       Group gr =  list_Group.get(0);
       Students st = new Students("Пупкин", "Вася,", "крутой");
       gr.addStudentGroup(st);

       gr =  list_Group.get(0);
       st = new Students("Казявкин", "Гоша,", "лол");
       gr.addStudentGroup(st);

       gr =  list_Group.get(1);
       st = new Students("Цукан", "Борис,", "жадина");
       gr.addStudentGroup(st);

       gr =  list_Group.get(1);
       st = new Students("Конь", "Цыпа,", "гуляка");
       gr.addStudentGroup(st);
    }


    public String getProfesor() {
        return profesor;
    }
    public void group(){

       for (int i =0; i <list_Group.size(); i++){
           System.out.println(" Gpoup  "+ list_Group.get(i).getName_Grup());

           List<Students> st = list_Group.get(i).getStud();

           for (int f = 0; f < st.size(); f++){
               System.out.println(
                       list_Group.get(i).getStud().get(f).getFillName().toString());
           }

      }
        System.out.println();
        System.out.println(" Староста "+ group.getStarosta());

    }

    public void compare(String lastName){


        for (int i =0; i <list_Group.size(); i++){

            List<Students> st = list_Group.get(i).getStud();

            for (int f = 0; f < st.size(); f++) {
                if (lastName.equalsIgnoreCase(list_Group.get(i).getStud().get(f).getLastName().toString())) {
                    System.out.println(" Есть Этот студент " + lastName);
                    b = true;
                }
            }
        }
        if (!b){
            System.out.println(" Такого студента нет " + lastName);
        }
        b = false;
    }
    public void choice(){
        System.out.println(" С каким личным качеством должен быть староста ");
        for (int i =0; i <list_Group.size(); i++){
            List<Students> st = list_Group.get(i).getStud();
            for (int f = 0; f < st.size(); f++) {
                System.out.println(list_Group.get(i).getStud().get(f).getRespect().toString());

            }
        }
        System.out.println();
        System.out.println(" Выбирите его из списка и введите в консоль и он будет назначен");
    }
    public void starosta(String starosta){

        for (int i =0; i <list_Group.size(); i++){

            List<Students> st = list_Group.get(i).getStud();

            for (int f = 0; f < st.size(); f++) {
                if (starosta.equalsIgnoreCase(list_Group.get(i).getStud().get(f).getRespect().toString())) {
                    System.out.println(" Этот студент староста " + list_Group.get(i).getStud().get(f).getFillName());
                    starosta = list_Group.get(i).getStud().get(f).getFillName();
                    group.setStarosta(starosta);
                    b = true;
                }
            }
        }
        if (!b){
            System.out.println(" С таким качеством  '"+ starosta + "'  студента нет" );

        }
        b = false;
    }
}
