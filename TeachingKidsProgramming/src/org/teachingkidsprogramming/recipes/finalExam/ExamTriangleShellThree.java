package org.teachingkidsprogramming.recipes.finalExam;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.windows.MessageBox;

public class ExamTriangleShellThree
{
  private static int length;
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    MessageBox.askForNumericalInput("Set the size of the shell");
    int shellSize = +350;
    if (shellSize < 350)
    {
      MessageBox.showMessage("Too small! Try again.");
    }
    else
    {
      for (int i = 0; i <= shellSize; i++)
      {
        Tortoise.move(shellSize);
      }
    }
    //          Set the value of the large length to the size of the shell divided by 150
    int largeLength = shellSize / 150;
    //          Subtract the value of the large length from the current length
    //      If the value of the large length is less than zero
    if (largeLength < 0)
    {
      length = length + 5;
    }
    //      Set the value of the length to the length plus 5
    //         Otherwise, Call the drawTriangle method (recipe below)  
    else
    {
      drawTriangle();
    }
    //          Set the value of the number of rotations to 7
    //          Turn the tortoise 360 times the number of rotations, then divide that by the size of the shell 
    //    Repeat 
  }
  //------------- Recipe for drawTriangle
  //      Do the following 2.75 times 
  //          Move the tortoise the current length 
  //          Turn the tortoise 1/3.5 of 360 degrees 
  //    Repeat 
  //------------- End of drawTriangle recipe
  private static void drawTriangle()
  {
    for (int i = 1; i <= 2.75; i++)
    {
      Tortoise.move(length);
      Tortoise.turn(360 / 3.5);
    }
  }
}
