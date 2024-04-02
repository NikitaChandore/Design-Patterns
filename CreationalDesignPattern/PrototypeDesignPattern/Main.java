package CreationalDesignPattern.PrototypeDesignPattern;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("nikita",2,26);
        //Creating a Clone Object
        Student cloStudent = new Student();
        cloStudent.name = student.name;
        cloStudent.age = student.age;
       // cloStudent.rollNumber = student.rollNumber;
       // above line create an error because rollnumber is private variable
       // another problem is that here cloneobject need to know everything about the base object
       // what if I want to use only one variable for clonning

       
       //another way of doing clonning
       //Implement Student class with Prototype interface
       Student studentClone = (Student)student.clone();

    }
    
}
