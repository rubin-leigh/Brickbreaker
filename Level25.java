import javax.swing.*;
import java.util.ArrayList;
/**
 * @author Leigh Rubin
 * Level25.java
 * Defines the Level
 */
public class Level25 implements Level
{
    private ArrayList<Brick> b;
    /**
     * Constructs a Level25 object
     */
    public Level25()
    {
        b = new ArrayList<Brick>();
        b.add(new NormalBrick(4,true));
        b.add(new NormalBrick(4,false));
        b.add(new NormalBrick(4,false));
        b.add(new NormalBrick(4,true));
        b.add(new NormalBrick(4,false));
        b.add(new NormalBrick(4,false));
        b.add(new NormalBrick(4,false));
        b.add(new NormalBrick(4,false));
        //
        b.add(new MetalBrick());
        b.add(new MetalBrick());
        b.add(new MetalBrick());
        b.add(new MetalBrick());
        b.add(new MetalBrick());
        b.add(new MetalBrick());
        b.add(new MetalBrick());
        b.add(new NormalBrick(1,false));
        b.add(new NormalBrick(1,false));
        b.add(new NormalBrick(1,false));
        b.add(new MetalBrick());
        b.add(new MetalBrick());
        b.add(new NormalBrick(1,false));
        b.add(new NormalBrick(1,false));
        b.add(new NormalBrick(1,false));
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
        setLoc(0, mid - 3*w, top);
        setLoc(1, mid - 2*w, top);
        setLoc(2, mid + 2*w, top);
        setLoc(3, mid + 3*w, top);
        setLoc(4, mid - 3*w, top + h);
        setLoc(5, mid - 2*w, top + h);
        setLoc(6, mid + 2*w, top + h);
        setLoc(7, mid + 3*w, top + h);
        setLoc(8, mid - 2*w, top + 3*h);
        setLoc(9, mid - w, top + 3*h);
        setLoc(10, mid + w, top + 3*h);
        setLoc(11, mid + 2*w, top + 3*h);
        setLoc(12, mid - 2*w, top + 4*h);
        setLoc(13, mid + 2*w, top + 4*h);
        setLoc(14, mid - 2*w, top + 5*h);
        setLoc(15, mid - w, top + 5*h);
        setLoc(16, mid, top + 5*h);
        setLoc(17, mid + w, top + 5*h);
        setLoc(18, mid + 2*w, top + 5*h);
        setLoc(19, mid - 2*w, top + 6*h);
        setLoc(20, mid - w, top + 6*h);
        setLoc(21, mid, top + 6*h);
        setLoc(22, mid + w, top + 6*h);
        setLoc(23, mid + 2*w, top + 6*h);
        setLoc(24, mid - 2*w, top + 7*h);
        setLoc(25, mid + 2*w, top + 7*h);
        setLoc(26, mid - 2*w, top + 8*h);
        setLoc(27, mid - w, top + 8*h);
        setLoc(28, mid, top + 8*h);
        setLoc(29, mid + w, top + 8*h);
        setLoc(30, mid + 2*w, top + 8*h);
    }
    
    public ArrayList<Brick> getBricks()
    {
        return b;
    }
}