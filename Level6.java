import javax.swing.*;
import java.util.ArrayList;
/**
 * @author Leigh Rubin
 * Level6.java
 * Defines the Level
 */
public class Level6 implements Level
{
    private ArrayList<Brick> b;
    /**
     * Constructs a Level6 object
     */
    public Level6()
    {
        b = new ArrayList<Brick>();
        b.add(new NormalBrick(1,false));
        b.add(new NormalBrick(1,false));
        b.add(new NormalBrick(1,false));
        b.add(new NormalBrick(1,false));
        b.add(new NormalBrick(1,false));
        b.add(new NormalBrick(1,false));
        b.add(new NormalBrick(1,false));
        //
        b.add(new NormalBrick(3,false));
        b.add(new NormalBrick(3,false));
        b.add(new NormalBrick(3,true));
        b.add(new NormalBrick(3,true));
        b.add(new NormalBrick(3,true));
        b.add(new NormalBrick(3,false));
        b.add(new NormalBrick(3,false));
        //
        b.add(new NormalBrick(2,false));
        b.add(new NormalBrick(2,false));
        b.add(new NormalBrick(2,false));
        //
        b.add(new NormalBrick(2,false));
        b.add(new NormalBrick(2,false));
        b.add(new NormalBrick(2,false));
        b.add(new NormalBrick(2,false));
        b.add(new NormalBrick(2,false));
        b.add(new NormalBrick(2,false));
        b.add(new NormalBrick(2,false));
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
        setLoc(0, mid - 3*w, top);
        setLoc(1, mid - 2*w, top);
        setLoc(2, mid - w, top);
        setLoc(3, mid, top );
        setLoc(4, mid + w, top);
        setLoc(5, mid + 2*w, top);
        setLoc(6, mid + 3*w, top);
        //
        setLoc(7, mid - 3*w, top + 2*h);
        setLoc(8, mid - 2*w, top + 2*h);
        setLoc(9, mid - w, top + 2*h);
        setLoc(10, mid, top + 2*h);
        setLoc(11, mid + w, top + 2*h);
        setLoc(12, mid + 2*w, top + 2*h);
        setLoc(13, mid + 3*w, top + 2*h);
        //
        setLoc(14, mid - w, top + 3*h);
        setLoc(15, mid, top + 3*h);
        setLoc(16, mid + w, top + 3*h);
        //
        setLoc(17, mid - 3*w, top + 5*h);
        setLoc(18, mid - 2*w, top + 5*h);
        setLoc(19, mid - w, top + 5*h);
        setLoc(20, mid, top + 5*h);
        setLoc(21, mid + w, top + 5*h);
        setLoc(22, mid + 2*w, top + 5*h);
        setLoc(23, mid + 3*w, top + 5*h);
    }
    
    public ArrayList<Brick> getBricks()
    {
        return b;
    }
}