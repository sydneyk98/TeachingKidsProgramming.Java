package org.teachingkidsprogramming.recipes.quizzes;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.windows.MessageBox;
import org.teachingkidsprogramming.recipes.quizzes.graders.HiLowQuizGrader;

public class HiLowQuiz extends org.teachingkidsprogramming.recipes.quizzes.graders.HiLowQuiz
{
  public void question1()
  {
    //        if the Y position of the tortoise is 115
    //
    //         turn the tortoise to the right 63 degrees
    if (Tortoise.getY() == 115)
    {
      Tortoise.turn(63);
    }
  }
  public void question2()
  {
    //        if the X position of tortoise is less than Y position of tortoise
    //
    //         turn the tortoise 54 degrees to the left
    //
    //        otherwise turn the tortoise 22 degrees to the right
    if (Tortoise.getX() < Tortoise.getY())
    {
      Tortoise.turn(-54);
    }
    else
      Tortoise.turn(22);
    {
    }
  }
  public void question3()
  {
    //        display the message "elcomeway omehay!"
    MessageBox.showMessage("elcomeway omehay!");
  }
  public void question4()
  {
    //        if the Y position of tortoise is greater than 50
    //
    //         turn the tortoise 177 degrees to the left
    if (50 < Tortoise.getY())
    {
      Tortoise.turn(-177);
    }
  }
  public static void main(String[] args)
  {
    new HiLowQuizGrader().grade(new HiLowQuiz());
  }
}
