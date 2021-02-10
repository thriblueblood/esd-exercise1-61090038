package kmitl.exercise1.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepartmentTest {


    /**
     * Testing for print business unit name
     * @return void
     */
    @Test
    void printBusinessUnitName() {

    }

    /**
     * Testing for remove business unit
     * @return void
     */
    @Test
    void removeBusinessUnit() {
        BusinessUnit team1 = new Team(1,"Team1");
        BusinessUnit team2 = new Team(2,"Team2");

        Department department = new Department(3,"Department");

        department.addBusinessUnit(team1);
        department.addBusinessUnit(team2);
    }

    /**
     * Testing for add business unit
     * @return void
     */
    @Test
    void addBusinessUnit() {
        BusinessUnit team1 = new Team(1,"Team1");
        BusinessUnit team2 = new Team(2,"Team2");

        Department department = new Department(3,"Department");

        department.addBusinessUnit(team1);
        department.removeBusinessUnit(team1);
    }
}