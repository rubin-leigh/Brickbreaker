import java.awt.*;
import java.util.Random;
import javax.swing.JLabel;
/**
 * @author Leigh Rubin
 * PowerUp.java
 * Defines a PowerUp object
 */
public class PowerUp
{
    private Rectangle powerUp;
    private Rectangle text;
    private String type;
    /**
     * Constructs a random PowerUp
     */
    public PowerUp()
    {
        powerUp = new Rectangle();
        Random gen = new Random();
        int x = gen.nextInt(9);
        switch(x){
            case 0: type = "Life"; break;
            case 1: type = "Laser"; break;
            case 2: type = "Gun"; break;
            case 3: type = "Long"; break;
            case 4: type = "Multi"; break;
            case 5: type = "Catch"; break;
            case 6: type = "Slow"; break;
            case 7: type = "Flip"; break;
            case 8: type = "Bomb"; break;
        }
        text = new Rectangle();
    }
    /**
     * Sets the location of the powerUp
     * @param int x
     * @param int y
     */
    public void setLoc(int x, int y)
    {
        powerUp.setBounds(x,y,65,29);
        text.setBounds(x,y,65,29);
    }
    /**
     * Returns the powerUp
     * @return Rectangle powerUp
     */
    public Rectangle getPowerUp()
    {
        return powerUp;
    }
    /**
     * Returns the Image
     * @return Image
     */
    public Image getImage()
    {
        return ImageLoader.loadCompatibleImage("PowerUp.png");
    }
    /**
     * Draw the image
     * @param Graphics g
     */
    public void draw(Graphics g)
    {
        g.drawImage(getImage(), powerUp.x, powerUp.y, powerUp.width, powerUp.height, null);
    }
    /**
     * Makes the powerUp fall
     */
    public void fall()
    {
        powerUp.setBounds(powerUp.x,powerUp.y + 2, 65, 29);
        text.setBounds(powerUp.x,powerUp.y + 2, 65, 29);
    }
    /**
     * Returns the type of powerUp
     * @return String type
     */
    public String getType()
    {
        return type;
    }
}
//xLife, Laser, Gun, Long, Warp, Multi, Catch, Slow, xFlip, Bomb