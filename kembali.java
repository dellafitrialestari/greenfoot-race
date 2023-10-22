import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class kembali here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class kembali extends Actor
{
    GameWorld a=new GameWorld();
    public void act(){
        if(Greenfoot.mouseClicked(this)){
           gameover aa=(gameover)getWorld();
           aa.getMyMusic().stop();
           Greenfoot.setWorld(new GameWorld());
        }
    }    
}
