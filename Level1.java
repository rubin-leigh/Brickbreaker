import javax.swing.*;
import java.util.ArrayList;
/**
 * @author Leigh Rubin
 * Level1.java
 * Defines the Level
 */
public class Level1 implements Level
{
    private ArrayList<Brick> b;
    /**
     * Constructs a Level1 object
     */
    public Level1()
    {
        b = new ArrayList<Brick>();
        for(int i = 0; i < 12; i++){
            if(i == 1 || i == 4)
                b.add(new NormalBrick(1,true));
            else
                b.add(new NormalBrick(1,false));
        }
        placeBricks();
    }
    
    public void setLoc(int loc, int x, int y)
    {
        b.get(loc).setLoc(x,y);
    }
    
    public void placeBricks()
    {
        int mid = 316;
        int top = 100;
        int w = 86;
        int h = 45;
        setLoc(0, mid - w, top + 30);
        setLoc(1, mid + w, top + 30);
        setLoc(2, mid - 2*w, top + 30 + h);
        setLoc(3, mid + 2*w, top + 30 + h);
        setLoc(4, mid - 2*w, top + 30 + 3*h);
        setLoc(5, mid + 2*w, top + 30 + 3*h);
        setLoc(6, mid - 2*w, top + 30 + 4*h);
        setLoc(7, mid + 2*w, top + 30 + 4*h);
        setLoc(8, mid - 2*w, top + 30 + 6*h);
        setLoc(9, mid + 2*w, top + 30 + 6*h);
        setLoc(10, mid - w, top + 30 + 7*h);
        setLoc(11, mid + w, top + 30 + 7*h);
    }
    
    public ArrayList<Brick> getBricks()
    {
        return b;
    }
}