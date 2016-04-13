import javax.swing.*;
import java.util.ArrayList;
/**
 * @author Leigh Rubin
 * Level12.java
 * Defines the Level
 */
public class Level12 implements Level
{
    private ArrayList<Brick> b;
    /**
     * Constructs a Level12 object
     */
    public Level12()
    {
        b = new ArrayList<Brick>();
        b.add(new NormalBrick(2,false));
        b.add(new NormalBrick(2,false));
        b.add(new NormalBrick(2,true));
        b.add(new NormalBrick(2,false));
        b.add(new NormalBrick(2,false));
        b.add(new NormalBrick(3,true));
        b.add(new NormalBrick(3,false));
        b.add(new NormalBrick(3,false));
        b.add(new NormalBrick(4,false));
        b.add(new NormalBrick(3,false));
        b.add(new NormalBrick(3,false));
        b.add(new NormalBrick(3,false));
        b.add(new NormalBrick(2,false));
        b.add(new NormalBrick(2,false));
        b.add(new MetalBrick());
        b.add(new NormalBrick(2,false));
        b.add(new NormalBrick(2,false));
        b.add(new MetalBrick());
        b.add(new NormalBrick(4,true));
        b.add(new NormalBrick(4,false));
        b.add(new MetalBrick());
        b.add(new NormalBrick(2,false));
        b.add(new NormalBrick(3,true));
        b.add(new NormalBrick(2,false));
        b.add(new NormalBrick(3,false));
        b.add(new NormalBrick(2,false));
        b.add(new NormalBrick(2,false));
        b.add(new NormalBrick(2,false));
        b.add(new NormalBrick(2,false));
        b.add(new NormalBrick(2,false));
        b.add(new NormalBrick(2,false));
        b.add(new NormalBrick(1,false));
        b.add(new NormalBrick(3,false));
        b.add(new NormalBrick(1,true));
        b.add(new NormalBrick(2,false));
        b.add(new NormalBrick(1,false));
        b.add(new NormalBrick(3,false));
        b.add(new NormalBrick(1,false));
        placeBricks();
    }
    
    public void setLoc(int loc, int x, int y)
    {
        b.get(loc).setLoc(x,y);
    }
    
    public void placeBricks()
    {
        int mid = 316;
        int top = 100;
        int w = 86;
        int h = 45;
        setLoc(0, mid - 2*w, top + 30);
        setLoc(1, mid - w, top + 30);
        setLoc(2, mid, top + 30);
        setLoc(3, mid + w, top + 30);
        setLoc(4, mid + 2*w, top + 30);
        setLoc(5, mid - 3*w, top + 30 + h);
        setLoc(6, mid - 2*w, top + 30 + h);
        setLoc(7, mid - w, top + 30 + h);
        setLoc(8, mid, top + 30 + h);
        setLoc(9, mid + w, top + 30 + h);
        setLoc(10, mid + 2*w, top + 30 + h);
        setLoc(11, mid + 3*w, top + 30 + h);
        setLoc(12, mid - 2*w, top + 30 + 2*h);
        setLoc(13, mid - w, top + 30 + 2*h);
        setLoc(14, mid, top + 30 + 2*h);
        setLoc(15, mid + w, top + 30 + 2*h);
        setLoc(16, mid + 2*w, top + 30 + 2*h);
        setLoc(17, mid - 2*w, top + 30 + 3*h);
        setLoc(18, mid - w, top + 30 + 3*h);
        setLoc(19, mid + w, top + 30 + 3*h);
        setLoc(20, mid + 2*w, top + 30 + 3*h);
        setLoc(21, mid - 2*w, top + 30 + 4*h);
        setLoc(22, mid - w, top + 30 + 4*h);
        setLoc(23, mid, top + 30 + 4*h);
        setLoc(24, mid + w, top + 30 + 4*h);
        setLoc(25, mid + 2*w, top + 30 + 4*h);
        setLoc(26, mid - 2*w, top + 30 + 5*h);
        setLoc(27, mid - w, top + 30 + 5*h);
        setLoc(28, mid, top + 30 + 5*h);
        setLoc(29, mid + w, top + 30 + 5*h);
        setLoc(30, mid + 2*w, top + 30 + 5*h);
        setLoc(31, mid - 3*w, top + 30 + 6*h);
        setLoc(32, mid - 2*w, top + 30 + 6*h);
        setLoc(33, mid - w, top + 30 + 6*h);
        setLoc(34, mid, top + 30 + 6*h);
        setLoc(35, mid + w, top + 30 + 6*h);
        setLoc(36, mid + 2*w, top + 30 + 6*h);
        setLoc(37, mid + 3*w, top + 30 + 6*h);
        
    }
    
    public ArrayList<Brick> getBricks()
    {
        return b;
    }
}