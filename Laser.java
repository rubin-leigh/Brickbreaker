import java.awt.*;
/**
 * @author Leigh Rubin
 * Laser.java
 * Defines a Laser object
 */
public class Laser
{
    private Rectangle l;
    private int speed; 
    /**
     * Constructs a laser with a speed
     * @param int speed
     */
    public Laser(int x)
    {
        speed = 5;
        l = new Rectangle(12,53);
        l.setBounds(x,726 - 35 - 53,12,53);
    }
    /**
     * Return the Image
     * @return Image
     */
    public Image getImage()
    {
        return ImageLoader.loadCompatibleImage("Laser.png");
    }
    /**
     * Draw the image
     * @param Graphics g
     */
    public void draw(Graphics g) {
        g.drawImage(getImage(), l.x, l.y, l.width, l.height, null);
    }
    /**
     * Moves the laser
     */
    public void move()
    {
        l.y -= speed;
    }
    /**
     * Returns the laser
     * @return Rectangle laser
     */
    public Rectangle getLaser()
    {
        return l;
    }
}