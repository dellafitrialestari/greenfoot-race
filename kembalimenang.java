import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class kembalimenang here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class kembalimenang extends Actor
{
    public void act(){
        if(Greenfoot.mouseClicked(this)){
           menang aa=(menang)getWorld();
           aa.getMyMusic().stop();
           Greenfoot.setWorld(new GameWorld());
        }
    }    
}
