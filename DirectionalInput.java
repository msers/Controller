=/*


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
            
            do
            {
            
               currController = controllers.getState(controlNum);
               
               Robot robot = new Robot();
            
               if(currController.a) //Uses Space on the keyboard to select tile
               {
               
                  System.out.println("Space");
                  
                  robot.keyPress(KeyEvent.VK_SPACE);
                  
                  robot.keyRelease(KeyEvent.VK_SPACE);
                 
                  
               }
                            
               if(currController.dpadUpJustPressed) // Up
               {
                
                  System.out.println("Up");
                  
                  robot.keyPress(KeyEvent.VK_UP);
                  
                  robot.keyRelease(KeyEvent.VK_UP);
                  
                  
               }
               
               if(currController.dpadDownJustPressed) // Down
               {
               
                  System.out.println("Down");
                  
                  robot.keyPress(KeyEvent.VK_DOWN);
                  
                  robot.keyRelease(KeyEvent.VK_DOWN);
                  
                  
               }
               
               if(currController.dpadLeftJustPressed) // Left
               {
               
                  System.out.println("Left");
                  
                  robot.keyPress(KeyEvent.VK_LEFT);
                  
                  robot.keyRelease(KeyEvent.VK_LEFT);
                  
                  
               }
               
               if(currController.dpadRightJustPressed) // Right
                {
               
                  System.out.println("Right");
                  
                  robot.keyPress(KeyEvent.VK_RIGHT);
                  
                  robot.keyRelease(KeyEvent.VK_RIGHT);
                  
                  
               }
               
            }while(!currController.a);
            
         }
         
         catch(AWTException e)
         {
            
            System.out.println("CATCH: \n");
            
            e.printStackTrace();
      
         }
         
         
      }
      
}
