package kmitl.esd.exercise1;

import kmitl.esd.exercise1.simple.CompanyManager;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanyManagerTest {

    /**
     * test that CompanyManger is not null
     */
    @Test
    void getInstance() {
        assertNotEquals(CompanyManager.getInstance(), null);
    }
}