import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Message here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Message extends Actor
{
    GreenfootImage gi;
    
    public Message() 
    {
        gi = new GreenfootImage(100, 50);
        setImage(gi);
    }
    
    public void setText(String msg) 
    {
        gi.clear();
        gi.setColor(Color.YELLOW);
        gi.fill();
        gi.setColor(Color.BLACK);
        gi.drawString(msg, 10, 30);
    }

    public void act() 
    {
        /*
        if(Greenfoot.mousePressed(this)) {
           System.out.println("message");
           getWorld().removeObject(this);
        }
        */
    }    
}
