import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class nilai here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class nilai extends Actor
{
    private int value = 0;
    private int target = 0;
    private String text;
    private int stringLength;
    
    public nilai(){
        this("");
    }
    
    public nilai(String prefix){
        text = prefix;
        stringLength = (text.length() + 2) * 16;
        setImage(new GreenfootImage(stringLength, 24));
        GreenfootImage image = getImage();
        Font font = image.getFont();
        image.setFont(font.deriveFont(24.0F)); 
        updateImage();
    }
    //Agar score dapat bertambah dan berkurang
    public void act(){
        if(value < target) {
            value++;
            updateImage();
        }
        else if(value > target) {
            value--;
            updateImage();
        }
    }
    
    public void add(int score){
        target += score;
    }

    public void subtract(int score){
        target -= score;
    }

    public int getValue(){
        return value;
    }
    
    public int gettarget(){
        return target;
    }
    
    private void updateImage(){
        GreenfootImage image = getImage();
        image.clear();
        image.drawString(text + value, 1, 18);
    }
}
