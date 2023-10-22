import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

import java.util.List;
/**
 * You create a program in which an arrow/key randomly/to the rhythm of 
 * something pops up and you must click that key in a certain amount of time. 
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameWorld extends World
{
    private GreenfootSound myMusic;
    
    public GameWorld()
    {    
        super(900, 550, 1);
    }
    public GreenfootSound getMyMusic(){
        return myMusic;
    }
    int j=0;
    public void tetap(int a){
        j=a;
    }
    int ba=0;
    public void act()
    {
        if(ba==0){
            play tombol1=new play(this);
            help tombol2=new help(this);
            about tombol3=new about(this);
            exitgame tombol4= new exitgame(this);
            addObject(tombol1,800,260);
            addObject(tombol2,800,340);
            addObject(tombol3,800,404);
            addObject(tombol4,830,480);
            if(j==0){
                myMusic=new GreenfootSound("awalgame.mp3");
                myMusic.playLoop();
                ba=1;
            }
        }
    }
}