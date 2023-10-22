import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Block here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Block extends Actor
{    
    private String str;
    private int state;
    public Block(){
        String[] alpha = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O",
                "P","Q","R","S","T","U","V","W","X","Y","Z"};
        str = alpha[Greenfoot.getRandomNumber(alpha.length-1)];
        changeState(0);
    }
    //Agar blok dapat berjatuhan
    public void act(){
        setLocation(getX(), getY()+2);
        if(getY() > getWorld().getHeight()-50 && getState()==0) {
            changeState(2);
            ((awal) getWorld()).kurang();
        }
        if(getY() > getWorld().getHeight()-5) getWorld().removeObject(this);
    }    
    nilai Nilai=new nilai();
    delman bec=new delman(); 
    public void checkKey(String string){
        if(string.equalsIgnoreCase(getChar())){
            if(getY() > getWorld().getHeight()-500 && 
            getY() < getWorld().getHeight()-50){
                if(getState()==0){ 
                    changeState(1);
                    pop();
                    Greenfoot.playSound("SelectClick.mp3");
                }
                else{
                    ((awal) getWorld()).kurang();
                }
            }
        }
    }
    public void pop() {
        ((awal) getWorld()).countPop();
        getWorld().removeObject(this);
    }
    public int getState() {
        return state;
    }
    public String getChar() {
        return str;
    }
    public void changeState(int status) {
        GreenfootImage img = new GreenfootImage(50,50);
        this.state = status;
        img.setColor(Color.BLUE);
        img.drawOval(0,0,50,50);
        img.drawOval(1,1,46,48);
        img.drawOval(2,2,46,46);
        img.drawOval(3,3,45,45);
        if(status == 0) 
            img.setColor(Color.WHITE);
        else if(status == 2)
            img.setColor(Color.ORANGE);
        img.fillOval(3,3,44,44);
        img.setColor(Color.ORANGE);
        img.setFont(new Font("Arial", 30));
        img.drawString(str, 13, 35);
        setImage(img);
    }
}