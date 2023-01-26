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
    int v;
    int x = 0;
    int r = 0;
    int flag = 0;
    int left = 0;
    int right = 0;
    public void act() 
    {
        // Add your action code here.
        GreenfootImage img = new GreenfootImage(img_bkup);
        img.scale( width,height );
        setImage(img);
        getWorld().showText( ""+right, 50, 400 );
        getWorld().showText( ""+left, 750, 400 );
        while(i==0){
            int A = 0;
            int B = 360;
            x = A + (int)(Math.random()*((B-A)+1));
            if(x < 10 && x < 350){
                x = x + 10;
            }
            if(x < 190 && x < 170){
                x = x + 10;
            }
            setRotation(x);
            v = 6;
            i++;
        }
        move(v);
        
        Actor actor1 = getOneIntersectingObject( PLAYER1.class );
        if( actor1 != null ){
            v += 1;
            x = x - 180;
            x = -x;
            int A = 0;
            int B = 20;
            r = A + (int)(Math.random()*((B-A)+1));
            setRotation(x);
        }       
        Actor actor2 = getOneIntersectingObject( PLAYER2.class );
        if( actor2 != null ){
            v += 1;
            x = x + 180;
            x = -x;
            int A = 0;
            int B = 20;
            r = A + (int)(Math.random()*((B-A)+1));
            setRotation(x);
        }
        if( x >= 360 ){
            x -= 360;
        }
        if( x <= -360 ){
            x += 360;
        }
        if((getY() <= 1 || getY() >= 449) && flag == 0){
            x = -x;
            setRotation(x);
            flag++;
        }
        if(getY() >= 20 && getY() < 430){
            flag = 0;
        }
        
        
        if(getX() <= 5){
            left++;
            if(left == 3){
                getWorld().showText( "PLAYER2 WIN!!!", 400, 150 );
                Greenfoot.stop();
            }
            setLocation(400,225);
            i = 0;
            Greenfoot.delay(30);
        }
        if(getX() >= 795){
            right++;
            if(right == 3){
                getWorld().showText( "PLAYER1 WIN!!!", 400, 150 );
                Greenfoot.stop();
            }
            setLocation(400,225);
            i = 0;
            Greenfoot.delay(30);
        }
    }    
}
