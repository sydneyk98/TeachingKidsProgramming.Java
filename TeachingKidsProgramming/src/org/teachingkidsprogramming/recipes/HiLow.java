package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.utils.Sounds;
import org.teachingextensions.windows.MessageBox;

import com.spun.util.NumberUtils;

public class HiLow
{
  public static void main(String[] args)
  {
    int correctNumber = NumberUtils.getRandomInt(1, 100);
    for (int i = 1; i <= 8; i++)
    {
      int guess = MessageBox.askForNumericalInput("Hi! Pick a number :)");
      if (guess == correctNumber)
      {
        Sounds.playBeep();
        MessageBox.showMessage("You Won!");
        System.exit(0);
      }
      else if (guess > correctNumber)
      {
        MessageBox.showMessage("Your number is too high...");
      }
      else if (guess < correctNumber)
      {
        MessageBox.showMessage("Your number is too low...");
      }
    }
    MessageBox.showMessage("You lost the game! YOU SUCK");
  }
}
