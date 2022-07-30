package guru.qa;

public class Second {
    public static void main(String[] args) {
        Employee Junior = new Employee(28, "Ivan", 5, "junior QA automation engineer");
        Junior.goToVacation();
        Junior.sayPosition();

        Employee Senior = new Employee(35, "IvanIvan", 521, "Senior QA automation engineer");
        Senior.goToVacation();
        Senior.sayPosition();

        Employee Candidate = new Employee(17, "Vanya", 0, "");
        Candidate.goToVacation();
        Candidate.sayPosition();
    }
}
