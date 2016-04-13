import javax.swing.*;
import java.util.ArrayList;
/**
 * @author Leigh Rubin
 * Level8.java
 * Defines the Level
 */
public class Level8 implements Level
{
    private ArrayList<Brick> b;
    /**
     * Constructs a Level8 object
     */
    public Level8()
    {
        b = new ArrayList<Brick>();
        b.add(new NormalBrick(3,false));
        b.add(new NormalBrick(3,false));
        b.add(new NormalBrick(3,false));
        b.add(new NormalBrick(3,false));
        b.add(new NormalBrick(3,false));
        b.add(new NormalBrick(3,false));
        b.add(new NormalBrick(3,false));
        b.add(new NormalBrick(3,false));
        b.add(new NormalBrick(3,false));
        b.add(new NormalBrick(3,false));
        b.add(new NormalBrick(3,false));
        b.add(new NormalBrick(3,false));
        b.add(new NormalBrick(3,false));
        b.add(new NormalBrick(3,false));
        b.add(new NormalBrick(3,false));
        b.add(new NormalBrick(3,false));
        b.add(new NormalBrick(3,false));
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
        setLoc(0, mid - 3*w, top);
        setLoc(1, mid + w, top);
        setLoc(2, mid, top + h);
        setLoc(3, mid - w, top + 2*h);
        setLoc(4, mid + 3*w, top + 2*h);
        setLoc(5, mid - 2*w, top + 3*h);
        setLoc(6, mid + 2*w , top + 3*h);
        setLoc(7, mid - 3*w, top + 4*h);
        setLoc(8, mid + w, top + 4*h);
        setLoc(9, mid, top + 5*h);
        setLoc(10, mid - w, top + 6*h);
        setLoc(11, mid + 3*w, top + 6*h);
        setLoc(12, mid - 2*w, top + 7*h);
        setLoc(13, mid + 2*w, top + 7*h);
        setLoc(14, mid - 3*w, top + 8*h);
        setLoc(15, mid + w, top + 8*h);
        setLoc(16, mid, top + 9*h);
    }
    
    public ArrayList<Brick> getBricks()
    {
        return b;
    }
}