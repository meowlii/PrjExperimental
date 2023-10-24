import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mundo here.
 * 
 * @author Melissa
 * @version 0.1 Alpha
 */
public class Mundo extends World
{
    private GreenfootSound bgMusic = new GreenfootSound("wind.wav");
    
    public void started()
    {
    bgMusic.playLoop();
}
    public void stopped()
    {
    bgMusic.pause();
}

    /**
     * Constructor for objects of class Mundo.
     * 
     */
    public Mundo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {
        Kiki kiki = new Kiki();
        addObject(kiki,196,214);
        Jiji jiji = new Jiji();
        addObject(jiji,215,91);
        kiki.setLocation(168,254);
        kiki.setLocation(168,254);
        kiki.setLocation(157,111);
        kiki.setLocation(157,111);
        kiki.setLocation(143,9);
        kiki.setLocation(156,252);
        jiji.setLocation(173,164);
        kiki.setLocation(144,102);
        kiki.setLocation(203,292);
        jiji.setLocation(195,178);
    }
}
