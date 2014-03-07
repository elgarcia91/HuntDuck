package hunt;

import java.util.Random;

public class Hunter implements FieldItem {

    private final char type = 'H';
    Random rnd = new Random();
    private int hunted;

    Hunter(HuntField f) {
        hunted = 0;
        Position pos = getRandomPos(f);
        boolean set = setItem(Hunter, pos);
        
    }

    @Override
    public boolean fired() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public char getType() {
        return 'H';
    }

    void start() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int hunted(){
        return hunted;
    }
    
    private Position getRandomPos(HuntField f){
        int x = (int)(rnd.nextDouble() * f.getXLength());
        int y = (int)(rnd.nextDouble() * f.getYLength());
        Position pos = new Position(x, y);
        return pos;
    }
}
