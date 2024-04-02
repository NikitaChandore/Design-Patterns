package CreationalDesignPattern.AbstractFactoryPattern;
//factory of factory

public class AbstractFactoryProducer {
    public AbstractFactory geFactoryInstance(String value){
        if(value.equals("economic"))
        return new EconomicCarFactory();
        else if(value.equals("luxury"))
        return new LuxuryCarFactory();
        else return null;
    }
    
}
