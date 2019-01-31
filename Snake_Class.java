import ou.*;
/**
 * partial class Snake - TMA02 Q1.
 * 
 * @author (Aaron Bruce Smith) 
 * @version (1.0)
 */
public class Snake
{
  private Circle head; // provided
   private Circle body; //instance variable body
   private Circle tail; // instance variable tail


   /**
    * Constructor for objects of class Snake
    */
   public Snake(int startX, int startY, Circle aHead, Circle aBody, Circle aTail)
   {
      // initialise instance variables
      head = aHead; // provided
      head.setXPos(startX); // provided
      head.setYPos(startY); // provided
      head.setDiameter(10); // provided
      head.setColour(OUColour.RED); //Change to RED
      
      body = aBody;
      body.setXPos(startX);
      body.setYPos(startY);
      body.setDiameter(8);
      body.setColour(OUColour.RED);
      
      tail = aTail;
      tail.setXPos(startX);
      tail.setYPos(startY);
      tail.setDiameter(6);
      tail.setColour(OUColour.RED);


   }

   /**
    * sets the colour of head, body and tail all to the argument colour.
    */
   private void setColour(OUColour colour)
   {
      head.setColour(colour); // provided
      body.setColour(colour); //complete helper method setColor
      tail.setColour(colour);


   }

   /**
    * helper method to return x position of head
    */
   private int getHeadXPos() // provided
   {
      return head.getXPos();
   }
   private int getHeadYPos() 
   {
      return head.getYPos();
   }
   
   private int getBodyXPos() 
   {
      return body.getXPos();
   }
   
   private int getBodyYPos() 
   {
      return body.getYPos();
   }
   

      


   /**
    * provided
    * return true if the argument represents a valid x-position for a head
    */
   private boolean checkX(int anXPos) // check room to make move
   {
      if ((anXPos >= 0) && (anXPos <= (250 - head.getDiameter()))) // constants only happen in Unit 7
      {
         return true;
      }
      else
      {
         return false;
      }
      
   }
      //alternative one-line version
      //return ((anXPos >= 0) && (anXPos <= (250 - head.getDiameter())));
      
      private boolean checkY(int anYPos)
   {
      if((anYPos >= 0) && (anYPos <= (350 - head.getDiameter()))) 
      {
         return true;
      }
      else 
      {
         return false;
      }
   }

   /**
    * provided, but won't compile til earlier parts are completed.
    * once you have completed the methods you are asked to write in
    * parts c and d you can uncomment the body of the method.
    * 
    * if the new position is valid, move the snake so that its head is in the given position
    * move the body to where the head was, and the tail to where the body was.
    * Delay after each move.
    * otherwise
    * leave position unchanged
    * output appropriate message
    */
   private void moveTo(int newHeadX, int newHeadY) // provided
   {
       int oldHeadX = getHeadXPos(); 
       int oldHeadY = getHeadYPos();
       int oldBodyX = getBodyXPos();
       int oldBodyY = getBodyYPos();
       if (checkX(newHeadX) && checkY(newHeadY))
       {
        head.setXPos(newHeadX);
         head.setYPos(newHeadY);
          delay(100);
          body.setXPos(oldHeadX);
          body.setYPos(oldHeadY);
          delay(100);            
          tail.setXPos(oldBodyX);
          tail.setYPos(oldBodyY);
          delay(100);            
       }
       else
       {
          System.out.println("Snake cannot cross boundary!");
      }      
   }


   /**
    * provided
    * Causes execution to pause by time number of milliseconds
    * You can use this method without needing to understand how it works
    */
   public void delay(int time)
   {
      try
      {
         Thread.sleep(time); 
      }
      catch (Exception e)
      {
         System.out.println(e);
      } 
   }

   /**
    * provided
    * return a random integer between 1 and 4 inclusive
    * You can use this method without needing to understand how it works
    */
   public int randomInteger() 
   {
      java.util.Random r = new java.util.Random();
      return r.nextInt(4) + 1;
   }

   
   public void right()
   {
     this.moveTo(this.getHeadXPos() + head.getDiameter(), this.getHeadYPos());
   }
   
   public void left()
   {
    this.moveTo(this.getHeadXPos()- head.getDiameter(), this.getHeadYPos() - -1);
    
   }
   
     public void up()
   {
     this.moveTo(this.getHeadXPos(), this.getHeadYPos() - head.getDiameter());
   }
   
      public void down()
   {
     this.moveTo(this.getHeadXPos(), this.getHeadYPos() + head.getDiameter());
   }
   
  public void randomWalk()
{
   for (int step = 1; step <= 100; step++) // or start at 0 
                                         // and go to < 100
      {
         int move = randomInteger();
         if (move == 1) 
         {
            right();
         }
         else if (move == 2) 
         {
            left();
         }
         else if (move == 3)
         {
            up();
         }
         else 
         {
            down();
         }
      }
   }    
   
   
/*
 * public void randomWalk()
   {
        if(randomInteger() == 1) {
           for(int count = 0; count < 100; count++) {
              this.up();
            }
         } else if(randomInteger() == 2) {
            for(int count = 0; count < 100; count++) {
              this.down();
              } 
            } else if(randomInteger() == 3) {
                for(int count = 0; count < 100; count++) {
              this.right();
              }
            } else if(randomInteger() == 4) {
               for(int count = 0; count < 100; count++) {
              this.left();
              }
 */
         
public void home() 
   {
      while(head.getXPos() > 125)
      {
         left();
      }
      while(head.getXPos() < 125)
      {
         right();
      }
      while(head.getYPos() > 175)
      {
         up();
      }
      while(head.getYPos() < 175)
      {
         down();
      }
       
      }
   }