import java.awt.*;
/**
 * @author Leigh Rubin
 * Bullet.java
 * Defines a Bullet object
 */
public class Bullet
{
    private Rectangle b;
    private int speed; 
    /**
     * Constructs a Bullet with a speed
     * @param int speed
     */
    public Bullet(int x)
    {
        speed = 3;
        b = new Rectangle(30,57);
        b.setBounds(x,726 - 35 - 57,30,57);
    }
    /**
     * Returns the Image
     * @return Image
     */
    public Image getImage()
    {
        return ImageLoader.loadCompatibleImage("Bullet.png");
    }
    /**
     * Draw the image
     * @param Graphics g
     */
    public void draw(Graphics g) {
        g.drawImage(getImage(), b.x, b.y, b.width, b.height, null);
    }
    /**
     * Moves the bullet
     */
    public void move()
    {
        b.y -= speed;
    }
    /**
     * Returns the Bullet
     * @return Rectangle bullet
     */
    public Rectangle getBullet()
    {
        return b;
    }
}