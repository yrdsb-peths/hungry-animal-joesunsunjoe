import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Food for bee
 * 
 * @author Jason
 * @version May 2022
 */
public class Baby extends Actor
{
    /**
     * Act - do whatever the Pizza wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(), getY() + 1);
        MyWorld world = (MyWorld)getWorld();
        if(getY()>= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        }
    }
}
