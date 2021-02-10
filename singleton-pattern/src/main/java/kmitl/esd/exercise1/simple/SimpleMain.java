package kmitl.esd.exercise1.simple;
import java.util.logging.Logger;

public class SimpleMain {
    /**
     * the main for Singleton pattern
     *
     * @return void
     */
    public static void main(String args[]) {
        CompanyManager companyManager = CompanyManager.getInstance();

        Logger.getLogger(SimpleMain.class.getName()).info("Simple: " + companyManager);
    }
}
