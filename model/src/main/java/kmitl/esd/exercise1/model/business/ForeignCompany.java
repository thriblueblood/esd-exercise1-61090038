package kmitl.esd.exercise1.model.business;

// derived class, Company is the super class
// ForeignCompany inherits Company
// superclass is not an interface -> behavioral inheritance
public class ForeignCompany extends Company{
    // -> behavioral inheritance

    /**
     * getter method for companytype
     * @return companytype
     */
    public CompanyType getCompanyType() {
        return CompanyType.FOREIGN;
    }

    /**
     * getter method for name
     * @return name
     */
    public String getName() {
        return "Foreign Comp." + name;
    }
}
