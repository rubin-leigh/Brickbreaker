import javax.swing.*;
import java.util.ArrayList;
/**
 * @author Leigh Rubin
 * Level28.java
 * Defines the Level
 */
public class Level28 implements Level
{
    private ArrayList<Brick> b;
    /**
     * Constructs a Level28 object
     */
    public Level28()
    {
        b = new ArrayList<Brick>();
        b.add(new NormalBrick(1,true));
        b.add(new NormalBrick(1,false));
        b.add(new NormalBrick(1,true));
        b.add(new NormalBrick(1,false));
        b.add(new NormalBrick(1,true));
        b.add(new NormalBrick(1,false));
        b.add(new NormalBrick(2,true));
        b.add(new MetalBrick());
        b.add(new MetalBrick());
        b.add(new MetalBrick());
        b.add(new MetalBrick());
        b.add(new MetalBrick());
        b.add(new NormalBrick(1,true));
        b.add(new NormalBrick(1,true));
        b.add(new MetalBrick());
        b.add(new NormalBrick(2,true));
        b.add(new MetalBrick());
        b.add(new NormalBrick(1,true));
        b.add(new MetalBrick());
        b.add(new NormalBrick(2,true));
        b.add(new MetalBrick());
        b.add(new NormalBrick(1,true));
        b.add(new MetalBrick());
        b.add(new MetalBrick());
        b.add(new MetalBrick());
        b.add(new MetalBrick());
        b.add(new MetalBrick());
        b.add(new MetalBrick());
        b.add(new NormalBrick(2,true));
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
        setLoc(8, mid - w, top + h);
        setLoc(9, mid, top + h);
        setLoc(10, mid + w, top + h);
        setLoc(11, mid + 2*w, top + h);
        setLoc(12, mid + 3*w, top + h);
        setLoc(13, mid + w, top + 2*h);
        setLoc(14, mid + 2*w, top + 2*h);
        setLoc(15, mid + 3*w, top + 2*h);
        setLoc(16, mid + 2*w, top + 3*h);
        setLoc(17, mid + 3*w, top + 3*h);
        setLoc(18, mid + 2*w, top + 4*h);
        setLoc(19, mid + 3*w, top + 4*h);
        setLoc(20, mid + 2*w, top + 5*h);
        setLoc(21, mid + 3*w, top + 5*h);
        setLoc(22, mid - 3*w, top + 6*h);
        setLoc(23, mid - 2*w, top + 6*h);
        setLoc(24, mid - w, top + 6*h);
        setLoc(25, mid, top + 6*h);
        setLoc(26, mid + w, top + 6*h);
        setLoc(27, mid + 2*w, top + 6*h);
        setLoc(28, mid + 3*w, top + 6*h);
    }
    
    public ArrayList<Brick> getBricks()
    {
        return b;
    }
}