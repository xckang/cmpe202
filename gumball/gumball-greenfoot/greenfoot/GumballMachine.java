import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GumballMachine here.
 * 
 * @author kk 
 * @version (a version number or a date)
 */
public class GumballMachine extends Actor
{
    Message message = new Message();
    Actor coin = null;

    public GumballMachine()
    {
        GreenfootImage image = getImage() ;
        image.scale( 350, 400 ) ; 
    }

    public void act() 
    {
        int mouseX, mouseY;
        
        if(Greenfoot.mousePressed(this)) {
            if (coin == null) {
                setMessage("no coin in slot");
            } else {
                GumballWorld world = (GumballWorld)getWorld();
                world.getInspector().inspect((Coin)coin);
                coin = null;
            }
        }
        
        Actor insertedCoin = getOneObjectAtOffset(+10, +10, Coin.class);
        if (insertedCoin != null) {
            if (coin != null) {
                insertedCoin.move(-300);
                setMessage("have coin");
            } else {
                coin = insertedCoin;
                setMessage("turn crank");
                ((Coin)coin).inSlot();
            }
        }   
    }
    
    public void setMessage(String msg) 
    {
        int mouseX, mouseY;
        MouseInfo mouse = Greenfoot.getMouseInfo();
        mouseX = mouse.getX();
        mouseY = mouse.getY();
        World world = getWorld();
        if (message.getWorld() != null) {
            world.removeObject(message);
        }
        message.setText(msg);
        world.addObject(message, mouseX, mouseY);
    }
    
}
