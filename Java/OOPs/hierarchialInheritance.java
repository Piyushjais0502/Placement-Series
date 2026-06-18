public class hierarchialInheritance {
    public static void main(String[] args){

        Circle c = new Circle();
        c.draw();
        c.setArea(55);
        c.getArea();

        Square s = new Square();
        s.draw();
        s.setParameter(44);
        s.getParameter();
    }
}
class Shape{
    void draw(){
        System.out.println("Drawing a shape...");
    }
}
class Circle extends Shape{

    private int area;

    void setArea(int area){
        this.area = area;
    }
    void getArea(){
        System.out.println("Area of circle : " + area);
    }
}
class Square extends Shape{
    private int parameter;

    void setParameter(int parameter){
        this.parameter = parameter;
    }
    void getParameter(){
        System.out.println("Parameter of square: "+ parameter);
    }
}
