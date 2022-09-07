import management.Manager;
import management.Director;
import techStaff.DatabaseAdmin;
import techStaff.Developer;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class EmployeeTest {

    Manager manager;
    Director director;

    @Before
    public void setUp(){
        manager = new Manager("John", "PB9136CC", 60000, "UI UX");
        director = new Director("NaeFunx", "PB£*@&HD", 100000, 10000000);
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(10000.00);
        assertEquals(70000.00, manager.getSalary(), 0.0);
    }

    @Test
    public void canPayBonus(){
        manager.payBonus();
        assertEquals(60600.00, manager.getSalary(), 0.0);
    }

    @Test
    public void canGetBudget(){
        assertEquals(10000000, director.getBudget(), 0.0);
    }

    @Test
    public void canChangeName(){
        manager.setName("Andrew");
        assertEquals("Andrew", manager.getName());
    }

    @Test
    public void cannotTakeNullToChangeName(){
        manager.setName("");
        assertEquals("John", manager.getName());
    }


}
