import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lobster extends Actor
{
    /**
     * Act - do whatever the lobster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   
    {
        // Add your action code here.
    }
    
    public void act()
    {
        move(3);
        turnAtEdge();
        
    }
    
    private void turnAtEdge ()
    { 
        if (isAtEdge())
        {
            turn(50);
        } 
    } 
    
}
