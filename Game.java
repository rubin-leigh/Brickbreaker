import javax.swing.*;
import java.awt.Dimension;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Collections;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
//http://www.brickbreakerguide.com/brick-breaker-help/
/**
 * @author Leigh Rubin
 * Game.java
 * Runs the BrickBreaker game
 */
public class Game extends JPanel implements ActionListener, KeyListener
{
    private ArrayList<Ball> balls = new ArrayList<Ball>();
    private ArrayList<Level> levels = new ArrayList<Level>();
    private ArrayList<Brick> b;
    private Paddle p = new Paddle(15);
    private Ball ball = new Ball();
    private Rectangle r = p.getPaddle();
    private Arrow a = null;
    private Timer timer;
    private int gameWidth = 968; //the width of the game area
    private int gameHeight = 726; //the height of the game area
    private JLabel background;
    private ArrayList<PowerUp> pU = new ArrayList<PowerUp>();
    private ArrayList<Laser> leftLasers = new ArrayList<Laser>();
    private ArrayList<Laser> rightLasers = new ArrayList<Laser>();
    private ArrayList<Bullet> bullet = new ArrayList<Bullet>();
    private int[] locs = {-15, 15, -14, 14, -13, 13, -12, 12, -11, 11, -10, 10, -9, 9, -8, 8, -7, 7, -6, 6, -5, 5, -4, 4 -3, 3, -2, 2, -1, 1};
    private int loc = 0;
    private int highscore = 0;
    private int currentLevel = 0;
    private int lives = 3;
    private int score = 0;
    private int ammo = 0;
    private int contacts = 0;
    private int moves = 0;
    private boolean laser = false;
    private boolean gun = false;
    private boolean cat = false;
    private boolean n = false;
    private boolean bomb = false;
    private boolean pause = false;
    private boolean shake = false;
    /**
     * Main method used to run the program
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLayout(new BorderLayout());

        Game game = new Game();
        frame.add(game, BorderLayout.CENTER);

        game.addKeyListener(game);
        frame.addKeyListener(game);

        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        frame.setTitle("Brick Breaker");
        frame.pack();
        frame.setLocationRelativeTo(null);

        game.setUpGame();
    }

    /**
     * Fills the levels ArrayList with all 34 levels
     */
    public void addLevels()
    {
        levels.add(new Level1());levels.add(new Level2());levels.add(new Level3());levels.add(new Level4());levels.add(new Level5());
        levels.add(new Level6());levels.add(new Level7());levels.add(new Level8());levels.add(new Level9());levels.add(new Level10());
        levels.add(new Level11());levels.add(new Level12());levels.add(new Level13());levels.add(new Level14());levels.add(new Level15());
        levels.add(new Level16());levels.add(new Level17());levels.add(new Level18());levels.add(new Level19());levels.add(new Level20());
        levels.add(new Level21());levels.add(new Level22());levels.add(new Level23());levels.add(new Level24());levels.add(new Level25());
        levels.add(new Level26());levels.add(new Level27());levels.add(new Level28());levels.add(new Level29());levels.add(new Level30());
        levels.add(new Level31());levels.add(new Level32());levels.add(new Level33());levels.add(new Level34());
    }

    /**
     * Constructs a new Game
     */
    public Game()
    {
        setPreferredSize(new Dimension(gameWidth, gameHeight));
    }

    public void actionPerformed(ActionEvent e) {
        update();
        repaint();
    }

    public void keyPressed(KeyEvent e)
    {
        int keyCode = e.getKeyCode();
        if(pause);
        else if(cat && ball.xSpeed == 0 && ball.ySpeed == 0){}
        else{
            if(p.flip)
            {
                if(keyCode == KeyEvent.VK_LEFT)
                    p.right = true;
                else if(keyCode == KeyEvent.VK_RIGHT)
                    p.left = true;
            }
            else
            {
                if(keyCode == KeyEvent.VK_LEFT)
                    p.left = true;
                else if(keyCode == KeyEvent.VK_RIGHT)
                    p.right = true;
            }
        }

        if(!pause && laser && leftLasers.size() < 2 && keyCode == KeyEvent.VK_SPACE)
            leftLasers.add(new Laser(p.getPaddle().x + 25));
        if(!pause && laser && rightLasers.size() < 2 && keyCode == KeyEvent.VK_SPACE)
            rightLasers.add(new Laser(p.getPaddle().x + 133 - 35));

        if(!pause && ammo > 0 && gun && bullet.size() < 1 && keyCode == KeyEvent.VK_SPACE){
            ammo--;
            bullet.add(new Bullet(p.getPaddle().x + (133/2) - 12));
            if(ammo == 0){
                gun = false;
                p.normalPaddle();
            }
        }
    }

    public void keyReleased(KeyEvent e)
    {
        int keyCode = e.getKeyCode();
        if(keyCode == KeyEvent.VK_P && !pause){
            pause = true;
            repaint();
            timer.stop();
        }
        else if(keyCode == KeyEvent.VK_P && pause){
            pause = false;
            timer.start();
        }
        else if(pause);
        else if(cat && ball.xSpeed == 0 && ball.ySpeed == 0){
            if(a == null)
                a = new Arrow();
            a.getArrow().x = ball.getBall().x - 21;
            a.getArrow().y = r.y - 61;
            if(keyCode == KeyEvent.VK_SPACE){
                ball.xSpeed = a.xSpeed;
                ball.ySpeed = a.ySpeed;
                moveBall(ball);
                a = null;
                if(n){
                    n = false;
                    cat = false;
                }
            }
        }
        else
        {
            if(p.flip)
            {
                if(keyCode == KeyEvent.VK_LEFT)
                    p.right = false;
                else if(keyCode == KeyEvent.VK_RIGHT)
                    p.left = false;
            }
            else
            {
                if(keyCode == KeyEvent.VK_LEFT)
                    p.left = false;
                else if(keyCode == KeyEvent.VK_RIGHT)
                    p.right = false;
            }
        }

        if(a != null && !pause){
            if(keyCode == KeyEvent.VK_LEFT){
                try{a.left();}
                catch(Exception x){}
                p.right = false;
                p.left = false;
            }
            else if(keyCode == KeyEvent.VK_RIGHT){
                try{a.right();}
                catch(Exception x){}
                p.right = false;
                p.left = false;
            }
        }
    }

    public void keyTyped(KeyEvent e){}

    /**
     * Sets up the Game
     */
    public void setUpGame() {
        if(timer != null) {
            timer.stop();
        }

        addLevels();
        b = levels.get(currentLevel).getBricks();
        try{
            Scanner scanner = new Scanner(new File("Highscore.txt"));
            highscore = 0;
            highscore = scanner.nextInt();
        }catch(Exception e){}
        timer = new Timer(1000 / 70, this); //roughly 70 frames per second
        timer.start();

        ball.setXSpeed(0);
        ball.setYSpeed(0);
        balls.add(ball);
        n = true;
        cat = true;
    }

    /**
     * Updates the Game
     */
    public void update()
    {
        movePaddle();
        handleBrickContacts();
        handlePowerUps();
        handleBallDirection();
        removeBalls();
        handleInfiniteLoop();
    }

    /**
     * Paints all components to JFrame
     */
    public void paint(Graphics g) {
        if(loc >= locs.length){
            shake = false;
            loc = 0;
        }
        if(shake){
            g.drawImage(ImageLoader.loadCompatibleImage("background.png"),locs[loc],0,null);
            loc++;
        }
        else
            g.drawImage(ImageLoader.loadCompatibleImage("background.png"),0,0,null);
        p.draw(g);
        try{
            if(b.size() > 0){
                for(Brick e: b)
                    e.draw(g);
            }
        }
        catch(Exception e){}
        for(PowerUp p: pU){
            g.setFont(new Font("Arial Black", Font.BOLD, 20)); 
            g.drawString(p.getType(),p.getPowerUp().x + 70, p.getPowerUp().y + 25);
            p.fall();
            p.draw(g);
        }
        for(Laser e: leftLasers)
            e.draw(g);
        for(Laser e: rightLasers)
            e.draw(g);
        for(Bullet e: bullet)
            e.draw(g);
        try{a.getArrow().setBounds(a.getArrow().x,a.getArrow().y, 60, 61);a.draw(g);}
        catch(Exception e){}
        g.setFont(new Font("Arial Black", Font.BOLD, 40)); 
        g.drawString(Integer.toString(score),853 - (Integer.toString(score).length() * 16), 210);
        g.drawString(Integer.toString(ammo),835, 365);
        g.drawString(Integer.toString(lives),835, 520);
        g.drawString(Integer.toString(highscore), 853 - (Integer.toString(highscore).length() * 16), 675);
        for(Ball e: balls)
            e.draw(g);
        if(pause)
            g.drawImage(ImageLoader.loadCompatibleImage("Controls.png"), 968 - (968/2) - (447/2), 726 - (726/2) - (284/2), 447, 284, null);
    }

    /**
     * Updates game based on type of PowerUp
     * @param PowerUp
     */
    public void usePowerUp(PowerUp e)
    {
        if(e.getType().equals("Life")){
            lives++;
            p.normalPaddle();
            ammo = 0;
            laser = false;
            gun = false;
            cat = false;
            bomb = false;
        }
        else if(e.getType().equals("Laser")){
            ammo = 0;
            p.laserPaddle();
            laser = true;
            gun = false;
            cat = false;
        }
        else if(e.getType().equals("Gun")){
            ammo += 3;
            p.gunPaddle();
            laser = false;
            gun = true;
            cat = false;
        }
        else if(e.getType().equals("Long")){
            ammo = 0;
            p.longPaddle();
            laser = false;
            gun = false;
            cat = false;
        }
        else if(e.getType().equals("Flip"))
            p.flip();
        else if(e.getType().equals("Slow")){
            ball.xSpeed = ball.xSpeed / 2;
            ball.ySpeed = ball.ySpeed / 2;
        }
        else if(e.getType().equals("Bomb")){
            bomb = true;
            cat = false;
            if(balls.size() > 1){
                for(int i = balls.size() - 1; i > 0; i--)
                    balls.remove(i);
                ball = balls.get(0);
                ball.xSpeed = 5;
                ball.ySpeed = -5;
            }
        }
        else if(e.getType().equals("Multi")){
            cat = false;
            bomb = false;
            for(int i = balls.size() - 1; i > 0; i--)
                balls.remove(i);
            ball.xSpeed = 3;
            ball.ySpeed = -6;
            balls.add(new Ball(ball.getBall().x + 9, ball.getBall().y + 9, -3, -6));
            balls.add(new Ball(ball.getBall().x + 9, ball.getBall().y + 9, -5, -5));
            balls.add(new Ball(ball.getBall().x + 9, ball.getBall().y + 9, 5, -5));
        }
        else if(e.getType().equals("Catch")){
            ammo = 0;
            laser = false;
            gun = false;
            bomb = false;
            cat = true;
            for(int i = balls.size() - 1; i > 0; i--)
                balls.remove(i);
            ball = balls.get(0);
            p.normalPaddle();
        }
    }

    /**
     * Moves the Paddle
     */
    public void movePaddle()
    {
        if(p.left){
            if(r.x - p.getSpeed() <= 58)
                r.x = 58;
            else
                r.x -= p.getSpeed();
        }
        else if(p.right){
            if(r.x + p.getSpeed() >= 655 - r.width)
                r.x = 655 - r.width;
            else
                r.x += p.getSpeed();
        }
    }

    /**
     * Handles the ball direction as a result of hitting bricks
     */
    public void handleBrickContacts()
    {
        for(int i = 0; i < b.size(); i++)
        {
            for(Ball e: balls)
            {
                if(e.getCircle().intersects(b.get(i).getBrick()))
                {
                    contacts++;
                    Brick x = b.get(i);
                    if(e.getCircle().y + 18 <= x.getBrick().y + e.ySpeed)
                        e.ySpeed = Math.abs(e.ySpeed) * -1;
                    else if(e.getCircle().y >= x.getBrick().y + 44 - Math.abs(e.ySpeed))
                        e.ySpeed = Math.abs(e.ySpeed);
                    else if(e.getCircle().getX() + 18 <= x.getBrick().x + e.xSpeed)
                        e.xSpeed = Math.abs(e.xSpeed) * -1;
                    else //if(ball.getCircle().getX() >= x.getBrick().x + 86 - Math.abs(ball.xSpeed))
                        e.xSpeed = Math.abs(e.xSpeed);
                    if(x instanceof NormalBrick){
                        if(bomb)
                        {
                            //89x48
                            score += 50;
                            for(int j = b.size() - 1; j >= 0; j--){
                                b.get(j).getBrick().setLocation(b.get(j).getBrick().x - 5, b.get(j).getBrick().y - 5);
                                b.get(j).getBrick().grow(5,5);
                                if(j != i && b.get(j).getBrick().intersects(b.get(i).getBrick()))
                                    b.get(j).updateBrick();
                                b.get(j).getBrick().grow(-5,-5);
                                b.get(j).getBrick().setLocation(b.get(j).getBrick().x + 5, b.get(j).getBrick().y + 5);
                            }
                            b.get(i).updateBrick();
                            b.get(i).updateBrick();
                            b.get(i).updateBrick();
                            b.get(i).updateBrick();
                            for(int j = b.size() - 1; j >= 0; j--){
                                if(b.get(j).getHits() <= 0)
                                    b.remove(j);
                            }
                            bomb = false;
                            shake = true;
                        }
                        else
                        {
                            score += 10;
                            NormalBrick a = (NormalBrick)x;
                            a.updateBrick();
                            if(a.getPowerUp() != null){
                                pU.add(a.getPowerUp());
                                a.setPowerUp(false);
                            }
                            if(a.getHits() <= 0)
                                b.remove(i);
                        }
                    }
                    break;
                }
            }
        }      

        handleLasers();

        handleBullets();
    }

    /**
     * Handles the laser ArrayLists and the bricks contacted by the Lasers
     */
    public void handleLasers()
    {
        for(int i = leftLasers.size() - 1; i >= 0; i--){
            Laser l = leftLasers.get(i);
            l.move();
            if(l.getLaser().y <= 90){
                leftLasers.remove(l);
                continue;
            }
            for(int j = b.size() - 1; j >= 0; j--){
                if(l.getLaser().intersects(b.get(j).getBrick())){
                    if(b.get(j) instanceof NormalBrick)score += 10;
                    leftLasers.remove(l);
                    b.get(j).updateLaser();
                    if(b.get(j).getHits() <= 0)
                        b.remove(j);
                }
            }
        }

        for(int i = rightLasers.size() - 1; i >= 0; i--){
            Laser l = rightLasers.get(i);
            l.move();
            if(l.getLaser().y <= 90){
                rightLasers.remove(l);
                continue;
            }
            for(int j = b.size() - 1; j >= 0; j--){
                if(l.getLaser().intersects(b.get(j).getBrick())){
                    if(b.get(j) instanceof NormalBrick)score += 10;
                    rightLasers.remove(l);
                    b.get(j).updateLaser();
                    if(b.get(j).getHits() <= 0)
                        b.remove(j);
                }
            }
        } 
    }

    /**
     * Handles the bullet ArrayLists and the bricks contacted by the Lasers
     */
    public void handleBullets()
    {
        for(int i = bullet.size() - 1; i >= 0; i--){
            Bullet e = bullet.get(i);
            e.move();
            if(e.getBullet().y <= 90){
                bullet.remove(e);
            }
            for(int j = b.size() - 1; j >= 0; j--){
                if(e.getBullet().intersects(b.get(j).getBrick())){
                    score += 50;
                    bullet.remove(e);
                    b.get(j).updateBullet();
                    if(b.get(j).getHits() <= 0 || b.get(j) instanceof MetalBrick)
                        b.remove(j);
                }
            }
        }
    }

    /**
     * Handles the PowerUps and adjusts the ArrayList<PowerUp>
     */
    public void handlePowerUps()
    {
        if(pU.size() != 0){
            for(int i = pU.size() - 1; i >= 0; i--){
                if(pU.get(i).getPowerUp().intersects(p.getPaddle())){
                    usePowerUp(pU.get(i));
                    pU.remove(i);
                    score += 50;
                }
                else if(pU.get(i).getPowerUp().y > 726)
                    pU.remove(i);
            }
        }
    }

    /**
     * Handles the direction of the ball after contacts the paddle and walls
     */
    public void handleBallDirection()
    {
        for(Ball e: balls)
        {
            if(e.getCircle().getX() <= 61 || e.getCircle().getX() + 18 >= 650){
                e.xSpeed *= -1;
                contacts++;
            }
            else if(e.getCircle().y <= 90){
                e.ySpeed = Math.abs(e.ySpeed);
                contacts++;
            }
            else if((e.getCircle().intersects(p.getPaddle()) && e.getCircle().y + 18 <= 697))
            {
                if(cat){
                    e.xSpeed = 0;
                    e.ySpeed = 0;
                }
                else if(e.getCircle().getX() + 9 < p.getPaddle().x + 10){
                    e.xSpeed = -9;
                    e.ySpeed = -4;
                }
                else if(e.getCircle().getX() + 9 < p.getPaddle().x + 30){
                    e.xSpeed = -8;
                    e.ySpeed = -4;
                }
                else if(e.getCircle().getX() + 9 < p.getPaddle().x + 45){
                    e.xSpeed = -7;
                    e.ySpeed = -5;
                }
                else if(e.getCircle().getX() + 9 < p.getPaddle().x + 55){
                    e.xSpeed = -5;
                    e.ySpeed = -5;
                }
                else if(e.getCircle().getX() + 9 < p.getPaddle().x + 66){
                    e.xSpeed = -4;
                    e.ySpeed = -6;
                }
                else if(e.getCircle().getX() + 9 < p.getPaddle().x + 76){
                    e.xSpeed = 4;
                    e.ySpeed = -6;
                }
                else if(e.getCircle().getX() + 9 < p.getPaddle().x + 97){
                    e.xSpeed = 5;
                    e.ySpeed = -5;
                }
                else if(e.getCircle().getX() + 9 < p.getPaddle().x + 105){
                    e.xSpeed = 7;
                    e.ySpeed = -5;
                }
                else if(e.getCircle().getX() + 9 < p.getPaddle().x + 118){
                    e.xSpeed = 9;
                    e.ySpeed = -4;
                }
                else{
                    e.xSpeed = 9;
                    e.ySpeed = -4;
                }
                if(!cat)
                    contacts++;
                moveBricks();
            }
            moveBall(e);
            if(b.size() == 0 || onlyMetal())
                nextLevel();
        }
    }

    /**
     * Moves the Ball
     * @param Ball
     */
    public void moveBall(Ball e)
    {
        e.getBall().x += e.xSpeed;
        e.getBall().y += e.ySpeed;
        e.getCircle().setFrame(e.getCircle().getX() + e.xSpeed, e.getCircle().getY() + e.ySpeed, 18, 18);
    }

    /**
     * Drops the bricks
     */
    public void moveBricks()
    {
        if(contacts >= 75 && moves < 9){
            for(Brick e: b){
                e.getBrick().y += 10;
            }
            moves++;
        }
    }

    /**
     * Returns if all of the bricks left are MetalBricks
     */
    public boolean onlyMetal()
    {
        for(Brick e: b)
        {
            if(e instanceof NormalBrick)
                return false;
        }
        return true;
    }

    /**
     * Advances to the next level
     */
    public void nextLevel()
    {
        currentLevel++;
        if(currentLevel > 33)
            currentLevel = 0;
        b = levels.get(currentLevel).getBricks();
        balls.clear();
        laser = false;
        gun = false;
        bomb = false;
        cat = true;
        n = true;
        ammo = 0;
        moves = 0;
        contacts = 0;
        ball.resetBall();
        p.normalPaddle();
        p.resetPaddle();
        leftLasers.clear();
        rightLasers.clear();
        bullet.clear();
        pU.clear();
        ball = new Ball();
        balls.add(ball);
        ball.setXSpeed(0);
        ball.setYSpeed(0);
        leftLasers.clear();
        rightLasers.clear();
        bullet.clear();
        repaint();
        try{
            Thread.sleep(1);
        }
        catch(Exception e){}
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){}
    }

    /**
     * Resets the ball and the paddle
     */
    public void reset()
    {
        lives--;
        laser = false;
        gun = false;
        cat = true;
        bomb = false;
        n = true;
        ammo = 0;
        contacts = 0;
        if(lives == 0){
            endGame();
            return;
        }
        ball.resetBall();
        p.normalPaddle();
        p.resetPaddle();
        leftLasers.clear();
        rightLasers.clear();
        bullet.clear();
        pU.clear();
        ball = new Ball();
        balls.add(ball);
        ball.setXSpeed(0);
        ball.setYSpeed(0);
        repaint();
        try{
            Thread.sleep(1);
        }
        catch(Exception e){}
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){}
    }

    /**
     * Removes balls from the ArrayList that go off the screen
     */
    public void removeBalls()
    {
        for(int i = balls.size() - 1; i >= 0; i--)
        {
            if(balls.get(i).getBall().y > gameHeight)
            {
                balls.remove(i);
            }
        }
        if(balls.size() == 0)
            reset();
        else
            ball = balls.get(0);
    }

    /**
     * Resets the ball when the ball is caught in an infinite loop
     */
    public void handleInfiniteLoop()
    {
        if(contacts >= 500){
            contacts = 0;
            if(lives == 0){
                endGame();
                return;
            }
            ball.resetBall();
            p.resetPaddle();
            ball = new Ball();
            ball.setXSpeed(5);
            ball.setYSpeed(-5);
            repaint();
            try{
                Thread.sleep(1);
            }
            catch(Exception e){}
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){}
        }
    }

    /**
     * Ends the game
     */
    public void endGame()
    {
        if(score > highscore){
            try{
                String content = Integer.toString(score);
                File file = new File("Highscore.txt");

                FileWriter fw = new FileWriter(file.getAbsoluteFile());
                fw.flush();
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(content);
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        timer.stop();
    }
}