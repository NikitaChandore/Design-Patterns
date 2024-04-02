package CreationalDesignPattern.SingletonDesignPattern.SynchronisedInitialization;

public class DBConnection {

    //problem
    //If two threads comes simultaneously then at both the time they will find instamce as null and will return new instance everytime
    //solution
    //Synchronised intialization 
    private DBConnection(){}
    
    private static DBConnection connectionObject; //no intialization

    synchronized public static DBConnection getInstance(){
        //synchronized will allow one instance at a time ones that is return it will pass another
        if(connectionObject == null){
            
            connectionObject = new DBConnection();
        }
        //if already set
        return connectionObject;
       
    }

    //problem with above is that it is very expensive synchronization is kind of locking that locks the thread before 
    //sending it to the method
    
}
