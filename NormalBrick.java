import java.awt.*;
import javax.swing.*;
/**
 * @author Leigh Rubin
 * NormalBrick.java
 * Defines a NormalBrick object
 */
public class NormalBrick extends Brick
{
    // instance variables - replace the example below with your own
    private double hits;
    private String file;
    private boolean hasPowerUp;
    private PowerUp p;
    /**
     * Constructs a NormalBrick with hits and a powerUp
     * @param double hits
     * @param boolean hasPowerUp
     */
    public NormalBrick(double h, boolean hP)
    {
        hits = h + 1;
        hasPowerUp = hP;
        file = (int)hits + "Hits.png";
        updateBrick();
    }
    public double getHits()
    {
        return hits;
    }
    /**
     * Releases powerUp 
     */
    public PowerUp getPowerUp()
    {
        if(hasPowerUp)
        {
            p = new PowerUp();
            p.setLoc(getBrick().x + 11, getBrick().y + 44);
            return p;
        }
        return null;
    }
    /**
     * Sets if the brick has a powerUp
     * @param boolean hasPowerUp
     */
    public void setPowerUp(boolean has)
    {
        hasPowerUp = has;
    }
    public Image getImage()
    {
        return ImageLoader.loadCompatibleImage(file);
    }
    public void updateBrick()
    {
        hits--;
        if(hits>3) file = "4Hits.png";
        else if(hits>2) file = "3Hits.png";
        else if(hits>1) file = "2Hits.png";
        else if(hits>0) file = "1Hits.png";
    }
    public void updateLaser()
    {
        hits -= 0.5;
        if(hits>3) file = "4Hits.png";
        else if(hits>2) file = "3Hits.png";
        else if(hits>1) file = "2Hits.png";
        else if(hits>0) file = "1Hits.png";
    }
    public void updateBullet()
    {
        hits = 0;
    }
}

