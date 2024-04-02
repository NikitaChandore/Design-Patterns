package CreationalDesignPattern.AbstractFactoryPattern;

public class EconomicCarFactory implements AbstractFactory{
    
    @Override
    public Car getInstance(int price){
        if(price<20000)
        return new EconomicCar1();
        else
        return null;
    }
    
}
