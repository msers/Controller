/*


*  ControllerTester


*/

import com.studiohartman.jamepad.ControllerIndex;
import com.studiohartman.jamepad.ControllerManager;
import com.studiohartman.jamepad.*;

import javax.swing.*;
import java.awt.*;

import javafx.application.Application;



public class TriggerBuzz
{
   public static int NUM_CONTROLLERS = 3;
   
   public static void main(String args[])
   {
   
      ControllerManager controllers = new ControllerManager(NUM_CONTROLLERS);
      controllers.initSDLGamepad();
      
      String p1 = "player_1";
      String p2 = "player_2";
      String p3 = "player_3";
      
      DirectionalInput a1 = new DirectionalInput();
      
      
      while(true) 
      {
         ControllerState player1 = controllers.getState(0);
         ControllerState player2 = controllers.getState(1);
         ControllerState player3 = controllers.getState(2);
  
         //////
         //Connections Failure
         //////
         
         if(!player1.isConnected) 
         {
         
            System.out.println(p1 + ": not connected");
            
            break;
            
         }
         
         if(!player2.isConnected) 
         {
         
            System.out.println(p2 + ": not connected");
            
            break;
            
         }
         
         //if(!player3.isConnected) 
         //{
         //
         //   System.out.println(p3 + ": not connected");
         //   break;
         //   
         //}
         
         
         //////
         //Buzzed
         //////
         
         if(player1.lb || player1.rb) 
         {
         
            System.out.println(p1 + ": Buzzed");
            
            a1.whichPlayer(player1, 0);
            
            break;
            
         }
         
         if(player2.lb || player2.rb) 
         {
         
            System.out.println(p2 + ": Buzzed");
            
            a1.whichPlayer(player2, 1);
            
            break;
            
         }
         
         if(player3.lb || player3.rb)
         {
         
            System.out.println(p3 + ": Buzzed");
            
            a1.whichPlayer(player3, 2);
            
            break;
            
         }

      }
      
      System.out.println("exit");
      System.exit(0);
      
   }
   
}
