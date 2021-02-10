package kmitl.esd.exercise1.model.business;

public class LocalCompany extends Company{

    /**
     * getter method for companytype
     * @return companytype
     */
    public CompanyType getCompanyType() {
        return CompanyType.LOCAL;
    }

    /**
     * getter method for name
     * @return name
     */
    public String getName() {
        return "Local Comp." + name;
    }

    public void something() {
    }
}
