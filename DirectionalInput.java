/*


* Gampad input 


*/

import com.studiohartman.jamepad.ControllerIndex;
import com.studiohartman.jamepad.ControllerManager;
import com.studiohartman.jamepad.*;

import javax.swing.*;
import java.awt.*;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javafx.application.Application;


public class DirectionalInput 
{

      //public static int NUM_CONTROLLERS = 1;
   
      public static void whichPlayer(ControllerState x, int controlNum)
      {
      
         ControllerManager controllers = new ControllerManager();
         controllers.initSDLGamepad();
         
         
         try
         {
            
            while(!x.a)
            {
               x = controllers.getState(controlNum);
               
               Robot robot = new Robot();
            
               if(x.a) //Uses Space on the keyboard to select tile
               {
               
                  System.out.println("Space");
                  robot.keyPress(24);
                  break;
                  
               }
               
               if(x.dpadUp) // Up
               {
               
                  System.out.println("Up");
                  
                  robot.keyPress(KeyEvent.VK_UP);
                  
                  break;
               
               }

               if(x.dpadDown) // Down
               {
               
                  System.out.println("Down");
                  
                  robot.keyPress(KeyEvent.VK_DOWN);
                  
                  break;
               
               }

               if(x.dpadLeft) // Left
               {
               
                  System.out.println("Left");
                  
                  robot.keyPress(KeyEvent.VK_LEFT);
                  
                  break;
               
               }
               if(x.dpadRight) // Right
               {
               
                  System.out.println("Right");
                  
                  robot.keyPress(KeyEvent.VK_RIGHT);
                  
                  break;
               
               }
               
               
            }
            
         }
         catch(AWTException e)
         {
      
            e.printStackTrace();
      
         }
      
      }
      
}
