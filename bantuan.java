import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bantuan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bantuan extends World
{
    private GreenfootSound myMusic;
    public bantuan()
    {    
        super(900, 550, 1); 
        addObject(new backbantuan(),830,475);
        myMusic=new GreenfootSound("helpsound.mp3");
        myMusic.playLoop();
    }
    public GreenfootSound getMyMusic(){
        return myMusic;
    }
}
