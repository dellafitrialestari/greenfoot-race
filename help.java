import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class about here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class help extends button
{
    private List A;
    
    public help(GameWorld h){
        super(h);
    }
    public void act(){
        if(Greenfoot.mouseClicked(this)){
           GameWorld aa=(GameWorld)getWorld();
           aa.getMyMusic().stop();
           A=getWorld().getObjects(button.class);
           getWorld().removeObjects(A);
           Greenfoot.setWorld(new bantuan());
        }
    }    
}
