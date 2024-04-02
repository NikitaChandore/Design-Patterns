package CreationalDesignPattern.SingletonDesignPattern.LazyIntialization;

public class DBConnection {

    //problem
    //If two threads comes simultaneously then at both the time they will find instamce as null and will return new instance everytime
        
    private DBConnection(){}
    //not accessible outside the class so that creation will get restricted 
    
    private static DBConnection connectionObject; //no intialization
    //created static intance

    public static DBConnection getInstance(){
        //static members are related to class
        if(connectionObject == null){
            
            connectionObject = new DBConnection();
        }
        //if already set
        return connectionObject;
       
    }
    
}
