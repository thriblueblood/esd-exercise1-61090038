package kmitl.esd.exercise1.model.business;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LocalCompanyTest {

    private static LocalCompany localCompany;

    /**
     * LocalCompany testing (set up)
     */
    @BeforeEach
    void setUp() {
        localCompany = new LocalCompany();
    }

    /**
     * Test that the company type is equal
     */
    @Test
    void getCompanyType() {
        assertEquals(localCompany.getCompanyType(), CompanyType.LOCAL);
    }

    /**
     * Test name
     */
    @Test
    void getName() {
    }

    @Test
    void something() {
    }
}