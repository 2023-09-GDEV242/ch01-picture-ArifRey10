
/**
 * Write a description of class picture here.
 * A person watching tv
 * @author (Arif Reyhan)
 * @version (9/3/2023)
 */
public class Picture
{
    private Square tv1;
    private Square tv2;
    private Square tv3;
    private Person analyser;
    private Triangle remote;
    private Circle carpet;


    public Picture()
    {
        tv1 = new Square();  
        tv2 = new Square();
        tv3 = new Square();
        analyser = new Person();
        remote = new Triangle();        
        carpet = new Circle(); 
        
    } 
    
    public void draw()
    {
     tv1.changeColor("black");
     tv1.moveHorizontal(-240);
     tv1.changeSize(50);
     tv1.makeVisible();
     
     tv2.changeColor("black");
     tv2.moveHorizontal(-140);
     tv2.changeSize(50);
     tv2.makeVisible();
     
     tv3.changeColor("black");
     tv3.moveHorizontal(-240);
     tv3.changeSize(50);
     tv3.makeVisible();
     
     analyser.changeSize(80,40);
     analyser.moveHorizontal(-94);
     analyser.moveVertical(25);
     analyser.makeVisible();
     
     remote.changeColor("blue");
     remote.moveHorizontal(-120);
     remote.moveVertical(-400);
     remote.changeSize(65);
     remote.makeVisible();
     
     carpet.changeColor("red");
     carpet.moveHorizontal(-300);
     carpet.moveVertical(-600);
     carpet.changeSize(750);
     carpet.makeVisible();
    
     
     
    }
     public void setBlackAndWhite()
    {
        tv1.changeColor("black"); 
        tv2.changeColor("black"); 
        tv3.changeColor("black");
        analyser.changeColor("white");
        remote.changeColor("black");
        carpet.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        tv1.changeColor("black"); 
        tv2.changeColor("black");
        tv3.changeColor("black");
        analyser.changeColor("brown");
        remote.changeColor("blue");
        carpet.changeColor("red");
    }
    
    
    }



