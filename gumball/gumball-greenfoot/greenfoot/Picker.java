import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Picker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Picker extends Alien
{
    public void pick(){};
    
    public void popGumball(Gumball gb)
    {
        GumballWorld world = (GumballWorld)getWorld();
        world.addObject(gb, 500, 500);
        world.getMachine().setMessage(gb.getClass().getName());
    }
}