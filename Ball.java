import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
/**
 * @author Leigh Rubin
 * Ball.java
 * Defines a Ball object
 */
public class Ball
{
    private Rectangle ball;
    private Ellipse2D.Double circle;
    public int xSpeed;
    public int ySpeed;
    /**
     * Constructs a Ball
     */
    public Ball()
    {
        ball = new Rectangle(18,18);
        circle = new Ellipse2D.Double(345, 668, 18, 18);
        xSpeed = 0;
        ySpeed = 0;
        ball.setBounds(345, 668, 18, 18);
    }
    public Ball(int x, int y, int xS, int yS)
    {
        ball = new Rectangle(18,18);
        circle = new Ellipse2D.Double(x, y, 18, 18);
        xSpeed = xS;
        ySpeed = yS;
        ball.setBounds(x, y, 18, 18);
    }
    /**
     * Draw the image
     * @param Graphics g
     */
    public void draw(Graphics g) {
        g.drawImage(getImage(), ball.x, ball.y, ball.width, ball.height, null);
    }
    /**
     * Returns the Image
     * @return Image
     */
    public Image getImage()
    {
        return ImageLoader.loadCompatibleImage("Ball.png");
    }
    /**
     * Returns the Ball
     * @return Rectangle ball
     */
    public Rectangle getBall()
    {
        return ball;
    }
    /**
     * Returns the bounding Ellipse
     * @reutrn Ellise2D.Double circle
     */
    public Ellipse2D.Double getCircle()
    {
        return circle;
    }
    /**
     * Resets the position of the ball
     */
    public void resetBall()
    {
        ball.setBounds(345, 668, 18, 18);
    }
    /**
     * Sets the xSpeed of the ball
     */
    public void setXSpeed(int x)
    {
        xSpeed = x;
    }
    /**
     * Sets the ySpeed of the ball
     */
    public void setYSpeed(int y)
    {
        ySpeed = y;
    }
}
