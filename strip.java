import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class strip here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class strip extends Actor
{
    public void act() 
    {
        setLocation(getX()-4,getY()) ;
        if (getX()<1)
        {
            setLocation(950,getY());
        }
    }    
}
