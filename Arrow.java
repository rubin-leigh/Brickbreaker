import java.awt.*;
/**
 * @author Leigh Rubin
 * Arrow.java
 * Defines an Arrow object
 */
public class Arrow
{
    private Rectangle arrow;
    private int loc;
    private int[] angle = {150,135,120,105,90,75,60,45,30};
    private int[] x = {-7,-6,-4,-2,0,2,4,6,7};
    private int[] y = {-5,-6,-7,-8,-8,-8,-7,-6,-5};
    public int xSpeed;
    public int ySpeed;
    private int ang;
    private String fileName;
    
    /**
     * Creates a new Arrow with an angle and speed
     */
    public Arrow()
    {
        arrow = new Rectangle();
        loc = 3;
        xSpeed = x[loc];
        ySpeed = y[loc];
        ang = angle[loc];
        fileName = Integer.toString(ang) + "Arrow.png";
        right();
    }
    
    /**
     * Moves the arrow left
     */
    public void left()
    {
        if(loc > 0){
            loc--;
            xSpeed = x[loc];
            ySpeed = y[loc];
            ang = angle[loc];
            fileName = Integer.toString(ang) + "Arrow.png";
        }
    }
    
    /**
     * Moves the arrow right
     */
    public void right()
    {
        if(loc < x.length - 1){
            loc++;
            xSpeed = x[loc];
            ySpeed = y[loc];
            ang = angle[loc];
            fileName = Integer.toString(ang) + "Arrow.png";
        }
    }
    
    /**
     * Returns the arrow
     * @return Rectangle arrow
     */
    public Rectangle getArrow()
    {
        return arrow;
    }
    
    /**
     * Draw the image
     * @param Graphics g
     */
    public void draw(Graphics g) {
        g.drawImage(getImage(), arrow.x, arrow.y, arrow.width, arrow.height, null);
    }
    
    /**
     * Returns the Image
     * @return Image
     */
    public Image getImage()
    {
        return ImageLoader.loadCompatibleImage(fileName);
    }
}