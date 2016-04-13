import javax.swing.*;
import java.util.ArrayList;
/**
 * @author Leigh Rubin
 * Level19.java
 * Defines the Level
 */
public class Level19 implements Level
{
    private ArrayList<Brick> b;
    /**
     * Constructs a Level19 object
     */
    public Level19()
    {
        b = new ArrayList<Brick>();
        b.add(new NormalBrick(1,false));
        b.add(new NormalBrick(1,false));
        b.add(new MetalBrick());
        b.add(new MetalBrick());
        b.add(new MetalBrick());
        b.add(new MetalBrick());
        b.add(new NormalBrick(1,false));
        b.add(new MetalBrick());
        b.add(new MetalBrick());
        b.add(new MetalBrick());
        b.add(new NormalBrick(1,true));
        b.add(new NormalBrick(1,true));
        b.add(new MetalBrick());
        b.add(new MetalBrick());
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
        setLoc(1, mid + 3*w, top);
        setLoc(2, mid - 3*w, top + h);
        setLoc(3, mid - 2*w, top + h);
        setLoc(4, mid + 2*w, top + h);
        setLoc(5, mid + 3*w, top + h);
        setLoc(6, mid, top + 4*h);
        setLoc(7, mid - w, top + 5*h);
        setLoc(8, mid, top + 5*h);
        setLoc(9, mid + w, top + 5*h);
        setLoc(10, mid - 3*w, top + 7*h);
        setLoc(11, mid + 3*w, top + 7*h);
        setLoc(12, mid - 3*w, top + 8*h);
        setLoc(13, mid - 2*w, top + 8*h);
        setLoc(14, mid - w, top + 8*h);
        setLoc(15, mid + w, top + 8*h);
        setLoc(16, mid + 2*w, top + 8*h);
        setLoc(17, mid + 3*w, top + 8*h);
    }
    
    public ArrayList<Brick> getBricks()
    {
        return b;
    }
}