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
   
      public static void whichPlayer(ControllerState currController, int controlNum)
      {
      
         ControllerManager controllers = new ControllerManager();
         
         controllers.initSDLGamepad();
         
         controllers.update();
         
         try
         {
         
            Robot robot = new Robot();
            
            while(true)
            {
               
               currController = controllers.getState(controlNum);
               
               controllers.update();
               
               if(currController.a) //Uses Space on the keyboard to select tile
               {
                  
                  //System.out.println("Space");
                  
                  robot.keyPress(KeyEvent.VK_SPACE);
                  
                  robot.keyRelease(KeyEvent.VK_SPACE);
                    
                  break;
                 
               }
                            
               else if(currController.dpadUp) // Up
               {
               
                  //System.out.println("Up");
                  
                  robot.keyPress(KeyEvent.VK_UP);
                  
                  robot.keyRelease(KeyEvent.VK_UP);
                  
                  
               }
               
               else if(currController.dpadDown) // Down
               {
               
                  //System.out.println("Down");
                  
                  robot.keyPress(KeyEvent.VK_DOWN);
                  
                  robot.keyRelease(KeyEvent.VK_DOWN);
                  
               }
               
               else if(currController.dpadLeft) // Left
               {
               
                  //System.out.println("Left");
                  
                  robot.keyPress(KeyEvent.VK_LEFT);
                  
                  robot.keyRelease(KeyEvent.VK_LEFT);
                  
                  
               }
               
               else if(currController.dpadRight) // Right
               {
               
                  //System.out.println("Right");
                  
                  robot.keyPress(KeyEvent.VK_RIGHT);
                  
                  robot.keyRelease(KeyEvent.VK_RIGHT);
                  
                  
               }
               
            }
            
         }
         
         catch(AWTException e)
         {
            
            System.out.println("CATCH: \n");
            
            e.printStackTrace();
      
         }
         
         
      }
      
}
