 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hi here.
 * The Bee
 * @author Jason 
 * @version May 2022
 */
import java.util.Random;

public class Bee extends Actor
{
    GreenfootSound beeSound = new GreenfootSound ("beeSound.mp3");
    GreenfootSound insectSound = new GreenfootSound("insectSound.mp3");
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
            Sound();
            removeTouching(Baby.class);
            MyWorld world = (MyWorld)getWorld();
            world.createBaby();
            world.increaseScore( );
        }
    }
    public void Sound()
    {
        
        Random rd = new Random(); 
        int[] arr = new int[1];
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = rd.nextInt();
            int integer = rd.nextInt();
            if (integer%2 == 0)
            {
                beeSound.play();
            }
            else
            {
                insectSound.play();
            }
        }
             
            
    }
}
