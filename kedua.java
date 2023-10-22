import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class kedua here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class kedua extends World
{
    private GreenfootSound myMusic;
    private double nextTime;
    private double lastTime;
    private String lastString;
    nilai Nilai=new nilai("Score: ");
    public kedua()
    {    
        super(900, 550, 1); 
        addObject(new delman2(),100,400);
        addObject(Nilai, 100, 500);
        addObject(new strip(),0,465);
        addObject(new strip(),150,465);
        addObject(new strip(),300,465);
        addObject(new strip(),450,465);
        addObject(new strip(),600,465);
        addObject(new strip(),750,465);
        addObject(new strip(),900,465);
        addObject(new awan1(),50,50);
        addObject(new awan2(),150,150);
        addObject(new awan3(),250,50);
        addObject(new awan4(),450,150);
        addObject(new awan5(),600,50);
        addObject(new awan6(),750,150);
        addObject(new pohon(),150,320);
        addObject(new pohon2(),300,400);
        addObject(new pohon(),450,320);
        addObject(new pohon2(),600,400);
        addObject(new pohon(),750,320);
        addObject(new pohon2(),900,400);
        addObject(new rumputdepan(),0,420);
        addObject(new rumputdepan(),450,420);
        addObject(new rumputdepan(),0,530);
        addObject(new rumputdepan(),450,530);
        setActOrder(rumputdepan.class,strip.class,orang2.class,button.class,pohon.class,pohon2.class,delman.class);
    }
    int b=0;
    public int cekNilai(){
        b=Nilai.getValue();
        return b;
    }
    public void countPop(){
        Nilai.add(20);
    }
    public void kurang(){
        Nilai.subtract(20);
    }
   
    public void gameOver(){
       Greenfoot.setWorld(new gameover());
       myMusic.stop();
    }
    public void menang(){
        Greenfoot.setWorld(new menang());
        myMusic.stop();
    }
    int a=0;
    public void act(){
        gerak();
        if(a==0){
            myMusic=new GreenfootSound("maingame.mp3");
            myMusic.playLoop();
            a=1;
        }
    }
    int c=0;
    orang2 or=new orang2();
    public void gerak(){
        if(System.currentTimeMillis() >= nextTime) {
            //Agar blok muncul
            c++;
            addObject(new Block2(), Greenfoot.getRandomNumber(getWidth()-150)+50, 0);
            nextTime = System.currentTimeMillis() + Greenfoot.getRandomNumber(1000);
            if(c==120){
                addObject(or,880,475);
            }
        }
        String str = Greenfoot.getKey();  
        if (str != null) {  
            //Ketika blok yang telah sesuai hurufnya diklik, menghilang
            lastString = str;
            lastTime = System.currentTimeMillis();
            for (Object obj : getObjects(Block2.class)) {  
                ((Block2) obj).checkKey(str);  
                
            }  
        }  
    }
}
