import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class animasi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class animasi extends Actor
{
    private GreenfootImage[] images;
    private int currentImage = 0;
    
    public animasi(String basename, String suffix, int noOfImages)
    {
        images = new GreenfootImage[noOfImages];
        for(int i=0; i < noOfImages; i++) {
            images[i] = new GreenfootImage(basename + i + suffix);
        }
        setImage(images[currentImage]);
    }  
}
