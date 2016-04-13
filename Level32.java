import javax.swing.*;
import java.util.ArrayList;
/**
 * @author Leigh Rubin
 * Level32.java
 * Defines the Level
 */
public class Level32 implements Level
{
    private ArrayList<Brick> b;
    /**
     * Constructs a Level32 object
     */
    public Level32()
    {
        b = new ArrayList<Brick>();
        b.add(new NormalBrick(1,true));
        b.add(new MetalBrick());
        b.add(new NormalBrick(1,true));
        b.add(new MetalBrick());
        b.add(new NormalBrick(1,true));
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
        b.add(new NormalBrick(1,true));
        b.add(new MetalBrick());
        b.add(new MetalBrick());
        b.add(new MetalBrick());
        b.add(new MetalBrick());
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
        setLoc(7, mid - 2*w, top + h);
        setLoc(8, mid, top + h);
        setLoc(9, mid + 2*w, top + h);
        setLoc(10, mid - 2*w, top + 2*h);
        setLoc(11, mid, top + 2*h);
        setLoc(12, mid + 2*w, top + 2*h);
        setLoc(13, mid - 2*w, top + 3*h);
        setLoc(14, mid, top + 3*h);
        setLoc(15, mid + 2*w, top + 3*h);
        setLoc(16, mid, top + 4*h);
        setLoc(17, mid - 3*w, top + 5*h);
        setLoc(18, mid - 2*w, top + 5*h);
        setLoc(19, mid, top + 5*h);
        setLoc(20, mid + 2*w, top + 5*h);
        setLoc(21, mid - 2*w, top + 6*h);
        setLoc(22, mid, top + 6*h);
        setLoc(23, mid + 2*w, top + 6*h);
        setLoc(24, mid - 2*w, top + 7*h);
        setLoc(25, mid + 2*w, top + 7*h);
        setLoc(26, mid + 3*w, top + 7*h);
        setLoc(27, mid - 2*w, top + 8*h);
        setLoc(28, mid - w, top + 8*h);
        setLoc(29, mid, top + 8*h);
        setLoc(30, mid + w, top + 8*h);
        setLoc(31, mid + 2*w, top + 8*h);
        setLoc(32, mid + 3*w, top + 8*h);
    }
    
    public ArrayList<Brick> getBricks()
    {
        return b;
    }
}