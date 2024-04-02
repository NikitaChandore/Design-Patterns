package CreationalDesignPattern.AbstractFactoryPattern;

public class LuxuryCarFactory implements AbstractFactory{
   @Override
    public Car getInstance(int price){
        if(price>20000)
        return new LuxuryCar1();
        else
        return null;
    }
}