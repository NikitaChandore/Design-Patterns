package CreationalDesignPattern.PrototypeDesignPattern;

public class Student implements ProtoType{
    String name;
    private int rollNumber;
    int age;
    Student(){}
    Student(String name,int rollNumber,int age){
        name = this.name;
        rollNumber = this.rollNumber;
        age = this.age;
    }

    //for protype clonning

    @Override
    public ProtoType clone(){
        return new Student(name,rollNumber,age);
    }
}
