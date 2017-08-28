import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Date;

public class Timer extends Actor
{
    private int remainingTime;
    private long timeFromLastUpdate;
    private CrabWorld world;
    
    public Timer(CrabWorld world) {
        this.remainingTime = 200;
        this.timeFromLastUpdate = System.currentTimeMillis();
        this.world = world;
    }
    
    
    public void act() 
    {   
        world.showText("Time " + this.remainingTime, 50, 50);
        long currentTime = System.currentTimeMillis();
        System.out.println(currentTime);
        if (currentTime - timeFromLastUpdate > 1000) {
            this.remainingTime-=1;
            this.timeFromLastUpdate = System.currentTimeMillis();
        }
        
        if (this.remainingTime == 0) {
            world.endGameProcess();
        }
    }
    
    public int getRemainingTime() {
        return this.remainingTime;
    }
}
