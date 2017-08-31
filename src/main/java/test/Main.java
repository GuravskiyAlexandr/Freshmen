package test;

import java.util.Scanner;

/**
 * Created by Alexsandr on 28.08.2017.
 * Технічне завдання: напишіть програму “Першокурсники”:
 * В програмі мають бути створені класи: студенти, професор, група (за бажанням класи можна додавати);
 * Дизайн класів (їх поля, взаємозв’язки) - також Ваша задача;
 * Студенти повинні вміти обрати Старосту за особистими якостями одногрупників (правила відбору визначаєте Ви). Програма повинна виводити Старосту групи в консоль;
 * Професор має вміти провести перекличку та визначити, чи всі студенти присутні (результат виводиться в консоль);
 * Набір студентів, груп та професорів може бути заданий за замовчуванням (можна захардкодити);
 * Приділіть увагу правилам ООП;
 * Не забудьте прикласти інструкцію користувача до виконаного завдання.
 */
public class Main {
    private static int number;
    private static University university = new University();

    public static void main(String[] args) {
        starting();
    }

    public static void print() {
        System.out.println("Select the item number and enter into the console and press 'Enter' ");
        System.out.println();
        System.out.println("0 Exit from the program");
        System.out.println("1 Take roll call");
        System.out.println("2 Choose Captain ");
        System.out.println("3 Show captain's name on the console ");
        System.out.println();
    }

    public static String readConsole() {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        return text;
    }

    public static int check() {
        do {
            Scanner scan = new Scanner(System.in);
            if (scan.hasNextInt()) {
                number = scan.nextInt();
                break;
            } else {
                System.out.println(" Be attentive!!!");
                System.out.println(" Enter the number of the item you are interested in. ");
            }
        } while (true);
        return number;
    }

    public static void rollcall() {
        System.out.println("Select the item number and enter into the console and press 'Enter'  \n");
        System.out.println("1 List of all students from all groups  as well as professors assigned to each group on the console ");
        System.out.println("2 Enter the surname of the student and find out if he is in place ");
        System.out.println("3 Enter the group name to see the students\n ");

        check();
        switch (number) {
            case 1:
                university.allStudentsGroupsProfessorsPrint();
                break;
            case 2:
                System.out.println("Enter the surname");
                university.checkPresenceOfStudent(readConsole());
                break;
            case 3:
                System.out.println("Enter the group name");
                university.showGroup(readConsole());
                break;
        }

    }

    public static void starting() {
        System.out.println();
        while (true) {
            print();
            check();
            switch (number) {
                case 0:
                    System.exit(0);
                case 1:
                    rollcall();
                    break;
                case 2:
                    university.qualityLIst();
                    university.chooseCaptain(readConsole());
                    break;
                case 3:
                    System.out.println(" Captain " + university.showCaptain() + "\n");
                    break;
            }
        }
    }
}
