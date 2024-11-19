// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class CannonBall extends Actor
{

    /**
     * Act - do whatever the CannonBall wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (isGameLost()) {
            transitionToGameOver();
        }
        kill();
        move();
    }

    /**
     * Ball movement
     */
    public void move()
    {
        Canon Cannon =  new  Canon();
        move(Greenfoot.getRandomNumber(10));
    }

    /**
     * Killing Ladybug
     */
    public void kill()
    {
        Actor ladybug = getOneIntersectingObject(Ladybug.class);
        if (ladybug != null) {
            World world = getWorld();
            world.removeObject(ladybug);
        }
    }

    /**
     * Checking if game is lost
     */
    public boolean isGameLost()
    {
        World world = getWorld();
        if (world.getObjects(Ladybug.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Transition to GameOverScreen
     */
    public void transitionToGameOver()
    {
        World gameOverWorld =  new  GameOverScreen();
        Greenfoot.setWorld(gameOverWorld);
        Greenfoot.playSound("lose.wav");
    }
}
