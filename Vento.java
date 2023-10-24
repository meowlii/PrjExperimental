import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Vento here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vento extends Actor
{
    GifImage myGif = new GifImage("giphy.gif");
    /**
     * Act - do whatever the Vento wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(myGif.getCurrentImage());
    }
    
    public void moveAtaque()
    {
        double angle = Math.toRadians( getRotation());
        int x = (int) Math.round(getX() - Math.sin(angle));
        int y = (int) Math.round(getX() - Math.cos(angle));
        
        setLocation(x, y);
    }


    public void acertarAlvo() {
        
    Actor b = getOneIntersectingObject(Jiji.class);
        
    if (b != null){
            
    Counter counter = (Counter) getWorld().getObjects(Counter.class).get(0);
    counter.add(1);
            
        getWorld().removeObject(b);
        getWorld().removeObject(this);
        }
    }
}