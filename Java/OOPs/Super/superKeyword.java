public class superKeyword {
    public static void main(String[] args){
        Horse h = new Horse();
        System.out.println(h.colour);

    }
}
class Animal{
    String colour;
    Animal(){
        System.out.println("Animal Constructor is called...");
    }
}
class Horse extends Animal{
    
    Horse(){
        super();
        super.colour = "brown";
        System.out.println("Horse contructor is called...");
    }
}
