public class interfaceUse {
    public static void main(String[] args){
        Queen q = new Queen();
        q.moves();
        Rook r = new Rook();
        r.moves();
    }
}
interface chessPlayer{
    void moves();
}
class Queen{
    void moves(){
        System.out.println("Queen moves UP, down, right, left , diagonal");
    }
}
class Rook{
    void moves(){
        System.out.println("Rook moves up, down, right, left");
    }
}
