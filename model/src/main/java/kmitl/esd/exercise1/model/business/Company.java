package kmitl.esd.exercise1.model.business;

/**
 * Superclass for the company inh. tree
 */
public abstract class Company implements ICompany {

    private String taxId;

    /**
     * factory method for subclasses
     * @param companyType type of the company
     * @return return an object of the company type
     */
    public static Company create(CompanyType companyType) {
        Company company = null;
        switch (companyType) {
            case LOCAL : company = new LocalCompany();
            case FOREIGN : company = new ForeignCompany();
        };
        return company;
    }

    // fields
    protected long id;
    protected String name;

    /**
     * Sole constructor. (For invocation by subclass
     * constructors, typically implicit.)
     */
    // Constructor
    public Company() {
    }

    /**
     * getter method for id
     * @return id
     */
    public long getId() {
        return id;
    }

    /**
     * setter method for id
     * @return void
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * getter method for name
     * @return id
     */
    public String getName() {
        return name;
    }

    public String setName() {
        return null;
    }

    /**
     * setter method for name
     * @return void
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getter method for taxid
     * @return taxid
     */
    public String getTaxId() {
        return this.taxId;
    }
}
