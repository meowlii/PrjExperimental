import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mundo2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mundo2 extends World
{
    private int atraso = 0;
    /**
     * Constructor for objects of class Mundo2.
     * 
     */
    public Mundo2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
}
    public void act(){
    if (Greenfoot.isKeyDown("enter") && (atraso==0){
    setBackground(new GreenfootImage("Mundo.jpg"));
    atraso++;
}
    else{
        if (!Greenfoot.isKeyDown("enter")){
    atraso = 0;
    }
    }
}
