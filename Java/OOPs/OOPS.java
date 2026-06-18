public class OOPS {
    public static void main(String[] args){
        Pen p1 = new Pen(); // new heap me ek jagah capture kr leta hai, created a pen object (heap( me objects banegi) and stack me properties)
        p1.setColour("blue");

        System.out.println(p1.getColour());
        p1.setTip(4);
        System.out.println(p1.getTip());

        //System.out.println(p1.colour);
        //System.out.println(p1.tip);
    }
}
class Pen{
    private String colour;
    private int tip;

    int getTip(){ //getters
        return this.tip;
    }

    String getColour(){  //getters
        return this.colour;
    }


    void setColour(String newcolour){ //setters
        colour = newcolour;
    }
    void setTip(int newTip){ //setters
        tip = newTip;
    }
}
