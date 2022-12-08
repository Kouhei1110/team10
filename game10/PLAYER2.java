import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PLAYER2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PLAYER2 extends Actor
{
    /**
     * Act - do whatever the PLAYER2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if( Greenfoot.isKeyDown( "up" )){
        setRotation(-90);
        move(6);
    }
    if( Greenfoot.isKeyDown( "down" )){
        setRotation(90);
        move(6);
    }
    }    
}
