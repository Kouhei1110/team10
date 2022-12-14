import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 450, 1);
        getBackground().scale( 1070,600 );
        addObject(new BALL(), 400, 225);
        addObject(new PLAYER1(), 50, 225);
        addObject(new PLAYER2(), 750, 225);
    }
}
