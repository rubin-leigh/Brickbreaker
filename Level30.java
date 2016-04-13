import javax.swing.*;
import java.util.ArrayList;
/**
 * @author Leigh Rubin
 * Level30.java
 * Defines the Level
 */
public class Level30 implements Level
{
    private ArrayList<Brick> b;
    /**
     * Constructs a Level30 object
     */
    public Level30()
    {
        b = new ArrayList<Brick>();
        b.add(new MetalBrick());
        b.add(new MetalBrick());
        b.add(new MetalBrick());
        b.add(new MetalBrick());
        b.add(new NormalBrick(1,true));
        b.add(new MetalBrick());
        b.add(new MetalBrick());
        b.add(new NormalBrick(1,true));
        b.add(new MetalBrick());
        b.add(new MetalBrick());
        b.add(new MetalBrick());
        b.add(new MetalBrick());
        b.add(new NormalBrick(1,false));
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
        setLoc(0, mid - 2*w, top + h);
        setLoc(1, mid + 2*w, top + h);
        setLoc(2, mid - 2*w, top + 2*h);
        setLoc(3, mid + 2*w, top + 2*h);
        setLoc(4, mid - 3*w, top + 3*h);
        setLoc(5, mid - 2*w, top + 3*h);
        setLoc(6, mid + 2*w, top + 3*h);
        setLoc(7, mid + 3*w, top + 3*h);
        setLoc(8, mid - 3*w, top + 4*h);
        setLoc(9, mid - 2*w, top + 4*h);
        setLoc(10, mid + 2*w, top + 4*h);
        setLoc(11, mid + 3*w, top + 4*h);
        setLoc(12, mid, top + 8*h);
        setLoc(13, mid - w, top + 9*h);
        setLoc(14, mid, top + 9*h);
        setLoc(15, mid + w, top + 9*h);
    }
    
    public ArrayList<Brick> getBricks()
    {
        return b;
    }
}