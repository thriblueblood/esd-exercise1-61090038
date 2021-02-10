package kmitl.esd.exercise1.model.business;

/**
 * Encapsulation example: package privacy
 */
class Employee {

    protected String firstName;
    protected String surname;

    /**
     * getter method for fisrtname
     * @return firstname
     */
    public String getFirstName() {
      return firstName;
    }

    /**
     * setter method for firstname
     * @return void
     */
    public void setFirstName(String firstName) {
      this.firstName = firstName;
    }

    /**
     * getter method for surname
     * @return surname
     */
    public String getSurname() {
      return surname;
    }

    /**
     * setter method for surname
     * @return void
     */
    public void setSurname(String surname) {
      this.surname = surname;
    }
  }
