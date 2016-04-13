import javax.swing.*;
import java.awt.*;
/**
 * @author Leigh Rubin
 * MetalBrick.java
 * Defines a MetalBrick object
 */
public class MetalBrick extends Brick
{
    /**
     * Constructs a MetalBrick
     */
    public MetalBrick()
    {
        super();
    }
    public void updateBrick(){}
    public Image getImage()
    {
        return ImageLoader.loadCompatibleImage("MetalBrick.png");
    }
    public double getHits()
    {
        return (double)Integer.MAX_VALUE;
    }
    public void updateLaser(){}
    public void updateBullet(){}
}
