import java.util.ArrayList;
/**
 * @author Leigh Rubin
 * Level.java
 * Outlines a Level
 */
public interface Level
{
    /**
     * Set location of the Bricks
     * @param int loc
     * @param int x
     * @param int y
     */
    public void setLoc(int loc, int x, int y);
    /**
     * Places the Bricks
     */
    public void placeBricks();
    /**
     * Returns the bricks in the level
     * @return ArrayList<Brick> bricks
     */
    public ArrayList<Brick> getBricks();
}
