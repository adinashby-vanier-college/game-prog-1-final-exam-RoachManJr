// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Ladybug extends Actor
{

    /**
     * Act - do whatever the Hero wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        movement();
        if (isGameWon()) {
            transitionToGameWon();
        }
    }

    /**
     * Method is used for Ladybug's movement utilizing the arrow keys.
     */
    public void movement()
    {
        if (Greenfoot.isKeyDown("up")) {
            move(3);
        }
        if (Greenfoot.isKeyDown("down")) {
            move(-3);
        }
        if (Greenfoot.isKeyDown("left")) {
            turn(-3);
        }
        if (Greenfoot.isKeyDown("right")) {
            turn(3);
        }
    }

    /**
     * Checking if game is won
     */
    public boolean isGameWon()
    {
        World world = getWorld();
        if (isTouching(FinishLocation.class)) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Trasnsition to WinningScreen
     */
    public void transitionToGameWon()
    {
        World gameWinWorld =  new  WinningScreen();
        Greenfoot.setWorld(gameWinWorld);
        Greenfoot.playSound("win.wav");
    }
}
