import javax.swing.*;
import java.util.ArrayList;
/**
 * @author Leigh Rubin
 * Level26.java
 * Defines the Level
 */
public class Level26 implements Level
{
    private ArrayList<Brick> b;
    /**
     * Constructs a Level26 object
     */
    public Level26()
    {
        b = new ArrayList<Brick>();
        b.add(new NormalBrick(3,false));
        b.add(new NormalBrick(3,false));
        b.add(new NormalBrick(3,false));
        b.add(new NormalBrick(3,false));
        b.add(new NormalBrick(3,false));
        b.add(new NormalBrick(3,false));
        b.add(new NormalBrick(3,false));
        b.add(new NormalBrick(4,true));
        b.add(new MetalBrick());
        b.add(new MetalBrick());
        b.add(new MetalBrick());
        b.add(new MetalBrick());
        b.add(new MetalBrick());
        b.add(new MetalBrick());
        b.add(new NormalBrick(4,true));
        b.add(new MetalBrick());
        b.add(new NormalBrick(4,true));
        b.add(new MetalBrick());
        b.add(new NormalBrick(4,true));
        b.add(new MetalBrick());
        b.add(new MetalBrick());
        b.add(new MetalBrick());
        b.add(new MetalBrick());
        b.add(new MetalBrick());
        b.add(new MetalBrick());
        b.add(new NormalBrick(2,false));
        b.add(new NormalBrick(2,false));
        b.add(new NormalBrick(2,false));
        b.add(new NormalBrick(2,false));
        b.add(new NormalBrick(2,false));
        b.add(new NormalBrick(2,false));
        b.add(new NormalBrick(2,false));
        b.add(new NormalBrick(2,false));
        b.add(new NormalBrick(1,false));
        b.add(new NormalBrick(1,false));
        b.add(new NormalBrick(1,false));
        b.add(new NormalBrick(1,false));
        b.add(new NormalBrick(1,false));
        b.add(new NormalBrick(2,false));
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
        setLoc(7, mid - 3*w, top + 2*h);
        setLoc(8, mid - w, top + 2*h);
        setLoc(9, mid + w, top + 2*h);
        setLoc(10, mid - 3*w, top + 3*h);
        setLoc(11, mid - w, top + 3*h);
        setLoc(12, mid + w, top + 3*h);
        setLoc(13, mid - 3*w, top + 4*h);
        setLoc(14, mid - 2*w, top + 4*h);
        setLoc(15, mid - w, top + 4*h);
        setLoc(16, mid, top + 4*h);
        setLoc(17, mid + w, top + 4*h);
        setLoc(18, mid + 2*w, top + 4*h);
        setLoc(19, mid - 3*w, top + 5*h);
        setLoc(20, mid - 2*w, top + 5*h);
        setLoc(21, mid - w, top + 5*h);
        setLoc(22, mid, top + 5*h);
        setLoc(23, mid + w, top + 5*h);
        setLoc(24, mid + 2*w, top + 5*h);
        setLoc(25, mid - 3*w, top + 6*h);
        setLoc(26, mid - 2*w, top + 6*h);
        setLoc(27, mid - w, top + 6*h);
        setLoc(28, mid, top + 6*h);
        setLoc(29, mid + w, top + 6*h);
        setLoc(30, mid + 2*w, top + 6*h);
        setLoc(31, mid + 3*w, top + 6*h);
        setLoc(32, mid - 3*w, top + 7*h);
        setLoc(33, mid - 2*w, top + 7*h);
        setLoc(34, mid - w, top + 7*h);
        setLoc(35, mid, top + 7*h);
        setLoc(36, mid + w, top + 7*h);
        setLoc(37, mid + 2*w, top + 7*h);
        setLoc(38, mid + 3*w, top + 7*h);
        setLoc(39, mid - 2*w, top + 9*h);
        setLoc(40, mid - w, top + 9*h);
        setLoc(41, mid, top + 9*h);
        setLoc(42, mid + w, top + 9*h);
        setLoc(43, mid + 2*w, top + 9*h);
        setLoc(44, mid + 3*w, top + 9*h);
    }
    
    public ArrayList<Brick> getBricks()
    {
        return b;
    }
}