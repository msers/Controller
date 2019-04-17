/*


*  ControllerTester


*/
package com.studiohartman.jamepad.tester;

import com.studiohartman.jamepad.ControllerIndex;
import com.studiohartman.jamepad.ControllerManager;
import com.studiohartman.jamepad.*;

import javax.swing.*;
import java.awt.*;


public class TriggerBuzz
{
   public static int NUM_CONTROLLERS = 2;

   public static void main(String args[])
   {
      ControllerManager controllers = new ControllerManager(NUM_CONTROLLERS);
      controllers.initSDLGamepad();
      
      while(true) 
      {
         ControllerState currState = controllers.getState(0);
  
         if(!currState.isConnected || currState.b) 
         {
         
            System.out.println("Seeya Nerd");
            break;
            
         }
         if(currState.a) 
         {
         
            System.out.println("\"A\" on \"" + currState.controllerType + "\" is pressed");
            
         }
      }
      
   }
          
}
