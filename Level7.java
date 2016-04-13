import javax.swing.*;
import java.util.ArrayList;
/**
 * @author Leigh Rubin
 * Level7.java
 * Defines the Level
 */
public class Level7 implements Level
{
    private ArrayList<Brick> b;
    /**
     * Constructs a Level7 object
     */
    public Level7()
    {
        b = new ArrayList<Brick>();
        b.add(new NormalBrick(1,true));
        b.add(new NormalBrick(1,true));
        b.add(new NormalBrick(4,false));
        b.add(new NormalBrick(4,false));
        b.add(new NormalBrick(2,false));
        b.add(new NormalBrick(2,false));
        b.add(new NormalBrick(2,false));
        b.add(new NormalBrick(2,true));
        b.add(new NormalBrick(2,true));
        b.add(new NormalBrick(1,false));
        b.add(new NormalBrick(1,false));
        b.add(new NormalBrick(1,false));
        b.add(new NormalBrick(1,false));
        b.add(new NormalBrick(1,false));
        b.add(new NormalBrick(1,false));
        b.add(new NormalBrick(1,false));
        b.add(new NormalBrick(3,true));
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
        setLoc(0, mid - w, top);
        setLoc(1, mid + w, top);
        setLoc(2, mid - w, top + h);
        setLoc(3, mid + w, top + h);
        setLoc(4, mid - w, top + 2*h);
        setLoc(5, mid + w, top + 2*h);
        setLoc(6, mid - w , top + 3*h);
        setLoc(7, mid, top + 3*h);
        setLoc(8, mid + w, top + 3*h);
        setLoc(9, mid - 2*w, top + 4*h);
        setLoc(10, mid - w, top + 4*h);
        setLoc(11, mid, top + 4*h);
        setLoc(12, mid + w, top + 4*h);
        setLoc(13, mid + 2*w, top + 4*h);
        setLoc(14, mid - 3*w, top + 5*h);
        setLoc(15, mid + 3*w, top + 5*h);
        setLoc(16, mid, top + 6*h);
    }
    
    public ArrayList<Brick> getBricks()
    {
        return b;
    }
}