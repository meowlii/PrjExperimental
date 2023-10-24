import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kiki here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kiki extends Actor
{
    GreenfootSound Vento = new GreenfootSound("wind.mp3");
    public int speed = 3;
    private int sTimer = 0;

    /**
     * Atividade 1
     */
    public void movimento(){
        
        if (Greenfoot.isKeyDown("w")){
        this.setLocation(this.getX(), this.getY() - speed);
        setRotation(0);;
    }
        if (Greenfoot.isKeyDown("s")){
        this.setLocation(this.getX(), this.getY() + speed);
        setRotation(90);
    }
        if (Greenfoot.isKeyDown("a")){
        this.setLocation(this.getX() - speed, this.getY());
        setRotation(180);
    }
        if (Greenfoot.isKeyDown("d")){
        this.setLocation(this.getX() + speed, this.getY());
        setRotation(270);
    }
    
        else if (Greenfoot.isKeyDown("f") && (sTimer == 0)){
            
            sTimer ++;
            Vento.play();
            getWorld().addObject(new Vento(), getX() - 100, getY() + 30);
        }
        else {
            if (!Greenfoot.isKeyDown("f")){
            sTimer = 0;
            }
        }
    }
    
    /**
     * Do whatever the jiji likes to to just now.
     */
    public void act()
    {
 
        movimento();
    }

    /**
     * Move one step forward.
     */
      public void move()
    {
       move(1);
    }
    
    /**
     * Turn left by 90 degrees.
     */
    public void turnLeft()
    {
        turn(-90);
    }
       
    /**
     * Check whether there is a leaf in the same cell as we are.
     * Return true, if there is, false otherwise.
     */
    public boolean foundLeaf()
    {
        Actor leaf = getOneObjectAtOffset(0, 0, Leaf.class);
        return leaf != null;
    }
    
    /**
     * Eat a leaf (if there is one in our cell).
     */

    
    /**
     * Set the direction we're facing. The 'direction' parameter must
     * be in the range [0..3].
     */
    
    public void setDirection(int direction)
    {
        if ((direction >= 0) && (direction <= 3)) {
            setRotation(direction * 0);
        }
    }
    
    /**
     * Test if we can move forward. Return true if we can, false otherwise.
     
    /**
     * Tell how many leaves we have eaten.
     */

}
    
