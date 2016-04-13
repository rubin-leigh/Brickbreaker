import javax.swing.*;
import java.util.ArrayList;
/**
 * @author Leigh Rubin
 * Level27.java
 * Defines the Level
 */
public class Level27 implements Level
{
    private ArrayList<Brick> b;
    /**
     * Constructs a Level27 object
     */
    public Level27()
    {
        b = new ArrayList<Brick>();
        b.add(new MetalBrick());
        b.add(new MetalBrick());
        b.add(new MetalBrick());
        b.add(new MetalBrick());
        b.add(new NormalBrick(1,false));
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
        setLoc(0, mid, top);
        setLoc(1, mid, top + h);
        setLoc(2, mid, top + 2*h);
        setLoc(3, mid, top + 3*h);
        setLoc(4, mid + 2*w, top + 4*h);
        setLoc(5, mid, top + 5*h);
        setLoc(6, mid, top + 6*h);
        setLoc(7, mid, top + 7*h);
        setLoc(8, mid, top + 8*h);
        setLoc(9, mid - 2*w, top + 9*h);
        setLoc(10, mid - w, top + 9*h);
        setLoc(11, mid, top + 9*h);
        setLoc(12, mid + w, top + 9*h);
        setLoc(13, mid + 2*w, top + 9*h);
        setLoc(14, mid + 3*w, top + 9*h);
    }
    
    public ArrayList<Brick> getBricks()
    {
        return b;
    }
}