package CreationalDesignPattern.SingletonDesignPattern.DoubleLocking;

public class DBConnection {

    private DBConnection(){}
    
    private static DBConnection connectionObject; //no intialization

    public static DBConnection getInstance(){
        //synchronized will allow one instance at a time ones that is return it will pass another
        if(connectionObject == null){
            //second time while checking the object is not null so execution will go to line 21
            synchronized(DBConnection.class){
                //here only one will go inside if null create new object and lock is released
                if(connectionObject == null)
                //Double locking is applied here
                    connectionObject = new DBConnection();
            }
        }
        //if already set
        return connectionObject;
       
    }
    
}
