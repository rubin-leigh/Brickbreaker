import javax.swing.*;
import java.util.ArrayList;
/**
 * @author Leigh Rubin
 * Level14.java
 * Defines the Level
 */
public class Level14 implements Level
{
    private ArrayList<Brick> b;
    /**
     * Constructs a Level14 object
     */
    public Level14()
    {
        b = new ArrayList<Brick>();
        b.add(new NormalBrick(4,false));
        b.add(new MetalBrick());
        b.add(new MetalBrick());
        b.add(new MetalBrick());
        b.add(new NormalBrick(4,false));
        b.add(new MetalBrick());
        b.add(new NormalBrick(4,false));
        b.add(new NormalBrick(4,false));
        //
        b.add(new NormalBrick(4,true));
        b.add(new MetalBrick());
        b.add(new MetalBrick());
        b.add(new MetalBrick());
        //
        b.add(new NormalBrick(4,false));
        b.add(new MetalBrick());
        b.add(new MetalBrick());
        b.add(new MetalBrick());
        b.add(new NormalBrick(4,false));
        b.add(new MetalBrick());
        b.add(new NormalBrick(4,true));
        b.add(new NormalBrick(4,true));
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
        setLoc(2, mid + w, top + 30);
        setLoc(3, mid + 2*w, top + 30);
        setLoc(4, mid - 2*w, top + 30 + h);
        setLoc(5, mid - w, top + 30 + h);
        setLoc(6, mid + w, top + 30 + h);
        setLoc(7, mid + 2*w, top + 30 + h);
        //
        setLoc(8, mid - 2*w, top + 30 + 3*h);
        setLoc(9, mid + 2*w, top + 30 + 3*h);
        setLoc(10, mid - 2*w, top + 30 + 4*h);
        setLoc(11, mid + 2*w, top + 30 + 4*h);
        //
        setLoc(12, mid - 2*w, top + 30 + 6*h);
        setLoc(13, mid - w, top + 30 + 6*h);
        setLoc(14, mid + w, top + 30 + 6*h);
        setLoc(15, mid + 2*w, top + 30 + 6*h);
        setLoc(16, mid - 2*w, top + 30 + 7*h);
        setLoc(17, mid - w, top + 30 + 7*h);
        setLoc(18, mid + w, top + 30 + 7*h);
        setLoc(19, mid + 2*w, top + 30 + 7*h);
    }
    
    public ArrayList<Brick> getBricks()
    {
        return b;
    }
}