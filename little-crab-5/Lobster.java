import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)
import java.util.Random;

/**
 * A lobster. Lobsters live on the beach. They like to eat crabs. (Well, in our game
 * they do...)
 * 
 * Version: 2
 * 
 * The lobster walks around randomly. If it runs into a crab it eats it.
 * In this version, we have added a sound effect, and the game stops when
 * a lobster eats the crab.
 */

public class Lobster extends Actor
{
    private int speed;
    private CrabWorld world;
    
    public Lobster(CrabWorld world) {
        Random random = new Random();
        this.speed = random.nextInt(5)+3;
        this.speed = 4;
        this.world = world;
    }
    
    
    /**
     * Do whatever lobsters do.
     */
    public void act()
    {
        turnAtEdge();
        randomTurn();
        move(this.speed);
        lookForCrab();
    }

    /**
     * Check whether we are at the edge of the world. If we are, turn a bit.
     * If not, do nothing.
     */
    public void turnAtEdge()
    {
        if ( isAtEdge() ) 
        {
            turn(17);
        }
    }

    /**
     * Randomly decide to turn from the current direction, or not. If we turn
     * turn a bit left or right by a random degree.
     */
    public void randomTurn()
    {
        if (Greenfoot.getRandomNumber(100) > 90) 
        {
            turn(Greenfoot.getRandomNumber(90)-45);
        }
    }

    /**
     * Try to pinch a crab. That is: check whether we have stumbled upon a crab.
     * If we have, remove the crab from the game, and stop the program running.
     */
    public void lookForCrab()
    {
        if ( isTouching(Crab.class) ) 
        {
            Greenfoot.playSound("au.wav");
            world.addScore(-50);
            Random random = new Random();
            this.setLocation(random.nextInt(559)+1, random.nextInt(559)+1);
        }
    }
}