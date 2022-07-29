package guru.qa;

public class Not_first_class {
    public static void main(String[] args) {
        Person employee = new Person(28, "Ivan", 521, "junior QA automation engineer");
        employee.goToVacation();
        employee.sayPosition();
    }
}
