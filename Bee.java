 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hi here.
 * The Bee
 * @author Jason 
 * @version May 2022
 */
public class Bee extends Actor
{
    GreenfootSound beeSound = new GreenfootSound ("beeSound.mp3");
    public void act()
    {
        if (Greenfoot.isKeyDown("left"))
        {
            move(-1);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            move(2);            
        }
        eat();
    }
    public void eat()
    {
        if (isTouching(Baby.class))
        {
            beeSound.play();
            removeTouching(Baby.class);
            MyWorld world = (MyWorld)getWorld();
            world.createBaby();
            world.increaseScore( );
        }
    }
}
