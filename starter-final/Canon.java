// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Canon extends Actor
{
    public int rotation = getRotation();

    /**
     * Act - do whatever the Canon wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        fire();
    }

    /**
     * Used for the cannon firing the cannonballs
     */
    public void fire()
    {
        CannonBall newBall =  new  CannonBall();
        getWorld().addObject(newBall, getX(), getY());
        sleepFor(50);
    }
}
