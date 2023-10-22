import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class exitgame extends button
{
    private List A;
    public exitgame(GameWorld h){
        super(h);
    }
    
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
           GameWorld aa=(GameWorld)getWorld();
           aa.getMyMusic().stop();
           A=getWorld().getObjects(button.class);
           getWorld().removeObjects(A);
           Greenfoot.stop();
        }
    }    
}
