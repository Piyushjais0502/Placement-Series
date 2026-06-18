public class Inheritance{
    public static void main(String[] args){
        Labrador L = new Labrador();
        L.eat();
        L.bark();
        L.colour();

    }
}
class Animal{
    void eat(){
        System.out.println("Animal is Eating...");
    }
}
class Dog extends Animal{     //single level inheritance
    void bark(){
        System.out.println("The Dog is barking");
    }
}
class Labrador extends Dog{   //Multilevel inheritance
    void colour(){
        System.out.println("The dog is of golden colour..");
    }
}