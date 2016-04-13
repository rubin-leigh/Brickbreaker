import java.awt.Rectangle;
import javax.swing.*;
import java.awt.*;
import java.awt.Image;
/**
 * @author Leigh Rubin
 * Brick.java
 * Defines a brick object
 */
public abstract class Brick
{
    private Rectangle rect;
    /**
     * Constructs a Brick
     */
    public Brick()
    {
        rect = new Rectangle(89,48);
    }
    /**
     * Draw the image
     * @param Graphics g
     */
    public void draw(Graphics g) {
        g.drawImage(getImage(), rect.x, rect.y, rect.width, rect.height, null);
    }
    /**
     * Returns the Brick
     * @return Rectangle brick
     */
    public Rectangle getBrick()
    {
        return rect;
    }
    /**
     * Returns the Image
     * @return Image
     */
    public abstract Image getImage();
    /**
     * Updates the brick
     */
    public abstract void updateBrick();
    /**
     * Returns the hits left of the brick
     * @return double hits
     */
    public abstract double getHits();
    /**
     * Updates brick when hit by laser
     */
    public abstract void updateLaser();
    /**
     * Updates brick when hit by bullet
     */
    public abstract void updateBullet();
    /**
     * Sets the location of the brick
     * @param int x
     * @param int y
     */
    public void setLoc(int x, int y)
    {
        rect.setBounds(x, y, 86, 44);
    }
    /**
     * Moves the brick
     */
    public void move()
    {
        if(rect.y <= 621)
            rect.y += 17;
    }
}
//brick = 86x44
//background = 968x726
//ball = Radius 9
//paddle = 133x35
//playingArea = 591x629 (61 from left, 91 from top)
//left = 61, right = 652, top = 91, bottom = 720
//paddle starting loc (260,690)