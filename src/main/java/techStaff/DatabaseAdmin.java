package techStaff;
import staff.Employee;

public class DatabaseAdmin extends Employee {

    public DatabaseAdmin(String name, String niNumber, double salary) {
        super(name, niNumber, salary);
    }

    @Override
    public void raiseSalary(double num) {
        this.salary += num;
    }

    @Override
    public void payBonus() {
        this.salary += salary * .01;
    }


}
