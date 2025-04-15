import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Hero extends Actor
{
    int currentX = 100;
    
    public void act()
    {
        setLocation(100, currentX);
        
        if (Greenfoot.isKeyDown("w")) {
            currentX -= 5; 
        }
        if (Greenfoot.isKeyDown("s")) {
            currentX += 5;
        }
    }
}
