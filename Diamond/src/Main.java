import kareltherobot.*;

public class Main implements Directions{
  public static void main(String[] args) {
    World.setVisible(true);
    World.setDelay(2);
    World.setSize(9,9);

    // The line below creates a Robot that we will refer to as r.  
    // Find out what the numbers and direction do!
    Robot r = new Robot(1,5,West,20);

    r.putBeeper();

    for (int i = 0; i < 4; ++i)
{
   for (int j = 0; j < 4; ++j)
{
   r.move();
   r.turnLeft();
   r.turnLeft();
   r.turnLeft();
   r.move();
   r.putBeeper();
   r.turnLeft();
}
   r.turnLeft();
   r.turnLeft();
   r.turnLeft();
}


  }
}