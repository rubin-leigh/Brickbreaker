import javax.swing.*;
import java.util.ArrayList;
/**
 * @author Leigh Rubin
 * Level21.java
 * Defines the Level
 */
public class Level21 implements Level
{
    private ArrayList<Brick> b;
    /**
     * Constructs a Level21 object
     */
    public Level21()
    {
        b = new ArrayList<Brick>();
        b.add(new NormalBrick(4,true));
        b.add(new NormalBrick(4,true));
        b.add(new NormalBrick(4,true));
        b.add(new NormalBrick(4,true));
        b.add(new NormalBrick(4,true));
        b.add(new NormalBrick(4,true));
        b.add(new NormalBrick(4,true));
        b.add(new NormalBrick(4,false));
        b.add(new MetalBrick());
        b.add(new MetalBrick());
        b.add(new NormalBrick(4,false));
        b.add(new NormalBrick(1,false));
        b.add(new MetalBrick());
        b.add(new MetalBrick());
        b.add(new NormalBrick(1,false));
        b.add(new MetalBrick());
        b.add(new MetalBrick());
        b.add(new MetalBrick());
        b.add(new MetalBrick());
        placeBricks();
    }
    
    public void setLoc(int loc, int x, int y)
    {
        b.get(loc).setLoc(x,y);
    }
    
    public void placeBricks()
    {
        int mid = 316;
        int top = 90;
        int w = 86;
        int h = 45;
        setLoc(0, mid - 3*w, top);
        setLoc(1, mid - 2*w, top);
        setLoc(2, mid - w, top);
        setLoc(3, mid, top);
        setLoc(4, mid + w, top);
        setLoc(5, mid + 2*w, top);
        setLoc(6, mid + 3*w, top);
        setLoc(7, mid - 3*w, top + 4*h);
        setLoc(8, mid - 2*w, top + 4*h);
        setLoc(9, mid + 2*w, top + 4*h);
        setLoc(10, mid + 3*w, top + 4*h);
        setLoc(11, mid - 3*w, top + 5*h);
        setLoc(12, mid - 2*w, top + 5*h);
        setLoc(13, mid + 2*w, top + 5*h);
        setLoc(14, mid + 3*w, top + 5*h);
        setLoc(15, mid - 3*w, top + 6*h);
        setLoc(16, mid - 2*w, top + 6*h);
        setLoc(17, mid + 2*w, top + 6*h);
        setLoc(18, mid + 3*w, top + 6*h);
    }
    
    public ArrayList<Brick> getBricks()
    {
        return b;
    }
}