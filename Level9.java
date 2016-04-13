import javax.swing.*;
import java.util.ArrayList;
/**
 * @author Leigh Rubin
 * Level9.java
 * Defines the Level
 */
public class Level9 implements Level
{
    private ArrayList<Brick> b;
    /**
     * Constructs a Level9 object
     */
    public Level9()
    {
        b = new ArrayList<Brick>();
        b.add(new NormalBrick(2,true));
        b.add(new NormalBrick(2,true));
        b.add(new NormalBrick(1,false));
        b.add(new NormalBrick(1,false));
        b.add(new NormalBrick(3,false));
        b.add(new NormalBrick(3,false));
        b.add(new NormalBrick(3,false));
        b.add(new NormalBrick(3,false));
        b.add(new NormalBrick(3,false));
        b.add(new NormalBrick(1,true));
        b.add(new NormalBrick(1,true));
        b.add(new NormalBrick(1,true));
        b.add(new NormalBrick(1,true));
        b.add(new NormalBrick(1,true));
        b.add(new NormalBrick(3,false));
        b.add(new NormalBrick(3,false));
        b.add(new NormalBrick(3,false));
        b.add(new NormalBrick(3,false));
        b.add(new NormalBrick(3,false));
        b.add(new NormalBrick(1,false));
        b.add(new NormalBrick(1,false));
        b.add(new NormalBrick(1,false));
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
        setLoc(1, mid + 2*w, top + 30);
        setLoc(2, mid - 2*w, top + 30 + h);
        setLoc(3, mid + 2*w, top + 30 + h);
        setLoc(4, mid - 2*w, top + 30 + 2*h);
        setLoc(5, mid - w, top + 30 + 2*h);
        setLoc(6, mid, top + 30 + 2*h);
        setLoc(7, mid + w, top + 30 + 2*h);
        setLoc(8, mid + 2*w, top + 30 + 2*h);
        setLoc(9, mid - 2*w, top + 30 + 3*h);
        setLoc(10, mid - w, top + 30 + 3*h);
        setLoc(11, mid, top + 30 + 3*h);
        setLoc(12, mid + w, top + 30 + 3*h);
        setLoc(13, mid + 2*w, top + 30 + 3*h);
        setLoc(14, mid - 2*w, top + 30 + 4*h);
        setLoc(15, mid - w, top + 30 + 4*h);
        setLoc(16, mid, top + 30 + 4*h);
        setLoc(17, mid + w, top + 30 + 4*h);
        setLoc(18, mid + 2*w, top + 30 + 4*h);
        setLoc(19, mid - w, top + 30 + 5*h);
        setLoc(20, mid + w, top + 30 + 5*h);
        setLoc(21, mid - w, top + 30 + 6*h);
        setLoc(22, mid + w, top + 30 + 6*h);
    }
    
    public ArrayList<Brick> getBricks()
    {
        return b;
    }
}