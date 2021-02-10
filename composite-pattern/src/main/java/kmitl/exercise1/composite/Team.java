package kmitl.exercise1.composite;
import java.util.logging.Logger;

public class Team implements BusinessUnit {
    private Integer id;
    private String name;

    public Team(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * getter method for id
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * setter method for id
     * @return void
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * getter method for name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * setter method for name
     * @return void
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * A function for showing the business unit details
     *
     * @return void
     */
    @Override
    public void printBusinessUnitName() {
        Logger.getLogger(Team.class.getSimpleName()).info("Team :" + name);
    }
}
