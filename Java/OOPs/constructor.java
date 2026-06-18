public class constructor {
    public static void main(String[] args){
        //Student s1 = new Student("Piyush");
       // System.out.println(s1.name);
       Student s1 = new Student();
    }
}
class Student{
    String name;
    int roll;

    Student(){                //non parametrized constructor
        System.out.println("Constructor is called...");
    }
    Student(String name){     //parametrized constructor
        this.name = name;
    }
    Student (int roll){       //we can create multiple constructor
        this.roll = roll;
    }
}
