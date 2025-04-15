import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Banana extends Actor
{
    public void act()
    {
        move(-12);
        
        if (getX() <= 0) {
            resetBanana();
        }
        
        if (isTouching(Hero.class)) {
            SadFace sadFace = new SadFace();
            getWorld().addObject(sadFace, 300, 200);
            getWorld().removeObject(this);
        }
    }
    
    public void resetBanana() {
        int num = Greenfoot.getRandomNumber(9);
        setLocation(600, (num+1)*50);
    }
}
