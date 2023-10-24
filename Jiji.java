import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jiji here.
 * 
 * @author Melissa 
 * @version 1.0 Alpha
 */
public class Jiji extends Actor
{
    private int leavesEaten;

    public Jiji()
    {
        leavesEaten = 0;
    }
    /**
     * Atividade 1
     */
    public void movimento(){
        
        int speed = 1;
        
        if (Greenfoot.isKeyDown("up")){
        this.setLocation(this.getX(), this.getY() - speed);
        setRotation(0);;
    }
        if (Greenfoot.isKeyDown("down")){
        this.setLocation(this.getX(), this.getY() + speed);
        setRotation(90);
    }
        if (Greenfoot.isKeyDown("left")){
        this.setLocation(this.getX() - speed, this.getY());
        setRotation(180);
    }
        if (Greenfoot.isKeyDown("right")){
        this.setLocation(this.getX() + speed, this.getY());
        setRotation(270);
    }
    
    else if (Greenfoot.isKeyDown("g")){
            getWorld().addObject(new lazinha(), getX() - 100, getY() + 30);
        }
    
    }
    
    /**
     * Do whatever the jiji likes to to just now.
     */
    public void act()
    {
        if (foundLeaf()) {
            eatLeaf();
        }
        else
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
    public void eatLeaf()
    {
        Actor leaf = getOneObjectAtOffset(0, 0, Leaf.class);
        if (leaf != null) {
            // eat the leaf...
            getWorld().removeObject(leaf);
            leavesEaten = leavesEaten + 1;
        }
    }
    
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
    public int getLeavesEaten()
    {
        return leavesEaten;
    }
}
