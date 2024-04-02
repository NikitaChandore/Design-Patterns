package CreationalDesignPattern.FactoryDesignPattern;

public class ShapeInstanceFactory {

    //If any change in condition only one class need to change 
    public Shape getShapeInstance(String value){
        if(value.equals("circle")){
            return new Circle();
        }
        else if(value.equals("square")){
            return new Square();
        }
        return null;
    }
    
}
