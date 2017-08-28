package test;

/**
 * Created by Alexsandr on 21.04.2017.
 */
public class Students {
    private String lastName;
    private String name;
    private String respect;
    private String fillName;
    Students(){

    }
    public Students(String lastName, String name, String respect){
        this.lastName=lastName;
        this.name=name;
        this.respect=respect;
        fillName="Фамилия "+lastName+" Имя "+ name;
    }


    public String getFillName() {

        return fillName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getRespect() {
        return respect;
    }

    public void setFillName(String fillName) {
        this.fillName = fillName;
    }
}
