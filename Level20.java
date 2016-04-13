import javax.swing.*;
import java.util.ArrayList;
/**
 * @author Leigh Rubin
 * Level20.java
 * Defines the Level
 */
public class Level20 implements Level
{
    private ArrayList<Brick> b;
    /**
     * Constructs a Level20 object
     */
    public Level20()
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
        b.add(new MetalBrick());
        b.add(new MetalBrick());
        b.add(new MetalBrick());
        b.add(new MetalBrick());
        b.add(new MetalBrick());
        b.add(new MetalBrick());
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
        setLoc(0, mid - 2*w, top + 2*h);
        setLoc(1, mid - w, top + 2*h);
        setLoc(2, mid + w, top + 2*h);
        setLoc(3, mid + 2*w, top + 2*h);
        setLoc(4, mid - 2*w, top + 3*h);
        setLoc(5, mid - w, top + 3*h);
        setLoc(6, mid + w, top + 3*h);
        setLoc(7, mid + 2*w, top + 3*h);
        setLoc(8, mid - w, top + 4*h);
        setLoc(9, mid + w, top + 4*h);
        setLoc(10, mid - w, top + 5*h);
        setLoc(11, mid + w, top + 5*h);
        setLoc(12, mid - w, top + 6*h);
        setLoc(13, mid + w, top + 6*h);
        setLoc(14, mid - w, top + 7*h);
        setLoc(15, mid + w, top + 7*h);
        setLoc(16, mid - w, top + 8*h);
        setLoc(17, mid + w, top + 8*h);
        setLoc(18, mid - 3*w, top + 9*h);
        setLoc(19, mid - 2*w, top + 9*h);
        setLoc(20, mid - w, top + 9*h);
        setLoc(21, mid + w, top + 9*h);
        setLoc(22, mid + 2*w, top + 9*h);
        setLoc(23, mid + 3*w, top + 9*h);
    }
    
    public ArrayList<Brick> getBricks()
    {
        return b;
    }
}