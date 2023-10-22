import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level extends World
{
    private GreenfootSound myMusic;
    int ba=0;
    public GreenfootSound getMyMusic(){
        return myMusic;
    }
    public level(){    
        super(900, 550, 1); 
        myMusic=new GreenfootSound("awalgame.mp3");
        myMusic.playLoop();
    }
    public void act(){
        if(ba==0){
            mahasiswa tombol1=new mahasiswa();
            sma tombol2=new sma();
            smp tombol3=new smp();
            kembalilevel tombol4=new kembalilevel();
            addObject(tombol1,810,260);
            addObject(tombol2,800,340);
            addObject(tombol3,800,409);
            addObject(tombol4,835,480);
            ba=1;
        }
    }
}
