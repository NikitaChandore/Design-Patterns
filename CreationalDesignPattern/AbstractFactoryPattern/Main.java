package CreationalDesignPattern.AbstractFactoryPattern;

public class Main {
    public static void main(String[] args) {
        AbstractFactoryProducer abstractFactoryProducer = new AbstractFactoryProducer();
        AbstractFactory abstractFactory = abstractFactoryProducer.geFactoryInstance("economic");
        Car car = abstractFactory.getInstance(20000);
        System.out.println(car.speed());

    }
}
