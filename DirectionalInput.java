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

   public static int NUM_CONTROLLERS = 1;
   
      public static void main(String args[])
      {
   
         ControllerManager controllers = new ControllerManager(NUM_CONTROLLERS);
         controllers.initSDLGamepad();
         
         try
         {
            
            while(true)
            {
               ControllerState currController = controllers.getState(0);
               Robot robot = new Robot();
            
               if(currController.a) //Uses Space on the keyboard to select tile
               {
               
                  System.out.println("Space");
                  robot.keyPress(32);
               
               }
               
               if(currController.dpadUp) //Uses Space on the keyboard to select tile
               {
               
                  System.out.println("Up");
                  //robot.keyPress(94);
               
               }

               if(currController.dpadDown) //Uses Space on the keyboard to select tile
               {
               
                  System.out.println("Down");
                  //robot.keyPress(95);
               
               }

               if(currController.dpadLeft) //Uses Space on the keyboard to select tile
               {
               
                  System.out.println("Left");
                  //robot.keyPress(66);
               
               }
               if(currController.dpadRight) //Uses Space on the keyboard to select tile
               {
               
                  System.out.println("Right");
                  //robot.keyPress(65);
               
               }
               
            }
            
         }
         catch(AWTException e)
         {
      
            e.printStackTrace();
      
         }
      
      }
      
}