package guru.qa;

import static java.lang.Math.rint;

public class Person {
    private int age; // указывается в годах
    private int operating_time; // время работы, указывается в месяцах
    private String name;
    private String position; // Должность работника
    private double dayVacation = 14;


    public Person(int age, String name, int operating_time, String position) {
        this.age = age;
        this.name = name;
        this.operating_time = operating_time;
        this.position = position;
    }

    void goToVacation() {
        if (age >= 18) {
            if (operating_time >= 6) {
                for (int i = operating_time - 6; i > 0; i--) {
                    dayVacation += 2.33;
                }
                System.out.println("Вы можете уйти в отпуск, у Вас есть " + (int)rint(dayVacation) + " отпускных дней");
            } else {
                System.out.println("Пока вы не можете уйти в оплачиваемый отпуск, " +
                        "для этогов Вам необходимо еще отработать еще " + (6 - operating_time) + " месяц");
            }
        } else {
            System.out.println("Вы еще не можете работать, Вам нет 18 лет");
        }
    }

    void sayPosition() {
        if (age >= 18) {
            System.out.println("Ваша должность : " + position);
        }
    }
}
