import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mahasiswa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mahasiswa extends Actor
{
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
           level aa=(level)getWorld();
           aa.getMyMusic().stop();
           Greenfoot.setWorld(new ketiga());
        }
    }    
}
