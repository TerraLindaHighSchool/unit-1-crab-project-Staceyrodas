import greenfoot.*;

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    private int numOfWorms = 8;
    
    public void act()
    {
        move(3);
        turnAtEdge();
        checkKeyPress();
        onCollision();
    }
    
    private void turnAtEdge ()
    { 
        if (isAtEdge())
        {
            turn(50);
        } 
    } 
    
    private void checkKeyPress ()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            turn(4);            
        }
    
        if(Greenfoot.isKeyDown("left"))
        {
            turn(-4);
        }

    }
    
    private void onCollision()
    {
        if(isTouching(Worm.class))
        {
            removeTouching(Worm.class);
            Greenfoot.playSound("slurp.wav");
            numOfWorms--;
            System.out.println("Number of worms: " + numOfWorms);
            
            // Winning The Game
            if(numOfWorms == 0)
            {
                Greenfoot.setWorld(new WinSplash());
                Greenfoot.playSound("fanfare.wav");
                Greenfoot.stop();
            }
        }  
    
        
        if(isTouching(lobster.class))
        {
            removeTouching(Worm.class);
            Greenfoot.playSound("au.wav");
            Greenfoot.stop();
            
        }
    }
    
}
    
   


