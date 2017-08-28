package test;

import java.util.Scanner;

/**
 * В програмі мають бути створені класи: студенти, професор, група (за бажанням класи можна додавати);
 Дизайн класів (їх поля, взаємозв’язки) - також Ваша задача;
 1 Студенти повинні вміти обрати Старосту за особистими якостями одногрупників (правила відбору визначаєте Ви).
    Програма повинна виводити Старосту групи в консоль;
 2 Професор має вміти провести перекличку та визначити, чи всі студенти присутні (результат виводиться в консоль);
 3 Набір студентів, груп та професорів може бути заданий за замовчуванням (можна захардкодити);
 Приділіть увагу правилам ООП;
 Не забудьте прикласти інструкцію користувача до виконаного завдання.
 * Created by Alexsandr on 21.04.2017.
 */
public class Main {
    private static Professor pr = new Professor();
    private static int k = 0;
    private static   boolean run = true;
    private static   boolean run_2 = true;

    public static void print(){
        System.out.println("Выбирите какой пункт вы хотите и введите в консоль и нажмите 'Enter' ");
        System.out.println();
        System.out.println("1 Провести перекличку ");
        System.out.println("2 Выбрать Старосту ");
        System.out.println("3 Вывести старасту на консоль ");
    }
    public static String Scan(){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        return s;
    }

    public static int check() {// создаем метод проверки чтоб водили только
                                 // цыфры буквы ни ни!

        do {
            Scanner scan = new Scanner(System.in);
            if (scan.hasNextInt()) {
                k = scan.nextInt();
                break;
            } else {
                System.out.println(" Будте внимательней!!!");
                System.out.println(" В ведите номер пункта который вас интересует ");
            }
        } while (true);
        return k;
    }
    public static   void rollcall() {
        System.out.println("Професор  "+pr.getProfesor()+" проводит перекличку  Выбирите какой пункт вы хотите и введите в консоль и нажмите 'Enter' ");
        System.out.println("1 вывести на консоль список студентов ");
        System.out.println("2 ввести Фамилию студента и узнать если он на месте ");

        while (run_2) {
            check();
            switch (k) {
                case 1:
                    pr.group();
                    run = true;
                    starting(run);
                    run_2 =false;
                    break;
                case 2:
                    pr.compare(Scan());
                    run = true;
                    starting(run);
                    run_2 =false;
                    break;
            }
        }
    }

    public static void main(String[] args) {
        starting(run);

    }
    public static void  starting(Boolean run){
        System.out.println();
        while (run){
            print();
            check();
            switch (k){
                case 1:
                    rollcall();
                    run = false;
                    k = 0;

                    break;

                case 2:
                    choose();
                    pr.starosta(Scan());
                    break;


                case 3:
                    System.out.println( " Староста "+ pr.group.getStarosta());
                    break;


            }

        }
    }

    private static void choose() {
        pr.choice();
    }

}
