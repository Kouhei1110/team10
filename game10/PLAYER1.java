import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PLAYER1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PLAYER1 extends Actor
{
    /**
     * Act - do whatever the PLAYER1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if( Greenfoot.isKeyDown( "up" ) ){
        setRotation(-90);
        move(4);
    }
        // Add your action code here.
    }    
}