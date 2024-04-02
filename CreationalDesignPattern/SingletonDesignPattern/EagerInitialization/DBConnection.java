package CreationalDesignPattern.SingletonDesignPattern.EagerInitialization;

public class DBConnection {

    //when the class will load this static object will also get initialize
    
    private DBConnection(){}
    //not accessible outside the class so that creation will get restricted 
    
    private static DBConnection connectionObject = new DBConnection();
    //created static intance

    public static DBConnection getInstance(){
        //static members are related to class
        return connectionObject;
    }
    
}
