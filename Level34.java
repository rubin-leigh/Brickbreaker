import javax.swing.*;
import java.util.ArrayList;
/**
 * @author Leigh Rubin
 * Level34.java
 * Defines the Level
 */
public class Level34 implements Level
{
    private ArrayList<Brick> b;
    /**
     * Constructs a Level34 object
     */
    public Level34()
    {
        b = new ArrayList<Brick>();
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
        b.add(new MetalBrick());
        b.add(new MetalBrick());
        b.add(new MetalBrick());
        b.add(new MetalBrick());
        b.add(new MetalBrick());
        b.add(new MetalBrick());
        b.add(new NormalBrick(2,true));
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
        setLoc(1, mid - 2*w, top + h);
        setLoc(2, mid, top + h);
        setLoc(3, mid + 2*w, top + h);
        setLoc(4, mid - 2*w, top + 2*h);
        setLoc(5, mid, top + 2*h);
        setLoc(6, mid + 2*w, top + 2*h);
        setLoc(7, mid - 2*w, top + 3*h);
        setLoc(8, mid, top + 3*h);
        setLoc(9, mid + 2*w, top + 3*h);
        setLoc(10, mid - 2*w, top + 4*h);
        setLoc(11, mid, top + 4*h);
        setLoc(12, mid + 2*w, top + 4*h);
        setLoc(13, mid - 2*w, top + 5*h);
        setLoc(14, mid, top + 5*h);
        setLoc(15, mid + 2*w, top + 5*h);
        setLoc(16, mid - 2*w, top + 6*h);
        setLoc(17, mid, top + 6*h);
        setLoc(18, mid + 2*w, top + 6*h);
        setLoc(19, mid - 2*w, top + 7*h);
        setLoc(20, mid, top + 7*h);
        setLoc(21, mid + 2*w, top + 7*h);
        setLoc(22, mid - 3*w, top + 8*h);
        setLoc(23, mid - 2*w, top + 8*h);
        setLoc(24, mid + 2*w, top + 8*h);
        setLoc(25, mid - 3*w, top + 9*h);
        setLoc(26, mid - 2*w, top + 9*h);
        setLoc(27, mid - w, top + 9*h);
        setLoc(28, mid, top + 9*h);
        setLoc(29, mid + w, top + 9*h);
        setLoc(30, mid + 2*w, top + 9*h);
    }
    
    public ArrayList<Brick> getBricks()
    {
        return b;
    }
}