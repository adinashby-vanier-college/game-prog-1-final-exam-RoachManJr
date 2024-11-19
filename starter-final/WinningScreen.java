// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class WinningScreen extends World
{
    private GreenfootSound gameMusic;

    /**
     * Constructor for objects of class WinningScreen.
     */
    public WinningScreen()
    {
        super(800, 600, 1);
        showTextWithBigBlackFont("Congratulations, You Win!", 100, 300);
        gameMusic =  new  GreenfootSound("win.wav");
    }

    /**
     * Show winning text
     */
    public void showTextWithBigBlackFont(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new  Font(50);
        bg.setFont(font);
        bg.setColor(Color.BLACK);
        bg.drawString(message, x, y);
    }

    /**
     * Start music
     */
    public void started()
    {
        gameMusic.play();
    }

    /**
     * Stop music
     */
    public void stopped()
    {
        gameMusic.stop();
    }
}
