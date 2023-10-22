import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tentang here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tentang extends World
{
    private GreenfootSound myMusic;
    public tentang(){    
        super(900, 550, 1);
        addObject(new back(),830,475);
        myMusic=new GreenfootSound("about.mp3");
        myMusic.playLoop();
    }
    public GreenfootSound getMyMusic(){
        return myMusic;
    }
}
