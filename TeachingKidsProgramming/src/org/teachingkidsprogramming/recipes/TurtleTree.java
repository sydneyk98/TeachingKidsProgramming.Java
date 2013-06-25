package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Turtle;

public class TurtleTree
{
  public static void main(String[] args)
  {
    Turtle turtle = new Turtle();
    turtle.setY(turtle.getY() + 100);
    turtle.setSpeed(10);
    turtle.getBackgroundWindow().setBackground(Colors.Grays.Black);
    int branch = 60;
    while (true)
      drawBranch(turtle, branch);
  }
  private static void drawBranch(Turtle turtle, int branch)
  {
    if (0 < branch)
    {
      adjustColor(turtle, branch);
      turtle.move(branch);
      drawLowerBranches(turtle, branch);
    }
  }
  private static void adjustColor(Turtle turtle, int branch)
  {
    if (branch <= 10)
    {
      turtle.setPenWidth(1);
      turtle.setPenColor(Colors.Greens.Lime);
    }
    else if (branch <= 20)
    {
      turtle.setPenWidth(2);
      turtle.setPenColor(Colors.Greens.ForestGreen);
    }
    else if (branch <= 30)
    {
      turtle.setPenWidth(4);
      turtle.setPenColor(Colors.Greens.DarkGreen);
    }
    else if (branch <= 40)
    {
      turtle.setPenWidth(6);
      turtle.setPenColor(Colors.Greens.Olive);
    }
    else if (branch <= 50)
    {
      turtle.setPenWidth(8);
      turtle.setPenColor(Colors.Browns.Sienna);
    }
    else if (branch <= 60)
    {
      turtle.setPenWidth(10);
      turtle.setPenColor(Colors.Browns.SaddleBrown);
    }
  }
  private static void drawLowerBranches(Turtle turtle, int branch)
  {
    int rightAngle = (int) (Math.random() * 100 + 1);
    turtle.turn(rightAngle);
    drawShorterBranch(turtle, branch);
    int leftAngle = -(int) (Math.random() * 100 + 1);
    turtle.turn(leftAngle - rightAngle);
    drawShorterBranch(turtle, branch);
    turtle.turn(-leftAngle);
    adjustColor(turtle, branch);
    turtle.move(-branch);
  }
  private static void drawShorterBranch(Turtle turtle, int branch)
  {
    int difference = 10;
    drawBranch(turtle, branch - difference);
  }
}