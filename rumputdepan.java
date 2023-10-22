import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rumputdepan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rumputdepan extends Actor
{
    public void act()
    {
        //Rumput dapat seperti bergerak
        setLocation(getX()-4,getY()) ;
        //ketika gambar rumput habis, dapat menampilkan kembali
        if (getX()<1)
        {
            setLocation(900,getY());
        }
    }
}
