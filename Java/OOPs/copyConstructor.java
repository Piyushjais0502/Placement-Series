public class copyConstructor {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Piyush";
        s1.roll = 23;

        Student s2 = new Student(s1);   //copy constructor

        System.out.println(s2.name);
        System.out.println(s2.roll);
    }
    
}
class Student{
    String name;
    int roll;

    Student (Student s1){               //copy constructor
        this.name = s1.name;
        this.roll = s1.roll;
    }


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
