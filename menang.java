import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class menang here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class menang extends World
{
    private GreenfootSound myMusic;
    public GreenfootSound getMyMusic(){
        return myMusic;
    }
    public menang(){    
        super(900, 550, 1); 
        myMusic=new GreenfootSound("menang.mp3");
        myMusic.playLoop();
        addObject(new kembalimenang(),800,480);
    }
}
