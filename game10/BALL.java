import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BALL here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BALL extends Actor
{
    /**
     * Act - do whatever the BALL wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage img_bkup = null;
    private int width=50;
    private int height= 50;

    public BALL(){
        img_bkup = new GreenfootImage( getImage() );
        getImage().scale( width,height );
    }
    
    int i = 0;
    public void act() 
    {
        // Add your action code here.
        GreenfootImage img = new GreenfootImage(img_bkup);
        img.scale( width,height );
        setImage(img);
        while(i==0){
            int A = 0;
            int B = 360;
            int x = A + (int)(Math.random()*((B-A)+1));
            setRotation(x);
            i++;
        }
        move(5);
    }    
}
