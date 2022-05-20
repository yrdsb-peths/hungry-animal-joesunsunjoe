import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hi here.
 * The Bee
 * @author Jason 
 * @version May 2022
 */
public class Bee extends Actor
{
    /**
     * Act - do whatever the Hi wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("left"))
        {
            move(-1);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            move(1);            
        }
        eat();
    }
    public void eat()
    {
        if (isTouching(Baby.class))
        {
            removeTouching(Baby.class);
            MyWorld world = (MyWorld)getWorld();
            world.createBaby();
            world.increaseScore( );
        }
    }
}
