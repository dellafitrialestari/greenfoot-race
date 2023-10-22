import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class becak here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class delman2 extends animasi
{
    int delay=5;
    int x;
    int img=0;
    public delman2(){
       super("delman",".png",9); 
    }
   
    public void act(){
        //Delman tidak berubah tempat, dan cek nilai
        orang2 or=(orang2)getOneIntersectingObject(orang2.class);
        int a=1;
        setLocation(getX()+a, getY() );
        if(or != null && ((kedua)getWorld()).cekNilai()<=1500){
            ((kedua)getWorld()).gameOver();
        }
        else if (or !=null && ((kedua)getWorld()).cekNilai()>1500){
            ((kedua)getWorld()).menang();
        }
        //Agar delman tidak jalan ke depan
        camina();
    }    
    
     public void camina(){              
        if(delay==0){
         caminaLenador();
         setLocation(getX()-3,getY());
         delay=2;
        }
        else
            delay--;
    }
    
    public void caminaLenador(){
         switch(img){
               case 0: setImage("delman0.png");
                       break;
                       
               case 1: setImage("delman1.png");
                       break;
                       
               case 2: setImage("delman2.png");
                       break;
                       
               case 3: setImage("delman3.png");
                       break;
               
               case 4: setImage("delman4.png");
                       break;
                       
               case 5: setImage("delman5.png");
                       break;
                                
               case 6: setImage("delman6.png");
                       break;
                                
               case 7: setImage("delman7.png");
                       break;
                                
               case 8: setImage("delman8.png");
                       break;
                       
               case 9: setImage("delman9.png");
                       break;     
         }
         //Agar animasi dapat berubah-ubah
         img=(img+1)%11;
    } 
}
