import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class Inspector here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Inspector extends Alien
{
    private ArrayList<Picker> pickers = new ArrayList<Picker>();
    
    public void addPicker(Picker obj) 
    {
        pickers.add(obj);
    }
    
    public void removePicker(Picker obj) 
    {
        pickers.remove(obj);
    }
    
    public void inspect(Coin coin)
    {
        int pickerID = Greenfoot.getRandomNumber(pickers.size());
        Picker picker = pickers.get(pickerID);
        if (coin.getClass() == Quarter.class) {
            picker.pick();
        } else {
            GumballWorld world = (GumballWorld)getWorld();
            world.getMachine().setMessage("wrong coin");
        }
        
    }
    
}
