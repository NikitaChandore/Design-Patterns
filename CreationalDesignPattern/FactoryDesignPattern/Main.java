package CreationalDesignPattern.FactoryDesignPattern;

public class Main {
    public static void main(String[] args) {
        
        ShapeInstanceFactory instance = new ShapeInstanceFactory();
        Shape shape = instance.getShapeInstance("circle"); //reation of object on the basic of condition
        shape.computeArea();
    }
}
