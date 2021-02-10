package kmitl.esd.exercise1.registration;

public class CompanyManager {
    private static CompanyManager instance = null;


    protected CompanyManager() {
    }

    public static CompanyManager getInstance(){
        if (instance == null){
            synchronized (CompanyManager.class){
                if(instance == null){
                    instance = new CompanyManager();
                }
            }
        }
        return instance;
    }
//    public void doSthInstance() {
//        System.out.println("Sth with the instance");
//    }

//    protected String positionName;
//
//    public static ManagerType getPosition(String Position) {
//        if(Position.equalsIgnoreCase("finance")){
//            return new FinanceManager();
//        }
//        else if (Position.equalsIgnoreCase("production")){
//            return new ProductionManager();
//        }
//        return null;
//    }
//
//
//    public String getPositionName (){ return positionName;}
}
