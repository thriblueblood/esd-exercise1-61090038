package kmitl.exercise1.composite;

import java.util.ArrayList;
import java.util.List;

public class Department implements BusinessUnit {
    private Integer id;
    private  String name;

    private List<BusinessUnit> chlidBusinessUnit;

    /**
     * Constructor for Department class
     */
    public Department(Integer id, String name){
        this.id = id;
        this.name = name;
        this.chlidBusinessUnit = new ArrayList<>();
    }

    /**
     * Fucntion for print business unit name
     * @return void
     */
    @Override
    public void printBusinessUnitName() {
        chlidBusinessUnit.forEach(BusinessUnit::printBusinessUnitName);
    }

    /**
     * Function for remove business unit
     * @param  businessUnit businessUnit to remove
     * @return void
     */
    public void removeBusinessUnit(BusinessUnit businessUnit){
        chlidBusinessUnit.remove(businessUnit);
    }

    /**
     * Function for add business unit
     *@param  businessUnit businessUnit to add
     * @return void
     */
    public void addBusinessUnit(BusinessUnit businessUnit){
        chlidBusinessUnit.add(businessUnit);
    }
}
