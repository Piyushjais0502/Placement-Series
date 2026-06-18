public class methodOverloading {
    public static void main(String[] args){
       /* Calculator c = new Calculator();
        System.out.println(c.add(2,5));
        System.out.println(c.add(3, 7, 9));*/

        Printer p = new Printer();
        p.print(456.776655);
        p.print(55);
        p.print("piyush");

    }
}
/*class Calculator {
    int add(int a, int b){
        return a + b;
    }
    int add(int a, int b, int c){
        return a + b + c;
    }
}*/
class Printer{
    void print(String s){
        System.out.println("String : "+s);
    }
    void print(int a){
        System.out.println("Integer : "+a);
    }
    void print(double d){
        System.out.println("Double : "+d);
    }
}