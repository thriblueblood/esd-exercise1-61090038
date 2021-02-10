package kmitl.exercise1.composite;

public class CompositeMain {
    /**
     * Main for Composite Pattern
     *
     * @return void
     */
    public static void main(String[] args) {
        BusinessUnit team1 = new Team(1,"Team1");
        BusinessUnit team2 = new Team(2,"Team2");

        Department department = new Department(3,"Department");

        department.addBusinessUnit(team1);
        department.addBusinessUnit(team2);
        department.removeBusinessUnit(team2);

        department.printBusinessUnitName();
    }
}
