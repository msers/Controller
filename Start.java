/*


* Controller Connection


*/
import org.lwjgl.input.Controllers;
import org.lwjgl.input.Controller;
import org.lwjgl.LWJGLException;

public class Start
{

   static Controller controller;
   public static boolean Start;


   public static void main(String args[])
   {
      
      try
      {
      
         Controllers.create();
      
      }
      
      catch(LWJGLException e)
      {
      
         e.printStackTrace();
      
      }
      
      Controllers.poll();
      
      for(int i = 0;i < Controllers.getControllerCount();i++)
      {
      
         controller = Controllers.getController(i);
         System.out.println(controller.getName());
      
      }
      controller = Controllers.getController(0);
      
      for(int i = 0;i < controller.getButtonCount();i++)
      {
      
         System.out.println(i + ": " + controller.getButtonName(i));
      
      }
      while(true)
      {
      
         controller.poll();
         Start=controller.isButtonPressed(7);
         System.out.println(Start);
      
      }
      
   }


}