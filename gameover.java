import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gameover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gameover extends World
{
    private GreenfootSound myMusic;
    public GreenfootSound getMyMusic(){
        return myMusic;
    }
    public gameover()
    {    
        super(900, 550, 1);
        myMusic=new GreenfootSound("gameover.mp3");
        myMusic.playLoop();
        addObject(new kembali(),800,480);
    }
}
