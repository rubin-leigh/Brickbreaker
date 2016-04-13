import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * @author Leigh Rubin
 * Paddle.java
 * Defines a Paddle object
 */
public class Paddle
{
    private int speed;
    public boolean flip = false;
    public boolean right = false;;
    public boolean left = false;
    private Rectangle paddle;
    private String file;
    /**
     * Constructs a Paddle with a speed
     * @param int s
     */
    public Paddle(int s)
    {
        speed = s;
        paddle = new Rectangle(133,35);
        paddle.setBounds(290, 686, 133, 35);
        file = "Paddle.png";
    }
    /**
     * Draw the image
     * @param Graphics g
     */
    public void draw(Graphics g) {
        g.drawImage(getImage(), paddle.x, paddle.y, paddle.width, paddle.height, null);
    }
    /**
     * Returns the Image
     * @return Image
     */
    public Image getImage()
    {
        return ImageLoader.loadCompatibleImage(file);
    }
    /**
     * Returns the Paddle
     * @return Rectangle paddle
     */
    public Rectangle getPaddle()
    {
        return paddle;
    }
    /**
     * Resets the position of the paddle
     */
    public void resetPaddle()
    {
        paddle.setBounds(290, 686, 133, 35);
        file = "Paddle.png";
    }
    /**
     * Returns the speed of the paddle
     * @return int speed
     */
    public int getSpeed()
    {
        return speed;
    }
    /**
     * Sets the speed of the paddle
     * @param int speed
     */
    public void setSpeed(int s)
    {
        speed = s;
    }
    /**
     * Makes the paddle a normal paddle
     */
    public void normalPaddle()
    {
        paddle.setBounds(paddle.x, paddle.y, 133, 35);
        file = "Paddle.png";
        flip = false;
    }
    /**
     * Makes the paddle a laser paddle
     */
    public void laserPaddle()
    {
        paddle.setBounds(paddle.x, paddle.y, 133, 35);
        file = "LaserPaddle.png";
    }
    /**
     * Make the paddle a gun paddle
     */
    public void gunPaddle()
    {
        paddle.setBounds(paddle.x, paddle.y, 133, 35);
        file = "GunPaddle.png";
    }
    /**
     * Makes the paddle a long paddle
     */
    public void longPaddle()
    {
        paddle.setBounds(paddle.x - 34, paddle.y, 201, 35);
        file = "LongPaddle.png";
    }
    /**
     * Flips the controls of the paddle
     */
    public void flip()
    {
        flip = true;
    }
} 