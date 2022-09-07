package techStaff;
import staff.Employee;

public class Developer extends Employee {
    public Developer(String name, String niNumber, double salary) {
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
